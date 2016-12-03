package kr.ac.hansung.Class.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.ac.hansung.Class.model.MyClass;

public class ClassMapper implements RowMapper<MyClass> {

	public MyClass mapRow(ResultSet rs, int rowNum) throws SQLException {
		MyClass myclass = new MyClass();
		myclass.setSemester(rs.getInt("semester"));
		myclass.setCode(rs.getString("code"));
		myclass.setTitle(rs.getString("title"));
		myclass.setGrades(rs.getInt("grades"));
		myclass.setType(rs.getString("type"));
		myclass.setYear(rs.getInt("year"));		
		return myclass;
	}

}
