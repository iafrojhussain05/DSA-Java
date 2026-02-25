public class functionArgumentArray{


public static void  update(int marks[] , int nonchange){
 
nonchange = 20;

// by reference
for(int i = 0; i <marks.length; i++){
marks[i] = marks[i] + 1;
}
}
public static void main(String args[]){
int marks[] = {90 , 67 , 63};
int nonchange = 30;

update(marks , nonchange);

System.out.println(nonchange);

for(int i = 0; i < marks.length; i++){
System.out.print(marks[i]+" ");
}
System.out.println();

}

}
