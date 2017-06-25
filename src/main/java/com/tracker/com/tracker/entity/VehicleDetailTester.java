package com.tracker.com.tracker.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by sai on 6/25/17.
 */


public class VehicleDetailTester {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");


        EntityManager entityManager = entityManagerFactory.createEntityManager();

  /*   --> INSERT Vehicles

    vehicle vh = new vehicle();
        vh.setVin("WP1AB29P63LA60179");
        vh.setMake("PORSCHE");
        vh.setModel("CAYENNE");
        vh.setYear(2015);
        vh.setRedlineRpm(8000);
        vh.setMaxFuelVolume(18);
        vh.setLastServiceDate("2017-03-25T17:31:25.268Z");


        entityManager.getTransaction().begin();
        entityManager.persist(vh);
        entityManager.getTransaction().commit();*/

  /*  -->  FIND By ID

  vehicle vh = entityManager.find(vehicle.class, "WP1AB29P63LA60179");
  System.out.println(vh);*/




       /* -->   Update values


        vehicle vh = entityManager.find(vehicle.class, "WP1AB29P63LA60179");
        vh.setYear(2014);
        entityManager.getTransaction().begin();
        entityManager.merge(vh);
        entityManager.getTransaction().commit();*/



       /* -->  Delete record


       vehicle vh = entityManager.find(vehicle.class, "WP1AB29P63LA60179");
        entityManager.getTransaction().begin();
       entityManager.remove(vh);
        entityManager.getTransaction().commit();*/



       /* -->  FIND all

        TypedQuery<vehicle> query = entityManager.createQuery("select vh from vehicle vh order by year ASC ", vehicle.class);

        List<vehicle> vehicleList = query.getResultList();

        for( vehicle vh: vehicleList)
        {
            System.out.println(vh);
        }*/


        /* --> Find by Vin

        TypedQuery<vehicle> query = entityManager.createQuery("select vh from vehicle vh where vin=:paramVin ", vehicle.class);
        query.setParameter("paramVin", "WP1AB29P63LA60179");

        List<vehicle> vehicleList = query.getResultList();

        for( vehicle vh: vehicleList)
        {
            System.out.println(vh);
        }*/



        /* --> Find by Vin using named queries

        TypedQuery<vehicle> query = entityManager.createNamedQuery("Vehicle.findByVin",vehicle.class);

        query.setParameter("paramVin", "WP1AB29P63LA60179");

        List<vehicle> vehicleList = query.getResultList();

        for( vehicle vh: vehicleList)
        {
            System.out.println(vh);
        }

        */

        entityManager.close();
        entityManagerFactory.close();

    }
}
