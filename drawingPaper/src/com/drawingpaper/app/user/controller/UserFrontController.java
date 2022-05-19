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
				System.out.println("���̵� �ߺ��˻� ����" + e);
			}
		} else if(command.equals("/user/UserJoinEmailOk.us")) {
			
		} else {
			
		}
		
		if(af != null) {// af�� null�� �ƴ϶��
			if(af.isRedirect()) {//redirect ����̶��
				resp.sendRedirect(af.getPath());//redirect�� ����
				
			}else {//forward ����̶��
				RequestDispatcher dispatcher = req.getRequestDispatcher(af.getPath());
				dispatcher.forward(req, resp);//forward�� ����
			}
		}
	}
}
