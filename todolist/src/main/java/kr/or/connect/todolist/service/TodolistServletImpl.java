package kr.or.connect.todolist.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.connect.todolist.dao.LogDao;
import kr.or.connect.todolist.dao.TodoDao;
import kr.or.connect.todolist.dto.Log;
import kr.or.connect.todolist.dto.Todo;

@Service
public class TodolistServletImpl implements TodolistService {
	@Autowired
	TodoDao todoDao;
	@Autowired
	LogDao logDao;
	
	@Override
	@Transactional
	public List<Todo> getTodoList(){
		return todoDao.selectAll();
	}
	
	@Override
	@Transactional (readOnly=false)
	public int deleteTodoById(Long id, String ip) {
		int delete = todoDao.deleteById(id);
		
		Log log = new Log(ip,"delete",new Date());
		logDao.insert(log);
		
		return delete;
	}
	
	@Override
	@Transactional (readOnly=false)
	public Long addTodo(Todo todo, String ip) {
		todo.setRegdate(new Date());
		Long id = todoDao.insert(todo);
		
		Log log = new Log(ip,"insert",new Date());
		logDao.insert(log);
		
		return id;
	}
}
