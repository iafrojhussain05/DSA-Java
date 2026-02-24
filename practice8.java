// Write a program that reads a set of integers , and then prints the sum of the even and odd integers

import java.util.*;
public class practice8{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int n , num;

int evenSum = 0 , oddSum = 0;

System.out.print("Enter how many number : ");
num = sc.nextInt();

 
for(int i =1; i<=num; i++){
System.out.print("Enter "+i+ " integers : ");
n = sc.nextInt();

if(n % 2 == 0){
evenSum += n;
}else{
oddSum += n;
}
}

System.out.println("Sum of Even number : "+evenSum);
System.out.println("Sum of Odd number : "+oddSum);

}
}
