public class PrefixSum{

public static void Prefix_Sum(int num[]){


int SumMax = Integer.MIN_VALUE;

int Currsum = 0;

// prefix sum
int prefix[] = new int[num.length];

prefix[0] = num[0];

// calculate prefix array

for(int i =1; i<prefix.length; i++){
prefix[i]  = prefix[i-1] + num[i];
}


for(int i =0; i<num.length; i++){
int start = i;
for(int j =i; j<num.length; j++){
int end = j;
Currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

if(SumMax < Currsum){
SumMax = Currsum;
}

}
}
System.out.println(SumMax);
}
public static void main(String args[]){
int num[] = {1,2,3,4,5};
Prefix_Sum(num);

}
}
