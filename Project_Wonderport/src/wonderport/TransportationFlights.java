package wonderport;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by amir on 4/4/17.
 */
public class TransportationFlights extends Flights {

    public static ArrayList<TransportationFlights>  transportationFlights = new ArrayList<TransportationFlights>();
    public static void transportaionFlightsPrinter(){
        for( int i = 0; i < transportationFlights.size() ; i++ ){
            System.out.print("TransportationFlight's Origin: " + transportationFlights.get(i).getOrigin() + "|");
            System.out.print("TransportationFlight's Destination: " + transportationFlights.get(i).getDestination() + "|");
            System.out.println("TransportationFlight's Takeoff Time:" + transportationFlights.get(i).getTakeoffTime() + "|");
            System.out.println("TransportationFlight's Landing Time:" + transportationFlights.get(i).getLandingTime() + "|");
            if( i == (transportationFlights.size() - 1) )
                System.out.println("-----------");

        }
    }
    public static void addFlight() {
        Scanner scanner = new Scanner(System.in);
        transportationFlights.add(new TransportationFlights());
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
        for( int i = 0; i < transportationFlights.size(); i++ ){
            System.out.println(" Available Transportation Flights Are : ");
            System.out.println("Flight " + (i+1) + "." );
            System.out.print("TransportationFlight's Origin: " + transportationFlights.get(i).getOrigin() + "|");
            System.out.print("TransportationFlight's Destination: " + transportationFlights.get(i).getDestination() + "|");
            System.out.println("TransportationFlight's Takeoff Time:" + transportationFlights.get(i).getTakeoffTime() + "|");
            System.out.println("TransportationFlight's Landing Time:" +transportationFlights.get(i).getLandingTime() + "|");
            if( i == (transportationFlights.size() - 1) )
                System.out.println("-----------");
        }
    }

}
