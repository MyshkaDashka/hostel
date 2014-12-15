package by.bsuir.hostel.controllers;

import by.bsuir.hostel.model.Administration;
import by.bsuir.hostel.model.Hostels;
import by.bsuir.hostel.model.Informations;
import by.bsuir.hostel.model.Student;
import by.bsuir.hostel.service.administration.IAdministrationService;
import by.bsuir.hostel.service.hostel.IHostelService;
import by.bsuir.hostel.service.information.IInformationService;
import by.bsuir.hostel.service.student.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Dashka on 12.12.2014.
 */
@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private IAdministrationService administrationService;

    @Autowired
    private IHostelService hostelService;

    @Autowired
    private IInformationService informationService;

    @Autowired
    private IStudentService studentService;

    @RequestMapping("/")
    public String home() {
        return "redirect:/home";
    }


    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(ModelMap model) {
        List<Administration> administrationList = administrationService.administrationListOne(1);
        model.addAttribute("director", administrationList);
        administrationList = administrationService.administrationListOne(2);
        model.addAttribute("secretary", administrationList);
        List<Informations> informationsList1 = informationService.informationsListOne(1);
        model.addAttribute("infOne", informationsList1);
        List<Informations> informationsList2 = informationService.informationsListOne(2);
        model.addAttribute("infTwo", informationsList2);
        return "home";
    }

    @RequestMapping(value = "/aboutPage", method = RequestMethod.GET)
    public String about(Model model) {
        List<Hostels> hostelsList = hostelService.hostelOne(1);
        model.addAttribute("hostel1", hostelsList);
        hostelsList = hostelService.hostelOne(2);
        model.addAttribute("hostel2", hostelsList);
        hostelsList = hostelService.hostelOne(3);
        model.addAttribute("hostel3", hostelsList);
        hostelsList = hostelService.hostelOne(4);
        model.addAttribute("hostel4", hostelsList);
        return "aboutPage";
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public String contact(Model model) {
        List<Informations> informationsList3 = informationService.informationsListOne(3);
        model.addAttribute("infTree", informationsList3);
        List<Hostels> hostelsList = hostelService.hostelOne(1);
        for (Hostels hostels : hostelsList) {
            model.addAttribute("street", hostels.getStreet());
            model.addAttribute("house", hostels.getHouse());
        }
        ;
        List<Administration> administrationList = administrationService.administrationListOne(1);
        for (Administration administration : administrationList) {
            model.addAttribute("dirPhone", administration.getPhone());
        }
        ;
        administrationList = administrationService.administrationListOne(2);
        for (Administration administration : administrationList) {
            model.addAttribute("secPhone", administration.getPhone());
        }
        ;
        return "contacts";
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public String studentsView(Model model) {
        List<Student> studentList= studentService.studentList();
        model.addAttribute("students", studentList);
        return "students";
    }

    @RequestMapping("/studentsf/{id}")
     public String studentsByType(@PathVariable("id") Integer idType, Model model){
        List<Student> studentList = studentService.studentListFind(idType);
        model.addAttribute("students", studentList);
        return "students";
    }
    @RequestMapping("/studentsf/students")
    public String students1(){
        return "redirect:/students";
    }
    @RequestMapping("/studentsf/home")
    public String students2(){
        return "redirect:/home";
    }
    @RequestMapping("/studentsf/aboutPage")
     public String students3(){
        return "redirect:/aboutPage";
    }
    @RequestMapping("/studentsf/contacts")
    public String students4(){
        return "redirect:/contacts";
    }

}
