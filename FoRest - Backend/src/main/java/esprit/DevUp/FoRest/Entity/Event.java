package esprit.DevUp.FoRest.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "event")
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idEvent;
    @Enumerated(EnumType.STRING)
    public location location;
    String name;
    String objectif;
    @Enumerated(EnumType.STRING)
    public state state;
    public String description;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="idCreno")
    private Set<Creno> crenos;

    @ManyToMany
    Set<User> users;




}
