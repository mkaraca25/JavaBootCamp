package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdaptor implements LoggerService {

	@Override
	public void logToSystem(String message) {
		// TODO Auto-generated method stub
		JLoggerManager manager=new JLoggerManager();
		manager.log(message);
	}

}
