package wonderport;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by amir on 4/9/17.
 */
public class Pilots extends Users{

    public static ArrayList<Pilots> pilots = new ArrayList<Pilots>();

    public Pilots(){
        usernameAndPasswordSetter();
    }
    public static void userSelection(){
        System.out.println(" Select The Number Of Work You Want To Be Done : ");
        System.out.println(" 1.Add Pilot \n 2.Remove Pilots \n 3.Log Of Flights You'll Have \n --------- \n Press 0 to go back. ");
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
        pilots.add(new Pilots());
        System.out.println(" Welcome to this Airport Dear \"" + pilots.get(0).getUsername() + "\" !" );
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
    public static void pilotsPrinter(){
        for( int i = 0; i < pilots.size(); i++ ){
            System.out.print("Pilot's UserName: " + pilots.get(i).getUsername() + "|");
            System.out.print("Pilot's PassWord: " + pilots.get(i).getPassword()+ "|");
            System.out.println("Pilot's ID: " + pilots.get(i).getId() + "\t"  + "|");
            if( i == (pilots.size() - 1) )
                System.out.println("------------");
        }
    }
}


