package com.csdj.chainsupermarket.util.freight;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

/**
 * @ClassName EntCoordSyncJob
 * @Description TODO
 * @Author 孤街
 * @Date 2019/11/24 13:27
 * @Version 1.0
 **/
public class EntCoordSyncJobUtil {
    /**
     * 百度地图密钥
     */
    static String AK = "GFoXnZsafCktQHQDmZyCd5KLKIOVVv9h";


//    public static void main(String[] args) {
//        String dom = "湖南长沙";
//        String coordinate = getCoordinate(dom);
//        System.out.println("'" + dom + "'的经纬度为：" + coordinate);
//        // System.err.println("######同步坐标已达到日配额6000限制，请明天再试！#####");
//    }


    /**
     * 调用百度地图API根据地址，获取坐标
     *
     * @param address 目标地址
     * @return 坐标
     */
    public static Map<String, Object> getCoordinate(String address) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (address != null && !"".equals(address)) {
            address = address.replaceAll("\\s*", "").replace("#", "栋");
            String url = "http://api.map.baidu.com/geocoding/v3/?address=" + address + "&output=json&ak=" + AK;
            String json = loadJSON(url);
            System.out.println(json);
            if (json != null && !"".equals(json)) {
                JSONObject obj = JSONObject.fromObject(json);
                if ("0".equals(obj.getString("status"))) {
                    // 经度
                    double lng = obj.getJSONObject("result").getJSONObject("location").getDouble("lng");
                    // 纬度
                    double lat = obj.getJSONObject("result").getJSONObject("location").getDouble("lat");

                    DecimalFormat df = new DecimalFormat("#.##");
                    map.put("lng", lng);
                    map.put("lat", lat);
                    return map;
                }
            }
        }
        return null;
    }

    public static String loadJSON(String url) {
        StringBuilder json = new StringBuilder();
        try {
            URL oracle = new URL(url);
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream(), "UTF-8"));
            String inputLine = null;
            while ((inputLine = in.readLine()) != null) {
                json.append(inputLine);
            }
            in.close();
        } catch (MalformedURLException e) {
        } catch (IOException e) {
        }
        return json.toString();
    }

    // 来自stackoverflow的MD5计算方法，调用了MessageDigest库函数，并把byte数组结果转换成16进制
    /*
     * public String MD5(String md5) { try { java.security.MessageDigest md = java.security.MessageDigest .getInstance("MD5"); byte[] array = md.digest(md5.getBytes()); StringBuffer sb = new StringBuffer(); for (int i = 0; i < array.length; ++i) { sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100) .substring(1, 3)); } return sb.toString(); } catch (java.security.NoSuchAlgorithmException e) {
     * } return null; }
     */
}
