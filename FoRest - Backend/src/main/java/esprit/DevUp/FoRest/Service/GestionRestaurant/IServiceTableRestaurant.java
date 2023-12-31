package esprit.DevUp.FoRest.Service.GestionRestaurant;

import esprit.DevUp.FoRest.Entity.Restaurant.TableRestaurant;

import java.util.List;

public interface IServiceTableRestaurant {
    List<TableRestaurant> retrieveAllTableRestaurant();
    List<TableRestaurant> retrieveAllTableRestaurantByRestaurant(Integer idrestaurant);

    TableRestaurant addTableRestaurant (Integer id,TableRestaurant u);

    TableRestaurant updateTableRestaurant (TableRestaurant u);

    TableRestaurant retrieveTableRestaurant(Integer id);


    void removeTableRestaurant(Integer id);
}

