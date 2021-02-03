/*
This is a program to determine how many answers are right, given an a set of both
student and teacher answer sheets.
Creator: Jacob Reyes
Problem Source: https://dmoj.ca/problem/ccc11s2
*/
import java.util.*;
public class MultiChoice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int counter=0;
        String[] student = new String[size];
        String[] teacher = new String[size];
        for(int j=0;j<size;j++){
            student[j]=input.next();
        }
        for(int k=0;k<size;k++){
            teacher[k]=input.next();
        }
        for(int l=0;l<size;l++){
            if(student[l].equals(teacher[l])){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
