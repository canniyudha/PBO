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
public class LimasSegitiga extends Segitiga{
    
    double tinggiLimas , volume ; 

    public LimasSegitiga(double alas, double tinggi, double Tinggi) {
        super(alas, tinggi);
        this.tinggiLimas = Tinggi;
    }
    
    @Override
    void  Volume (){
        volume = 1.0 / 3.0 * luasSegitiga()* tinggiLimas ;
        System.out.println(volume);
    }
    
}
