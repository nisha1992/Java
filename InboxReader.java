import java.io.*;
import javax.mail.*;
import java.util.Properties;
import javax.mail.internet.InternetAddress;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.internet.MimeMessage;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import java.util.HashMap;
import java.util.regex.*;

public class InboxReader extends Thread 
{

 
public static void main(String args[])throws IOException
 {
Pattern p=Pattern.compile("[a-z A-Z \"]+");
final String uname ,password ;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Your username :-");
uname = br.readLine();
System.out.println("Enter Your Password :-");
Console console =System.console();
char [] pass = console.readPassword();
password = String.copyValueOf(pass);
System.out.println("In Progress ......\n\n");
Properties props = System.getProperties();
props.setProperty("mail.store.protocol", "imaps");
try {
  MultiHashMapImp<String, String> map = new MultiHashMapImp();  
Session session = Session.getDefaultInstance(props, null);
Store store = session.getStore("imaps");
store.connect("imap.gmail.com", uname, password);
System.out.println(store);
Folder inbox = store.getFolder("Inbox");
inbox.open(Folder.READ_ONLY);
Message messages[] = inbox.getMessages();
/*for(int i=0;i<messages.length;i++)
 {
r=InternetAddress.toString(messages[i].getFrom());
Matcher m=p.matcher(r);
if(m.find())
{
x=m.group();
System.out.print(x+"\t");
map.get(x);
}
}*/
for(int i=0;i<messages.length;i++)
 {
String r=InternetAddress.toString(messages[i].getFrom());
Matcher m=p.matcher(r);
Object content = messages[i].getContent();
String contentReturn = null;
if (content instanceof String) 
{
contentReturn = (String) content;
} 
else if (content instanceof Multipart) 
{
Multipart multipart = (Multipart) content;
BodyPart part = multipart.getBodyPart(0);
part.toString();
contentReturn = part.getContent().toString();
}
if(m.find())
{
String x=m.group();
map.put(x,contentReturn);
}

   
/*System.out.println(contentReturn);
System.out.println("Content" +((messages[i].getContent())));
System.out.println("From: " + InternetAddress.toString(messages[i].getFrom()));
System.out.println("Reply-to: " + InternetAddress.toString(messages[i].getReplyTo()));
String to = InternetAddress.toString(messages[i].getRecipients(Message.RecipientType.TO));
System.out.println("To: " + to);
String cc = InternetAddress.toString(messages[i].getRecipients(Message.RecipientType.CC));
System.out.println("Cc: " + cc);
String bcc = InternetAddress.toString(messages[i].getRecipients(Message.RecipientType.BCC));
System.out.println("Bcc: " + bcc);
System.out.println("Subject: " + messages[i].getSubject());
System.out.println("Sent: " + messages[i].getSentDate());
System.out.println("Received: " + messages[i].getReceivedDate());*/


}

map.get("Shopnineteen ");
//map.putAll();

System.out.println(inbox.getMessageCount());
} catch (NoSuchProviderException e) {
e.printStackTrace();
System.exit(1);
} catch (MessagingException e) {
e.printStackTrace();
System.exit(2);
}

}

}
