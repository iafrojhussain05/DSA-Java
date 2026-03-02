public class practice1{

// Bubble sorting
public static void bubble(int arr[]){

for(int i=0; i<arr.length-1; i++){
for(int j=0; j<arr.length-i-1; j++){
if(arr[j] > arr[j+1]){
int temp = arr[j];
arr[j] = arr[j+1];
arr[j+1] = temp;
}
}
}
}


// Selection Sorting 
public static void selection(int arr[]){
for(int i=0;  i< arr.length; i++){
int minindex =i;
for(int j =i+1; j<arr.length; j++){
if(arr[j] < arr[minindex]){
minindex = j;
}
} 

int temp = arr[i];
arr[i] = arr[minindex];
arr[minindex] = temp;
}
}


// insertion sorting

public static void main(String args[]){
int arr[] = {3,6,2,1,8,7,4,5,3,1};

bubble(arr);
for(int num : arr)
System.out.print(num+" ");
System.out.println();

selection(arr);
for(int array : arr)
System.out.print(array+" ");
System.out.println();



}
}
