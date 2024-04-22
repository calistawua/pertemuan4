/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author calista
 * tgl:2024-04-22
 */
public class ArrayDim {
    int jdta = 5;
    String[]dteman = new String[5];
    Scanner dtN = new Scanner(System.in);
    
    public void storedata(){
        System.out.println("Isikan Data Teman");
        System.out.println("~~~~~~~~~~~~~~~~");
        
        //perulangan menggunakan for atau while
        int num=0;
        for (int i=0; i<jdta;i++) {
            num++;
            
         System.out.println("Data ke 1:");
        dteman[0] = dtN.nextLine();
        
        }
       
        
/**    
        System.out.println("Data ke 2:");
        dteman[0] = dtN.nextLine();
        
        System.out.println("Data ke 3:");
        dteman[0] = dtN.nextLine();
        
        System.out.println("Data ke 4:");
        dteman[0] = dtN.nextLine();
        
        System.out.println("Data ke 5:");
        dteman[0] = dtN.nextLine();
 * */
        
        dteman[0] = "Adit";
        dteman[1] = "Sopo";
        dteman[2] = "Jono";
        dteman[3] = "Denis";
        dteman[4] = "Edel";
    }
    
    public void viewdata(){
        System.out.print("Daftar Teman");
        System.out.print("~~~~~~~~~~~~~");
        int no = 0;
        for(int i=0; i<jdta; i++ ) {
            no++;
            System.out.println(no+"."+dteman[i]);
        }
                     
    } 
    public void editdata(){
        System.out.println("Ubah Data Teman");
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println("Index Data Yang di Ubah");
        String id = dtIN.nextLine(); 
        int idx = Integer.parseInt(id);
        System.out.println("Data Yang di Ubah: "+dteman[idx]);
        System.out.println("diubah menjadi: ");
        String newdt = dtIN.nexLine();
        dteman[idx] = newdt;
        System.out.println("Data index ke-"+idx+" telah dirubah");
    }
    public void destorydata() {
        System.out.println("Ubah Data Teman");
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println("Index Data Yang di Hapus");
        String id = dtIN.nextLine();
        int idx = Integer.parseInt(id);
        dteman[idx] = "";
        System.out.println("Data index ke-"+idx+" telah dihapus");
        
        
        
    }
       
}
