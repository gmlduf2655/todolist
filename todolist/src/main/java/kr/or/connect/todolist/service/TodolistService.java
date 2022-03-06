package kr.or.connect.todolist.service;

import java.util.List;

import kr.or.connect.todolist.dto.Todo;

public interface TodolistService {
	public List<Todo> getTodoList();
	public int deleteTodoById(Long id, String ip);
	public Long addTodo(Todo todo, String ip);
}

