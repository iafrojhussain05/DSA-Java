// Calculator

import java.util.*;
public class Calculator{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter First Value : ");
double a = sc.nextDouble();

System.out.print("Enter Second  Value : ");
double b = sc.nextDouble();

System.out.print("Enter Operator : ");
char ch = sc.next().charAt(0);

switch(ch){
case '+':
System.out.println(a+" + "+b+ " = "+(a+b));
break;

case '-':
System.out.println(a+" - "+b+ " = "+(a-b));
break;

case '*':
System.out.println(a+" * "+b+ " = "+(a*b));
break;

case '/':
System.out.println(a+" / "+b+ " = "+(a/b));
break;

case '%':
System.out.println(a+" % "+b+ " = "+(a%b));
break;

default :
System.out.println("Invalid");
}
}
}
