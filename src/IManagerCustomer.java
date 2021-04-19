import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IManagerCustomer implements ManagerCustomer {
    static List<Customer> customerList = new ArrayList<>();
    Customer customer = new Customer();
    IManagerRoom iManagerRoom = new IManagerRoom();

    @Override
    public void displayList() {
        if (customerList.size() == 0) {
            System.out.println("Danh sách trống");
        } else {
            for (Customer i : customerList) {
                System.out.println(i.toString());
            }
        }
    }

    @Override
    public void addList() {

        Customer customer = IOCustomer.iOCustomer();
        customerList.add(customer);
        for (Room i : IManagerRoom.roomList) {
            if (i.getNameRoom().equals(customer.getNameRoom())) {
                i.setAvailable(false);
            }
        }
    }

    @Override
    public void editList() {
        int idEdit = findIDCustomer();
        if (idEdit != -1) {
            customerList.get(idEdit).setIdCustomer(IOCustomer.inputIdCustomer());
            customerList.get(idEdit).setNameCustomer(IOCustomer.inputNameCustomer());
            customerList.get(idEdit).setAgeCustomer(IOCustomer.inputAgeCustomer());
            customerList.get(idEdit).setAddress(IOCustomer.inputAddress());
            customerList.get(idEdit).setNameRoom(IORoom.inputNameRoom());
            customerList.get(idEdit).setVehicle(IOVehicle.iovehicle());
        }
    }

    @Override
    public void deleteList() {
        int index = findIDCustomer();
        if (index != -1) {
            String nameRoom = customerList.get(index).getNameRoom();
            customerList.remove(customerList.get(index));
            for (Customer c : customerList) {
                if (!c.getNameRoom().equals(nameRoom)) {
                    for (Room r : IManagerRoom.roomList) {
                        if (r.getNameRoom().equals(nameRoom)) {
                            r.setAvailable(true);
                        }
                    }
                }
            }
        }
    }

    @Override
    public int findNameCustomer() {
        for (Customer i : customerList) {
            if (i.getNameCustomer().equals(IOCustomer.inputNameCustomer())) {
                return customerList.indexOf(i);
            }
        }
        return -1;
    }

    @Override
    public int findIDCustomer() {
        for (Customer i : customerList) {
            if (i.getIdCustomer().equals(IOCustomer.inputIdCustomer())) {
                return customerList.indexOf(i);
            }
        }
        return -1;
    }

    @Override
    public int findLicensePlates() {
        for (Customer i : customerList) {
            if (i.getVehicle().getLicensePlates().equals(IOVehicle.inputLicensePlates())) {
                return customerList.indexOf(i);
            }
        }
        return -1;
    }

    public void displayVehicle() {
        for (Customer i : customerList) {
            if (!i.getVehicle().getVehicleType().equals(""))
                System.out.println(i.getNameCustomer() + ":" + i.getNameRoom() + "," + i.getVehicle());
        }
    }

    public void displayInforCustomer() {
        int index = findIDCustomer();
        System.out.println(customerList.get(index));
    }

    public void writeFile() {
        try {
            FileOutputStream fos = new FileOutputStream("listCustomer.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(customerList);
            oos.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("Lỗi chưa ghi file");
        }
    }

    public void readFile() {
        try {
            FileInputStream fis = new FileInputStream("listCustomer.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            customerList = (List<Customer>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("Lỗi khi đọc file");
        }
    }
}
