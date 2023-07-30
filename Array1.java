//1Q) take an array as input from the user.
//   search for a given number x and print 
//   the index at which it occurs
//    (Linear Search is applied)

import java.util.*;

public class Array1 {

    public static void main(String args[]) {

        System.out.print("Give the size of the array : ");

       Scanner sc = new Scanner (System.in);
       int size = sc.nextInt();
       int userarray[] = new int[size];

        System.out.println("Give the integer array elements : ");

       for(int i=0; i<size; i++) {

        userarray[i] = sc.nextInt();

       }

       System.out.println("Give a number to be located in the array");

       int unknown = sc.nextInt();
       int index = 0;

       for(int j=0; j<size ; ) {
        if(userarray[j] != unknown){
            index = j++;
        }else if(userarray[j]==unknown){
            index = j;
            break;
        }
       }
        // Above for loop not the most effective , much better way is given below.

        // for(int j=0 ; j<userarray.length ; j++){
        //    if(userarray[j]==unknown){
        //      System.out.print("x found at index " + j)
        //                             }
        //      }
       
       System.out.println("The required index of the element is " + index);
    }
}
