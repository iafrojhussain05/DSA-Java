public class LinearSearch{

public static int Linear_Search(int Array[] , int key){

for(int i =0; i<Array.length; i++){
if(Array[i] == key){
return i;
}
}
return -1;
}
public static void main(String args[]){

int Array[] = {10 , 20 , 30 , 40 , 50};
int key = 30;

int index  = Linear_Search(Array , key);
if(index == -1){
System.out.println("Not Found ");
}else{
System.out.println("key is at "+index);
}
}
}
