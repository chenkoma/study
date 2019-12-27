package com.chen.demo.mqtt;

import com.chen.demo.common.MD5Util;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

/**
 * @author koma 11:05 2019-06-26
 * @desc
 */
public class DeviceMQTT {

    public static final String host = "tcp://mq.gw.tuyacn.com:1883";
    public static final String topic = "tuya1319563f96bc263b";
    public static final String clientId = "663126085ccf7f7ddc7f";
    public static final String secKey = "4beaefa45cf6437a";
    public static final String localKey = "8b604b00c503501f";

    public MqttClient client;
    public MqttTopic topic11;



    /**
     * 用来连接服务器
     */
    public void connect(String host, String uuid, String seckey, String localkey) {
        String userName = uuid;
        String passWord = MD5Util.MD5(seckey).substring(8, 24).toLowerCase();
        System.out.println(passWord);

        MqttConnectOptions options = new MqttConnectOptions();
        options.setCleanSession(false);
        options.setUserName(userName);
        options.setPassword(passWord.toCharArray());
        // 设置超时时间
        options.setConnectionTimeout(10);
        // 设置会话心跳时间
        options.setKeepAliveInterval(20);
        try {

            client = new MqttClient(host, clientId, new MemoryPersistence());

            client.setCallback(new PushCallback());
            client.connect(options);
            topic11 = client.getTopic(topic);
            System.out.println("============" + topic11);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new DeviceMQTT().connect(host, "663126085ccf7f7ddc7f", secKey, localKey);
    }


}
