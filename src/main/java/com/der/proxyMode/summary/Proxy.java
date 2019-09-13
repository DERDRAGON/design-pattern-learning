package com.der.proxyMode.summary;

public class Proxy extends Subject {

	private Subject subject;

	public void setSubject(RealSubject subject) {
		this.subject = subject;
	}

	@Override
	public void request() {
		if (null != subject) {
			subject.request();
		}
	}

}
