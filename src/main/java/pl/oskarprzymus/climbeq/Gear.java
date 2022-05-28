package pl.oskarprzymus.climbeq;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
public class Gear {

    @Id
    private UUID id;

    private String name;

    @ManyToMany
    private Set<Category> categories;

    public Gear() {
        id = UUID.randomUUID();
    }

    public Gear(final String name){
        this();
        this.name=name;
    }

}
