package com.drawingpaper.app.project.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.drawingpaper.app.action.Action;
import com.drawingpaper.app.action.ActionForward;
import com.drawingpaper.app.project.dao.ProjectDAO;
import com.drawingpaper.app.project.vo.ProjectVO;
import com.drawingpaper.app.user.dao.UserDAO;
import com.drawingpaper.app.user.vo.UserVO;

public class ProjectListOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		ProjectDAO dao = new ProjectDAO();
		UserDAO udao = new UserDAO();
		ActionForward forward = new ActionForward();
		int totalCount = dao.getTotal();
		List<ProjectVO> list = dao.getList();
		
		
		for(ProjectVO per:list) {
			
			int goalprice = Integer.parseInt(per.getPro_goalprice());
			int achieveprice = Integer.parseInt(per.getPro_achieveprice());
			int percent =  (int) ((Integer)achieveprice / (goalprice * 1.0)*100);
			per.setPercent(percent); // 占쎈쓠占쎄쉽占쎈뱜 �④쑴沅�
			
			Date now = new Date();
	        String eday = per.getPro_end();
	        String strFormat = "yyyyMMdd";    //strStartDate 占쏙옙 strEndDate 占쎌벥 format
	        
	        SimpleDateFormat sdf = new SimpleDateFormat(strFormat);
	        //SimpleDateFormat 占쎌뱽 占쎌뵠占쎌뒠占쎈릭占쎈연 startDate占쏙옙 endDate占쎌벥 Date 揶쏆빘猿쒐몴占� 占쎄문占쎄쉐占쎈립占쎈뼄.
	        String nowd = sdf.format(now);
            Date nowDate  = sdf.parse(nowd);
            Date endDate = sdf.parse(eday);
 
            //占쎈あ占쎄텊筌욑옙 占쎄텢占쎌뵠占쎌벥 占쎈뻻揶쏉옙 筌△뫁�뵠(ms)�몴占� 占쎈릭�뙴占� 占쎈짗占쎈툧占쎌벥 ms(24占쎈뻻*60�겫占�*60�룯占�*1000獄쏉옙�뵳�딇겧) 嚥∽옙 占쎄돌占쎈듌占쎈뼄.
            long diff = (endDate.getTime() - nowDate.getTime()) / (24*60*60*1000);
            int ifdiff = (int)diff;
            String diffDay = Long.toString(diff);
            
            if(ifdiff == 1) {
            	per.setDiffDay("오늘마감");
            } else if(ifdiff < 1) {
            	dao.setOngogin(per.getPro_no());
            } else {
            	per.setDiffDay(diffDay + "일 남음");            	
            }
            
            //�씠誘몄� 寃쎈줈濡� 諛붽퓭�꽌 ���옣
            String strimage = "/images/project/img1/" + per.getPro_images();
            per.setPro_images(strimage);
            
            //user_no濡� 留욎떠�꽌 異쒕젰
        	per.setUserName(udao.getUserName(per.getUser_no()));

		
		}

		req.setAttribute("totalCount", totalCount);
		req.setAttribute("projectList", dao.getList());
		
		forward.setRedirect(false);
		forward.setPath("/app/project/projectList.jsp");
		
		return forward;
	}
}
