import java.util.Scanner;

public class IOVehicle {
    public static String inputVehicleType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập loại xe:");
        String vehicleType = scanner.nextLine();
        return vehicleType;
    }


    public static String inputLicensePlates() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biển số xe:");
        String licensePlates = scanner.nextLine();
        return licensePlates;
    }

    public static Vehicle iovehicle() {
        Vehicle vehicle = new Vehicle(IOVehicle.inputVehicleType(), IOVehicle.inputLicensePlates());
        return vehicle;
    }
}
