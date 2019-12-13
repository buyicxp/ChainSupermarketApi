package com.csdj.chainsupermarket.controller.shop.minuteshop;

import com.csdj.chainsupermarket.entity.shop.minuteshop.ShopMessage;
import com.csdj.chainsupermarket.service.shop.minuteshop.MessageService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @ClassName MessageController
 * @Description: 门店
 * @Author 刘时钟
 * @Date 2019/12/2
 * @Version V1.0
 **/
@RestController
@RequestMapping("/Message")
@CrossOrigin
public class MessageController {
    Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
    @Autowired
    private MessageService messageService;

    /**
     * 查询门店列表
     * @param name
     * @param operating
     * @return
     */
    @RequestMapping("/listShop")
    public List<ShopMessage> listShop(@RequestParam(value = "name", required = false) String name,
                           @RequestParam(value = "operating", required = false) String operating,
                           Integer currentPage, Integer pageSize) {
        List<ShopMessage> list = messageService.listShopMessageService(name,operating,(currentPage-1)*pageSize,pageSize);
        return list;
    }

    /**
     *查询门店记录数
     * @param name
     * @param operating
     * @return
     */
    @RequestMapping("/countShop")
    public Integer countShop(@RequestParam(value = "name", required = false) String name,
                         @RequestParam(value = "operating", required = false) String operating){
        return messageService.countShopMessageService(name,operating);
    }
    /**
     * 添加门店
     * @param message
     * @return
     */
    @RequestMapping("/saveShop")
    public Integer  saveShop(ShopMessage message) {
        String sub=message.getSpAddress();
        String city=sub.substring(0,sub.lastIndexOf("市")+1);
        message.setSpCity(city);
        message.setSpOperating("正常");
        message.setSpCreationtime(new Date());
        Integer count= messageService.saveShopMessageService(message);
            logger.info("添加门店！");
        return count;
    }

    /**
     * 根据id查询要修改的门店
     * @param id
     * @return
     */
    @RequestMapping("/getShop")
    public ShopMessage  getShop(@RequestParam(value = "id", required = false) Integer id) {
        ShopMessage shopMessage = messageService.getShopMessageService(id);
        return shopMessage;
    }

    /**
     * 修改门店
     * @param message
     * @return
     */
    @RequestMapping("/updateShop")
    public boolean  updateShop(ShopMessage message) {
        String sub=message.getSpAddress();
        String city=sub.substring(0,sub.lastIndexOf("市")+1);
        message.setSpCity(city);
        if(messageService.updateShopMessageService(message)>0){
            logger.info("修改门店！");
            return true;
        }
        return false;
    }
    /**
     * 停用门店
     * @param id
     * @param operating
     * @return
     */
    @RequestMapping("/disableShop")
    public boolean  disableShop(@RequestParam(value = "id", required = false) Integer id,
                               @RequestParam(value = "operating", required = false) String operating) {
        if(messageService.disableShopMessageService(id,operating)>0){
            logger.info("停用门店！");
            return true;
        }
        return false;
    }

    /**
     * 查询门店名称
     * @return
     */
    @RequestMapping("/listShopName")
    public List<ShopMessage> listShopName() {
        List<ShopMessage> list = messageService.listShopMessageNameService();
        return list;
    }
}
