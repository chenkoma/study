package com.chen.demo.common;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
/**
 * 利用HttpClient进行post请求的工具类
 * @ClassName: HttpClientUtil
 * @Description: TODO
 * @author Devin <xxx>
 * @date 2017年2月7日 下午1:43:38
 *
 */
public class HttpClientUtil {
    @SuppressWarnings("resource")
    public static String doPost(String url,String jsonstr,String charset){
        HttpClient httpClient = null;
        HttpPost httpPost = null;
        String result = null;
        try{
            httpClient = new SSLClient();
            httpPost = new HttpPost(url);
            httpPost.addHeader("Content-Type", "application/json");
            StringEntity se = new StringEntity(jsonstr);
            se.setContentType("text/json");
            se.setContentEncoding(new BasicHeader("Content-Type", "application/json"));
            httpPost.setEntity(se);
            HttpResponse response = httpClient.execute(httpPost);
            if(response != null){
                HttpEntity resEntity = response.getEntity();
                if(resEntity != null){
                    result = EntityUtils.toString(resEntity,charset);
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args){
        String url = "https://a1.cn.wgine.com/api.json?a=tuya.m.user.email.token.create&appRnVersion=5.7&appVersion=1.0.2&clientId=9hc44e5vgqjtdra5nx9t&lang=zh&os=IOS&osSystem=7.1.1&sign=c11c2fae57ecbed7b2734b678beca946&time=1561453862&ttid=online&v=1.0";
        String jsonStr = "{\"email\":\"autoyu002@tuya.com\",\"countryCode\":86}";
        String httpOrgCreateTestRtn = HttpClientUtil.doPost(url, jsonStr, "utf-8");
        System.out.println(httpOrgCreateTestRtn);
    }
}
