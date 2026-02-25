public class ReverseArray{

public static void Reverse_Array(int num[] ){

int start = 0 , end = num.length - 1;

while(start < end ){
int temp = num[start];
num[start] = num[end];
num[end] = temp;

start++;
end--;

}
}
public static void main(String args[]){

int num[] = {56 , 76 , 32 , 98};


Reverse_Array(num);

 for(int i =0; i<num.length; i++){
System.out.print(num[i]+" ");
}
System.out.println();
}
}
