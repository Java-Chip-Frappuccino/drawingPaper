package com.drawingpaper.app.mybatis.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class MyBatisConfig {
	private static SqlSessionFactory sqlSession_f;
	
	static {
		try {
			String resource = "./com/drawingpaper/app/mybatis/config/config.xml";	
			Reader reader = Resources.getResourceAsReader(resource); 
			sqlSession_f = new SqlSessionFactoryBuilder().build(reader); 
			reader.close(); 
		} catch (IOException e) {
			e.printStackTrace();
<<<<<<< HEAD
			throw new RuntimeException("ì´ˆê¸°í™” ë¬¸ì œ ë°œìƒ, MybatisConfig.java");
		} catch (Exception e) {
			System.out.println(e);
=======
			throw new RuntimeException("ÃÊ±âÈ­ ¹®Á¦ ¹ß»ý, MybatisConfig.java");
>>>>>>> 4b3c978687e35f27f7cd831308c99a5133c3fa42
		}
	}

	public static SqlSessionFactory getSqlsession_f() {
		return sqlSession_f;
	}
	
	
}
