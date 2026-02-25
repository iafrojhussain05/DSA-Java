public class sumOfArray{

public static int sum(int num[]){

int s = 0;
for(int i =0; i<num.length; i++){
s += num[i];
}

return s;
}
public static void main(String args[]){

int num[] = {26,6};

System.out.println(sum(num));
}
}
