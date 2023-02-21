package esprit.DevUp.FoRest.Controller.GestionRestaurant;

import esprit.DevUp.FoRest.Entity.TableRestaurant;
import esprit.DevUp.FoRest.Service.GestionRestaurant.IServiceTableRestaurant;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("/Table")
public class TableController {
    @Autowired
    IServiceTableRestaurant iServiceTableRestaurant;

    @GetMapping("/retrieveAlltableRestaurant")
    public List<TableRestaurant> getTableRestaurant() {
        List<TableRestaurant> list = iServiceTableRestaurant.retrieveAllTableRestaurant();
        return list;
    }

    @PostMapping("/addTableRestaurant")
    public TableRestaurant addTableRestaurant(@RequestBody TableRestaurant reservationPlace) {
        TableRestaurant r = iServiceTableRestaurant.addTableRestaurant(reservationPlace);
        return r;
    }

    @DeleteMapping("/removeTableRestaurant/{idtable}")
    public void removeTable(@PathVariable("idtable") Integer idtable) {
        iServiceTableRestaurant.removeTableRestaurant(idtable);
    }

    @PutMapping("/updateTableRestaurant/{idtable}")
    public TableRestaurant updateTableRestaurant(@RequestBody TableRestaurant idtable) {
        TableRestaurant table= iServiceTableRestaurant.updateTableRestaurant(idtable);
        return table;
    }

}
