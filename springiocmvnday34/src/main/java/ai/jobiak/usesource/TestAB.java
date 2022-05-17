package ai.jobiak.usesource;
import org.springframework.core.io.FileSystemResource;

import ai.jobiak.source.A;
import org.springframework.beans.factory.BeanFactory; 
import org.springframework.beans.factory.xml.XmlBeanFactory;
import ai.jobiak.ifaces.BDigital;

public class TestAB {
public static void main(String[] args) {

		

		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		//B b=new B();
		
		BDigital bDigital=(BDigital)factory.getBean("bDigital");

		bDigital.publish();
}

}
