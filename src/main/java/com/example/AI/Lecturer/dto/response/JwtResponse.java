package com.example.AI.Lecturer.dto.response;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {
    private String token;
    private String email;
    private String role;

}
