package RMICLIENT;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import service.accountService;
import service.basicDataService;
import service.commentService;
import service.dataService;
import service.orderService;
import service.promotionService;

/**************************************************************
 * RMIClient 
 * @author 蒋健聪 151250070
 * @Description 专门从RMI获取服务器数据的类。
 *
 *************************************************************/

public class RMIClient {
	public static String IP = "localhost";
	public static int PORT = 8888;
	
	private static dataService data = null;
	private static commentService comment = null;
	private static orderService order = null;
	private static promotionService promotion = null;
	private static accountService account = null;
	private static basicDataService basicData = null;
	
	
	
	
	private static Exception exception = null;
	
	/**************************************************************
	 * public RMIClient()
	 * 
	 * @throws MalformedURLException, RemoteException, NotBoundException
	 * @Description RMIClient的构造函数。获取RMI服务注册表中数据。
	 * @Sample 
	 * 
	 *************************************************************/
	
	public RMIClient(){
		exception = null;
		try {
			data = (dataService)Naming.lookup("rmi://" + IP + ":"+PORT+"/dataServer");
			data=(dataService)Handler.getProxy(data);
			
			comment = (commentService)Naming.lookup("rmi://" + IP + ":"+PORT+"/commentServer");
			comment=(commentService)Handler.getProxy(comment);
			
			order = (orderService)Naming.lookup("rmi://" + IP + ":"+PORT+"/orderServer");
			order=(orderService)Handler.getProxy(order);
			
			promotion = (promotionService)Naming.lookup("rmi://" + IP + ":"+PORT+"/promotionServer");
			promotion=(promotionService)Handler.getProxy(promotion);
			
			
			account = (accountService)Naming.lookup("rmi://" + IP + ":"+PORT+"/accountServer");
			account=(accountService)Handler.getProxy(account);
			
			basicData = (basicDataService)Naming.lookup("rmi://" + IP + ":"+PORT+"/basicDataServer");
			basicData=(basicDataService)Handler.getProxy(basicData);
			
			
		}catch (MalformedURLException e) {
//			System.err.println(getClass() + ": 出现了错误的 URL。或者在规范字符串中找不到任何合法协议，或者无法解析字符串。");
			exception = new Exception(e.getClass().getName());
		} catch (RemoteException e) {
//			System.err.println(getClass() + ": Remote发生与通信相关的异常。");
			exception = new Exception(e.getClass().getName());
		} catch (NotBoundException e) {
//			System.err.println(getClass() + ": 注册表中没有相关绑定的名称。");
			exception = new Exception(e.getClass().getName());
		}
	}
	
	public Exception getException(){
		return exception;
	}
	/* =========================================================
		以下是所有的getter方法
	==========================================================*/
	
	public static dataService getdataService(){
		return data;
	}
	
	public static commentService getCommentService(){
		return comment;
	}
	
	public static orderService getOrderService(){
		return order;
	}
	
	
	public static promotionService getPromotionService(){
		return promotion;
	}
	
	public static accountService getAccountService(){
		return account;
	}
	
	public static basicDataService getBasicDataService(){
		return basicData;
	}
	
}
