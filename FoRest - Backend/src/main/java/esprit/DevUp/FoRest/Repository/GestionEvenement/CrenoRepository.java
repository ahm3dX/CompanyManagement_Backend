package esprit.DevUp.FoRest.Repository.GestionEvenement;

import esprit.DevUp.FoRest.Entity.Creno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CrenoRepository extends JpaRepository<Creno, Integer> {

    @Query(value = "SELECT * FROM creno e WHERE e.id_event = :id_event",
            nativeQuery = true)
    List<Creno> getEventFromCreno(@Param("id_event") int id_event);

}