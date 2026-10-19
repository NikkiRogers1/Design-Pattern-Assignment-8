public class Main {
    public static void main(String[] args) {
        
        VehicleReport truck = new TruckReport();
        VehicleReport bike = new BikeReport();
        
        truck.generateReport();
        bike.generateReport();

    }
}

