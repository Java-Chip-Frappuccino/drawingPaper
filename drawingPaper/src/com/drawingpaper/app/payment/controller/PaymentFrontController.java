package com.drawingpaper.app.payment.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.drawingpaper.app.action.ActionForward;

public class PaymentFrontController  extends HttpServlet {
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
		
		
		if(command.equals("/payment/PaymentComplete.pm")) { // 결제 정보 업로드 이동
			try {
				af = new PaymentComplete().execute(req, resp);
			} catch (Exception e) {
				System.out.println("결제 정보 등록 실패" + e);
			}
		}else if(command.equals("/payment/Payment.pm")) { // 결제완료시 이동
			af = new ActionForward();
			af.setRedirect(false);
			af.setPath("/app/payment/payment.jsp");
		}
		
		
		if(af != null) { 
			if(af.isRedirect()) {
				resp.sendRedirect(af.getPath());
				
			}else {
				RequestDispatcher dispatcher = req.getRequestDispatcher(af.getPath());
				dispatcher.forward(req, resp);
			}
		}
	}
	
	
}
