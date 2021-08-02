package com.yhl.controller;
import com.yhl.entity.Users;
import com.yhl.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired UsersService service;

    @RequestMapping(value = "/toAdd", method = RequestMethod.GET)
    public String toAdd() {
        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView add(Users users) {
        service.insert(users);
        ModelAndView modelAndView = new ModelAndView();
        return new ModelAndView("redirect:/users/find");
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(Users users,Model model) {
        model.addAttribute("user",service.findOne(users));
        return "update";
    }

    @RequestMapping("update")
    public ModelAndView update(Users users){
        service.update(users);
        return new ModelAndView("redirect:/users/find");
    }

    @RequestMapping("/find")
    public String findAll(Model model) {
        model.addAttribute("list", service.findAll());
        return "list";
    }
    @RequestMapping("/delete")
    public ModelAndView delete(Users users){
        service.delete(users);
        ModelAndView modelAndView = new ModelAndView();
        return new ModelAndView("redirect:/users/find");
    }
}
