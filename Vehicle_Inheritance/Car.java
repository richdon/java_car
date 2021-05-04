package Vehicle_Inheritance;

public class Car extends Vehicle {


    private int mph;
    private boolean park = true;
    private boolean reverse;
    private boolean drive;
    private String steer;

    public Car(int yearBuilt, String engineType) {
        super("Steel", yearBuilt, engineType);

    }

    public void accelerate(int speed) {
        if (!park) {
            if (speed == 0) {
                System.out.println("No change in speed");
            } else if (super.moving(speed)) {
                System.out.println("accelerated speed by: " + speed);
            } else {
                System.out.println("Decelerated speed by: " + speed);
            }

            System.out.println("The odometer is: " + odometer(speed));
        }
        else {
            System.out.println("You must first shift gear into either reverse or drive");
        }

    }

    private int odometer(int speed) {
        mph += speed;
        return mph;
    }

    public void shiftGears(String gear) {
        if (gear.toLowerCase().equals("reverse")) {
            System.out.println("Car is in reverse gear");
            reverse = true;
            park = false;
            drive = false;
        }
        else if (gear.toLowerCase().equals("drive")) {
            System.out.println("Car is in drive gear");
            drive = true;
            park = false;
            reverse = false;
        }
        else if (gear.toLowerCase().equals("park")) {
            System.out.println("Car is parked");
            park = true;
            drive = false;
            reverse = false;
            super.moving(0);
        }
        else {
            System.out.println("Enter valid input");
        }
    }

    public void turnWheel(String direction) {

        if (direction.toLowerCase().equals("left")) {
            steer = direction;
            System.out.println("Car is turning left");
        }
        else if (direction.toLowerCase().equals("right")) {
            steer = direction;
            System.out.println("Car is turning right");
        }
        else {
            System.out.println("Enter valid input");
        }

    }
}
