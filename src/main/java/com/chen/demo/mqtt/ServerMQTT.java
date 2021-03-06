package com.chen.demo.mqtt;

import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

/**
 * @author koma 16:36 2019-06-25
 * @desc 服务器向多个客户端推送主题，即不同客户端可向服务端订阅相同的主题
 */
public class ServerMQTT {
    public static final String HOST = "tcp://localhost:1883";
    public static final String TOPIC = "topic11";
    private static final String clientId = "server11";

    private MqttClient client;
    private MqttTopic topic11;
    private String userName = "admin";
    private String passWord = "password";

    private MqttMessage message;

    /**
     * 构造函数
     * @throws MqttException
     */
    public ServerMQTT() throws MqttException {
        // MemoryPersistence设置clientId的保存形式，默认为以内存保存
        client = new MqttClient(HOST, clientId, new MemoryPersistence());
        connect();
    }

    /**
     * 用来连接服务器
     */
    private void connect() {
        MqttConnectOptions options = new MqttConnectOptions();
        options.setCleanSession(false);
        options.setUserName(userName);
        options.setPassword(passWord.toCharArray());
        // 设置超时时间
        options.setConnectionTimeout(10);
        // 设置会话心跳时间
        options.setKeepAliveInterval(20);
        try {
            client.setCallback(new PushCallback());
            client.connect(options);
            topic11 = client.getTopic(TOPIC);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        /**
         * @param topic
         * @param message
         * @throws MqttPersistenceException
         * @throws MqttException
         */
        public void publish(MqttTopic topic , MqttMessage message) throws MqttPersistenceException, MqttException {
            MqttDeliveryToken token = topic.publish(message);
            token.waitForCompletion();
            System.out.println("message is published completely! " + token.isComplete());
        }

        /**
         * 启动入口
         * @param args
         * @throws MqttException
         */
        public static void main(String[] args) throws MqttException {
            ServerMQTT server = new ServerMQTT();
            server.message = new MqttMessage();
            server.message.setQos(1);
            server.message.setRetained(true);
            server.message.setPayload("hello,topic11".getBytes());
            server.publish(server.topic11 , server.message);
            System.out.println(server.message.isRetained() + "------retained状态");

        }
}
