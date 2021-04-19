import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class IManagerRoom implements ManagerRoom {
    static ArrayList<Room> roomList = new ArrayList<>();

   /* static {
        roomList.add(new Room("P101", 5000000, "vip", true));
        roomList.add(new Room("P102", 2500000, "normal", true));
        roomList.add(new Room("P103", 1500000, "pool", true));
        roomList.add(new Room("P104", 5000000, "vip", true));
        roomList.add(new Room("P105", 2500000, "normal", true));
        roomList.add(new Room("P105", 2500000, "normal", true));
        roomList.add(new Room("P105", 2500000, "normal", true));
    }*/

    @Override
    public void displayList() {
        for (Room i : roomList) {
            System.out.println(i);
        }
    }

    @Override
    public void addList() {

        if (roomList.size() == 0) {
            Room room = IORoom.iORoom();
            roomList.add(room);
        } else {
            String name = IORoom.inputNameRoom();
            if (findNameRoom(name) == -1) {
                roomList.add(new Room(name,IORoom.inputPrice(),IORoom.inputRoomType(),IORoom.inputAvailable()));
            } else {
                System.out.println("Tên phòng đã tồn tại");
            }
        }
    }

    @Override
    public void editList() {
        if (findNameRoom(IORoom.inputNameRoom()) != -1) {
            roomList.get(findNameRoom(IORoom.inputNameRoom())).setNameRoom(IORoom.inputNameRoom());
            roomList.get(findNameRoom(IORoom.inputNameRoom())).setPrice(IORoom.inputPrice());
            roomList.get(findNameRoom(IORoom.inputNameRoom())).setRoomType(IORoom.inputRoomType());
        } else {
            System.out.println("Tên phòng không tồn tại");
        }
    }

    @Override
    public void deleteList() {
        if (findNameRoom(IORoom.inputNameRoom()) != -1) {
            roomList.remove(findNameRoom(IORoom.inputNameRoom()));
        } else {
            System.out.println("Tên phòng không tồn tại");
        }
    }

    @Override
    public int findNameRoom(String nameRoom) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getNameRoom().equals(nameRoom)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void displayRoomEmpty() {
        for (Room i : roomList) {
            if (i.isAvailable() == true) System.out.println(i);
        }
    }

    @Override
    public void displayRoomRented() {
        for (Room i : roomList) {
            if (i.isAvailable() == false) System.out.println(i);
        }
    }

    public void writeFile() {
        try {
            File file = new File("ListRoom.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Room i : roomList) {
                bufferedWriter.write(i.toString1() + "\n");
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("lỗi chưa ghi được file");
        }
    }

    public void readFile() {
        try {
            File file = new File("ListRoom.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals("")) continue;
                String[] element = line.split(",");
                roomList.add(new Room(element[0], Double.parseDouble(element[1]), element[2],
                        Boolean.parseBoolean(element[3])));

            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("lỗi không đọc được file");
        }
    }
}
