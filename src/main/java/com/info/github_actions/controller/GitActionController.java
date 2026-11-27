package com.info.github_actions.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController 
@RequestMapping ("/gitHubActions")
public class GitActionController {
    @GetMapping("/welcome")
    public String welcomeGitActions() {
        return "Welcome to GitHub Actions!!!";
    }
}
