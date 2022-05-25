package pl.oskarprzymus.climbeq;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GearService {
    public List<Gear> getAllGear() {
        return List.of(new Gear("Crash Pad"),new Gear("Shoes"),new Gear("Rope"));
    }

    public Gear getGearById(final UUID id) {
        return new Gear("Czekan");
    }

    public Gear createGear(final Gear gear) {
        gear.setId(UUID.randomUUID());

        //TODO save to DB

        return gear;
    }

    public Gear updateGear(final UUID id, final Gear gear) {
        Gear gearDB = new Gear("Generic gear");
        gearDB.setName(gear.getName());

        //TODO update in DB

        return gearDB;
    }

    public void deleteGear(final UUID id) {
        //TODO delete in DB
    }
}
