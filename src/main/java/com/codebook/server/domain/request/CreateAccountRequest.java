package com.codebook.server.domain.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateAccountRequest {
    private String username;
    private String password;
    private String email;
}
