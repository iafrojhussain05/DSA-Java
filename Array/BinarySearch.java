public class BinarySearch{

public static int Binary_Search(int num[] , int key){
int start = 0 , end = num.length - 1;

while(start <= end){
int mid = (start + end) / 2;

if(num[mid] == key){
return mid;
}

if(num[mid] < key ){
start = mid +1;
}else{
end = mid-1; 
}
}return -1;

}

public static void main(String args[]){
int num[] = {4 , 78 , 33 , 67};
int key = 78;

int index = Binary_Search(num , key);
System.out.println(index);
}
}
