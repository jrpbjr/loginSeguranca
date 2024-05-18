package org.exemple.dao.response;

public class JwtAuthenticationResponse {
    private String token;

    public JwtAuthenticationResponse() {
    }

    public JwtAuthenticationResponse(String token) {
        this.token = token;
    }

    public static JwtAuthenticationResponseBuilder builder() {
        return new JwtAuthenticationResponseBuilder();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static class JwtAuthenticationResponseBuilder {
        private String token;

        JwtAuthenticationResponseBuilder() {
        }

        public JwtAuthenticationResponseBuilder token(String token) {
            this.token = token;
            return this;
        }

        public JwtAuthenticationResponse build() {
            return new JwtAuthenticationResponse(token);
        }
    }
}