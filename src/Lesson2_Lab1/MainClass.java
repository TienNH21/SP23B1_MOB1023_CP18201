/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson2_Lab1;

import java.util.Scanner;

/**
 *
 * @author tiennh
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten SP:");
        String name = sc.nextLine();
        System.out.println("Gia SP:");
        double gia = Double.parseDouble(sc.nextLine());
        
        Product p = new Product(name, gia);
    }
}
