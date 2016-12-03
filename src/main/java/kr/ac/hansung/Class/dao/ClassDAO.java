package kr.ac.hansung.Class.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.Class.model.MyClass;


@Repository
public class ClassDAO {
	private JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	
	public int getsemesterGrade(int x,int y){
		String sqlStatement = "select sum(grades) from class where year = ? and semester = ?";
		return jdbcTemplateObject.queryForObject(sqlStatement,new Object[]{x,y},Integer.class);		
	}
	
	public int gettypeGrade(String type){
		String sqlStatement = "select sum(grades) from class where type=?";
		return jdbcTemplateObject.queryForObject(sqlStatement,new Object[]{type},Integer.class);		
	}
	
	public int getGrade(){
		String sqlStatement = "select sum(grades) from class where year<2017";
		return jdbcTemplateObject.queryForObject(sqlStatement,new Object[]{},Integer.class);		
	}
	
	//querying and returning a single object
	public MyClass getClass(String title){
		String sqlStatement = "select * from class where title=?";
		return jdbcTemplateObject.queryForObject(sqlStatement,new Object[]{ title } ,new ClassMapper());
	}
	
	public List<MyClass> getClasses(){
		String sqlStatement = "select * from class ";
		return jdbcTemplateObject.query(sqlStatement,new ClassMapper());
	}
	public List<MyClass> getSchedule(){
		String sqlStatement = "select * from class where year=2017";
		return jdbcTemplateObject.query(sqlStatement,new ClassMapper());
	}
	
	//querying and returning a multiple object
	public List<MyClass> getsemesterClasses(int s,int n){
		String sqlStatement = "select * from class where year=?  and semester =?";
		return jdbcTemplateObject.query(sqlStatement,new Object[]{s,n},new ClassMapper());
	}
	public boolean insert(MyClass myclass){
		int year = 2017;
		int semester = 1;
		String code = myclass.getCode();
		String title = myclass.getTitle();
		String type = myclass.getTitle();
		int grades = myclass.getGrades();
		String sqlStatement = "insert into class (year,semester,code,title,type,grades) values (?,?,?,?,?,?)";
		return (jdbcTemplateObject.update(sqlStatement, new Object[]{year,semester,code,title,type,grades})==1);
	}
}
