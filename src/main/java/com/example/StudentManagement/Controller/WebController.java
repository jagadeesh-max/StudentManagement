package com.example.StudentManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.StudentManagement.Entity.Student;
import com.example.StudentManagement.StudentServices.StudentServs;

@Controller
public class WebController {
	
	
	@Autowired
	StudentServs ss;
	
	
	public WebController(StudentServs ss) {
		super();
		this.ss = ss;
	}

	@GetMapping("/viewI")
	public String mapViewInfo()
	{
		return "viewInfo";
	}
	
	@GetMapping("/addI")
	public String mapaddInfo()	
	{
		return "register";
	}
	
	@GetMapping("/updateI")
	public String mapupdateInfo()
	{
		return "updateInfo";
	}
	
	@GetMapping("/revI")
	public String mapdeleteInfo()
	{
		return "remove";
	}
	
	@PostMapping("/addstudent")
	public String addStudent( @RequestParam("sid")String kid,
			@RequestParam("sname")  String name,
			@RequestParam("sbatch")  String batch)
	{
		Student st=new Student(kid,name,batch);
		 ss.addStudent(st);
		 return "index";
	}
	
	@PutMapping("/updstud")
	public String updatestudent(@RequestParam("sid")String kid,
			@RequestParam("sname")  String name,
			@RequestParam("sbatch")  String batch)
	{
		Student st=ss.getStudent(kid);
		st.setName(name);
		st.setBatch(batch);
		ss.updateStudent(st);
		return "index";
	}
	
	@GetMapping("/getstud")
	public String getStudent(@RequestParam("sid")String id,Model model)
	{
		Student student=ss.getStudent(id);
		model.addAttribute("student", student);
	   return "ShowInfo";	
	}
	
	@GetMapping("/delstud")
	public String deleteStudent(@RequestParam("sid")String id)
	{
		ss.deleteStudent(id);
		return "index";
	}
	
	
}
