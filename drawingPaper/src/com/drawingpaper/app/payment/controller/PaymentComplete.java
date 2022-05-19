package com.drawingpaper.app.payment.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.drawingpaper.app.action.Action;
import com.drawingpaper.app.action.ActionForward;
import com.drawingpaper.app.payment.dao.PaymentDAO;
import com.drawingpaper.app.payment.vo.PaymentVO;

public class PaymentComplete implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// 데이터 베이스 업로드
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		PaymentVO vo = new PaymentVO();
		PaymentDAO dao = new PaymentDAO();
		ActionForward forward = new ActionForward();
		
		private int pay_no;
		private int user_no;
		private int pro_no;
		private String pay_date;
		private String pay_price;
		private String pay_merchantuid;
		
		vo.setPay_no( req.getParameter("pay_no") );
		vo.setUser_no( req.getParameter("") );
		vo.setPro_no( req.getParameter("") );
		vo.setPayment( req.getParameter("") );
		vo.setPayment( req.getParameter("") );
		vo.setPayment( req.getParameter("") );
		
		return null;
	}

}
