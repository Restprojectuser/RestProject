package com.Initializer.RestProject;

public class Driver {
    private String name;

    private int age;
    private String validlicense;
    private int experience;

    public Driver(String name, int age,String validlicense,int experience)

    {

        this.name = name;

        this.age= age;

        this.validlicense = validlicense;

        this.experience=experience;

    }

    public Driver() {

    }


    public String setDriverName(String name)

    {

        this.name = name;

        return name;
    }



    public String getDriverName()

    {

        return name;

    }



    public int setDriverAge(int age)

    {

        this.age = age;

        return age;

    }
    public int getDriverAge()

    {

        return age;

    }
    public String setDriverValidlisence(String validlicense)

    {

        this.validlicense = validlicense;

        return validlicense;

    }



    public String getDriverValidlisensce()

    {

        return validlicense;

    }



    public int setDriverExperience(int experience)

    {

        this.experience= experience;

        return experience;

    }



    public int getDriverExperience()

    {

        return experience;
    }







    public static void main (String[] args)
    {













    }

}




