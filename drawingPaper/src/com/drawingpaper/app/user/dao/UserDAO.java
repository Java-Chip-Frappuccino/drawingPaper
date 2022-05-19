package com.drawingpaper.app.user.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.drawingpaper.app.mybatis.config.MyBatisConfig;

public class UserDAO {

	SqlSessionFactory sessionFactory = MyBatisConfig.getSqlsession_f();
	SqlSession sqlSession;
	
	public UserDAO() { // �⺻�����ڸ� ���� ������ �ɾ���� sql���� �۵��ȴ�.
		sqlSession = sessionFactory.openSession(true);
	}
	
	// īī�� �α���

	// �Ϲ� �α��� �α׾ƿ� ��ȿ���� ��� true�� �α��� ����
	// �α��� ��ȿ�� üũ
	public boolean emailCheck(String user_email) {
		return (Integer)(sqlSession.selectOne("User.emailCheck", user_email)) == 1;
	}
	
	// ��й�ȣ ��ȿ�� üũ
	public boolean pwCheck(String user_pw) {
		return (Integer)(sqlSession.selectOne("User.pwCheck", user_pw)) == 1;
	}
	
	// �α׾ƿ�
	public boolean logout() {
		return true;
	}

	// ���� ȭ�� ����(���� �̸�)����ֱ�
}
