import java.io.Serializable;

public class Customer implements Serializable {
    private String nameCustomer;
    private int ageCustomer;
    private String idCustomer;
    private String address;
    private Room room;
    private Vehicle vehicle;
    private String nameRoom;

    public Customer() {
    }
    public Customer(String nameCustomer, int ageCustomer, String idCustomer, String address, Room room) {
        this.nameCustomer = nameCustomer;
        this.ageCustomer = ageCustomer;
        this.idCustomer = idCustomer;
        this.address = address;
        this.room =room;
    }

    public Customer(String nameCustomer, int ageCustomer, String idCustomer, String address, String nameRoom, Vehicle vehicle) {
        this.nameCustomer = nameCustomer;
        this.ageCustomer = ageCustomer;
        this.idCustomer = idCustomer;
        this.address = address;
        this.nameRoom = nameRoom;
        this.vehicle = vehicle;

    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public Customer(String nameCustomer, int ageCustomer, String idCustomer, String address, Room room, Vehicle vehicle) {
        this.nameCustomer = nameCustomer;
        this.ageCustomer = ageCustomer;
        this.idCustomer = idCustomer;
        this.address = address;
        this.room = room;
        this.vehicle = vehicle;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public int getAgeCustomer() {
        return ageCustomer;
    }

    public void setAgeCustomer(int ageCustomer) {
        this.ageCustomer = ageCustomer;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  "Tên khách hàng:" + nameCustomer + " " +
                "Tuổi khách hàng:" + ageCustomer + " " +
                "CMND:" + idCustomer + " " +
                "Địa chỉ:" + address + " " +
                 vehicle +
                "Phòng đang thuê:" + nameRoom + " ";
    }
}
