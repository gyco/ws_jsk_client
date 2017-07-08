package com.rl.hello;

import javax.xml.ws.Endpoint;

public class ServerPublish {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:8080/hello", new HelloServer());
	}
}
