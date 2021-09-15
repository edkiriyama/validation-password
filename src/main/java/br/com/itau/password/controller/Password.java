package br.com.itau.password.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Validação do password com REGEX
@RestController
public class Password {
    private Pattern pattern;
    private Matcher matcher;

    private static final String password_regex = "^(?=.*[A-Z])(?!.*(.).*\\1)(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%ˆ&*()-+]).{9,}$";

    @GetMapping("/password")
    public boolean validate(final String password) {
        pattern = Pattern.compile(password_regex);
        matcher = pattern.matcher(password);
        return matcher.matches();
    }

}


