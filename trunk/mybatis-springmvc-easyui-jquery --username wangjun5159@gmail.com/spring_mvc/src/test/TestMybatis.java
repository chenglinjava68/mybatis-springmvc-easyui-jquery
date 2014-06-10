package test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import persistence.BlogMapper;

import domain.Blog;


/**
 * SqlSessionFactoryBuilder用于创建SqlSessionFactory
 * SqlSessionFactory用于创建SqlSession
 * @author adewang
 *
 */
public class TestMybatis {

	
	private static SqlSessionFactory sqlSessionFactory;
	

	@BeforeClass
	public static void init() throws IOException{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	/**
	 * 测试连接数据库是否正常
	 */
	@Test
	public void testMybatisConnect(){
		SqlSession session = sqlSessionFactory.openSession();
		session.close();
	}
}
