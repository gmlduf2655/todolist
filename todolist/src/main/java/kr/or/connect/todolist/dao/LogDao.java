package kr.or.connect.todolist.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import kr.or.connect.todolist.dto.Log;

@Repository
public class LogDao {
	private NamedParameterJdbcTemplate jdbc;
	private SimpleJdbcInsert insert;
	
	public LogDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
		this.insert = new SimpleJdbcInsert(dataSource)
				.withTableName("log").usingGeneratedKeyColumns("id");
	}
	
	public Long insert(Log log) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(log) ;
		return insert.executeAndReturnKey(params).longValue();		
	}
}