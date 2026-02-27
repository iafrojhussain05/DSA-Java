public class KadanesAlgo{

public static void Kadanes(int num[]){

int currSum = 0;
int MaxSum = Integer.MIN_VALUE;

for(int i =0; i<num.length; i++){

currSum += num[i];

if(currSum < 0){
currSum = 0;
}

MaxSum = Math.max(currSum , MaxSum);
}

System.out.println(MaxSum);

}

public static void main(String args[]){
int num[] = {-2 , -3 , -1 , -2 , 1 , 5 , -3};

Kadanes(num);

}
}
