import java.util.Scanner;

public class IOCustomer {
    static Scanner scanner = new Scanner(System.in);

    public static String inputNameCustomer() {
        System.out.println("Nhập tên khách hàng");
        while (true) {
            try {
                String nameCustomer = scanner.nextLine();
                if (!nameCustomer.equals("")) {
                    return nameCustomer;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập lại tên khách hàng");
            }
        }
    }

    public static int inputAgeCustomer() {
        System.out.println("Nhập tuổi khách hàng");
        while (true)
            try {
                int age = Integer.parseInt(scanner.nextLine());
                return age;
            } catch (Exception e) {
                System.out.println("Nhập lại tuổi khách hàng");
            }
    }

    public static String inputIdCustomer() {
        System.out.println("Nhập số CMND");
        while (true)
            try {
                String id = scanner.nextLine();
                if (!id.equals(""))
                return id;
                else throw new Exception();
            } catch (Exception e) {
                System.out.println("Nhập lại số CMND");
            }
    }

    public static String inputAddress(){
        System.out.println("Nhập địa chỉ khách hàng");
        while (true) {
            try {
                String address = scanner.nextLine();
                if (!address.equals("")) {
                    return address;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập lại địa chỉ khách hàng");
            }
        }
    }
    public static Customer iOCustomer(){
        String nameCustomer = IOCustomer.inputNameCustomer();
        int ageCustomer = IOCustomer.inputAgeCustomer();
        String idCustomer = IOCustomer.inputIdCustomer();
        String address = IOCustomer.inputAddress();
        String nameRoom =IORoom.inputNameRoom();
        Vehicle vehicle =IOVehicle.iovehicle();
        Customer customer = new Customer(nameCustomer,ageCustomer,idCustomer,address,nameRoom,vehicle);
        return customer;
    }
}
