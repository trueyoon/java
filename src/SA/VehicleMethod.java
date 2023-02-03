package SA;

public interface VehicleMethod {
    //method 운행시작, 속도변경, 상태변경, 승객탑승

    //운행 시작
    void start();
    //속도 변경
    void changeSpeed(int speed);
    // 상태 변경
    void changeStatus(boolean status);
    //승객 탑승
    void takePassenger(int passenger);

}
