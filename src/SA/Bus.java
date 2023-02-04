package SA;

public class Bus extends Vehicle implements VehicleMethod{

    int fare; // 요금
    String status; // 운행, 차고지행

    public Bus(int num){
        super();
        this.setNum(num);
        this.setMaxPassenger(30);
        status = "운행";
        fare = 1000;
        System.out.println(this.num + "번 버스객체 만들어짐!");
    }
    @Override
    public void start(){
        this.setStatus("운행");

    }

    @Override
    public void changeStatus(String status){
        this.status = status;
        System.out.println("상태: " + this.status);
    }
/*
    public void printStatus(){

    }*/

    @Override
    public void takePassenger(int passenger) {
        if (this.currentPassenger+passenger > maxPassenger){
            System.out.println("최대 승객 수를 초과했습니다");
        }
        else {
            System.out.println("탑승 승객 수 = " + passenger);
            this.currentPassenger += passenger;
            System.out.println("잔여 승객 수 = " + (maxPassenger-this.currentPassenger));
        }
    }

    @Override
    public void changeSpeed(int speed){
        if (this.fuel >= 10){
            this.setSpeed(this.speed+speed);
        }
        else {
            System.out.println("주유가 필요합니다.");
            this.status = "차고지행";
        }
    }

    @Override
    public void checkFare(){
        System.out.println("요금 확인 = " + (this.currentPassenger * fare));
    }

    @Override
    public void fuelCalc(int fuel){
        this.fuel += fuel;
        System.out.println("주유량: " + this.fuel);
        if (this.fuel < 10){
            System.out.println("주유가 필요합니다");
        }
    }
}