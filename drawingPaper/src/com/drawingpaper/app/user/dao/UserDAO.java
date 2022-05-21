package com.drawingpaper.app.user.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.drawingpaper.app.mybatis.config.MyBatisConfig;

public class UserDAO {

	SqlSessionFactory sessionFactory = MyBatisConfig.getSqlsession_f();
	SqlSession sqlSession;
	
	public UserDAO() { // �⺻�����ڸ� ���� ������ �ɾ���� sql���� �۵��ȴ�.
		sqlSession = sessionFactory.openSession(true);
	}
	

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
	   
	   // īī�� api ȸ������
	   public int kakaoJoin(HashMap<String, String> kakaoJoinMap){
	      int userNumber = 0;
	      try {
	         userNumber = sqlSession.insert("User.kakaoInsert", kakaoJoinMap);
	         System.out.println("userNumber  : " + userNumber);
	      } catch (Exception e) {;}
	      return userNumber;
	   }
	   
	   // īī�� api �α���
	   public Map<String, String> kakaoLogin(String user_email) {
	      System.out.println("dao");
	      return sqlSession.selectOne("User.kakaoSelect", user_email);
	   }

	   // ���� ȭ�� ����(���� �̸�)����ֱ�
	}