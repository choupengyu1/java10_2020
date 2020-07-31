package TheWorld;

public class Dio8 {
	public static void main(String[] args) {
		
		int a =123456;
		int b;
		for(int i=1;;i++){
			b = a%10;
			a=a/10;
			System.out.print(b);
			if(a==0){
				System.out.println("\n"+i);
				break;
			}
			}
		
		}
	}

