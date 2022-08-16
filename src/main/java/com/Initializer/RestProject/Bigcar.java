package com.Initializer.RestProject;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class Bigcar extends  Driverdetails{
    public static void main (String []args){
//        Carhistory car = new Carhistory();

        Carhistory cara = new Carhistory(6000000, "Toyota" , "Fortuner","petrol");


        Driverdetails drivera = new Driverdetails("John", 26 , "Heavy vehicle", 2);
        Map<String,Object> adj=new HashMap<>();
//        Map<Map<String,String >,Carhistory> map = new HashMap<>();
        Map<Object,Carhistory> map = new HashMap<>();

        adj.put("name",drivera.getDriverName());
        adj.put("age",String.valueOf(drivera.getDriverAge()));
        adj.put("License",drivera.getDriverValidlisensce());
        adj.put("expi",String.valueOf(drivera.getDriverExperience()));

        System.out.println(adj);
//        adj.put("expi",String.valueOf(driver1.getDriverExperience()));
//        adj.put("cost",String.valueOf(car1.getCost()));
//        adj.put("company",car1.getCompany());
//        adj.put("model",car1.getModel());
//        adj.put("fueltype",car1.getFueltype());

        map.put(drivera,cara);
        System.out.println(map);
        Gson gson = new Gson();
        String json = gson.toJson(map);
        System.out.println(json);

        // JSONObject json = new JSONObject(map);
        //.System.out.println(json);


    }
}


class Carhistory{
    private int cost;
    private String company;
    private String model;
    private String fueltype;

    public Carhistory() {

    }

    public int getCost() {
        return cost;}

    public Carhistory(int cost, String company, String model, String fueltype) {
        this.cost = cost;
        this.company = company;
        this.model = model;
        this.fueltype = fueltype;
    }

    public void setCost(int cost) {
        this.cost=cost;
    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }


}




