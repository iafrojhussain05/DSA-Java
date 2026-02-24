/* In a program , input 3 numbers : A , B and C. You have to output the average of these 3 numbers.
(Hint : Average of N numbers is sum of those number divide by N).
*/
import java.util.*;
public class practice1{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter First Number : ");
float A = sc.nextFloat();

System.out.print("Enter Second Number : ");
float B = sc.nextFloat();

System.out.print("Enter Third Number : ");
float C = sc.nextFloat();

float AverageNum = (A+B+C)/3;
System.out.println("Average of 3 Numbner : "+AverageNum);
}
}
