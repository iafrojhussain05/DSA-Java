//Income Tax Calculator
import java.util.*;
public class incomeTax{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter Your Salary : ");
double salary = sc.nextDouble();

double tax;

if(salary < 500000){ 
tax = 0;
}

else if(salary <= 500000 && salary >= 1000000){
tax = (salary*0.2);
 }

else{
tax = (salary*0.3);
 }

System.out.println("Your Tax is "+tax);

}
}
