public class Vehicle {
    final String commonCode = "12EC7897";
    static int count=0;
    String noPlate ;
    String vehicleOwner;
    String fuel;
    Vehicle(){
        System.out.println("A NEW VEHICLE WOOOH!");
        count++;
    }

    Vehicle(String noPlate,String vehicleOwner){
        this();
        System.out.println("Vehicle initailizing no plate with owner");
        this.noPlate = noPlate;
        this.vehicleOwner = vehicleOwner;

    }
    Vehicle(String noPlate,String vehicleOwner,String fuel){
        this(noPlate,vehicleOwner);
        this.fuel = fuel;
    }

     static void sound(){
        System.out.println("br br Br BRR BRRR BRRRRRRRRRRRRRRRRRRR");
    }

    void fueling(){
        System.out.println("FILLING THE PETROL/ DIESEL FOR VEHICLE");
    }

    @Override
    public String toString() {
        return "No. Plate :"+noPlate+"\n"+"Owner :"+vehicleOwner+"\n"+"Fuel :"+fuel;
    }
}
