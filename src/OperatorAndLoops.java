import java.util.Scanner;
public class OperatorAndLoops{
    public static void main(String[] args) {
        int i = 0;
        System.out.println("value="+i);
        i++;
        System.out.println("value1="+i++);
        System.out.println("value2="+i);
        ++i;
        System.out.println("value3="+i++);
        System.out.println("value4="+i++);
        int z= i+i++ + ++i+i+ ++i + i++;
        System.out.println("value5="+z);
		//Loops:
		//For loops:-
		for(int j=0;j<10;j++)
		{
			System.out.println("j: "+j);
		}
		//while loops:-
		int k=10;
		while(k>0){
			System.out.println("K: "+k);
			k--;
		}
		//do-while loops:-
		int m =10;
		do{
			System.out.println("M: "+m);
			m--;
		}
		while(m>0);
		System.out.println("Enter the no.:");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("The no. of a is "+a);
	
    }
}
