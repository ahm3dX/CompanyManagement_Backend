package esprit.DevUp.FoRest.Repository.EventRepository;

import esprit.DevUp.FoRest.Entity.Event.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InviteRepository extends JpaRepository<invite, Integer> {

}
