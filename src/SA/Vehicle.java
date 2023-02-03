package SA;

public abstract class Vehicle {
    int num; // 번호
    int fuel; //주유량
    int speed; //속도
    //boolean changeSppeed; // ??속도 변경??
    int currentPassenger;   //현재 승객수
    boolean status;
    int maxPassenger;   //최대 승객수

    public Vehicle(){
        fuel = 100;
        speed = 0;
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public int getFuel() {
        return fuel;
    }
    public void setFuel(int fuel){
        this.fuel = fuel;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getMaxPassenger(){
        return maxPassenger;
    }
    public void setMaxPassenger(int maxPassenger){
        this.maxPassenger = maxPassenger;
    }
    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }

}
