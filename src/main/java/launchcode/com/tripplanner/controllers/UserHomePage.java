package launchcode.com.tripplanner.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class UserHomePage {

    @RequestMapping(value = "userhomepage")
    public String userhomepage(Model model) {
            model.addAttribute("title","Upcoming Trips");
            return "UserHomePage";
    }
}
// TODO Make welcome page say user's currently planned trips
