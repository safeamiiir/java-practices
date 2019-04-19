package wonderport;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by amir on 4/9/17.
 */
public class Attendants extends Users {

    public static ArrayList<Attendants> attendents = new ArrayList<Attendants>();

    public Attendants(){
        usernameAndPasswordSetter();
    }
    public static void userSelection(){
        System.out.println(" Select The Number Of Work You Want To Be Done : ");
        System.out.println(" 1.Add Attendent \n 2.Remove Attendent \n 3.Log Of Flights You'll Have \n --------- \n Press 0 to go back. ");
        Scanner scanner = new Scanner(System.in);
        numberSelection = scanner.nextInt();
        switch (numberSelection){
            case 1 : {
                addUser();
                break;}
            case 2 : {

                break;}
            case 3 : {

                break;}
            case 0 : {
                mainclass.menuPrinter();
                break;}

        }
    }
    public static void addUser(){
        Scanner scanner = new Scanner(System.in);
        attendents.add(new Attendants());
        System.out.println(" Welcome to this Airport Dear \"" + attendents.get(0).getUsername() + "\" !" );
        System.out.println(" \t You're Successfully Regestered :) " );
        System.out.println("--------- \n Press 0 to go back. " );
        int backward = scanner.nextInt();
        while(backward != 0){
            System.out.println(" Enter Valid Number . ");
            backward = scanner.nextInt();
        }
        if( backward == 0 ){
            userSelection();
        }

    }
    public static void passengersPrinter(){
        for( int i = 0; i < attendents.size(); i++ ){
            System.out.print("Attendant's  UserName: " + attendents.get(i).getUsername() + "|" );
            System.out.print("Attendant's  PassWord: " + attendents.get(i).getPassword() + "|" );
            System.out.println("Attendant's  ID: " + attendents.get(i).getId() + "|" );
            if( i == (attendents.size() - 1) )
                System.out.println("-------------");

        }
    }
}
