/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylists;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author shalomdaniel
 */
public class Lab_ex2 {
        
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);  
        System.out.println("Enter array index number: ");
        int num = reader.nextInt();
        
        Random rd = new Random(); // creating Random object
        int[] arr = new int[num];
        System.out.println("Array is of index -  " + num);
        System.out.println("\nElements of the Array are: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(50); // storing random integers in an array
            System.out.println(arr[i]); // printing each array element
        }
     
        if (arr.length % 2 == 0){
            System.out.println("Array has even index. Hence, we double each element of the array ");
            for(int i = 0; i<arr.length; i++){
                arr[i] = arr[i] * 2;
                System.out.println(arr[i]); 
            }
        }
        
        else {
            System.out.println("Array has odd index. Hence, we triple each element of the array  ");
            for(int i = 0; i<arr.length; i++){
                arr[i] = arr[i] * 3;
                System.out.println(arr[i]); 
            }
        }
    }

}
