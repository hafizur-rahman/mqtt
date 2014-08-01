package com.jdreamer.iot;

import org.fusesource.mqtt.client.BlockingConnection;
import org.fusesource.mqtt.client.MQTT;
import org.fusesource.mqtt.client.QoS;

public class Publish {

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
		con.publish("lights/home/balcony", "off".getBytes(), QoS.AT_LEAST_ONCE,
				true);

		con.disconnect();
	}
}
