package com.dsa;
import java.sql.SQLOutput;
import java.util.Scanner;
public class LinearSearch1 {
    public static void main(String[] args) {
        int[] arr ={12,56,34,678,4,535,678,3,6,56,45,-5,8};
        Scanner sc = new Scanner(System.in);
        int target =sc.nextInt();
        int result = linearSearch(arr,target);
        System.out.println(result);
    }
    static int linearSearch(int[] ar,int target1){
        if(ar.length ==0){
            return -1;
        }
        for (int index = 0; index <ar.length ; index++) {
            int element =ar[index];
            if(target1 == element){
                return index;
            }
        }
        return -1;
    }
}
