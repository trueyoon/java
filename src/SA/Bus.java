package SA;

public class Bus extends Vehicle implements VehicleMethod{

    int fare; // 요금
    boolean isRun; // 운행중인 상태

    public Bus(int num){
        super();
        this.setNum(num);
        this.setMaxPassenger(30);
        isRun = true;
        fare = 1000;
    }
    @Override
    public void start(){
        this.setStatus(true);
    }

    @Override
    public void changeStatus(boolean status){
        if (this.fuel < 10){
            System.out.println("주유가 필요합니다.");
        }
        this.setStatus(status);
    }

    @Override
    public void takePassenger(int passenger) {
        this.currentPassenger += passenger;
    }

    @Override
    public void changeSpeed(int speed){
        if (this.fuel >= 10){
            this.setSpeed(this.speed+speed);
        }
        else {
            System.out.println("주유량을 확인해 주세요.");
        }
    }
}