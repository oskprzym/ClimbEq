package pl.oskarprzymus.climbeq;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class GearService {

    private final GearRepository gearRepository;

    public Iterable<Gear> getAllGear() {
        return gearRepository.findAll();
    }

    public Gear getGearById(final UUID id) {
        return gearRepository.findById(id)
                .orElseThrow(); // TODO custom exception

    }

    public Gear createGear(Gear gear) {
        gear.setId(UUID.randomUUID());

        gear = gearRepository.save(gear);

        return gear;
    }

    public Gear updateGear(final UUID id, final Gear gear) {
        Gear gearDB = gearRepository.findById(id)
                .orElseThrow(); //TODO custom exception

        gearDB.setName(gear.getName());

        gearDB = gearRepository.save(gearDB);

        return gearDB;
    }

    public void deleteGear(final UUID id) {
        gearRepository.deleteById(id);
    }
}
