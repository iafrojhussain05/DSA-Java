public class bubblesort{

public static void bubble(int arr[]){
for(int i =0; i<arr.length-1; i++){
for(int j =0; j<arr.length-i-1; j++){
if(arr[j] > arr[j+1]){

// swap
int temp = arr[j];
arr[j] = arr[j+1];
arr[j+1] = temp;
}
}
}
}
public static void main(String args[]){

int arr[] = {7,4,1,9,3};

bubble(arr);

for(int i =0; i<arr.length; i++){
System.out.print(arr[i]+" ");
}
}
}
