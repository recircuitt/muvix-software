package elufka.software.muvix.controllers;

import elufka.software.muvix.services.UserService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserController {
    private UserService userService;
}
