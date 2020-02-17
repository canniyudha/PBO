/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg2;

/**
 *
 * @author ASUS
 */

public class PrismaSegitiga extends Segitiga {
    
    private double tinggiPrisma, volume ;

    public PrismaSegitiga(double alas, double tinggi, double Tinggi) {
        super(alas, tinggi);
        this.tinggiPrisma = Tinggi;
    }
   
    @Override
    void  Volume (){
        volume =   luasSegitiga()* tinggiPrisma ;
        System.out.println( volume );
    }

}
