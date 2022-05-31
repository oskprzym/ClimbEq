package pl.oskarprzymus.climbeq.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.oskarprzymus.climbeq.domain.Gear;
import pl.oskarprzymus.climbeq.services.GearService;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/gear")
@RequiredArgsConstructor
public class GearController {

    private final GearService gearService;

    @GetMapping
    Iterable<Gear> getAllGear(){
        return gearService.getAllGear();
    }

    @GetMapping("{id}")
    Gear getGetById(@PathVariable UUID id){
        return gearService.getGearById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Gear createGear(@RequestBody Gear gear){
        return gearService.createGear(gear);
    }

    @PutMapping("{id}")
    Gear updateGear(@PathVariable UUID id, @RequestBody Gear gear){
        return gearService.updateGear(id, gear);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteGearById(@PathVariable UUID id){
        gearService.deleteGear(id);
    }

}
