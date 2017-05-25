package com.cmsz.demon.index.schedule;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.corundumstudio.socketio.SocketIOServer;

public class Socketio {

	private static Logger logger = LoggerFactory.getLogger(Socketio.class);
	
	@Autowired
	SocketIOServer socketIOServer;
	
	public void push() throws Exception{
		HashMap<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("hello", "world");
		logger.debug("Socketio push");
		socketIOServer.getBroadcastOperations().sendEvent("helloEvent", resultMap);
	}
	
}
