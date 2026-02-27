public class PairsArray{

public static void Pairs_Array(int num[]){

// total pairs n(n-1)/2
int tp = 0;
// outer loop

for(int i =0; i<num.length; i++){
int curr = num[i];

// inner loop

for(int j = i+1; j<num.length; j++){
System.out.print("(" + curr + "," + num[j] +")" );
tp++;
}

System.out.println();
}
System.out.println("Total Pairs : "+tp);
}
public static void main(String args[]){
int num[] = {1,2,3,4,5};

Pairs_Array(num);

}
}
