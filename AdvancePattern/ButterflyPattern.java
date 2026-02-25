public class ButterflyPattern{

public static void Butterfly(int n){

// first loop

for(int i = 1; i <= n; i++){


// star 
for(int j = 1; j <= i; j++){
System.out.print("*");
}

// space 2*(n-i)

for(int j = 1; j <= 2*(n-i); j++){

System.out.print(" " );
}


// star 

for(int j = 1; j <= i; j++){
System.out.print("*");
}

System.out.println();
}

// Second HAlf

for(int i = n; i >= 1; i--){

// star
for(int j = 1; j <= i; j++){
System.out.print("*");
}

// space 2*(n-i)
 
for(int j = 1; j <= 2*(n-i); j++){
 
System.out.print(" " );
}
 
 
// star
 
for(int j = 1; j <= i; j++){
System.out.print("*");
}

System.out.println();
}
}
public static void main(String args[]){
Butterfly(4);

}

}
