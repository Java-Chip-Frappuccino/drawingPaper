package com.drawingpaper.app.project;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.drawingpaper.app.action.Action;
import com.drawingpaper.app.action.ActionForward;
import com.drawingpaper.app.project.dao.ProjectDAO;

public class ProjectMyListOk implements Action{
	
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception{
		HashMap<String, Integer> projectMap = new HashMap<>();
		ActionForward af = new ActionForward();
		ProjectDAO dao = new ProjectDAO();
		
		/////////세션에서 받아올 유저넘버/////////////
		int user_no = 1;
		
		//전체 프로젝트 수 //////////다르게 뿌리기
		int total = dao.getMyProjectTotal();
		//사용자가 요청한 페이지
		String temp = req.getParameter("page");
		//요청한 페이지가 null이면 1페이지, 아니면 오쳥한 페이지를 page에
		int page = temp == null ? 1 : Integer.parseInt(temp);
		//한 페이지에 출력되는 게시글 수
		int rowCount = 10;
		//한 페이지에 나오는 페이지 번호 수
		int pageSize = 10;
		
		//페이지에서 출력되는 게시글 중 첫번째 프로젝트의 인덱스
		int startRow = (page - 1) * rowCount;
		
		//화면에 출력되는 페이지 번호 중
		//시작 페이지
		int startPage = ((page - 1) / pageSize) * pageSize + 1;
		//끝 페이지(10, 20, 30, ...)
		int endPage = startPage + pageSize - 1;
		//실제 마지막 프로젝트가 출력되는 마지막 페이지 번호
		int realEndPage = (int)Math.ceil(total / (double)rowCount);
		
		//화면에서의 마지막 페이지가 실제 마지막 페이지보다 크다면,
		//실제 마지막 페이지를 endPage에 담아준다.
		//endPage는 항상 10단위로 끝나기 때문에, 14페이지가 마지막 페이지일 경우
		//14페이지를 endPage에 담아준다.
		endPage = endPage > realEndPage ? realEndPage : endPage;
		
		//DB에서 select 할 때 필요한 데이터
		projectMap.put("user_no", user_no);
		projectMap.put("startRow", startRow);
		projectMap.put("rowCount", rowCount);
		
		req.setAttribute("myProjectList", dao.selectMyProject(projectMap));
		req.setAttribute("page", page);
		req.setAttribute("startPage", startPage);
		req.setAttribute("endPage", endPage);
		req.setAttribute("realEndPage", realEndPage);
		req.setAttribute("total", total);
		
		af.setRedirect(false);
		af.setPath("경로경로경로경로");
		
		
		return af;
	}

}
