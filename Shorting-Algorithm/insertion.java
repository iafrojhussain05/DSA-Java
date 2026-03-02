// Insertion sort
public class insertion{

public static void insertion_sort(int num[]){

for(int i =1; i<num.length; i++){
int curr = num[i];
int prev = i-1;


// find ut of the correct pos to insert
while(prev >= 0 && num[prev] > curr){
num[prev+1] = num[prev];
prev--;
}
num[prev+1] = curr;
}
}
public static void main(String args[]){

int num[] = {65,32,243,9,3,2,6};

insertion_sort(num);
for(int arr : num)
System.out.print(arr+" ");
}
}
