/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author User
 */
public class Mobil {

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        
        System.out.println("program percobaan");
        System.out.print("masukkan nama :");
        String nama = inputan.nextLine();
        System.out.print("umur :");
        int umur = inputan.nextInt();
        
        if (umur > 50) {
            System.out.println("anda tua");
        }else if(umur > 10){
            System.out.println("Anda Remaja");
        }else if(umur > 0) {
            System.out.println("Anda bayi");
        }else{
            System.out.println("Anda belum dibuat");
            
        
        }
    }
    
}
