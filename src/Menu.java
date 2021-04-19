import java.util.Scanner;

public class Menu {
    public static void showMenu1() {
        System.out.println("----TRÌNH QUẢN LÝ PHÒNG TRỌ----");
        System.out.println("0.Hiện thị danh sách đã có");
        System.out.println("1.Hiện thị danh sách phòng");
        System.out.println("2.Thêm phòng trọ");
        System.out.println("3.Sửa thông tin phòng trọ");
        System.out.println("4.Hiện thị danh sách phòng trống");
        System.out.println("5.Hiện thị danh sách phòng đang có khách thuê");
        System.out.println("6.Exit");
    }

    public static void showMenu2() {
        System.out.println("----TRÌNH QUẢN LÝ KHÁCH TRỌ----");
        System.out.println("0.Hiện thị danh sách đã có");
        System.out.println("1.Hiện thị danh sách khách trọ");
        System.out.println("2.Thêm khách trọ");
        System.out.println("3.Sửa thông tin khách trọ");
        System.out.println("4.khách trả phòng");
        System.out.println("5.Hiện thị danh sách xe");
        System.out.println("6.Tìm kiếm thông tin khách trọ");
        System.out.println("7.Exit");
    }

    public static void showMenu() {
        System.out.println("1.----TRÌNH QUẢN LÝ PHÒNG TRỌ----");
        System.out.println("2.----TRÌNH QUẢN LÝ KHÁCH TRỌ----");
        System.out.println("3.Exit");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IManagerRoom iManagerRoom = new IManagerRoom();
        IManagerCustomer iManagerCustomer = new IManagerCustomer();

        int choose = 0;
        do {
            showMenu();
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Nhập số để chạy chương trình");
            }
            switch (choose) {
                case 1:

                    do {
                        showMenu1();
                        try {
                            choose = Integer.parseInt(scanner.nextLine());
                        } catch (Exception e) {
                            System.out.println("Nhập số để chạy chương trình");
                        }
                        switch (choose) {
                            case 0:
                                iManagerRoom.readFile();
                                break;
                            case 1:
                                System.out.println("-------------------------------------------");
                                iManagerRoom.displayList();
                                System.out.println("-------------------------------------------");
                                break;
                            case 2:
                                System.out.println("-------------------------------------------");
                                iManagerRoom.addList();
                                System.out.println("-------------------------------------------");
                                break;
                            case 3:
                                System.out.println("-------------------------------------------");
                                iManagerRoom.editList();
                                System.out.println("-------------------------------------------");
                                break;
                            case 4:
                                System.out.println("-------------------------------------------");
                                iManagerRoom.displayRoomEmpty();
                                System.out.println("-------------------------------------------");
                                break;

                            case 5:
                                System.out.println("-------------------------------------------");
                                iManagerRoom.displayRoomRented();
                                System.out.println("-------------------------------------------");
                                break;
                            case 6:
                                iManagerRoom.writeFile();
                                System.out.println("-------------------------------------------");
                                break;
                            default:
                                System.out.println("Chọn lại chương trình");
                                break;
                        }
                    } while (choose != 6);
                    break;
                case 2:
                    do {
                        Menu.showMenu2();
                        try {
                            choose = Integer.parseInt(scanner.nextLine());
                        } catch (Exception e) {
                            System.out.println("Nhập số để chạy chương trình");
                        }
                        switch (choose) {
                            case 0:
                                iManagerCustomer.readFile();
                            case 1:
                                System.out.println("-------------------------------------------");
                                iManagerCustomer.displayList();
                                System.out.println("-------------------------------------------");
                                break;
                            case 2:
                                System.out.println("-------------------------------------------");
                                iManagerCustomer.addList();
                                System.out.println("-------------------------------------------");
                                break;
                            case 3:
                                System.out.println("-------------------------------------------");
                                iManagerCustomer.editList();
                                System.out.println("-------------------------------------------");
                                break;
                            case 4:
                                System.out.println("-------------------------------------------");
                                iManagerCustomer.deleteList();
                                System.out.println("-------------------------------------------");
                                break;
                            case 5:
                                System.out.println("-------------------------------------------");
                                iManagerCustomer.displayVehicle();
                                System.out.println("-------------------------------------------");
                                break;
                            case 6:
                                System.out.println("-------------------------------------------");
                                iManagerCustomer.displayInforCustomer();
                                System.out.println("-------------------------------------------");
                                break;
                            case 7:
                                System.out.println("-------------------------------------------");
                                iManagerCustomer.writeFile();
                                break;
                            default:
                                System.out.println("-------------------------------------------");
                                System.out.println("Nhập lại chương trình");
                                System.out.println("-------------------------------------------");
                                break;
                        }
                    } while (choose != 7);
                    break;
                case 3:
                    System.out.println("-------------------------------------------");
                    iManagerCustomer.writeFile();
                    iManagerRoom.writeFile();
                    System.out.println("-------------------------------------------");
                    break;
                default:
                    System.out.println("Nhập lại số để chạy chương trình");
            }
        } while (choose != 0);
    }
}