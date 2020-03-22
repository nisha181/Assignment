package com.cognizant.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cognizant.model.Student;
@Component("dao")
public class StudentDaoImpl implements StudentDao {
	public StudentDaoImpl() {
		super();
	}

	public StudentDaoImpl(JdbcTemplate jt) {
		super();
		this.jt = jt;
	}

	@Autowired
	private JdbcTemplate jt;

	public int insert() {
		String sql = "insert into Students values(?,?,?)";
		int result = jt.update(sql, "7","nisha","100");
		return result;
	}

	public List<Student> getAll() {
		String sql = "select * from Students";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Student> rs = jt.query(sql, rowMapper);
		return rs;
	}

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public String toString() {
		return "StudentDaoImpl [jt=" + jt + "]";
	}

}
