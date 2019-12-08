package com.yoon.portfolio.index;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Index
 */
@Controller
public class IndexController implements ErrorController{

    @GetMapping({"/error"})
    public String index() {
        return "index";
    }

    @Override
    public String getErrorPath() {

        return "/error";
    }
}