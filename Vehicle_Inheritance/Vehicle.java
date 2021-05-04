package Vehicle_Inheritance;

public class Vehicle {
    private String material;
    private int yearBuilt;
    private String engineType;

    public Vehicle(String material, int yearBuilt, String engineType) {
        this.material = material;
        this.yearBuilt = yearBuilt;
        this.engineType = engineType;
    }

    public boolean moving (int speed) {

        if (speed > 0) {
            return true;
        }
        return false;
    }

    public String getMaterial() {
        return material;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public String getEngineType() {
        return engineType;
    }
}
