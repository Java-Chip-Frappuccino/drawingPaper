package com.drawingpaper.app.project.vo;

public class ProjectDTO {
	private String pro_title;
	private String pro_category;
	private String pro_start;
	private String pro_end;
	
	public ProjectDTO() {;}
	
	public ProjectDTO(ProjectVO projectVO) {
		super();
		this.pro_title = projectVO.getPro_title();
		this.pro_category = projectVO.getPro_category();
		this.pro_start = projectVO.getPro_start();
		this.pro_end = projectVO.getPro_end();
	}

	public String getPro_title() {
		return pro_title;
	}

	public void setPro_title(String pro_title) {
		this.pro_title = pro_title;
	}

	public String getPro_category() {
		return pro_category;
	}

	public void setPro_category(String pro_category) {
		this.pro_category = pro_category;
	}

	public String getPro_start() {
		return pro_start;
	}

	public void setPro_start(String pro_start) {
		this.pro_start = pro_start;
	}

	public String getPro_end() {
		return pro_end;
	}

	public void setPro_end(String pro_end) {
		this.pro_end = pro_end;
	}
	
}
