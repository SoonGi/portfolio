package com.yoon.portfolio.login;

import com.yoon.portfolio.common.PortFolioResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * LoginController
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    public String getLogIn() {
        return "index";
    }

    @PostMapping("/login")
    @ResponseBody
    public ResponseEntity<PortFolioResponse> login() {
        return ResponseEntity.ok(PortFolioResponse.builder().result("success").build());
    }
}