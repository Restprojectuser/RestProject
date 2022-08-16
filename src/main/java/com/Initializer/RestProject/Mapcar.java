package com.Initializer.RestProject;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Mapcar extends Driverdetails  {
    public static void main (String []args){
        Map<Object, Object> map = new HashMap<>();
//        Driverdetails driver1 = new Driverdetails("John",32,"Heavy vehicle",3);


// Convert a map having list of values.
        String[] valuea = new String[] { "Company=Toyota", "Model=Fortuner", "Fuel type=Petrol","Cost=6000000" };
        String[] valueb= new String[] { "Company=Maruti", "Model=Swift", "Fuel type=Diesel","Cost=560000" };
        String[] valuec = new String[] { "Comapny=Kia", "Model=Seltos", "Fuel type=Petrol","Cost=960000" };
        String[] valued = new String[] { "Company=Renault", "Model=Duster", "Fuel type=Diesel","Cost=880000" };
//        String[] driver1 = new String[] {"Name=John","Age=32","Valid lisence=Heavy vehicle","Experiene=3"};

        map.put("Name=John,Age=32,Valid lisence=HMV,Experiene=3", valuea);
        map.put("Name=Jackson,Age=28,Valid lisence=HMV,Experiene=2", valueb);
        map.put("Name=Paul,Age=25,Valid lisence=LMV,Experiene=2", valuec);
        map.put("Name=Richard,Age=35,Valid lisence=LMV,Experiene=5",valued);
//        map.put("key2", value2);
//        map.put("key3", value3);
//        map.put("key4", value4);

        JSONObject json = new JSONObject(map);
        System.out.println(json);
    }

}
