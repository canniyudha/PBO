/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpbo01;
import static java.lang.System.exit;
import java.util.Scanner;
/**
 *
 * @author Lab Informatika
 */
public class PraktikumPBO01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        balok varbalok = new balok();
        kerucut varkeru = new kerucut();
        limas varlimas = new limas();
        
        Scanner input = new Scanner(System.in);
        boolean runing = true;
        String ulang;
        double x, y, z, h1, h2;
        
        do {
        System.out.println("MENU");
        System.out.println("1. Balok");
        System.out.println("2. Kerucut");
        System.out.println("3. Limas");
        System.out.println("4. Exit");
        
        System.out.print("Masukan Pilihan : ");
        int pilih = input.nextInt();
        
        switch(pilih){
            case 1 :
                System.out.println("Balok");
               
                System.out.print("Masukan Panjang : ");
                x = input.nextDouble();
        
                System.out.print("Masukan Lebar : ");
                y = input.nextDouble();
                
                System.out.print("Masukan Tinggi : ");
                z = input.nextDouble();
            
                h1 = varbalok.volume(x, y, z);
                System.out.print("Volume : ");
                System.out.println(h1);
                
                h2 = varbalok.luas(x, y);
                System.out.print("Luas : ");
                System.out.println(h2);
                
                break;
            case 2 :
                System.out.println("Kerucut");
                
                System.out.print("Masukan Jari Jari : ");
                x = input.nextDouble();
        
                System.out.print("Masukan Tinggi : ");
                y = input.nextDouble();
                
                h1 = varkeru.volume(x, y);
                System.out.print("Volume : ");
                System.out.println(h1);
                
                h2 = varkeru.luas(x);
                System.out.print("Luas : ");
                System.out.println(h2);
                
                break;
            case 3 :
                System.out.println("Limas");
                
                System.out.print("Masukan Panjang : ");
                x = input.nextDouble();
        
                System.out.print("Masukan Lebar : ");
                y = input.nextDouble();
            
                System.out.print("Masukan Tinggi : ");
                z = input.nextDouble();
            
                h1 = varbalok.volume(x, y, z);
                System.out.print("Volume : ");
                System.out.println(h1);
                h2 = varbalok.luas(x, y);
                System.out.print("Luas : ");
                System.out.println(h2);
                
                break;
                
            case 4:
                {exit(0);}
                break;
        }
        
        }while (runing);
        
       
    }
    
}
