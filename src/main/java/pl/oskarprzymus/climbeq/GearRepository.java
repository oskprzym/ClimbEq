package pl.oskarprzymus.climbeq;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GearRepository extends CrudRepository<Gear, UUID> {


}
