package esprit.DevUp.FoRest.Controller.GestionEvenement;

import esprit.DevUp.FoRest.Entity.Event.*;
import esprit.DevUp.FoRest.Repository.EventRepository.*;
import esprit.DevUp.FoRest.Service.EventServices.*;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("invite")
public class InviteController {
    private IinviteService iinviteService;

    @GetMapping("get-invite")
    public ResponseEntity getAllInvite() {


        List<invite> AllInvite = iinviteService.getAllInvite();
        return new ResponseEntity<>(AllInvite, HttpStatus.CREATED);

    }
    @GetMapping("get-invite/{id}")
    public ResponseEntity getInvite(@PathVariable int id) {
        System.out.println("ID"+id);

        Optional<invite> invitee = iinviteService.getInvite(id);
        return new ResponseEntity<>(invitee, HttpStatus.CREATED);

    }
    @PostMapping("addinvite")
    public ResponseEntity<invite> addInvite(@RequestBody invite i) {
        System.out.println(i);

        
        iinviteService.addInvite(i);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
