/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Irsyad
 */
public class JajarGenjang {
    int a = 8;
    int t = 8;
    int JG;
    int jg1;
    
    void rumusjajar (){
        JG = a*t;
        System.out.println("Luas jajar genjang :  "+JG);
    }
    void kelilingjajar(){
        jg1= a+t+a+t;
        System.out.println("KElilinng Jajar Genjang :"+jg1);
    }
}
