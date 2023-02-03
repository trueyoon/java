package SA;

public interface VehicleMethod {
    //method 운행시작, 속도변경, 상태변경, 승객탑승

    //운행 시작
    default void start(Vehicle vehicle){
        vehicle.setStatus(true);
    }
    //속도 변경
    default void changeSpeed(Vehicle vehicle, int speed){
        if (vehicle.fuel >= 10){
            vehicle.setSpeed(vehicle.speed+speed);
        }
        else {
            System.out.println("주유량을 확인해 주세요.");
        }
    }
    // 상태 변경
    default void changeStatus(Vehicle vehicle, boolean status){
        if (vehicle.fuel < 10){
            System.out.println("주유가 필요합니다.");
        }
        vehicle.setStatus(status);
    }
    //승객 탑승
    default void takePassenger(Vehicle vehicle, int passenger) {
        if (vehicle.currentPassenger + passenger <= vehicle.maxPassenger
                && vehicle.status) {
            vehicle.currentPassenger += passenger;
        }
    }

}
