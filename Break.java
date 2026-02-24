
import java.util.*;
public class Break{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

do{
System.out.print("Enter your num : ");
int n = sc.nextInt();

System.out.println(n);
if(n % 2 == 0){
break;
}
}while(true);
}
}
