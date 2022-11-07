package com.lab.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lab.entities.Student;
import com.lab.service.StudentServiceImpl;

@Controller
public class MainController {
	
	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@RequestMapping("/")
	public String Home(Model m) {
		List<Student> student = studentServiceImpl.findAll();
		m.addAttribute("student", student);
		// System.out.println(student);
		return "index";
	}

	// add product form
	@RequestMapping("/add")
	public String Add() {
		return "add_product_form";
	}

	//save to database
	@PostMapping("/handler")
	public String handler(@ModelAttribute Student student) {
		studentServiceImpl.save(student);
		System.out.println(student);
		return "redirect:/";
	}

	//delete the student
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		studentServiceImpl.deleteById(id);
		return "redirect:/";
	}

	//update the student before get data from database and show to update page 
	@RequestMapping("/update/{id}")
	public String update(@PathVariable("id") int id, Model m) {
		Student student = studentServiceImpl.findById(id);
		m.addAttribute("student", student);
		return "update_form";
	}

	//update the form with handler and save the in database
	@PostMapping("/updateHandler")
	public String updateHandler(@ModelAttribute Student student) {
		studentServiceImpl.save(student);
		return "redirect:/";
	}
	
	
	//for unathorized page
	@RequestMapping(value = "/403")
	public ModelAndView accesssDenied(Principal user) {

		ModelAndView model = new ModelAndView();
		
		

		if (user != null) {
			model.addObject("msg", "Hi " + user.getName() 
			+ ", you do not have permission to access this page!");
		} else {
			model.addObject("msg", 
			"You do not have permission to access this page!");
		}

		model.setViewName("403");
		return model;

	}

}
