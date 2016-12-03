package kr.ac.hansung.Class.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.Class.dao.ClassDAO;
import kr.ac.hansung.Class.model.MyClass;

@Service
public class ClassService {
	private ClassDAO classDAO;
	
	@Autowired
	public void setclassDAO(ClassDAO classDAO) {
		this.classDAO = classDAO;
	} 
	public int getsemesterGrades(int x,int y){		
		return classDAO.getsemesterGrade(x,y);		
	}
	public int gettypeGrades(String type){		
		return classDAO.gettypeGrade(type);		
	}
	public int getGrades(){		
		return classDAO.getGrade();		
	}
	public List<MyClass> getsemester(int x,int y){		
		return classDAO. getsemesterClasses(x,y);		
	}
	public List<MyClass> getcurrent(){		
		return classDAO.getClasses();		
	}
	public List<MyClass> getSchedule(){		
		return classDAO.getSchedule();		
	}
	public void insert(MyClass myclass){
		classDAO.insert(myclass);
	}
}
