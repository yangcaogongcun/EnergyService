package com.stand.spring.util;

import java.security.GeneralSecurityException;
import java.util.Properties;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

import com.stand.spring.model.Email;
import com.sun.mail.util.MailSSLSocketFactory;

/**
 * 本类测试简单邮件 直接用邮件发送数据库已经被删除如要发送现将Email的对象值传入
 * @author Administrator
 */
@Component("sendEmail")
public class SendEmail {

	/**
	 * 调用发送邮件
	 * @param email
	 */
	public void send(Email email) {
		JavaMailSenderImpl senderImpl = new JavaMailSenderImpl();
		// 设定 mail server
		senderImpl.setHost(email.getHost());
		// 建立邮件消息
		SimpleMailMessage mailMessage = new SimpleMailMessage(); //
		// 设置收件人，寄件人 用数组发送多个邮件
		mailMessage.setTo(email.getReciveemailname());
		mailMessage.setFrom(email.getSendemailname());
		mailMessage.setSubject(email.getSubject());
		mailMessage.setText("测试我的简单邮件发送机制！！");
		senderImpl.setUsername(email.getSendemailname()); // 根据自己的情况,设置username
		senderImpl.setPassword(email.getSendemailpassword()); // 根据自己的情况, 设置password，此处的password不一定是用户的明文密码，也可能是邮箱的授权码，这个需要开启，具体百度
		MailSSLSocketFactory sf;
		try {
			sf = new MailSSLSocketFactory();
			sf.setTrustAllHosts(true);
			Properties prop = new Properties();
			prop.put("mail.smtp.ssl.enable", "true");
			prop.put("mail.smtp.ssl.socketFactory", sf);
			prop.put("mail.smtp.auth", "true"); // 将这个参数设为true，让服务器进行认证,认证用户名和密码是否正确
			prop.put("mail.smtp.timeout", "5000");
			senderImpl.setJavaMailProperties(prop); // 发送邮件
			senderImpl.send(mailMessage);
			System.out.println("发送成功！");
		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			System.out.println("发送失败！");
			e.printStackTrace();
			
		}
	}

	

		/*
		 * String to = "acreltest@126.com"; String subject = "测试邮件"; String
		 * content = "helloworld"; MailSSLSocketFactory sf = new
		 * MailSSLSocketFactory();sf.setTrustAllHosts(true); Properties
		 * properties = new Properties(); properties.put("mail.smtp.host",
		 * "smtp.qq.com"); //properties.put("mail.smtp.port", "25");
		 * properties.put("mail.smtp.auth", "true");
		 * properties.put("mail.smtp.timeout", "5000");
		 * properties.put("mail.smtp.ssl.enable", "true");
		 * properties.put("mail.smtp.ssl.socketFactory", sf); //crjvfeqcoyrnbhhh
		 * Authenticator authenticator = new
		 * Email_Authenticator("312339267@qq.com", "crjvfeqcoyrnbhhh");
		 * javax.mail.Session sendMailSession =
		 * javax.mail.Session.getDefaultInstance(properties, authenticator);
		 * MimeMessage mailMessage = new MimeMessage(sendMailSession);
		 * mailMessage.setFrom(new InternetAddress("312339267@qq.com")); //
		 * Message.RecipientType.TO属性表示接收者的类型为TO
		 * mailMessage.setRecipient(Message.RecipientType.TO, new
		 * InternetAddress(to)); mailMessage.setSubject(subject, "UTF-8");
		 * mailMessage.setSentDate(new Date()); //
		 * MiniMultipart类是一个容器类，包含MimeBodyPart类型的对象 Multipart mainPart = new
		 * MimeMultipart(); // 创建一个包含HTML内容的MimeBodyPart BodyPart html = new
		 * MimeBodyPart(); html.setContent(content.trim(),
		 * "text/html; charset=utf-8"); mainPart.addBodyPart(html);
		 * mailMessage.setContent(mainPart); Transport.send(mailMessage);
		 * System.out.println("发送成功");
		 */
	}


/*
 * class Email_Authenticator extends Authenticator { String userName = null;
 * String password = null;
 * 
 * public Email_Authenticator() { }
 * 
 * public Email_Authenticator(String username, String password) { this.userName
 * = username; this.password = password; }
 * 
 * protected PasswordAuthentication getPasswordAuthentication() { return new
 * PasswordAuthentication(userName, password); } }
 */