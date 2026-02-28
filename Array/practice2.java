import java.util.*;
public class practice2{

// Ascending Order Array
public static void ascendingOrder(Integer num[]){

Arrays.sort(num);
for(int i : num){
System.out.print(i+" ");

}

System.out.println();
}


public static void descending(Integer num[]){

Arrays.sort(num , Collections.reverseOrder());

for(int j : num){
System.out.print(j+" ");
}
System.out.println();
}
public static void main(String args[]){
Integer  num[] = {43 , 67 , 2 , 1  , 9};

ascendingOrder(num);
descending(num);
}
}
