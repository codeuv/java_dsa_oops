public class SmartVehicle extends Vehicle{
    String smartCode = "USER U CAN RESET";
    public SmartVehicle(String noPlate, String vehicleOwner, String fuel) {
        super(noPlate,vehicleOwner,fuel);

    }

    SmartVehicle(){
        super("xxx xxx","","");
        System.out.println("SMART VEHICLE 2.0 CREATED");
    }



    static void sound(){
        System.out.println("HEY Rider How can i help you");
    }
    void fueling(){
        System.out.println("CHARGING SMART VEHICLE");
    }

    void connectToMobile(){
        System.out.println("Connecting via common Network");
    }
}
