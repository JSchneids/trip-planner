package launchcode.com.tripplanner.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class WelcomeController {

        @RequestMapping(value = "")
        @ResponseBody
        public String index() {
            return "Welcome to Trip Planner";
        }
}
