package io.github.rvdxk.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;

    //user first name should not be null or empty
    @NotEmpty(message = "User first name should not be null or empty")
    private String firstName;

    //user last name should not be null or empty
    @NotEmpty(message = "User last name should not be null or empty")
    private String lastName;

    //user email should not be null or empty
    //email address should be valid
    @NotEmpty(message = "User email address should not be null or empty")
    @Email(message = "Email address should be valid")
    private String email;
}
