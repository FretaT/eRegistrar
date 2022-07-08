package cs.miu.eregistrar.eregistrar.controller;


import cs.miu.eregistrar.eregistrar.model.Student;
import cs.miu.eregistrar.eregistrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    private StudentService studentService;


    //    @GetMapping(value = "")
//    public String displayHomepage(){
//        return "public/home";
//    }
    @GetMapping(value = "studentList")
    public ModelAndView displayListOfStudents() {
        var students = studentService.getAllStudents();
        var modelAndView = new ModelAndView();
        modelAndView.addObject("students", students);
        modelAndView.setViewName("public/listofStudents");
        return modelAndView;
    }

    @GetMapping(value = "newStudent")
    public String registerStudent() {
        return "Secured/registerNewStudent";
    }


    @PostMapping(value = "/NewStudent")
    public String registerNewStudent(@Valid @ModelAttribute("student") Student student,
                                     BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("student", student);
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "Secured/registerNewStudent";
        }
        return "public/listofStudents";
    }



    @GetMapping(value = "/deleteStudent")
    public String deleteStudent() {
        return "public/listofStudents";
    }
    }
