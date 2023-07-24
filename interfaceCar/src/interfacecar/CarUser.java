package interfacecar;
public class CarUser {
  
    private final Car car; 
    
    public CarUser(Car car){
    this.car = car;
    }
    void turnOnTheCar(){
    this.car.startEngine();
    }
    void turnOffTheCar(){
    this.car.stopEngine();
    }
    void makecarfaster(){
    this.car.speedUp();
    }
    void makecarslower(){
    this.car.speedDown();
}
}

