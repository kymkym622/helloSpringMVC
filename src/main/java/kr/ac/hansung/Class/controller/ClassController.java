package kr.ac.hansung.Class.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.hansung.Class.model.MyClass;
import kr.ac.hansung.Class.service.ClassService;

@Controller
public class ClassController {
	
	private ClassService classService;
	
	@Autowired
	public void setclassesServie(ClassService classService){
		this.classService = classService;
	}
	 
	@RequestMapping("/classes")
	public String showclasses(Model model){
		List<MyClass> classes = classService.getcurrent() ;
		model.addAttribute("grades1",classService.getsemesterGrades(2011,1));
		model.addAttribute("grades2",classService.getsemesterGrades(2011,2));
		model.addAttribute("grades3",classService.getsemesterGrades(2015,1));
		model.addAttribute("grades4",classService.getsemesterGrades(2015,2));
		model.addAttribute("grades5",classService.getsemesterGrades(2016,1));
		model.addAttribute("grades6",classService.getsemesterGrades(2016,2));
		return "classes";
	}
	@RequestMapping("/type")
	public String Gradesoftype(Model model){
		List<MyClass> classes = classService.getcurrent() ;
		model.addAttribute("type1",classService.gettypeGrades("교필"));
		model.addAttribute("type2",classService.gettypeGrades("핵교A"));
		model.addAttribute("type3",classService.gettypeGrades("핵교B"));
		model.addAttribute("type4",classService.gettypeGrades("일교"));
		model.addAttribute("type5",classService.gettypeGrades("전기"));
		model.addAttribute("type6",classService.gettypeGrades("전지"));
		model.addAttribute("type7",classService.gettypeGrades("전선"));
		model.addAttribute("type8",classService.getGrades());		
		return "type";
	}	
	
	@RequestMapping("/application")
	public String Application(Model model){
		model.addAttribute(new MyClass());
		return "application";
	}
	
	@RequestMapping("/semester")
	public String Semester(Model model,@RequestParam(value="year")int year){		
		if(year==20111){
			model.addAttribute("semesters",classService.getsemester(2011, 1));
		}
		else if(year==20112){
			model.addAttribute("semesters",classService.getsemester(2011, 1));
		}
		else if(year==20151){
			model.addAttribute("semesters",classService.getsemester(2011, 1));
		}
		else if(year==20152){
			model.addAttribute("semesters",classService.getsemester(2011, 1));
		}
		else if(year==20162){
			model.addAttribute("semesters",classService.getsemester(2011, 1));
		}
		else if(year==20162){
			model.addAttribute("semesters",classService.getsemester(2011, 1));
		}
		return "semester";
	}
	
	@RequestMapping("/docreate")
	public String application_result(Model model,MyClass myClass){		
		classService.insert(myClass);
		return "success";
	}
	
	@RequestMapping("/inquiry")
	public String inquiry(Model model){		
		model.addAttribute("Schedules",classService.getSchedule());
		return "inquiry";
	}
}
