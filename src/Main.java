package com.company;

import java.util.ArrayList;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        fizzBuzz();
        isEven(100);
        getMinimum(new Integer[]{1,5,6,-1,35,65});
    }

    //Question 1
    public static void fizzBuzz(){
        int[] num={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int i=0;i<20;i++){
            if(num[i]%3==0 && num[i]%5==0){
                System.out.println("FizzBuzz");
            }
            else if(num[i]%3==0){
                System.out.println("Fizz");
            } else if (num[i]%5==0) {
                System.out.println("Buzz");
            }
            else{
                System.out.println(num[i]);
            }
        }
    }

    //Question 2
    public static boolean isEven(Integer num){

        if(i%2==0){
            return true;
        }
        else return false;    }

    //Question 3
    public static Integer getMinimum(Integer[] numbers){

        int m=0;
        if(num.length==0){
            return null;
        }
        else{
            for(int i=0;i<num.length;i++){
                for(int j=i+1;j<num.length;j++){
                    if(num[i]<num[j]){
                        m=num[i];
                    }
                    else m=num[j];
                }
            }
            return m;
        }    }

/*
    //Question 4
    public static ArrayList<User> getParsedUsers(String[] strings){

    }

    //Question 5
    public static void printUsers_OMN(ArrayList<User> users){

    }


    //Question 6
    public static void printUsersSortedByAge(ArrayList<User> users){

    }

    //Question 7
    public static void printUsersOldest10(ArrayList<User> users){

    }

    //Question 8
    public static void printUserStateStats(ArrayList<User> users){

    }

    //Question 9
    public static Set<String> getWordOverlap(String[] listA, String[] listB){

    }

    //Question 10
    public static ArrayList<User> getUserOverlap(ArrayList<User> usersA, ArrayList<User> usersB){

    }
*/


}
