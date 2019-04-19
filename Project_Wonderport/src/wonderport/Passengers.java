package wonderport;

//import com.sun.tools.internal.xjc.api.util.FilerCodeWriter;
//import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by amir on 4/9/17.
 */
public class Passengers extends Users {

    public static ArrayList<Passengers> passengers = new ArrayList<Passengers>();
    public ArrayList<String> flightsMembers = new ArrayList<String>();

    public Passengers(){
        usernameAndPasswordSetter();
    }
    public static void userSelection(){
        System.out.println(" Select The Number Of Work You Want To Be Done : ");
        System.out.println(" 1.Add Passenger \n 2.Remove Passenger \n 3.Log Of Available Flights \n --------- \n Press 0 to go back. ");
        Scanner scanner = new Scanner(System.in);
        numberSelection = scanner.nextInt();
        switch (numberSelection){
            case 1 : {
                addUser();
                mainclass.userSelectionBacker();
                break;}
            case 2 : {

                break;}
            case 3 : {
                userFlightLogShower();
                break;}
            case 0 : {
                mainclass.menuPrinter();
                break;}

        }
    }
    public static void addUser(){
        Scanner scanner = new Scanner(System.in);
        passengers.add(new Passengers());
        System.out.println(" Welcome to this Airport Dear \"" + passengers.get(0).getUsername() + "\" !" );
        System.out.println(" \t You're Successfully Regestered :) " );
        System.out.println("---------" );

    }
    public static void passengersPrinter(){
        for( int i = 0; i < passengers.size(); i++ ){
            System.out.print("Passenger's UserName: " + passengers.get(i).getUsername() + "|");
            System.out.print("Passenger's PassWord: " + passengers.get(i).getPassword() + "|");
            System.out.println("Passenger's ID: " + passengers.get(i).getId() + "|");
            if( i == (passengers.size() - 1) )
                System.out.println("-----------");

        }
    }
    public static void eachPassengersFlightsPrinter(ArrayList<String> flightsMembers) {
        for (String element : flightsMembers) {
            System.out.println(element);
        }
    }
    public static void passengersFlightsPrinter() {
        for(Passengers element : passengers ) {
            System.out.println(element.getUsername() + "Flights : " + element.flightsMembers);
        }
    }
    public static void userFlightLogShower(){
        Scanner scanner = new Scanner(System.in);
        String userNameSelection,passwordSelection;
        System.out.println(" Enter Your UserName : ");
        userNameSelection = scanner.next();
        System.out.println(" Enter Your Password : ");
        passwordSelection = scanner.next();
        for (Passengers element : Passengers.passengers){
            if(element.getUsername().equals(userNameSelection)
                    && element.getPassword().equals(passwordSelection)){
                //TransportationFlights.FlightLogsPrinter();
                //MilitaryFlights.FlightLogsPrinter();
                eachPassengersFlightsPrinter(element.flightsMembers);
                mainclass.userSelectionBacker();
            }
        }
        System.out.println(" The UserName Or Password is Incorrect ! \n Try Again ! ");
        System.out.println(" ---------- ");
        mainclass.baseMenuPrinter();
    }

}
