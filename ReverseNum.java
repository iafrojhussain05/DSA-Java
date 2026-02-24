import java.util.*;
public class ReverseNum{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter n :");
int n = sc.nextInt();

// usig while Loop


while(n > 0){
int LastDigit = n%10;
System.out.print(LastDigit+" ");
n /= 10;

}
}
}
