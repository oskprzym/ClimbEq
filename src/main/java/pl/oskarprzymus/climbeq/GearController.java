package pl.oskarprzymus.climbeq;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/gear")
@RequiredArgsConstructor
public class GearController {

    private final GearService gearService;

    @GetMapping
    List<Gear> getAllGear(){
        return gearService.getAllGear();
    }

    @GetMapping("{id}")
    Gear getGetById(@PathVariable UUID id){
        return gearService.getGearById(id);
    }

    @PostMapping
    Gear createGear(@RequestBody Gear gear){
        return gearService.createGear(gear);
    }

    @PutMapping("{id}")
    Gear updateGear(@PathVariable UUID id, @RequestBody Gear gear){
        return gearService.updateGear(id, gear);
    }

    @DeleteMapping("{id}")
    void deleteGearById(@PathVariable UUID id){
        gearService.deleteGear(id);
    }

}
