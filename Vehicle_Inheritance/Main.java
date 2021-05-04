package Vehicle_Inheritance;

public class Main {
    public static void main(String[] args) {

        Toyota myCar = new Toyota(1998, "4WD", 6, 4,"SUV","Gas", "Highlander");

        myCar.printSpecs();

        myCar.shiftGears("DRIVE");
        myCar.accelerate(100);
        myCar.accelerate(-30);


    }
}
