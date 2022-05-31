package pl.oskarprzymus.climbeq.domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Gear {

    @Id
    private UUID id;

    private String name;

    private int priceInCents;

    private String description; //TODO Extract a description class with various options

    @ManyToMany
    @ToString.Exclude
    private Set<Category> categories;

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        final Gear gear = (Gear) o;
        return id != null && Objects.equals(id, gear.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
