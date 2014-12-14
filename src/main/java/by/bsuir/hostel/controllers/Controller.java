package by.bsuir.hostel.controllers;

import by.bsuir.hostel.model.Administration;
import by.bsuir.hostel.service.administration.IAdministrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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

    @RequestMapping("/")
    public String home() {
        return "redirect:/home";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model) {
        List<Administration> administrationList = administrationService.administrationList();
        model.addAttribute("admList", administrationList);
        return "home.jsp";
    }


}
