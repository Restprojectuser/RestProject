package com.Initializer.RestProject;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Car  {
    private String make;

    private String model;
    private String fueltype;
    private double cost;






    public Car (String make,String model,String fueltype,double cost)

    {

        this.make = make;

        this.model= model;

        this.fueltype = fueltype;

        this.cost=cost;

    }



    public String setCarMake(String make)

    {

        this.make = make;

        return make;
    }



    public String getCarMake()

    {

        return make;

    }



    public String setCarModel(String model)

    {

        this.model = model;

        return model;

    }



    public String getCarModel()

    {

        return model;

    }



    public double setCarcost(double cost)

    {

        this.cost= cost;

        return cost;

    }
    public double getCarcost()

    {

        return cost;

    }
    public String setCarfueltype(String fueltype)

    {

        this.fueltype= fueltype;

        return fueltype;

    }



    public String getCarfueltype()

    {

        return fueltype;

    }







    public static void main (String[] args)
    {

        Car car1 = new Car("Toyota", "Corolla" , "petrol",6000000.67);

        Car car2 = new Car("Nissan", "Murano" , "Diesel",750000.98);

        Car car3 = new Car("Mahendra", "Mazda" , "petrol",890000.56);

        Car car4 = new Car("Nexa", "Swift","Diesel",445000.89);



        Driver driver1 = new Driver("John", 26 , "Heavy vehicle", 2);

        Driver driver2 = new Driver("Nissan", 21 , "Four Wheeler",1);
        Driver driver3 = new Driver("Rakesh", 32 , "Two Wheeler",3);

        Driver driver4 = new Driver("Rock", 28 , "Heavy vehicle",4);

        HashMap<String,String> adj=new HashMap<>();
        adj.put("name",driver1.getDriverName());
        adj.put("age",String.valueOf(driver1.getDriverAge()));
        adj.put("License",String.valueOf(driver1.getDriverValidlisensce()));
        adj.put("expi",String.valueOf(driver1.getDriverExperience()));
        Map<Map<String,String >,Car> map = new HashMap<>();
        map.put(adj, car1);
        System.out.println(adj);
        Gson gson = new Gson();
        String json = gson.toJson(map);
        // JSONObject json = new JSONObject(map);
        System.out.println(json);







//
//
//            car1.setCarMake("Toyota");
//
//            System.out.println(car1);
//
//            System.out.println(car1.getCarMake());
//
//
//
//            car2.setCarModel("Murano");
//
//            System.out.println(car2);
//
//            System.out.println(car2.getCarMake());
//
//
//            car3.setCarcost(620000);
//
//            System.out.println(car3);
//
//            System.out.println(car3.getCarModel());





    }

}





