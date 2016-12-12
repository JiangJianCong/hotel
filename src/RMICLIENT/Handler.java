package RMICLIENT;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

/**************************************************************
 * Handler 
 * @author 蒋健聪
 * @Description 在文件中写入操作日志
 * @see InvocationHandler
 *************************************************************/
public class Handler implements InvocationHandler {
	
	private static Logger logger;
	private static java.util.logging.Handler handler;
	private Object delegate;
	String file_name = "bigworkLog";

	public static Object getProxy(Object o) {
		Handler h = new Handler(o);
		Object odelegate = Proxy.newProxyInstance(o.getClass().getClassLoader(),
				o.getClass().getInterfaces(), h);
		return odelegate;
	}

	private String getLogName() {
		StringBuffer logPath = new StringBuffer();
		logPath.append(System.getProperty("user.home"));
		logPath.append("\\" + file_name);
		File file = new File(logPath.toString());
		if (!file.exists()) {
			file.mkdir();
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		logPath.append("\\" + sdf.format(new Date()) + ".log");
		return logPath.toString();
	}

	public Handler(Object deleObject) {
		try {
			if (logger == null) {
				logger = Logger.getLogger(this.getClass()
						.getName());
			}
			if (handler == null) {
				handler = new FileHandler(getLogName());
				handler.setEncoding("utf8");
				logger.addHandler(handler);
			}
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
		delegate = deleObject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object o = null;
		logger.info("here the method " + method + " start");
		o = method.invoke(delegate, args);
		logger.info("here the method " + method + " end");
		return o;
	}

}
