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
public class segitia {

    int alas = 5;
    int tinggi = 4;
    int sisi_a = 1;
    int sisi_b = 3;
    int sisi_c = 4;
    int sgt;
    int sgt1;

    void luasrumus() {
        sgt = alas * tinggi * 1 / 2;
        System.out.println("rumus segitiga : " + sgt);
    }

    void kelilingrummus() {
        sgt1 = sisi_a + sisi_b + sisi_c;
        System.out.println("rumus keliling segitiga :" + sgt1);
    }

}
