package com.nt.beans;

public abstract class WebContainers {
  //declaring abstarct method having return type is dependent
	public abstract RequestHandler createhandler();
	//implementing business method
	public void processdata(String data) {
		RequestHandler handler=null;
		System.out.println("web container is processing data"+data+"through Requesthandler");
		//get dependent class Objcet
		handler=createhandler();
		handler.handleRequest(data);
	}
}
