package com.der.proxyMode.summary;

public class Client {

	public static void main(String[] args) {
		Proxy proxy = new Proxy();
		proxy.setSubject(new RealSubject());
		proxy.request();
	}
}
