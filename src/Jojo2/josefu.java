package Jojo2;

public class josefu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5。 
		xisa(5);

	}
	public static void xisa(int q){
		int a = 1;
		for(int i=1;i<=q;i++)
		{
			a*=i;
		}
		System.out.println(a);
		}
	
}
