
package com.rl.hello;

import javax.jws.WebService;

@WebService
public class HelloServer {

	public String sayHello(String name){
		return "hello  "+name;
				
		
	}

}
