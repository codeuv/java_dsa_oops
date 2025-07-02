import com.codeuv.Car.ABSBrake;
import com.codeuv.Car.Brake;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SmartVehicle sv = new SmartVehicle("BAR9071","Electric-Hydro","Cyber Jakie");

        System.out.println(sv.toString());

        Vehicle v = new Vehicle("KA 09 TX 12323","joe","petrol");
        System.out.println(v.count);

        System.out.println(sv.commonCode);
        sv.fueling();
        sv.sound();

        //Upcasting or Dynamic Memory Dispatch
        Vehicle vs = new SmartVehicle("AS 12 HU 1231","NAMAN","Hybrid");
        sv.fueling();
        System.out.println(sv.smartCode);
//        System.out.println(vs.smartCode); this will show an error ... because reference variable cannot access it
        System.out.println(vs.toString());

        ABSBrake ab = new ABSBrake();
        System.out.println(ab.name);




    }
}