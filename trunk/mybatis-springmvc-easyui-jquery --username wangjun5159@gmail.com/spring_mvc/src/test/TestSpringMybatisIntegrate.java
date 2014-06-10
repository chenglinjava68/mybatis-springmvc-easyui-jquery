package test;

import java.io.IOException;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.BlogManageService;

public class TestSpringMybatisIntegrate {

	private static ApplicationContext context;

	@BeforeClass
	public static void init() throws IOException{
		String configLocation = "applicationContext.xml";
		context = new ClassPathXmlApplicationContext(configLocation);
		
	}
	
	/**
	 * 测试连接数据库是否正常
	 */
	@Test
	public void testSaveBlog(){
		BlogManageService blogManageService= (BlogManageService) context.getBean("blogManageService");
		blogManageService.saveBlog("jun");
	}
	
	/**
	 * 测试连接数据库是否正常
	 */
	@Test
	public void testFindAllBlog(){
		BlogManageService blogManageService= (BlogManageService) context.getBean("blogManageService");
		blogManageService.findAllBlog();
	}
	
	
}
