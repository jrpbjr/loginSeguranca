package org.exemple.service;

import org.exemple.dao.request.SignUpRequest;
import org.exemple.dao.request.SigninRequest;
import org.exemple.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}