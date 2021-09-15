package br.com.itau.password.service;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class PasswordService {

    private Pattern pattern;
    private Matcher matcher;

    private static final String password_regex = "^(?=.*[A-Z])(?!.*(.).*\\1)(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%ˆ&*()-+]).{9,}$";

    public boolean validate(final String password) {
        pattern = Pattern.compile(password_regex);
        matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public Pattern getPattern() {
        return pattern;
    }

    public Matcher getMatcher() {
        return matcher;
    }
}
