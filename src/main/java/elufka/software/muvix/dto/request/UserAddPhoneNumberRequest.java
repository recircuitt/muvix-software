package elufka.software.muvix.dto.request;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class UserAddPhoneNumberRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //temporal para testeo, luego se saca por seguridad
    private Long id;

    private String phoneNumber;

}
