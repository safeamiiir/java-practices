package wonderport;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by amir on 4/9/17.
 */
public class AirPlanes {

    private String airPlaneName;
    public static ArrayList<AirPlanes> airPlanes = new ArrayList<AirPlanes>();
    public ArrayList<String> flightAirPlane = new ArrayList<String>();

    private int id = 0;
    int i = 0;
    static int ii = 0;

    public String getAirPlaneName() {
        return airPlaneName;
    }
    public int getId() {
        return id;
    }

    public AirPlanes(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter The AirPlane's Name : ");
        airPlaneName = scanner.next();
        id = i+1;
    }
    public static void addAirPlane(){
        airPlanes.add(new AirPlanes());
        System.out.println(" The \"" + airPlanes.get((ii++)).getAirPlaneName()  + "\" AirPlane Has Been Added !");
        backer();
    }
    public static void backer (){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ---------- \n Press 0 to go to Menu. " );
        int selection = scanner.nextInt();
        while(selection != 0){
            System.out.println(" Enter Valid Number . ");
            selection = scanner.nextInt();
        }
        if( selection == 0 )
            mainclass.baseMenuPrinter();
    }
    public static void airPlanesFlightsPrinter() {
        int i = 1;
        for(AirPlanes element : airPlanes ) {
            System.out.println(" AirPlane " + i++ + " : " + element.getAirPlaneName());
        }
        mainclass.baseMenuPrinter();
    }


}
