/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21task4juridegtjarjov;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class JPTV21Task4JuriDegtjarjov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int counter = 0;
        int stroka = 0;  
        double avarage = 0;
        double sum = 0;
        double count = 100;
        
        Random random = new Random();
        System.out.println("Одномерные массив");
        int[] nums = new int[100];         
        for(int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(100);;
            sum += nums[i];            
            if(nums[i]%2 == 0){
                nums[i]++;
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            System.out.printf("",nums[i]);

               
            Arrays.sort(nums);
            System.out.printf("%3d",nums[i]);
            stroka++;
            if(stroka==10){
                System.out.println();
                stroka = 0;
        }

                }
        System.out.println("Среднее арифмитическое: " + (sum/count));
            }
    
    }
    

