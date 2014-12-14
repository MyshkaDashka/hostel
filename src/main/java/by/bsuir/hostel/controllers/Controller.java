package by.bsuir.hostel.controllers;

import by.bsuir.hostel.model.Administration;
import by.bsuir.hostel.model.Hostels;
import by.bsuir.hostel.service.administration.IAdministrationService;
import by.bsuir.hostel.service.hostel.IHostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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

    @RequestMapping("/")
    public String home() {
        return "redirect:/home";
    }


    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(ModelMap model) {
        List<Administration> administrationList = administrationService.administrationList();
       // model.addAttribute("message", "hi");
       model.addAttribute("admList", administrationList);
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
        return "contacts";
    }


}
