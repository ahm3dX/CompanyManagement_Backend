package esprit.DevUp.FoRest.Service.EventServices;

import esprit.DevUp.FoRest.Entity.Event.*;

import esprit.DevUp.FoRest.Repository.EventRepository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

;

@Service
@AllArgsConstructor
public class CrenoService implements ICrenoService {
    CrenoRepository crenoRepository;
    EventRepository eventRepository;
    private final PlannificationRepository plannificationRepository;

    @Override
    public Creno addCreno(Creno c, int idEvent) {
        Event event= eventRepository.findById(idEvent).get();
        c.setEvent(event);
        addPlanification(c);
        return c;
    }

    private void addPlanification(Creno c) {
        Plannification p = new Plannification();
        p.setDateP(c.getDateDebut());
        p.setCreno(c);
        p.setOccurrence(c.getOccurence());
        plannificationRepository.save(p);
        crenoRepository.save(c);
    }
 /*   @Override courclassroom = creno  classe = event

    public CoursClassroom ajouterCoursClassroom(CoursClassroom cc, Integer classeId) {
        Classe classe= classeRepository.findById(classeId).get();
        cc.setClasse(classe);
        coursClassroomRepository.save(cc);
        return cc;
    }*/

    @Override
    public List<Creno> getAllCrenos() {
        return crenoRepository.findAll();
    }

    @Override
    public Optional<Creno> getCreno(int id) {
        return crenoRepository.findById(id);
    }

    @Override
    public void affecterCrenoEvent(int idCreno, int idEvent) {
        Creno creno= crenoRepository.findById(idCreno).get();
        System.out.println("Crennnnnnnnnnnnn"+creno);

        Event event= eventRepository.findById(idEvent).get();
        System.out.println("Evntnnnnnnnnnnnn"+creno);
         //creno.setEvent(event);
        eventRepository.save(event);

    }

    @Override
    public List<Creno> retriveCrenoEvent(int idEvent) {
        return crenoRepository.getEventFromCreno(idEvent);
    }


}
