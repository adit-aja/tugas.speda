/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diit3
 */
import java.util.Scanner;
public class Speda {
    int maju,mundur,berhenti,jarak;
    void Maju(){
        jarak=(jarak+10);
        maju=jarak;
    }
    void Mundur(){
        jarak=(maju-5);
        mundur=jarak;
    }
    void Berhenti(){
        
        berhenti=jarak;
    }
    public static void main(String[] args) {
        Speda h1 = new Speda();
        Scanner i1 =new Scanner(System.in);
        int pilih;
        System.out.println("MENU");
        System.out.println("1.Maju");
        System.out.println("2.Mundur");
        System.out.println("3.Berhenti");
        System.out.println("0.Exit");
        while(true){
            System.out.print("pilih : ");
            pilih = i1.nextInt();
            if(pilih==1){
                 h1.Maju();
                 System.out.println("Bergerak Maju 10 km");
                 System.out.println("Jarak tempuh Speda "+ h1.maju+"km");
                }
            else if(pilih == 2){
                h1.Mundur();
                System.out.println("Bergerak mundur 5 km");
                System.out.println("Jarak tempuh Sepeda "+ h1.mundur+"km");
            }else if(pilih == 3){
                h1.Berhenti();
                System.out.println("Sepeda berhenti");
                System.out.println("Jarak tempuh speda "+ h1.jarak+ "km");
            }else if(pilih==0){
                System.out.println("Terimakasih telah menggunakan program ini");
                 break;
            }else{
                System.out.println("Pilihan anda tidak ada di daftar menu");
            }
        }
    }
}
