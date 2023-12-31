package esprit.DevUp.FoRest.Service.EventServices;

import esprit.DevUp.FoRest.Entity.Event.Plannification;
import java.util.List;
import java.util.Optional;

public interface IPlannificationService {

    //    List<Plannification> retrieveAllPlannification();

    //public Creno addCreno(Creno c, int idEvent)
    public Plannification addPlan(Plannification p, Integer idCreno);

    List<Plannification> getAllPlannifications();

    Optional<Plannification> getPlannification(int id);



}

