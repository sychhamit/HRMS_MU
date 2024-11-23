package com.magadhUniversity.controller;




import com.magadhUniversity.model.Sport;
import com.magadhUniversity.service.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SportController {
    @Autowired
    private SportService studentService;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("student", new Sport());
        return "index";
    }

    @PostMapping("/submit")
    public String submitStudent(Sport sport) {
        studentService.saveStudent(sport);
        return "redirect:/students";
    }}