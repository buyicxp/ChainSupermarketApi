package com.csdj.chainsupermarket.controller.commodity;

import com.alibaba.fastjson.JSON;
import com.csdj.chainsupermarket.entity.commodity.GoodsProduct;
import com.csdj.chainsupermarket.service.commodity.GoodsProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 黄丹
 * @date 2019-12-10
 * 产品表控制器类
 */
@CrossOrigin
@ResponseBody
@Controller
@RequestMapping("/commodity")
public class GoodsProductController {
    @Resource
    GoodsProductService goodsProductService;
    private final Logger logger = LoggerFactory.getLogger(GoodsProductController.class);

    @RequestMapping("/showPhoto")
    public Map<String, Object> showPhoto(
            @RequestParam("photo") MultipartFile file,
            @RequestParam(value = "colorId", required = false) int colorId,
            @RequestParam(value = "sizeId", required = false) int sizeId,
            @RequestParam("details") String details, @RequestParam("goodsName") String goodsName,
            @RequestParam("goodsTitle") String goodsTitle, @RequestParam("categoryId") int categoryId,
            @RequestParam("goodsCode") String goodsCode, @RequestParam("createDate") String createDate,
            @RequestParam("price") double price,
            @RequestParam(value = "activityPrice", required = false) double activityPrice,
            @RequestParam("weight") double weight, @RequestParam("locking") int locking,
            @RequestParam("already") int already,
            @RequestParam(value = "activityId", required = false) int activityId,
            @RequestParam(value = "bounds", required = false) int bounds,
            @RequestParam(value = "presell", required = false) int presell) {
        OutputStream os = null;
        InputStream inputStream = null;
        Map<String, Object> result = new HashMap<>(1);
        GoodsProduct goodsProduct = null;
        try {
            if (!file.isEmpty()) {
                String fileName = file.getOriginalFilename();
                inputStream = file.getInputStream();
                ByteArrayOutputStream baas = new ByteArrayOutputStream();
                // 1K的数据缓冲
                byte[] bs = new byte[1024];
                int len;
                while ((len = inputStream.read(bs)) != -1) {
                    baas.write(bs, 0, len);
                }
                inputStream.close();
                inputStream = new ByteArrayInputStream(baas.toByteArray());
                String sha1 = getSha1(new ByteArrayInputStream(baas.toByteArray()));
                assert sha1 != null;
                String filePath = "D:\\photo\\" + sha1.substring(0, 2);
                // 输出的文件流保存到本地文件
                File tempFile = new File(filePath);
                if (!tempFile.exists()) {
                    if (tempFile.mkdirs()) {
                        assert fileName != null;
                        os = new FileOutputStream(tempFile.getPath() + File.separator + sha1 + fileName.substring(fileName.indexOf('.')));
                        while ((len = inputStream.read(bs)) != -1) {
                            os.write(bs, 0, len);
                        }
                    }
                }
                goodsProduct = new GoodsProduct();
                goodsProduct.setColorId(colorId);
                goodsProduct.setSizeId(sizeId);
                goodsProduct.setDetails(details);
                goodsProduct.setGoodsName(goodsName);
                goodsProduct.setGoodsTitle(goodsTitle);
                goodsProduct.setCategoryId(categoryId);
                goodsProduct.setGoodsCode(goodsCode);
                goodsProduct.setPrice(price);
                goodsProduct.setWeight(weight);
                goodsProduct.setLocking(locking);
                goodsProduct.setAlready(already);
                goodsProduct.setActivityPrice(activityPrice);
                goodsProduct.setActivityId(activityId);
                goodsProduct.setBounds(bounds);
                goodsProduct.setPresell(presell);
                goodsProduct.setCreateDate(createDate);
                assert fileName != null;
                String urePath = "img/" + sha1.substring(0, 2) + "/" + sha1 + fileName.substring(fileName.indexOf('.'));
                goodsProduct.setPicturePath(urePath);
                goodsProduct.setBigPicturePath(urePath);


            }
        } catch (IOException e) {
            logger.error(e.toString(), e);
        } finally {
            // 完毕，关闭所有链接
            try {
                if (os != null) {
                    os.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                logger.error(e.getLocalizedMessage(), e);
            }
        }
        logger.info(JSON.toJSONString(goodsProduct));
        int res = goodsProductService.addGoods(goodsProduct);
        if (res > 0) {
            logger.info("添加成功");
        } else {
            logger.info("添加失败");
        }
        result.put("res", res);
        return result;
    }

    private String getSha1(InputStream in) {
        try {
            MessageDigest messagedigest = MessageDigest.getInstance("sha-1");
            int len;
            byte[] buffer = new byte[1024 * 1024 * 10];
            try {
                while ((len = in.read(buffer)) > 0) {
                    messagedigest.update(buffer, 0, len);
                }
                byte[] hash = messagedigest.digest();
                return bytesToHexString(hash);
            } catch (IOException e) {
                logger.error(e.getLocalizedMessage(), e);
                return null;
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        logger.error(e.getLocalizedMessage(), e);
                    }
                }
            }
        } catch (NoSuchAlgorithmException e) {
            logger.error(e.getLocalizedMessage(), e);
            return null;
        }
    }

    /**
     * Convert byte[] to hex string
     *
     * @param src byte[] data
     * @return hex string
     */
    private String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder();
        if (src == null || src.length <= 0) {
            return null;
        }
        for (byte b : src) {
            int v = b & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

    /**
     * 获取产品列表
     *
     * @param
     * @param pageSize
     * @return
     */

    @RequestMapping(value = "/listProduct", method = RequestMethod.POST)
    public String getBrand(@RequestParam(value = "start") int start,
                           @RequestParam(value = "pageSize") int pageSize,
                           @RequestParam(value = "goodsTitle", required = false) String goodsTitle,
                           @RequestParam(value = "categoryid", required = false) Integer categoryid) {
        System.out.println("阿达阿道夫" + start + "," + pageSize + "," + goodsTitle + "," + categoryid);
        String str = JSON.toJSONString(goodsProductService.listProduct(start, pageSize, goodsTitle, categoryid));
        String result = "{\"status\":200,\"message\":" + str + "}";
        System.out.println(result);
        return result;
    }


    /**
     * 获取产品列表
     *
     * @param
     * @param pageSize
     * @return
     */

    @RequestMapping(value = "/listProductshelves", method = RequestMethod.POST)
    public String getBrandshelves(@RequestParam(value = "start") int start,
                                  @RequestParam(value = "pageSize") int pageSize,
                                  @RequestParam(value = "goodsTitle", required = false) String goodsTitle,
                                  @RequestParam(value = "categoryid", required = false) Integer categoryid) {
        System.out.println("nbnb" + start + "," + pageSize + "," + goodsTitle + "," + categoryid);
        String str = JSON.toJSONString(goodsProductService.listProductshelves(start, pageSize, goodsTitle, categoryid));
        String result = "{\"status\":200,\"message\":" + str + "}";
        System.out.println(result);
        return result;
    }

    @RequestMapping(value = "/pageProduct", method = RequestMethod.POST)
    public String pageBrand(@RequestParam(value = "start") int start, @RequestParam(value = "pageSize") int pageSize) {
        String str = JSON.toJSONString(goodsProductService.pageProduct(start, pageSize));
        String result = "{\"status\":200,\"message\":" + str + "}";
        List<GoodsProduct> list = goodsProductService.pageProduct(start, pageSize);
        return result;
    }

    @RequestMapping(value = "/count", method = RequestMethod.POST)
    public Integer count() {
        return goodsProductService.countProduct();
    }

    @RequestMapping(value = "/delBooks", method = RequestMethod.POST)
    public boolean delBooks(Integer id) {
        if (goodsProductService.delProduct(id) > 0) {
            logger.info("删除产品");
            return true;
        }
        return false;
    }

    @RequestMapping(value = "/underCarriage", method = RequestMethod.POST)
    public Object downComm(@RequestParam(value = "id") int id) {
        int num = goodsProductService.underCarriage(id);
        if (num > 0) {
            return true;
        }
        return false;
    }

    @RequestMapping(value = "/grounding", method = RequestMethod.POST)
    public Object upComm(@RequestParam(value = "id") int id) {
        int num = goodsProductService.grounding(id);
        if (num > 0) {
            return true;
        }
        return false;
    }

    @RequestMapping(value = "/updateProduct", method = RequestMethod.POST)
    public boolean updateProduct(@RequestParam(value = "id") int id, @RequestParam(value = "putshelves") int putshelves) {
        if (goodsProductService.updateProduct(id, putshelves) > 0) {
            logger.info("拉取产品");
            return true;
        }
        return false;
    }

    @RequestMapping(value = "/upBooks", method = RequestMethod.POST)
    public boolean upBooks(GoodsProduct product) {
        if (goodsProductService.upProduct(product) > 0) {
            logger.info("修改产品！");
            return true;
        }
        return false;
    }

    /**
     * 批量添加
     *
     * @param products 列表
     * @return map
     */
    @PostMapping("/piAddGoods")
    public Map<String, Object> piAddGoods(@RequestBody List<GoodsProduct> products) {
        Map<String, Object> result = new HashMap<>(3);
        result.put("data", 0);
        int count = 0;
        try {
            for (GoodsProduct product : products) {
                count += goodsProductService.addGoods(product);
            }
            result.put("data", count);
            result.put("msg", "Success");
            result.put("code", 200);
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
            result.put("msg", "Server error");
            result.put("code", 500);
        }
        return result;
    }
}
