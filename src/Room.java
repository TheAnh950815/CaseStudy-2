public class Room {
    private String nameRoom;
    private double price;
    private String roomType;
    private boolean available= true;


    public Room() {
    }

    public Room(String nameRoom, double price, String roomType, boolean available) {
        this.nameRoom = nameRoom;
        this.price = price;
        this.roomType = roomType;
        this.available=available;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return  "Tên phòng:" + nameRoom + " " +
                "Giá phòng:" + price + " " +
                "Loại phòng: " + roomType + " ";
    }
    public String toString1(){
        return nameRoom +"," + price+"," + roomType + "," + available;
    }
}
