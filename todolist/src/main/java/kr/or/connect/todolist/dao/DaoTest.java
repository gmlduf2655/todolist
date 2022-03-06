package kr.or.connect.todolist.dao;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.todolist.config.ApplicationConfig;
import kr.or.connect.todolist.dto.Todo;

public class DaoTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		TodoDao todoDao = ac.getBean(TodoDao.class);
		
//		Todo tododata = new Todo( "첫번째 메세지", new Date() );
//		todoDao.insert(tododata);
		
		Long id = Long.parseLong("1");
		int delete = todoDao.deleteById(id);
		if(delete == 1) {
			System.out.println("id : " + id + " 삭제");
		}
		
		List<Todo> todos = todoDao.selectAll();
		
		for(Todo todo : todos) {
			System.out.println(todo);
		}
	}

}
