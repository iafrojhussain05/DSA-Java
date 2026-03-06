import java.util.*;

public class Searchin2DArray{

public static boolean search(int num[][] , int key){
for(int i=0 ; i<num.length; i++){  
for(int j=0; j<num[0].length; j++){

if(num[i][j] == key){
System.out.println("Found at ("+i+","+j+")");

return true;

}

}

}
System.out.println("Not Found");
return false; 
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int num[][] = new int[4][3];
int key =5;

System.out.println("enter 12 element");
for(int i=0 ; i<num.length; i++){
for(int j=0; j<num[0].length; j++){
num[i][j] = sc.nextInt();
}
}

for(int i=0 ; i<num.length; i++){ 
for(int j=0; j<num[0].length; j++){ 
System.out.print(num[i][j]+" ");
}
System.out.println();
}

search(num,key);
}
}
