package javaSE;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = 2;
		int y1 = 5;
		int r1;
		r1 = x1++ + x1*y1;
		System.out.println("x1="+x1+" y1="+y1+" r1="+r1);
		
		int a = 100;
		int b = a;
		b+=a; //b = b+a
		b-=a;
		b*=a;
		b/=a;
		b%=a;
	}

}
