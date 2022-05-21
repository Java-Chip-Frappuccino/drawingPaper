package com.drawingpaper.app.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.drawingpaper.app.action.Action;
import com.drawingpaper.app.action.ActionForward;
import com.drawingpaper.app.user.dao.UserDAO;
import com.drawingpaper.app.user.vo.UserVO;

public class userLogoutOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {

		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");

		UserDAO dao = new UserDAO();
		UserVO vo = new UserVO();
		ActionForward af = new ActionForward();

		HttpSession session = req.getSession(); // ������ ������
		System.out.println(session.toString()); // ���� Ȯ��

		if (dao.logout()) {
			session.invalidate(); // ���� �ʱ�ȭ
		}

		System.out.println("�α׾ƿ� ����");
		af.setRedirect(true);
		af.setPath(req.getContextPath() + "/user/emailLogin.us"); // ���������� ��� ���� ����

		return af;
	}

}