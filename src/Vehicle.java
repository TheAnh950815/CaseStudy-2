import java.io.Serializable;

public class Vehicle implements Serializable {
    private String vehicleType;
    private String licensePlates;

    public Vehicle() {
    }


    public Vehicle(String rangeOfVehicle, String licensePlates) {
        this.vehicleType = rangeOfVehicle;
        this.licensePlates = licensePlates;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    @Override
    public String toString() {
        return  "Loại xe: " + vehicleType + " " +
                "Biển số: " + licensePlates + " " ;
    }
}
