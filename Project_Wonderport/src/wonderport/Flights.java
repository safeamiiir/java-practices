package wonderport;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by amir on 4/9/17.
 */
public class Flights {

    protected String origin;
    protected String landingTime;
    protected String destination;
    protected String takeoffTime;
    protected String usernameSubmiter;
    protected String airPlaneNameSubmiter;
    public static ArrayList<String> takeOffTime = new ArrayList<String>();
    public static ArrayList<String> landing = new ArrayList<String>();


    public String getOrigin() {
        return origin;
    }
    public String getLandingTime() {
        return landingTime;
    }
    public String getDestination() {
        return destination;
    }
    public String getTakeoffTime() {
        return takeoffTime;
    }
    public Flights() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the origion : ");
        origin = scanner.next();

        System.out.println(" Enter the destination : ");
        destination = scanner.next();

        System.out.println(" Enter the takeOffTime : ");
        takeoffTime = scanner.next();
        takeoffTimeCkecker(takeoffTime);
        takeOffTime.add(takeoffTime);

        System.out.println(" Enter the landingTime : ");
        landingTime = scanner.next();
        landingTimeCkecker(landingTime);
        landing.add(landingTime);

        System.out.println(" Enter the AirPlanes's Name : ");
        flightToAirPlaneSetter();

        System.out.println(" Enter the Passenger's UserName : ");
        flightToPassengerSetter();

        //System.out.println(" Enter the Pilots's UserName : ");
        //System.out.println(" Enter the co-Pilots's UserName : ");



    }
    public void flightToPassengerSetter(){
        int flag = 0;
        Scanner scanner = new Scanner(System.in);
        this.usernameSubmiter = scanner.next();
        for (Passengers element : Passengers.passengers){
            if(element.getUsername().equals(this.usernameSubmiter)){
                ///////////////
                element.flightsMembers.add("Origin :" + getOrigin()
                        + " | Destination :" + getDestination()
                        + " | Takeoff Time :" + getTakeoffTime()
                        + " | Landing Time :" + getLandingTime() );
                System.out.println("Flight For \""+ this.usernameSubmiter + "\" Has Been set SuccessFully :) ");
                System.out.println(" ---------- ");
                mainclass.baseMenuPrinter();
                flag = 1;
            }
        }
        if(flag != 1) {
            System.out.println(" This UserName is not available !!! \n Try it Again!  ");
            System.out.println(" ---------- ");
            mainclass.baseMenuPrinter();
        }
    }
    public void flightToAirPlaneSetter(){
        int flag = 0;
        Scanner scanner = new Scanner(System.in);
        this.airPlaneNameSubmiter = scanner.next();
        for (AirPlanes element : AirPlanes.airPlanes){
            if(element.getAirPlaneName().equals(this.airPlaneNameSubmiter)){
                ///////////////
                element.flightAirPlane.add("Origin :" + getOrigin()
                        + " | Destination :" + getDestination()
                        + " | Takeoff Time :" + getTakeoffTime()
                        + " | Landing Time :" + getLandingTime() );
                System.out.println( " This Flight For \"" + AirPlanes.airPlanes.get(( (AirPlanes.ii)-1 )).getAirPlaneName() + "\" Has Been added. ");
                flag = 1;
            }
        }
        if(flag != 1) {
            System.out.println(" This AirPlane is not available !!! \n Try it Again!  ");
            System.out.println(" ---------- ");
            mainclass.baseMenuPrinter();
        }
    }
    private static void takeoffTimeCkecker(String time) {
        for (String element : Flights.takeOffTime) {
            if (time.equals(element)) {
                System.out.println(" Enter Another Time ! This Time There's Other Flight ");
                mainclass.baseMenuPrinter();
            }
        }
    }
    private static void landingTimeCkecker(String time) {
        for (String element : Flights.landing) {
            if (time.equals(element)) {
                System.out.println(" Enter Another Time ! This Time There's Other Flight ");
                mainclass.baseMenuPrinter();
            }
        }
    }


}
