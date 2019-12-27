package com.chen.demo.mqtt;

import com.chen.demo.common.HttpClientUtil;
import com.chen.demo.common.MD5Util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author koma 18:00 2019-06-25
 * @desc
 */
public class demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        String url = "https://a1.cn.wgine.com/api.json?a=tuya.m.user.email.token.create&appRnVersion=5.7&appVersion=1.0.2&clientId=9hc44e5vgqjtdra5nx9t&lang=zh&os=IOS&osSystem=7.1.1&sign=c11c2fae57ecbed7b2734b678beca946&time=1561453862&ttid=online&v=1.0";
        String jsonStr = "{\"email\":\"autoyu002@tuya.com\",\"countryCode\":86}";

        String url = "https://a1.cn.wgine.com/api.json?a=tuya.m.user.email.token.create&appRnVersion=5.7&appVersion=1.0.2&clientId=9hc44e5vgqjtdra5nx9t&lang=zh&os=IOS&osSystem=7.1.1";
        long time = new Date().getTime()/1000;

        String activeprops = "{\n" +
                "    \"gwVer\":\"2.3.0\",\n" +
                "    \"ability\":0,\n" +
                "    \"bv\":\"5.35\",\n" +
                "    \"pv\":\"2.1\",\n" +
                "    \"gwEtag\":\"0000000006\",\n" +
                "    \"devVer\":\"1.0.0\",\n" +
                "    \"softVer\":\"1.1.0\",\n" +
                "    \"protocolVer\":\"1.2.1\",\n" +
                "    \"timeZone\":\"+08:00\",\n" +
                "    \"cdVer\":\"1.0.0\",\n" +
                "    \"devAttribute\":1,\n" +
                "    \"feature\":{\n" +
                "        \"netName\":\"wy_test\"\n" +
                "    }\n" +
                "}";



        String data = "{\"email\":\"autoyu002@tuya.com\",\"countryCode\":86}";
//        String timee = "1561462670";
        String timee =  "" + time;
        String datam = MD5Util.MD5(data).toLowerCase();
        System.out.println("原md5 " + datam);

//        datamd = datam[8:16] + datam[0:8] + datam[24:32] + datam[16:24]
        String datamd = datam.substring(8,16) + datam.substring(0,8)
                + datam.substring(24,32) + datam.substring(16,24);
        System.out.println("新md5 " + datamd);

        String signun = "a=tuya.m.user.email.token.create||appVersion=1.0.2||clientId=9hc44e5vgqjtdra5nx9t||lang=zh||os=IOS||postData="+datamd+"||time="+timee+"||ttid=online||v=1.0||hejdvut3mh4jnuug57jdrdxveqcjhfah";


        String sign = MD5Util.MD5(signun).toLowerCase();
        System.out.println("sign " + sign);

        url = url + "&sign=" + sign +  "&time=" + time + "&ttid=online&v=1.0";
        System.out.println("url " + url);
        System.out.println("data " + data);


        Map<String,Object> params = new LinkedHashMap<>();
        params.put("email", "autoyu002@tuya.com");
        params.put("countryCode", 86);



        String httpOrgCreateTestRtn = HttpClientUtil.doPost(url, "{\"email\":\"autoyu002@tuya.com\",\"countryCode\":86}", "utf-8");
        System.out.println(httpOrgCreateTestRtn);
    }
}
