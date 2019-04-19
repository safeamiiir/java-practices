package wonderport;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by amir on 4/4/17.
 */
public class MilitaryFlights extends Flights{

    public static ArrayList<MilitaryFlights> militaryFlights = new ArrayList<MilitaryFlights>();
    public static void militaryFlightsPrinter(){
        for( int i = 0; i < militaryFlights.size(); i++ ){
            System.out.print("MilitaryFlight's Origin: " + militaryFlights.get(i).getOrigin() + "|");
            System.out.print("MilitaryFlight's Destination: " + militaryFlights.get(i).getDestination() + "|");
            System.out.println("MilitaryFlight's Takeoff Time:" + militaryFlights.get(i).getTakeoffTime() + "|");
            System.out.println("MilitaryFlight's Landing Time:" + militaryFlights.get(i).getLandingTime() + "|");
            if( i == (militaryFlights.size() - 1) )
                System.out.println("-----------");

        }
    }
    public static void addFlight() {
        Scanner scanner = new Scanner(System.in);
        militaryFlights.add(new MilitaryFlights());
        /*System.out.println(" Thank You Admin! \n \t The Flight has Been Added :) ");
        System.out.println("--------- \n Press 0 to go back to Menu.  ");
        int backward = scanner.nextInt();
        while (backward != 0) {
            System.out.println(" Enter Valid Number . ");
            backward = scanner.nextInt();
        }
        if(backward == 0)
            mainclass.baseMenuPrinter();*/
    }
    public static void FlightLogsPrinter(){
        for( int i = 0; i < militaryFlights.size(); i++ ){
            System.out.println(" Available Military Flights Are : ");
            System.out.println("Flight " + (i+1) + "." );
            System.out.print("MilitaryFlight's Origin: " + militaryFlights.get(i).getOrigin() + "|");
            System.out.print("MilitaryFlight's Destination: " + militaryFlights.get(i).getDestination() + "|");
            System.out.println("MilitaryFlight's Takeoff Time:" + militaryFlights.get(i).getTakeoffTime() + "|");
            System.out.println("MilitaryFlight's Landing Time:" + militaryFlights.get(i).getLandingTime() + "|");
            if( i == (militaryFlights.size() - 1) )
                System.out.println("-----------");
        }
    }
}
