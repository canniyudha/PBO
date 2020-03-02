/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg3;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Tugas3 {

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
                try {
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

                        if (h1 < 0) {
                            throw new RuntimeException("Tidak boleh kurang dari nol !");
                        }
                }
                catch (RuntimeException ex){
                    System.err.println("Errornya : "+ex);
                }
                break;
            case 2 :
                try {
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
                    if (h1 < 0) {
                            throw new RuntimeException("Tidak boleh kurang dari nol !");
                        }
                }
                catch (RuntimeException ex){
                    System.err.println("Errornya : "+ex);
                }
                break;
            case 3 :
                try {
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

                    if (h1 < 0) {
                            throw new RuntimeException("Tidak boleh kurang dari nol !");
                        }
                }
                catch (RuntimeException ex){
                    System.err.println("Errornya : "+ex);
                }
                break;
                
            case 4:
                {exit(0);}
                break;
        }
        
        }while (runing);
        
    }
    
}
