package org.exemple.dao.request;

public class SignUpRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public SignUpRequest() {
    }

    public SignUpRequest(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public static SignUpRequestBuilder builder() {
        return new SignUpRequestBuilder();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public static class SignUpRequestBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private String password;

        SignUpRequestBuilder() {
        }

        public SignUpRequestBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public SignUpRequestBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public SignUpRequestBuilder email(String email) {
            this.email = email;
            return this;
        }

        public SignUpRequestBuilder password(String password) {
            this.password = password;
            return this;
        }

        public SignUpRequest build() {
            return new SignUpRequest(firstName, lastName, email, password);
        }
    }
}