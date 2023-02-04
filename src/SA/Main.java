package SA;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(1);
        Bus bus2 = new Bus(2);
        bus.takePassenger(2);
        bus.checkFare();
        bus.fuelCalc(-50);
        bus.changeStatus("차고지행");
        bus.fuelCalc(10);
        bus.takePassenger(45);
        bus.takePassenger(5);
        bus.checkFare();
        bus.fuelCalc(-55);
    }
}
