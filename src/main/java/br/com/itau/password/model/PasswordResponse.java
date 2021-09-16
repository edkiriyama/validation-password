package br.com.itau.password.model;

public class PasswordResponse {
    private boolean isValid;

    public PasswordResponse(boolean isValid) {
        isValid = isValid;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}
