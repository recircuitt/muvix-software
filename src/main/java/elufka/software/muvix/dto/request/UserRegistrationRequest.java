package elufka.software.muvix.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRegistrationRequest {
    @NotBlank
    private String dni;

    @Email
    private String email;

    @NotBlank
    @Min(value = 8, message = "The entered password is too short")
    private String password;

    @NotBlank
    private String firstName;

    private String middleName;

    @NotBlank
    private String lastName;

}
