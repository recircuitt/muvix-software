package elufka.software.muvix.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //temporal para testeo, luego se saca por seguridad
    private Long id;

    @Column(unique = true)
    private String dni;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(unique = true)
    private String phoneNumber;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String firstName;

    private String middleName;

    @Column(nullable = false)
    private String lastName;

    @PrePersist
    private void onCreate(){
        if(middleName != null) this.setMiddleName(middleName);
        else this.setMiddleName(null);

        if(phoneNumber != null) this.setPhoneNumber(phoneNumber);
        else this.setPhoneNumber(phoneNumber);
    }
}
