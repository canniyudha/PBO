/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Scanner input = new Scanner(System.in);
        double alas ,tinggi , Tinggi ;
        
        System.out.println("-----URUTAN-----");
        System.out.println("- Segitiga ");
        System.out.println("- Prisma Segitiga");
        System.out.println("- Limas Segitiga\n");
        
       
        System.out.print("Alas : " );
        alas = input.nextDouble();
        System.out.print("Tinggi alas : " );
        tinggi = input.nextDouble();
        System.out.print("Tinggi bangunan 3d : " );
        Tinggi = input.nextDouble();
        
        System.out.println("-----Segitiga-----");
        Segitiga s3 = new Segitiga(alas ,tinggi );
        System.out.println("Luas Segitiga : " +  s3.luasSegitiga());
        
        System.out.println("\n----Prisma Segitiga-----");
        PrismaSegitiga ps = new PrismaSegitiga(alas, tinggi ,Tinggi);
        System.out.print("Volume Prisma Segitiga : ");
        ps.Volume();
       
        System.out.println("\n-----Limas Segitiga-----");
        LimasSegitiga limas = new LimasSegitiga (alas,tinggi,Tinggi);
        System.out.print("Volum1e Limas Segitiga: ");
        limas.Volume();
        
    }
    }
