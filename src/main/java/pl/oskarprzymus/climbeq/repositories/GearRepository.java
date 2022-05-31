package pl.oskarprzymus.climbeq.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.oskarprzymus.climbeq.domain.Gear;

import java.util.UUID;

@Repository
public interface GearRepository extends CrudRepository<Gear, UUID> {


}
