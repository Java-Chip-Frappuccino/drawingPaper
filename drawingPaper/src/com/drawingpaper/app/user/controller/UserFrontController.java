package com.drawingpaper.app.user.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.drawingpaper.app.action.ActionForward;

public class UserFrontController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String command = requestURI.substring(contextPath.length());
		ActionForward af = null;
		
		if(command.equals("/user/UserCheckEmailOk.us")) {
			try {
				af = new UserCheckEmailOk().execute(req, resp);
			} catch (Exception e) {
				System.out.println("아이디 중복검사 오류" + e);
			}
		} else if(command.equals("/user/UserJoinEmailOk.us")) {
			try {
				af = new UserJoinEmailOk().execute(req, resp);
			} catch (Exception e) {
				System.out.println("이메일로 회원가입 오류" + e);
			}
		} else if(command.equals("/user/UserEmailLogin.us")){
			af = new ActionForward();
			af.setRedirect(false);
			af.setPath("/app/login/emailLogin.jsp");
		} else if(command.equals("/user/UserJoinKakaoOk.us")) {
//			System.out.println("aa");
//			System.out.println(req.getParameter("email"));
//			System.out.println(req.getParameter("nickname"));
//			System.out.println(req.getParameter("id"));
			try {
				af = new UserJoinKakaoOk().execute(req, resp);
			} catch (Exception e) {
				System.out.println("카카오로 회원가입 오류" + e);;
			}
		}
		
		
		if(af != null) {// af가 null이 아니라면
			if(af.isRedirect()) {//redirect 방식이라면
				resp.sendRedirect(af.getPath());//redirect로 전송
				
			}else {//forward 방식이라면
				RequestDispatcher dispatcher = req.getRequestDispatcher(af.getPath());
				dispatcher.forward(req, resp);//forward로 전송
			}
		}
	}
}
