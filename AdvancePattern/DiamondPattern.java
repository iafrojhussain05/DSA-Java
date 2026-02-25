public class DiamondPattern{

public static void Diamond_Pattern(int n){

for(int i = 1; i <= n; i++){

// space 

for(int j = 1; j <= (n-i); j++){
System.out.print(" ");
}

// 

for(int j = 1; j <= (2*i)-1; j++){
System.out.print("*");
}

System.out.println();	
}

// Second Half

for(int i = n; i >= 1; i--){

// space

for(int j = 1; j <= (n-i); j++){
System.out.print(" ");
}

//

for(int j = 1; j <= (2*i)-1; j++){
System.out.print("*");
}

System.out.println();
}
}
public static void main(String args[]){

Diamond_Pattern(4);
}
}
