import java.util.*;

// java.util.Array; use for Ascending Order
// java.util.Collections; Descending Order Sort with But Integer
public class inbuildSort{

public static void main(String args[]){

int num[] = {6,8,35,96,5,1};
Arrays.sort(num);

for(int arr : num)
System.out.print(arr+" ");

System.out.println();


Integer n[] ={6,9,5,4,3,1};
Arrays.sort(n , Collections.reverseOrder());

for(int m :n)
System.out.print(m+" ");

}
}
