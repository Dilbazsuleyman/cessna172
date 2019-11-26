package com.company;

public class Main {

    public static void main(String[] args) {
	int var1=5;
	double var2=3.65;
	aircraft cessna172= new aircraft(); //creates object class aircraft
cessna172.passengers=4;
cessna172.cruiseSpeed=140;
cessna172.fuelCapacity=56.5;
cessna172.fuelBurnRate=9.5;
        System.out.println("Cessna:"+cessna172.passengers+cessna172);
        System.out.println("Cessna:"+cessna172.fuelCapacity);
        System.out.println("Cessna:"+cessna172.fuelBurnRate);
        System.out.println("Cessna:"+cessna172.cruiseSpeed);

        aircraft piperSaratoga = new aircraft(); //creates object class aircraft

//int jason ;
//jason=5;
    }
}
class aircraft {
   int passengers ;
   int cruiseSpeed ;
   double fuelCapacity;
   double fuelBurnRate;
}