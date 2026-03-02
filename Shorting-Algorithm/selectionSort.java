public class selectionSort{

public static void selection_Sort(int num[]){

for(int i=0; i<num.length-1; i++){

int minpos = i;

for(int j = i+1; j<num.length; j++){

if(num[j] < num[minpos]){

minpos = j;
}
}

// swap
int temp = num[minpos];
num[minpos] = num[i];
num[i] = temp;
}
}
public static void main(String args[]){

int num[] = {64, 25, 12, 22, 11};

selection_Sort(num);
for(int arr : num)
System.out.print(arr+" ");
}
}
