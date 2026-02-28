import java.util.*;
public class  practice1{

public static boolean twice(int num[]){
// time complexity : (O(n^2))
// without Hashsets
for(int i =0; i<num.length; i++){
for(int j =i+1; j<num.length; j++){
if(num[i] == num[j]){
return true;
}
}
}
return false;
}


public static boolean twiceHash(int num[]){

// Time complexity : (O(n))
// with Hashsets
HashSet<Integer>set  = new HashSet<>();

for(int i =0; i<num.length; i++){
if(set.contains(num[i])){
return true;
}else{
set.add(num[i]);
}
}
return false;
}


public static void main(String args[]){
int num[] = {67 , 43 , 76, 43 , 78};

if(twice (num))
System.out.println("true");
else
System.out.println("False");

// Hashsets
System.out.println(twiceHash(num));

}
}
