package esprit.DevUp.FoRest.Repository.GestionEvenement;

import esprit.DevUp.FoRest.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
}
