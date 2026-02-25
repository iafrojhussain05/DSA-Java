import java.util.*;
public class inputArray{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

// 
int[] marks = new int[5];

// input 
 marks[0] = sc.nextInt();
System.out.println("Marks 1 : "+marks[0]);

marks[1] = sc.nextInt();
System.out.println("Marks 2 : "+marks[1]);

marks[2] = sc.nextInt();
System.out.println("Marks 3 : "+marks[2]);

// percentage of marks 
int percentage =( marks[0] + marks[1] + marks[2]) / 3;

System.out.println("percentage : "+ percentage+"%");

// Total  length of Array
System.out.println("Length of Marks  "+marks.length);

 // update 
marks[0] = 100;
System.out.println(marks[0]);
 
}
}
