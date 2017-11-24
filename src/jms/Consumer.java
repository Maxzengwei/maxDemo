package jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;


public class Consumer{
	
    //默认连接用户名
    private static final String USERNAME = ActiveMQConnection.DEFAULT_USER;
    //默认连接密码
    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;
    //默认连接地址
    private static final String BROKEURL = ActiveMQConnection.DEFAULT_BROKER_URL;

    
	public static void main(String[] args){
    	ConnectionFactory factory;
    	factory = new ActiveMQConnectionFactory(Consumer.USERNAME,Consumer.PASSWORD,Consumer.BROKEURL);
    	
    	try{
    		Connection conn = factory.createConnection();
    		conn.start();
    		
    		Session session = conn.createSession(true, Session.AUTO_ACKNOWLEDGE);
    		Destination dest = session.createQueue("HW");
    		MessageConsumer msgConsumer = session.createConsumer(dest);
    		
    		while(true){
    			TextMessage message = (TextMessage) msgConsumer.receive(100000);//readMessage(session,msgConsumer);
    			if(message!=null){
    	    		System.out.println("接收消息： Activemq 接收消息"+message.getText());

    			}else{
    				break;
    			}
    		}
    		System.out.println("接收消息完毕");
    	}catch(Exception e){
			e.printStackTrace();
		}
    }
    
    public static TextMessage readMessage(Session session,MessageConsumer msgConsumer){
    	TextMessage message = null;
    	try{
    		message = (TextMessage) msgConsumer.receive(10);
    	}catch(Exception e){
    		e.printStackTrace();		
    	}
		return message;

    }
}