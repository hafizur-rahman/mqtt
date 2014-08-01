package com.jdreamer.iot;

import org.fusesource.mqtt.client.BlockingConnection;
import org.fusesource.mqtt.client.MQTT;
import org.fusesource.mqtt.client.Message;
import org.fusesource.mqtt.client.QoS;
import org.fusesource.mqtt.client.Topic;

public class Subscribe {
	public static void main(String[] args) throws Exception {
		final int port = Integer.parseInt(System.getProperty("mqtt.port",
				"61613"));
		final String userName = System.getProperty("mqtt.username", "admin");
		final String password = System.getProperty("mqtt.password", "password");

		MQTT mqtt = new MQTT();
		mqtt.setHost("localhost", port);
		mqtt.setUserName(userName);
		mqtt.setPassword(password);
		mqtt.setVersion("3.1.1");

		BlockingConnection con = mqtt.blockingConnection();
		con.connect();

		Topic[] topics = { new Topic("lights/home/balcony", QoS.AT_LEAST_ONCE) };
		byte[] qoses = con.subscribe(topics);
		Message message = con.receive();
		System.out.println(message.getTopic());

		byte[] payload = message.getPayload();
		// process the message then:
		message.ack();
		con.disconnect();

		System.out.println(new String(payload));
	}
}
