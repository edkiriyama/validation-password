package br.com.itau.password.controller;

import br.com.itau.password.model.PasswordRequest;
import br.com.itau.password.model.PasswordResponse;
import br.com.itau.password.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PasswordController {
    @Autowired
    private PasswordService passwordService;

    @GetMapping("/validate-password")
    public PasswordResponse validatePassword(@RequestBody PasswordRequest passwordRequest) {
        return new PasswordResponse(passwordService.validate(passwordRequest.getPassword()));
    }
}


