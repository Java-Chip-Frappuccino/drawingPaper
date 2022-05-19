package com.drawingpaper.app.user.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.drawingpaper.app.mybatis.config.MyBatisConfig;
import com.drawingpaper.app.user.vo.UserVO;

public class UserDAO {

	SqlSessionFactory sessionFactory = MyBatisConfig.getSqlsession_f();
	SqlSession sqlSession;
	
	public UserDAO() { // �⺻�����ڸ� ���� ������ �ɾ���� sql���� �۵��ȴ�.
		sqlSession = sessionFactory.openSession(true);
	}
	
	// īī�� �α���
	
	// �Ϲ� �α���
	public boolean login(String user_email, String user_pw) {
		HashMap<String, String> userMap = new HashMap<>();
		userMap.put("user_email", user_email);
		userMap.put("user_pw", user_pw);
		return (Integer)(sqlSession.selectOne("User.login", userMap)) == 1;
	}
	
	
	//�̸���(id) �˻� 	-> true(�ߺ�)
	public boolean checkEmail(String user_email) {
		return (Integer)(sqlSession.selectOne("User.checkEmail", user_email)) == 1;
	}
	
	//�̸��Ϸ� ȸ������
	public void joinEmail(String name, String email, String pw) {
		HashMap<String, String> emailJoinInfo = new HashMap<>();
		emailJoinInfo.put("user_email", email);
		emailJoinInfo.put("user_name", name);
		emailJoinInfo.put("user_pw", pw);
		
		sqlSession.insert("User.joinEmail", emailJoinInfo);
	}
}
