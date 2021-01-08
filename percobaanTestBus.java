//Affan Ian Amara
//190810710038

import java.util.Scanner;
import java.util.Random;

public class TestBus
{
    public static void main(String[] args)
    {
        int pil, id, umur;
        String nama;
        boolean hamil;
        
        Bus bus = new Bus();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== BUS TRANS KOETARADJA =====");
       
        
        do{ 
            System.out.println("MENU :");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang\n");
            System.out.print("Pilihan : ");
            pil = sc.nextInt();
            sc.nextLine();
            

            switch(pil){
                case 1:
                    System.out.print("Nama       : ");
                    nama = sc.nextLine();
                    
                    System.out.print("Umur       : ");
                    umur = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Hamil(y/n) : ");
                    String cek = sc.nextLine();
                    if(cek.equalsIgnoreCase("y")){ 
                        hamil = true; 
                    }else{
                        hamil = false;
                    }
                    Random angkaRandom = new Random();
                    id = angkaRandom.nextInt(100);

                    Penumpang p = new Penumpang(id, umur, hamil, nama);
                    
                    if(bus.naikkanPenumpang(p)){  
                        System.out.println("Penumpang dinaikkan\n");
                    } else{ 
                        System.out.println("Tidak ada kursi kosong\n");
                    }                    
                    System.out.println(bus.toString()); 
                    break;

                case 2:
                    System.out.print("Nama       : ");
                    nama =sc.nextLine();
                    
                    if(bus.turunkanPenumpang(nama)){ 
                        System.out.println("Penumpang berhasil diturunkan!");
                    } else{ 
                        System.out.println("Penumpang tidak ditemukan!"); 
                    }
                    System.out.println(bus.toString()); 
                    break;
                case 3:
                    System.out.println(bus.toString()); 
                    break;
                default:
                    break;
            }
            System.out.println("====================");
        }while(pil>0 && pil<5);
    }
}
