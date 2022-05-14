package com.drawingpaper.app.mybatis.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// SqlSession Factory Builder (���ǿ� ����ִ� ����)
public class MyBatisConfig {
	private static SqlSessionFactory sqlSession_f;
	
	static {
		try {
			String resource = "./config/config.xml";	// ��� ���� (config������ ���� ������ ���´�.)
			Reader reader = Resources.getResourceAsReader(resource); // �ش� ��� ������ �о�´�.
			sqlSession_f = new SqlSessionFactoryBuilder().build(reader); // ���丮�� ������, ��θ� �о���� ������ �����.
			reader.close(); // �б⸦ �ݴ´�.
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("�ʱ�ȭ ���� �߻�, MyBatisConfig.java");
		}
	}

	public static SqlSessionFactory getSqlsession_f() {	// getter ���� -> �������⸸ �ϸ� ��
		return sqlSession_f;
	}
	
	
}
