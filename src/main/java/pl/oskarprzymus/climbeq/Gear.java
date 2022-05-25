package pl.oskarprzymus.climbeq;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Gear {

    private UUID id;

    private String name;

    private List<String> categories;

    public Gear() {
        id = UUID.randomUUID();
    }

    public Gear(final String name){
        this();
        this.name=name;
    }

}
