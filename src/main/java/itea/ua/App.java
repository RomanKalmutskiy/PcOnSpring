package itea.ua;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	
	public static void main(String[] args) throws MalformedURLException {
		
		
		ClassContextLoader loader = new ClassContextLoader();

		System.out.println("adress loader;  "+loader.getUrl().toString());
		
		System.out.println(new File("context.xml").toURI().toString());
	
	/*	
		URL url = this.getClass().getClassLoader().getResource("context.xml");
		String context = url.toString();
	*/	
		//ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext(new String[]{"context.xml"});
		
		//ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext(new String[]{fi});
		
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext(new String[]{new File("context.xml").toURI().toString()});
		
		
		Pc pc=(Pc) ac.getBean("MyPC");
    	System.out.println(pc);
    	//MotherBoard mb =(MotherBoard) ac.getBean("myMotherBoard");
		//Cpu cpu = (Cpu) ac.getBean("cpu");
    	
  	
    	//System.out.println(mb);
	}

}
