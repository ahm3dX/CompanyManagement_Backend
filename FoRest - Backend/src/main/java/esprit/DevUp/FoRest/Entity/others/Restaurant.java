package esprit.DevUp.FoRest.Entity.others;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Restaurant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_restaurant", nullable = false)
    private Integer idRestaurant;
    private String nameRestaurant ;
    private  String addressRestaurant;
    private int nbrmaximal;
    @ManyToOne
    Restaurant restaurant;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="restaurant")
    @JsonIgnore
    private Set<OffreRestaurant> offreRestaurants;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="_Restaurant")
    @JsonIgnore
    private Set<ReservationPlace> reservationPlaces;



}
