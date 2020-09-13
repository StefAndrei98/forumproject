package com.stefandrei.forumproject.controller;

import com.stefandrei.forumproject.model.Topic;
import com.stefandrei.forumproject.service.TopicServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TopicController {
//
//    @Autowired
//    private TopicServices topicServices;
//
//    @Autowired
////    private SchoolGroupService schoolGroupService;
//
//    @GetMapping("alltopics")
//    public String showAllTopics(Model model){
//
//        List<Topic> topicList = topicServices.findAll ();
//        model.addAttribute ("topics" , topicList);
//
//        return "topiccontent/showalltopics";
//    }
//
//    @GetMapping("/addstudent")
//    public String addstudent(Model model){
//
//        model.addAttribute ("student" , new Student ());
//        model.addAttribute ("schoolgroups" , schoolGroupService.findAll ());
//
//        return "student/addstudent";
//    }
//
//    @PostMapping("/addstudent")
//    public String addstudent(@ModelAttribute Student student){
//        System.out.println (student);
//        studentService.save (student);
//
//        return "redirect:/allstudents";
//    }
//
//    @GetMapping("/editstudent/{id}")
//    public String editstudent(Model model , @PathVariable Integer id){
//        Student student = studentService.findById (id);
//        model.addAttribute ("student" , student);
//        model.addAttribute ("schoolgroups" , schoolGroupService.findAll ());
//
//        return "student/editstudent";
//    }
//
//    @PostMapping("/editstudent/{id}")
//    public String editstudent(@ModelAttribute Student student , @PathVariable Integer id){
//
////        Student database_student = studentService.findById (id); // to be able to update that id, get it from database
////        database_student.setFirstName (student.getFirstName ()); // update fields
////        database_student.setLastName (student.getLastName ());
////        studentService.save (database_student);
//        studentService.save (student);
//
//
//        return "redirect:/allstudents";
//    }
//
//    @GetMapping("/deletestudent/{id}")
//    public String deletestudent(@PathVariable Integer id){
//        studentService.deleteById(id);
//        // Student student = studentRepository.findById (id).get ();
//        // studentRepository.delete(student);
//
//        return "redirect:/allstudents";
//    }
//
//
}
