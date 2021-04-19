import java.util.Scanner;

public class IORoom {
    static Scanner scanner = new Scanner(System.in);

    public static String inputNameRoom() {
        System.out.println("Nhập tên phòng:");
        while (true) {
            try {
                String nameRoom = scanner.nextLine();
                if (!nameRoom.trim().equals("")) {
                    return nameRoom;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập lai tên phòng:");
            }
        }
    }

    public static double inputPrice() {
        System.out.println("Nhập giá phòng");
        double price = 0;
        while (true) {
            try {
                price = Double.parseDouble(scanner.nextLine());
                return price;
            } catch (Exception e) {
                System.out.println("Nhập lại giá phòng:");
            }
        }
    }

    public static String inputRoomType() {
        System.out.println("Nhập loại phòng");
        while (true) {
            try {
                String price = scanner.nextLine();
                if (!price.trim().equals("")) {
                    return price;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập lai loại phòng:");
            }
        }
    }

    public static boolean inputAvailable() {
        System.out.println("Nhập tình trạng phòng");
        String available = scanner.nextLine();
        if (available.equals("trống")) {
            return true;
        }
        return false;
    }

    public static Room iORoom() {
        Room room = new Room(IORoom.inputNameRoom(), IORoom.inputPrice(), IORoom.inputRoomType(), IORoom.inputAvailable());
        return room;
    }
}
