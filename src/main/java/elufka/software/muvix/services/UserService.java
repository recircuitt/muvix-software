package elufka.software.muvix.services;

import elufka.software.muvix.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserService {
    private UserRepository userRepository;
}
