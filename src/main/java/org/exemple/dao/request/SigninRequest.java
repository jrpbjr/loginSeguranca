package org.exemple.dao.request;

public class SigninRequest {
    private String email;
    private String password;

    public SigninRequest() {
    }

    public SigninRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static SigninRequestBuilder builder() {
        return new SigninRequestBuilder();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static class SigninRequestBuilder {
        private String email;
        private String password;

        SigninRequestBuilder() {
        }

        public SigninRequestBuilder email(String email) {
            this.email = email;
            return this;
        }

        public SigninRequestBuilder password(String password) {
            this.password = password;
            return this;
        }

        public SigninRequest build() {
            return new SigninRequest(email, password);
        }
    }
}