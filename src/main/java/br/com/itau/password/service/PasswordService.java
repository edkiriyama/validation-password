package br.com.itau.password.service;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class PasswordService {

    private static final String password_regex = "^(?=.*[A-Z])(?!.*(.).*\\1)(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%ˆ&*()-+])(?=\\S+$).{9,}$";

    public boolean validate(String password) {
        Pattern pattern = Pattern.compile(password_regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

}
