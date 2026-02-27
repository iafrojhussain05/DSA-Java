public class MaxSubarraySum{

public static void Max_Sub_array_Sum(int num[]){


int SumMax = Integer.MIN_VALUE;

int Currsum = 0;
 
for(int i =0; i<num.length; i++){
int start = i;

for(int j =i; j<num.length; j++){
int end = j;

Currsum = 0;

for(int k = start; k<=end; k++){
Currsum += num[k];

}
System.out.println(Currsum);
if(SumMax < Currsum){
SumMax = Currsum;
}
}
}

System.out.println(SumMax);

}
public static void main(String args[]){

int num[] = {1,2,3,4,5};

Max_Sub_array_Sum(num);

}
}
