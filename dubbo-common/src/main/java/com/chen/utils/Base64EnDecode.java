package com.chen.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.util.Base64;

/**
 * @Date: 3:15 下午 2021/3/26
 * @Desc: base加密、解密
 */
public class Base64EnDecode {
    public static void main(String[] args) throws Exception {
        String str = "{\"operateAction\":\"提交审核\",\"operateModule\":\"MPC任务\",\"operatorName\":\"管理员\",\"operatorUid\":1,\"serialNumber\":\"28a9a335bcb64766a00025da4bd27ebf\"}";

        // 加密
        base64(str);

        // 加密 + 解密
        enAndDeCode(str);

        // 解密
        byte[] byteArray = decryptBASE64("eyJvcGVyYXRlQWN0aW9uIjoi5o+Q5Lqk5a6h5qC4Iiwib3BlcmF0ZU1vZHVsZSI6Ik1QQ+S7\n" +
                "u+WKoSIsIm9wZXJhdG9yTmFtZSI6IueuoeeQhuWRmCIsIm9wZXJhdG9yVWlkIjoxLCJzZXJp\n" +
                "YWxOdW1iZXIiOiIyOGE5YTMzNWJjYjY0NzY2YTAwMDI1ZGE0YmQyN2ViZiJ9");
        System.out.println("sun.misc.BASE64 解密后：" + new String(byteArray));

    }


    /**
     * Base64
     *
     */
    public static void base64(String str) {
        byte[] bytes = str.getBytes();

        //Base64 加密
        String encoded = Base64.getEncoder().encodeToString(bytes);
        System.out.println("Base 64 加密后：" + encoded);

        //Base64 解密
        byte[] decoded = Base64.getDecoder().decode(encoded);

        String decodeStr = new String(decoded);
        System.out.println("Base 64 解密后：" + decodeStr);

        System.out.println();


    }

    /**
     * BASE64加密解密
     */
    public static void enAndDeCode(String str) throws Exception {
        String data = encryptBASE64(str.getBytes());
        System.out.println("sun.misc.BASE64 加密后：" + data);

        byte[] byteArray = decryptBASE64(data);
        System.out.println("sun.misc.BASE64 解密后：" + new String(byteArray));
    }

    /**
     * BASE64解密
     * @throws Exception
     */
    public static byte[] decryptBASE64(String key) throws Exception {
        return (new BASE64Decoder()).decodeBuffer(key);
    }

    /**
     * BASE64加密
     */
    public static String encryptBASE64(byte[] key) throws Exception {
        return (new BASE64Encoder()).encodeBuffer(key);
    }

}
