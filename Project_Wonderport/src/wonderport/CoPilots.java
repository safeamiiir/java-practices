package wonderport;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by amir on 4/9/17.
 */
public class CoPilots extends Users {

    public static ArrayList<CoPilots> coPilotes = new ArrayList<CoPilots>();

    public CoPilots(){
        usernameAndPasswordSetter();
    }
    public static void userSelection(){
        System.out.println(" Select The Number Of Work You Want To Be Done : ");
        System.out.println(" 1.Add Co-Pilot \n 2.Remove Co-Pilot \n 3.Log Of Flights You'll Have \n --------- \n Press 0 to go back. ");
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
        coPilotes.add(new CoPilots());
        System.out.println(" Welcome to this Airport Dear \"" + coPilotes.get(0).getUsername() + "\" !" );
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
        for( int i = 0; i < coPilotes.size(); i++ ){
            System.out.print("Co-Pilot's  UserName: " + coPilotes.get(i).getUsername() + "|" );
            System.out.print("Co-Pilot's PassWord: " + coPilotes.get(i).getPassword() + "|" );
            System.out.println("Co-Pilots's  ID: " + coPilotes.get(i).getId() + "|" );
            if( i == (coPilotes.size() - 1) )
                System.out.println("------------");

        }
    }
}
