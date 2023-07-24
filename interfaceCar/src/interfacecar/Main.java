package interfacecar;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        String mobil;
        int aksi;
        
        System.out.println("Daftar Mobil : ");
        System.out.println("- Avanza");
        System.out.println("- Esemka");
        System.out.println("- Tesla");
        System.out.println("- Lamborghini");
        System.out.println("");
        System.out.print("Masukkan mobil yang akan digunakan : ");
        Scanner input = new Scanner (System.in);
        mobil = input.nextLine();
        
        if (mobil.equalsIgnoreCase("Esemka")) {
            
            Car Bima13 = new Esemka();
            CarUser Meiva = new CarUser(Bima13);
            
            Meiva.turnOnTheCar();
        
        while (true){
            System.out.println("=== CAR SYSTEM ===");
            System.out.println("[1] Start Engine");
            System.out.println("[2] Stop Engine");
            System.out.println("[3] Speed Up");
            System.out.println("[4] Speed Down");
            System.out.println("[0] Exit");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextInt();

            switch(aksi){
                case 1:
                    Meiva.turnOnTheCar();
                    break;
                case 2:
                    Meiva.turnOffTheCar();
                    break;
                case 3:
                    Meiva.makecarfaster();
                    break;
                case 4:
                    Meiva.makecarslower();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Anda memilih aksi yang salah");
                    break;
            }
        }
    }
        
        else if (mobil.equalsIgnoreCase("Avanza")) {
            
            Car VelozGR = new Avanza();
            CarUser Yusnita = new CarUser(VelozGR);
            
            Yusnita.turnOnTheCar();
        
        while (true){
            System.out.println("=== CAR SYSTEM ===");
            System.out.println("[1] Start Engine");
            System.out.println("[2] Stop Engine");
            System.out.println("[3] Speed Up");
            System.out.println("[4] Speed Down");
            System.out.println("[0] Exit");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextInt();

            switch(aksi){
                case 1:
                    Yusnita.turnOnTheCar();
                    break;
                case 2:
                    Yusnita.turnOffTheCar();
                    break;
                case 3:
                    Yusnita.makecarfaster();
                    break;
                case 4:
                    Yusnita.makecarslower();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Anda memilih aksi yang salah");
                    break;
            }
        }
    }
        else if (mobil.equalsIgnoreCase("Lamborghini")) {
            
            Car Aventador = new Lamborghini();
            CarUser Amalia = new CarUser(Aventador);
            
            Amalia.turnOnTheCar();
        
        while (true){
            System.out.println("=== CAR SYSTEM ===");
            System.out.println("[1] Start Engine");
            System.out.println("[2] Stop Engine");
            System.out.println("[3] Speed Up");
            System.out.println("[4] Speed Down");
            System.out.println("[0] Exit");
            System.out.println("--------------------------");
            System.out.print("Pilh aksi> ");
            aksi = input.nextInt();

            switch(aksi){
                case 1:
                    Amalia.turnOnTheCar();
                    break;
                case 2:
                    Amalia.turnOffTheCar();
                    break;
                case 3:
                    Amalia.makecarfaster();
                    break;
                case 4:
                    Amalia.makecarslower();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Anda memilih aksi yang salah");
                    break;
            }
        }
    }
        else if (mobil.equalsIgnoreCase("Tesla")) {
            
            Car model3 = new Tesla();
            CarUser Wijaya = new CarUser(model3);
            
            Wijaya.turnOnTheCar();
        
        while (true){
            System.out.println("=== CAR SYSTEM ===");
            System.out.println("[1] Start Engine");
            System.out.println("[2] Stop Engine");
            System.out.println("[3] Speed Up");
            System.out.println("[4] Speed Down");
            System.out.println("[0] Exit");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextInt();

            switch(aksi){
                case 1:
                    Wijaya.turnOnTheCar();
                    break;
                case 2:
                    Wijaya.turnOffTheCar();
                    break;
                case 3:
                    Wijaya.makecarfaster();
                    break;
                case 4:
                    Wijaya.makecarslower();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Your answer is incorrect");
                    break;
            }
        }
    }
        else{
            System.out.println("ANDA SALAH MEMASUKKAN NAMA MOBIL!");
        }
    }
}

