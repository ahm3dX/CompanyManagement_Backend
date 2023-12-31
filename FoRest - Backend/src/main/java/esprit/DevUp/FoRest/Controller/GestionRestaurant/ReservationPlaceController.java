package esprit.DevUp.FoRest.Controller.GestionRestaurant;

import esprit.DevUp.FoRest.Entity.Restaurant.ReservationPlace;
import esprit.DevUp.FoRest.Service.GestionRestaurant.IServiceReservationPlace;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("/ReservationPlace")
public class ReservationPlaceController {
    @Autowired
    IServiceReservationPlace iServiceReservationPlace;
    @GetMapping("/retrieveAllReservationPlace")
    public List<ReservationPlace> getReservationPlace() {
        List<ReservationPlace> list = iServiceReservationPlace.retrieveAllReservationPlace();
        return list;
    }

    @GetMapping("/retrieveAllReservationPlace/{table}")
    public List<ReservationPlace> getReservationPlacebyresto(@PathVariable("table") Integer idresto) {
        List<ReservationPlace> list = iServiceReservationPlace.showbytable(idresto);
        return list;
    }
    @PostMapping("/addReservationPlace/{iduser}/{idmenu}/{idtable}")
    public ReservationPlace addReservationPlace(@RequestBody ReservationPlace reservationPlace,
                                                @PathVariable("iduser") Integer iduser,
                                                @PathVariable("idtable") Integer idtable,
                                                @PathVariable("idmenu") Integer idmenu) {
        ReservationPlace r = iServiceReservationPlace.addReservationPlace(idmenu,iduser,idtable,reservationPlace);
        return r;
    }
    @DeleteMapping("/removeReservationPlace/{idReservationPlace}")
    public void removeReservationPlace(@PathVariable("idReservationPlace") Integer idReservationPlace) {
        iServiceReservationPlace.removeReservationPlace(idReservationPlace);
    }

    @PutMapping("/updateReservationPlace/{idReservationPlace}")
    public ReservationPlace updateOffreRestaurant(@RequestBody ReservationPlace place) {
        ReservationPlace reservationPlace= iServiceReservationPlace.updateReservationPlace(place);
        return reservationPlace;
    }
}
