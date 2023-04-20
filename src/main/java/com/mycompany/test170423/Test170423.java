package com.mycompany.test170423;

import java.util.HashMap;
import java.util.Scanner;

import domain.Book;
import fligthControl.ui.TextUI;
import fligthControl.logic.FlightControl;
import fligthControl.domain.Airplane;
import fligthControl.domain.Flight;
import fligthControl.domain.Place;


public class Test170423 {

    public static void main(String[] args) {
        StringBuilder numbers = new StringBuilder();
        
        for (int i = 1; i < 5; i++) {
            numbers.append(i);
        }
        
        System.out.println(numbers.toString());
        
        System.out.println("------------------------------------------");
        
        Book book = new Book("The ABCs of packages!");
        System.out.println("Hallo mycompany.test170423: " + book.getName());
        
        System.out.println("----------------------------------------------------");
        System.out.println();
        
        /*
        HashMap<String, Airplane> airplanes = new HashMap<>();
        Airplane airplane1 = new Airplane("Airbus343", 5000);
        Airplane airplane2 = new Airplane("Airbus454", 7000);
        Airplane airplane3 = new Airplane("Boing 555", 9000);
        airplanes.put("airplane1",airplane1 );
        airplanes.put("airplane2", airplane2);
        airplanes.put("airplane3", airplane3);
        
        System.out.println(airplanes.get("airplane1"));
        
        Place stg = new Place("Stuttgart");
        Place fra = new Place("Frankfurt");
        Place bei = new Place("Beirut");
        Place dub = new Place("Dubai");
        
        HashMap<String, Flight> flights = new HashMap<>();
        flights.put("stg-fra", new Flight(airplane1 , stg, fra));
        flights.put("fra-bei", new Flight(airplane2, fra, bei));
        flights.put("bei-dub", new Flight(airplane3, bei, dub));
        
        System.out.println("-----------------------------------");
        System.out.println();
        
        Airplane airplane1 = new Airplane("Airbus343", 5000);
        Airplane airplane2 = new Airplane("Airbus454", 7000);
        Airplane airplane3 = new Airplane("Boing 555", 9000);
        FlightControl flightControl1 = new FlightControl();
        
        flightControl1.addAirplane("Airbus555", 9000);
        flightControl1.addAirplane("Airbus545", 7000);
        flightControl1.addAirplane("Boing 555", 9000);
        flightControl1.addFlight(airplane1, "Dubai", "Frankfurt");
        flightControl1.addFlight(airplane2, "Beirut", "Dubai");
        flightControl1.addFlight(airplane3, "Stuttgart", "Berlin");
        System.out.println(flightControl1.getAirplanes());
        
        System.out.println(flightControl1.getAirplane("Boing 555"));
        System.out.println(flightControl1.getFlights());
        
        System.out.println("----------------------------------------");
        System.out.println();
        */
        
        FlightControl flightControl2 = new FlightControl();
        
        Scanner scanner = new Scanner(System.in);
        TextUI textui = new TextUI(flightControl2,scanner);
        textui.start();
        textui.startFlightControl();      
        
        
    }
    
    
}
