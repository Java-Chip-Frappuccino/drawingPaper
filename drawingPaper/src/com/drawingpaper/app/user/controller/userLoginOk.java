package com.drawingpaper.app.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.drawingpaper.app.action.Action;
import com.drawingpaper.app.action.ActionForward;
import com.drawingpaper.app.user.dao.UserDAO;
import com.drawingpaper.app.user.vo.UserVO;

public class userLoginOk implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		UserDAO dao = new UserDAO();
		UserVO vo = new UserVO();
		ActionForward af = new ActionForward();

		String user_email = req.getParameter("user_email");
		String user_pw = req.getParameter("user_pw");
		
		System.out.println("000");
		if(dao.emailCheck(user_email) && dao.pwCheck(user_pw)) {
			HttpSession session = req.getSession(); // ������� Ʈ��� ���� �߻�
			
			System.out.println("�α��� ����"); // ����
			session.setAttribute("user_no", vo.getUser_no());
			session.setAttribute("user_email", vo.getUser_email());
			session.setAttribute("user_name", vo.getUser_name());
			session.setAttribute("user_kakao", vo.isUser_kakao());
			
			af.setRedirect(true); // redirect
			af.setPath(req.getContextPath() + "/user/userLoginOk.us"); // ������������ ��� ���� ����
			
		} else if(!dao.emailCheck(user_email) && dao.pwCheck(user_pw)){
			
			System.out.println("���̵� ����");
			af.setRedirect(false); // forward 
			af.setPath(req.getContextPath() + "/user/emailLogin.us?code=" + 0);
			
			
		} else if(dao.emailCheck(user_email) && !dao.pwCheck(user_pw)) {

			System.out.println("��� ����");
			af.setRedirect(false);
			af.setPath(req.getContextPath() + "/user/emailLogin.us?code=" + 1);
			
		} else {
			System.out.println("�α��� ����");
		}
		
	
		return af;
	}
	
	

}
