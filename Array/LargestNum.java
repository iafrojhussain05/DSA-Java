public class LargestNum{

public static int Largest_Num(int num[]){

int largest = Integer.MIN_VALUE;
for(int i =0; i <num.length; i++){
if(largest < num[i]){
largest = num[i];
}
}
return largest;
}
public static void main(String args[]){
int num[] = {56 , 87 ,32 ,9};


System.out.println("Largest Number : "+Largest_Num(num));
// output 87
}
}
