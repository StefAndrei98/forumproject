package com.stefandrei.forumproject.controller;

import com.stefandrei.forumproject.model.Reply;
import com.stefandrei.forumproject.model.Topic;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class ReplyController {
    @GetMapping("/actionreply")
    public String actionreply(Model model){

        model.addAttribute ("reply" , new Reply ());

        return "replycontent/actionreply";
    }
}
