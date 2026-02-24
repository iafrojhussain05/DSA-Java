public class FuctionOverloading{

public static void sum(int a , int b){
int sum = a+b;
System.out.println(sum);
}

public static void sum(int a , int b, int c){ 
int sum = a+b+c; 
System.out.println(sum);
}
public static void main(String args[]){
sum(1,2,3);
sum(1,2);
}
}
