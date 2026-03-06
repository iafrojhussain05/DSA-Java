import java.util.*;
public class twoDArray{
public static void main(String args[] ){
Scanner sc = new Scanner(System.in);

int arr[] = new int[5];

System.out.print("Enetr 5 element ");
for(int i =0; i<arr.length; i++){
arr[i] = sc.nextInt();
}

System.out.println("Print Array");
for(int i=0; i<arr.length; i++){
System.out.print(arr[i] +" ");
}

}
}
