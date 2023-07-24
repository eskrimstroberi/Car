package interfacecar;
public class Lamborghini implements Car {
   
    private int speed;
    private boolean isEngineOn;
    
    public Lamborghini (){
    this.speed = 0; //set speed awal
    }

    @Override
    public void startEngine() {
      isEngineOn = true;
        System.out.println("Mobil menyala...........");
        System.out.println("Selamat datang di Lamborghini ");
        System.out.println("Aventador Series ");    
    }
    
    @Override
    public void stopEngine() {
    isEngineOn= false;
        System.out.println("Mobil dimatikan..........");
    }
    
    @Override
    public void speedDown() {
      if(isEngineOn){
            if(this.speed == MIN_SPEED){
            System.out.println("KECEPATAN 0 Km/Jam");
            System.out.println("sudah"+this.getSpeed()+"Km/Jam");
            }
            else{
            this.speed-=20;        
            System.out.println("Kecepatan sekarang : "+this.getSpeed()+"Km/Jam");
            }
        }
        else {
        System.out.println("Nyalakan HP nya dahulu");       
        }    
    }
    
    @Override
    public void speedUp() {
      if(isEngineOn){
            if(this.speed == MAX_SPEED){
            System.out.println("KECEPATAN MAKSIMAL !!!");
            System.out.println("sudah"+this.getSpeed()+"Km/Jam");
            }
            else{
            this.speed+=20;        
            System.out.println("Kecepatan Sekarang : "+this.getSpeed()+"Km/Jam");
            }
        }
        else {
        System.out.println("Nyalakan mobilnya dahulu !");       
        }         
    }
       public int getSpeed(){
    return this.speed; 
    }
    
}

