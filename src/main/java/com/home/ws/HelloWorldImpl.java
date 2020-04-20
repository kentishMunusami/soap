package com.home.ws;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.home.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}
