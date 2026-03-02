public class CountingSort{
public static void  Counting(int num[]){

int largest = Integer.MIN_VALUE;
for(int i =1; i<num.length; i++){
if(largest < num[i]){
largest = num[i];
}
}
int count[] = new int[largest+1];

for(int i =0; i<num.length;  i++){
count[num[i]]++;
}

int j =0;
for(int i=0; i<num.length; i++){
while(count[i] > 0){
num[j]=i;
j++;
count[i]--;
}
}

}
public static void main(String args[]){
int num[] ={4,2,2,8,2,1};

Counting(num);
for(int arr : num)
System.out.print(arr+" ");
}
}
