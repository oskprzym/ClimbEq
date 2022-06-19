package pl.oskarprzymus.climbeq.domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
//@NoArgsConstructor
//@Builder
@Entity(name = "users")
public class User {

    @Id
    private UUID id;

    private String firstName;

    private String lastName;

    private Role role;

    @Email
    @NotNull
    private String email;

    @Digits(integer = 2, fraction = 0, message = "Phone number prefix must consist of 2 digits ")
    private String phonePrefix;

    @Digits(integer = 9, fraction = 0, message = "Phone number must consist of 9 digits")
    private String phoneNumber;

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        final User user = (User) o;
        return id != null && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
