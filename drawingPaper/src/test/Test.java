package test;

import com.drawingpaper.app.user.dao.UserDAO;
import com.drawingpaper.app.user.vo.UserVO;

public class Test {
	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		UserVO vo = new UserVO();
		vo.setUser_email("ccc@naver.com");
		vo.setUser_name("cc");
		vo.setUser_pw("0000");
		
//		dao.joinEmail(vo);
		dao.joinEmail("ȫ�浿", "hgd123@naver.com", "1234");
		
		if(dao.checkEmail("ccc@naver.com")) {
			System.out.println("�����ϴ� email�Դϴ�.");
		} else {
			System.out.println("�������� �ʴ� email�Դϴ�.");
		}
		
		
	}
}
