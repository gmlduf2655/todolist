package kr.or.connect.todolist.dto;

import java.util.Date;

public class Todo {
	private Long id;
	private String content;
	private Date regdate;
	
	
	public Todo() {}
	public Todo(String content, Date regdate) {
		this.content = content;
		this.regdate = regdate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", content=" + content + ", regdate=" + regdate + "]";
	}
	
	
}
