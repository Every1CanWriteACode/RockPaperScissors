/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivedimas;

import java.util.Scanner;

public class Ivedimas {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("0 - pabaiga");
        System.out.println("1 - akmuo");
        System.out.println("2 - popierius");
        System.out.println("3 - zirkles");
        
      double inf = Double.POSITIVE_INFINITY;
      int taskaiTavo = 0;
      int taskaiPc = 0;
       for(int i = 0; i < inf; i++){
        //Mano ir kompo pasirinkimai
        int pasirinkimas = sc.nextInt();
        int pc = (int)(Math.random() * 3) + 1; 
        //---------------------------------------------
           if(pasirinkimas > 3){
               System.out.println("Pasirinktas blogas skaicius");
           }
           if(pasirinkimas == 1 && pc == 1){
               System.out.println("lygiosios");
           }
            if(pasirinkimas == 1 && pc == 2){
               System.out.println("Kompas laimejo");
               taskaiPc++;
           }
            if(pasirinkimas == 1 && pc == 3){
              System.out.println("Kompas pralaimejo");
              taskaiTavo++;
            }
               if(pasirinkimas == 2 && pc == 1){
               System.out.println("Laimejai");
               taskaiTavo++;
           }
            if(pasirinkimas == 2 && pc == 2){
               System.out.println("Lygiosios");
           }
            if(pasirinkimas == 2 && pc == 3){
              System.out.println("Pralaimejai");
               taskaiPc++;
            }
               if(pasirinkimas == 3 && pc == 1){
               System.out.println("Pralaimejai");
                taskaiPc++;
           }
            if(pasirinkimas == 3 && pc == 2){
               System.out.println("Laimejai");
                taskaiTavo++;
           }
            if(pasirinkimas == 3 && pc == 3){
              System.out.println("Lygiosios");
            }
             if(pasirinkimas == 0){
               System.out.println("Surinkai tasku: "+taskaiTavo);
               System.out.println("Kompas Surinko tasku:"+taskaiPc);
               if(taskaiTavo > taskaiPc){
                   System.out.println("Sveikinu, laimejai! Kompui pritruko vos "+(taskaiTavo-taskaiPc)+" tasku");
               } else if(taskaiTavo == taskaiPc){
                   System.out.println("Lygiosios");
               }else {
                   System.out.println("Deja, bet laimejo kompas, kadangi jis turi "+(taskaiPc-taskaiTavo)+" tasku pranasuma");
               }
               break;
           }
           System.out.println("=======");
        }
}
}