/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucukten_buyuge_sayilari_siralama;
import java.util.Scanner;
/**
 *
 * @author MONSTER
 */
public class Kucukten_buyuge_sayilari_siralama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.print("1.Sayı (a):");
        a= s.nextInt();
        
        System.out.print("2.Sayı (b):");
        b= s.nextInt();
        
        System.out.print("3.Sayı (c):");
        c= s.nextInt();
        if (a<b && a<c) {
            if (b<c) {
                System.out.print("a<b<c");
            }else  {
                System.out.print("a<c<b");
            }
        }
        
        else if (b<a && b<c) {
            if (a<c) {
                System.out.print("b<a<c");
            }else {
                System.out.print("b<c<a");
                
            }
        }
        else {
            if(b<a) {
                System.out.print("c<b<a");
            }else {
                System.out.print("c<a<b");
            }
            }
        }                
    }
    

