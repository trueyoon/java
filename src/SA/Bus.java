package SA;

public class Bus extends Vehicle {

    int fare; // 요금
    boolean isRun; // 운행중인 상태


    public Bus(int num){
        super();
        this.setNum(num);
        this.setMaxPassenger(30);
        isRun = true;
        fare = 1000;
    }



}