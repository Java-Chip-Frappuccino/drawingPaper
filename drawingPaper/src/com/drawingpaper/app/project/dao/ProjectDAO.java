package com.drawingpaper.app.project.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.drawingpaper.app.mybatis.config.MyBatisConfig;
import com.drawingpaper.app.project.vo.ProjectDTO;

public class ProjectDAO {
	SqlSessionFactory sqlSessionFactory = MyBatisConfig.getSqlsession_f();
	SqlSession sqlSession;
	
	
	public ProjectDAO() {
		sqlSession = sqlSessionFactory.openSession(true);
	}
	
	public int getMyProjectTotal() {
		return sqlSession.selectOne("Project.getMyProjectTotal");
	}
	public int getSupportProjectTotal() {
		return sqlSession.selectOne("Project.getSupportProjectTotal");
	}
	public int getInterestProjectTotal() {
		return sqlSession.selectOne("Project.getInterestProjectTotal");
	}
	
	public List<ProjectDTO> selectMyProject(Map<String, Integer> projectMap){
		return sqlSession.selectList("Project.selectMyProject", projectMap);
	}
	
	public List<ProjectDTO> selectSupportProject(Map<String, Integer> projectMap){
		return sqlSession.selectList("Project.selectSupportProject", projectMap);
	}
	
	public List<ProjectDTO> selectInterestProject(Map<String, Integer> projectMap){
		return sqlSession.selectList("Project.selectInterestProject", projectMap);
	}
	
	
	
}
