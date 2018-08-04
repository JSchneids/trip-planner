package launchcode.com.tripplanner.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class WelcomeController {

        @RequestMapping(value = "")
        public String index(Model model) {
            model.addAttribute("title","Welcome to Trip Planner");
            return "index";
        }
}