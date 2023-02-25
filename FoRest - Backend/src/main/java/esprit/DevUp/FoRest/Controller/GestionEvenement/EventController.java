package esprit.DevUp.FoRest.Controller.GestionEvenement;


import esprit.DevUp.FoRest.Entity.Event;
import esprit.DevUp.FoRest.Service.GestionEvenement.IEventService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@AllArgsConstructor
@RestController
@RequestMapping("event")
public class EventController {
    private IEventService iEventService;

    @GetMapping("get-events")
    public ResponseEntity getAllEvents() {


        List<Event> allEvents = iEventService.getAllEvents();
        return new ResponseEntity<>(allEvents, HttpStatus.CREATED);

    }

    @GetMapping("get-event/{id}")
    public ResponseEntity getEvent(@PathVariable int id) {
        System.out.println("ID" + id);

        Optional<Event> event = iEventService.getEvent(id);
        return new ResponseEntity<>(event, HttpStatus.CREATED);

    }

    @PostMapping("addevent/{id}")
    public ResponseEntity<Event> addEvent(@PathVariable int id, @RequestBody Event e) {
        System.out.println(e);
        iEventService.addEvent(e,id);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @PutMapping("validate/{idEvent}")
    public void Validate(@PathVariable int idEvent) {
        System.out.println("ID" + idEvent);
        iEventService.validateAdmin(idEvent);
    }


    @PutMapping("deny/{idEvent}")
    public void deny(@PathVariable int idEvent) {
        System.out.println("ID" + idEvent);
        iEventService.validateAdmin(idEvent);
    }


}
