public class IncrementDemo{
	public static void main(String[] args){	
	int i = 0;
		System.out.println("val:" + i);
		i++;
		System.out.println("vala:" + i++);
		System.out.println("valb:" + i);
		++i;
		System.out.println("valc:" + i++);
		System.out.println("valc:" + i++);
		for(i = 0;i < 10;i++) {
			System.out.println("i:" + i);
			}
		int j = 10;
		while(j>0) {
			System.out.println("j:" + j);
			j--;
			}
		int k = 10;
		do {
			System.out.println("k:" + k);
			k--;
			} while(k>0);
	}
	}