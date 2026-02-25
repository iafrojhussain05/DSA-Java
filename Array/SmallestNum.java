public class SmallestNum{

public static int Smallest_Num(int num[]){
int smallest = Integer.MAX_VALUE;
for(int i =0; i<num.length; i++){
if(smallest > num[i]){
smallest = num[i];
}
}
return smallest;
}
public static void main(String args[]){
int num[] = {3 , 56 ,12 ,8 ,1 ,4 ,34};

System.out.println("Smallest Number : "+Smallest_Num(num));
 // output 1
}

}
