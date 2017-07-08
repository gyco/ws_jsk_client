package com.rl.client;

import com.rl.stub.MobileCodeWS;
import com.rl.stub.MobileCodeWSSoap;

public class TestMobileCodeClient {

	public static void main(String[] args) {
		MobileCodeWS mc = new MobileCodeWS();
		MobileCodeWSSoap wsSoap = mc.getMobileCodeWSSoap();
		String info = wsSoap.getMobileCodeInfo("13538861346", null);
		System.out.println(info);
	}
}
