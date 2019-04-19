package wonderport;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Scanner;

/**
 * Created by amir on 3/25/17.
 */
public class mainclass {
    public static void main(String[] args) {
        baseMenuPrinter();
        }

    public static void menuPrinter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter One Of This Numbers in the MainMenu : ");
        System.out.println(" 1.Passenger \n 2.Attendent \n 3.Co-Pilot \n 4.Pilot \n --------- \n Press 0 to go back. ");
        int numberSelection = scanner.nextInt();
        switch (numberSelection) {
            case 0:{
                baseMenuPrinter();
                break;
            }
            case 1:{
                Passengers.userSelection();
                break;}
            case 2:{
                Attendants.userSelection();
                break;}
            case 3:{
                CoPilots.userSelection();
                break;}
            case 4:{
                Pilots.userSelection();
                break;}
        }

    }
    public static void baseMenuPrinter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" \n \t \t \t Welcome :) \t \t \t  ");
        System.out.println(" Select You are \"1.Admin\" or \"2.User\"  : ");
        int userSelection = scanner.nextInt();
        while(userSelection != 1 && userSelection != 2){
            System.out.println(" You should Just Select \"1\" or \"2\" ! ");
            userSelection = scanner.nextInt();
        }
        if (userSelection == 1) { //admin
            System.out.println(" Enter What You Want to Do ");
            System.out.println(" 1.Check The Informations \n 2.Add Flights \n 3.add AirPlane");
            System.out.println(" --------- \n Press 0 to go back  ");
            int adminFunctionSelection = scanner.nextInt();
            while (adminFunctionSelection != 1 && adminFunctionSelection != 2 && adminFunctionSelection != 3 && adminFunctionSelection != 0) {
                System.out.println(" You should Just Select \"1\" or \"2\" or \"3\" or \"0\"  ! ");
                adminFunctionSelection = scanner.nextInt();
            }
            if (adminFunctionSelection == 1) { //Check The Informations
                System.out.println(" 1.Check Flights Informations \n 2.Check People Informations \n 3.Ckeck AirPlanes Informations");
                int adminInformationSelection = scanner.nextInt();
                while (adminInformationSelection != 1 && adminInformationSelection != 2 && adminInformationSelection!= 3) {
                    System.out.println(" You should Just Select \"1\" or \"2\" or \"3\"! ");
                    adminInformationSelection = scanner.nextInt();
                }
                if (adminInformationSelection == 1) {//check Flight Information
                    //TransportationFlights.transportaionFlightsPrinter();
                    //MilitaryFlights.militaryFlightsPrinter();
                    //System.out.print(MilitaryFlights.militaryFlights.get(0).getLandingTime());
                    Passengers.passengersFlightsPrinter();
                    baseMenuPrinter();
                }
                else if (adminInformationSelection == 2) {//check people Information
                    Passengers.passengersPrinter();
                    Attendants.passengersPrinter();
                    CoPilots.passengersPrinter();
                    Pilots.pilotsPrinter();
                    baseMenuPrinter();
                }
                else if (adminInformationSelection == 3){ //check AirPlane Information
                    AirPlanes.airPlanesFlightsPrinter();
                }

            }
            else if (adminFunctionSelection == 2) { //addFlights
                System.out.println(" 1.TransportationFlights \n 2.MilitaryFlights ");
                int flightSelection = scanner.nextInt();
                while (flightSelection != 1 && flightSelection != 2) {
                    System.out.println(" You should Just Select \"1\" or \"2\" ! ");
                    flightSelection = scanner.nextInt();
                }
                if (flightSelection == 1) {
                    //transportation Flight
                    TransportationFlights.addFlight();
                } else if (flightSelection == 2) {
                    //Military Flights
                    MilitaryFlights.addFlight();
                }
            }
            else if (adminFunctionSelection == 3) {//add AirPlane
                AirPlanes.addAirPlane();
            }
            else if (adminFunctionSelection == 0) {//add AirPlane
                baseMenuPrinter();
            }

        }
        else if (userSelection == 2) { //User
            menuPrinter();
        }
    }
    public static void userSelectionBacker (){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Press 0 to go back. " );
        int backward = scanner.nextInt();
        while(backward != 0){
            System.out.println(" Enter Valid Number . ");
            backward = scanner.nextInt();
        }
        if( backward == 0 )
            Passengers.userSelection();
    }
    public static void baseMenuBacker (){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" --------- \n Press 0 to go back. " );
        int back = scanner.nextInt();
        while(back != 0){
            System.out.println(" Enter Valid Number . ");
            back = scanner.nextInt();
        }
        if( back == 0 )
            Passengers.userSelection();
    }

}