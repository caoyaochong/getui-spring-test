package cn.edu.zju.cst.examples.getui_spring_test.exception.log;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		try {
			Test.testMethod();
		} catch(Exception e) {
//			String info = getErrorInfoFromException(e);
			String info ="javax.mail.SendFailedException: Invalid Addresses\n" + 
  "nested exception is:\n"+
	"com.sun.mail.smtp.SMTPAddressFailedException: 550 User suspended: zhouqf@getui.com\n" + 

	"at com.sun.mail.smtp.SMTPTransport.rcptTo(SMTPTransport.java:1294)\n" + 
	"at com.sun.mail.smtp.SMTPTransport.sendMessage(SMTPTransport.java:635)\n" + 
	"at javax.mail.Transport.send0(Transport.java:189)\n" + 
	"at javax.mail.Transport.send(Transport.java:118)\n" + 
	"at com.gexin.bi.utils.mail.SendAsynMailUtils.run(SendAsynMailUtils.java:68)\n" + 
"Caused by: com.sun.mail.smtp.SMTPAddressFailedException: 550 User suspended: zhouqf@getui.com\n" + 

	"at com.sun.mail.smtp.SMTPTransport.rcptTo(SMTPTransport.java:1145)\n" + 
	"... 4 more";
			List<String> list  = readErrorMail(info);
			System.out.println(list.size());
		}

	}
	
	
	public static  void testMethod() {
		int a = 1 / 0;
	}
	
	public static String getErrorInfoFromException(Exception e) {
        try {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            return "\r\n" + sw.toString() + "\r\n";
        } catch (Exception e2) {
            return "bad getErrorInfoFromException";
        }
    }
	
	public   static List<String> readErrorMail(String info) {
		List<String> retList = new ArrayList<String>();
		String[] infos = info.split("\n");
		for(String str : infos) {
			if(str.contains("550 User suspended:")) {
				int index = str.indexOf("550 User");
				int len = "550 User suspended:".length();
				int startIndex = len + index + 1;
				int endIndex = str.length();
				String email = str.substring(startIndex, endIndex);
				System.out.println(email);
				if(!retList.contains(email)) {
					retList.add(email);
				}
			}
		}
		return  retList;
	}

}
