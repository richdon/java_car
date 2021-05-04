package Vehicle_Inheritance;

public class Toyota extends Car {
    private String wheelDrive;
    private int numEngineCylinders;
    private int doors;
    private String bodyType;
    private String fuelType;
    private String model;
    private boolean radio;
    private boolean windowsDown;


    public Toyota(int yearBuilt, String wheelDrive, int numEngineCylinders, int doors, String bodyType, String fuelType, String model) {
        super(yearBuilt, "Combustion");
        this.wheelDrive = wheelDrive;
        this.numEngineCylinders = numEngineCylinders;
        this.doors = doors;
        this.bodyType = bodyType;
        this.fuelType = fuelType;
        this.model = model;
    }


    public void toggleWindows (String toggle) {
        if (toggle.toLowerCase().equals("down")) {
            windowsDown = true;
            System.out.println("Windows rolled down");
        } else if (toggle.toLowerCase().equals("up")) {
            windowsDown = false;
            System.out.println("Windows rolled up");
        } else {
            System.out.println("Invalid input");
        }
    }

    public void toggleRadio (String toggle) {
        if (toggle.toLowerCase().equals("on")) {
            radio = true;
            System.out.println("Radio turned on");
        } else if (toggle.toLowerCase().equals("off")) {
            radio = false;
            System.out.println("Radio turned off");
        } else {
            System.out.println("Invalid input");
        }
    }

    public void printSpecs() {
        System.out.println("this Toyota is a: " + getYearBuilt() + " " + doors + " door " + model + " " + numEngineCylinders + " cylinder " + bodyType + " that runs on " + fuelType);
    }
}






