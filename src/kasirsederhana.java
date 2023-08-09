
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author athar
 */
public class kasirsederhana {
   
    public static void main(String[] args) {
        System.out.println("Menu Makanan");  
        System.out.println("1. Soto Ayam (15.000)");
        System.out.println("2. Rawon Daging (17.000)");
        System.out.println("3. Mie Goreng (5000)");
        System.out.println("4. Tahu Telor (8.000)");
        System.out.println("5. Sate Kambing (20.000)");
        
        int hargaSoto=15000;
        int hargaRawon=17000;
        int hargaMie=5000;
        int hargaTahu=8000;
        int hargaSate=20000;
        int total;
        
       Scanner sc = new Scanner(System.in);
        System.out.println("Jumlah Beli Soto :");
        int Soto = sc.nextInt();
        total=Soto*hargaSoto;
        System.out.println("Jumlah Beli Rawon Daging :");
        int Rawon = sc.nextInt();
        total+=Rawon*hargaRawon;
        System.out.println("Juamlah Beli Mie Goreng :");
        int Mie = sc.nextInt();
        total +=Mie*hargaMie;
        System.out.println("Jumlah Beli Tahu Telur :");
        int Tahu = sc.nextInt();
        total+=Tahu*hargaTahu;
        System.out.println("Jumlah Beli Sate Kambing :");
        int Sate = sc.nextInt();
        total+=Sate*hargaSate;
        //int Totalsemua=totalsoto+totalrawon+totalmie+totaltahu+totalsate;
        System.out.println("Jumalh Uang diberikan : ");
        int uang = sc.nextInt();
        int kembalian = uang-total;
        System.out.println("Total Harga : "+total);
        System.out.println("Uang Kembalian : "+kembalian);
        
               
        
    }
    
           
           
           
}
