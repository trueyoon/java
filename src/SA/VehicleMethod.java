package SA;

public interface VehicleMethod {
    //method 운행시작, 속도변경, 상태변경, 승객탑승

    //운행 시작
    void start();
    //속도 변경
    void changeSpeed(int speed);
    // 상태 변경
    void changeStatus(String status);
    void takePassenger(int passenger);
    void checkFare();
    void fuelCalc(int fuel);

}
