public class BasicTo1dArray{

//Largest element
public static void Largest_element(int arr[]){

int largest = Integer.MIN_VALUE;
for(int i=0; i<arr.length; i++){
if(largest < arr[i]){
largest = arr[i];
}
}
System.out.println(largest);
}



// Smallest element

public static void Smallest_element(int arr[]){

int smallest = Integer.MAX_VALUE;

for(int i=0; i<arr.length; i++){
if(smallest > arr[i]){
smallest = arr[i];
}
}
System.out.println(smallest);
}



// Reverse the array
public static void Reverse_array(int arr[]){

int start =0 , end = arr.length-1;

while(start < end){

int temp = arr[start];
arr[start]  = arr[end];
arr[end] = temp;

start++;
end--;
}
}


// Linear search: element = 5 ka index
public static int Linear_search(int arr[], int key){

for(int i=0; i<arr.length; i++){
if(arr[i] == key){
return i;
}
}

return -1;
}
 

// Binary search: element = 4 ka index (sorted array me).

public static int  Binary_search(int arr[] ,int target ){

int start =0 , last = arr.length -1;

while(start <= last){
int mid = (start + last ) / 2;
if(arr[mid] == target)
return mid;


if(arr[mid] < target)
start = mid+1;
else
last = mid-1;

}
return -1;
} 


// Maximum subarray sum using Kadane’s Algorithm

public static void Kadanes_Algorithm(int arr[] ){

int currsum =0;
int maxsum = Integer.MIN_VALUE;

for(int i =1; i<arr.length; i++){
currsum = Math.max(arr[i] , currsum + arr[i]);
maxsum = Math.max(currsum , maxsum);
}

System.out.println(maxsum);
}

public static void main(String args[]){

int arr[] = {2,-3,4,-1,-2,1,5,-3};
int key = 5;
int target = 4;

//Largest_element(arr);

//Smallest_element(arr);

//Reverse_array(arr);

//for(int i=0; i<arr.length; i++){
//System.out.print(arr[i]+" ");
//}

//int index =  Linear_search(arr , key);
//if(index == -1){
//System.out.println("not Found");
//}else{
//System.out.println(index);
//}


int index = Binary_search(arr , target);
System.out.println(index);

//Kadanes_Algorithm(arr);
}
}
