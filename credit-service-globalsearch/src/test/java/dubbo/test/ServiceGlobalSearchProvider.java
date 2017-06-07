package dubbo.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceGlobalSearchProvider {
	
	private static final Log log = LogFactory.getLog(ServiceGlobalSearchProvider.class);

	public static void main(String[] args) {
		String[] springXML = new String[]{"classpath:spring-core.xml","classpath:spring-mybatis.xml","classpath:spring-dubbo-provider.xml","classpath:spring-dubbo-consumer.xml"};
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springXML);
			context.start();
		} catch (Exception e) {
			log.error("== ServiceBossProvider context start error:",e);
		}
		synchronized (ServiceGlobalSearchProvider.class) {
			while (true) {
				try {
					ServiceGlobalSearchProvider.class.wait();
				} catch (InterruptedException e) {
					log.error("== synchronized error:",e);
				}
			}
		}
	}
    
}