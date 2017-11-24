package jms;


import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import com.sun.media.jfxmedia.logging.Logger;
/**
 * 消息的生产者（发送者） 
 * @author liang
 *
 */
public class Producer{

    //默认连接用户名
    private static final String USERNAME = ActiveMQConnection.DEFAULT_USER;
    //默认连接密码
    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;
    //默认连接地址
    private static final String BROKEURL = ActiveMQConnection.DEFAULT_BROKER_URL;
    //发送的消息数量
    private static final int SENDNUM = 10;
    
	public static void main(String[] args){
		ConnectionFactory factory;
		Connection connection = null;
		
		factory = new ActiveMQConnectionFactory(Producer.USERNAME,Producer.PASSWORD,Producer.BROKEURL);
		System.out.println("factory parameters:"+Producer.USERNAME+" "+Producer.PASSWORD+" "+Producer.BROKEURL);
		Logger.logMsg(Logger.INFO,Producer.USERNAME+Producer.PASSWORD+Producer.BROKEURL);
		try{
			connection = factory.createConnection();
			connection.start();
			Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
			Destination dest = session.createQueue("HW");
			MessageProducer messageProducer = session.createProducer(dest);
			sendMessage(session,messageProducer);
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(connection != null){
				try{
					connection.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		
    }
    
    /**
     * 发送消息
     * @param session
     * @param messageProducer  消息生产者
     * @throws Exception
     */
    public static void sendMessage(Session session,MessageProducer messageProducer) throws Exception{
        for (int i = 0; i < Producer.SENDNUM; i++) {
            //创建一条文本消息 
            TextMessage message = session.createTextMessage("ActiveMQ 发送消息" +i);
            System.out.println("发送消息：Activemq 发送消息" + i);
            //通过消息生产者发出消息 
            messageProducer.send(message);
        }

    }
}