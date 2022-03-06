package kr.or.connect.todolist.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.connect.todolist.dto.Todo;
import kr.or.connect.todolist.service.TodolistService;

@Controller
public class TodoListController {
	@Autowired
	public TodolistService todolistService;
	
	@GetMapping (path="/list")
	public String list(ModelMap modelMap) {
		List<Todo> todolist = todolistService.getTodoList();
		
		modelMap.addAttribute("todolist", todolist);
		return "list";
	}
	
	@PostMapping (path="/write")
	public String write(@ModelAttribute Todo todo,
						HttpServletRequest request,
						ModelMap modelMap) {
		String clientIp = request.getRemoteAddr();
		
		Long id = todolistService.addTodo(todo, clientIp);
		
		return "redirect:list";
	}
	@GetMapping (path="/delete/{id}")
	public String delete(@PathVariable(name="id") Long id,
			HttpServletRequest request,
			ModelMap modelMap) {
		String clientIp = request.getRemoteAddr();	
		
		int delete = todolistService.deleteTodoById(id, clientIp);
		
		return "redirect:../list";
	}
}
