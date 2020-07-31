package Jojo2;

public class josefu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		year(1800);
	}
	public static void year(int a){
		if(a%400==0)
		{
			System.out.println("是闰年");
		}
		else if(a%4==0 && a%100!=0)
		{
			System.out.println("是闰年");
		}
		else
		{
			System.out.println("是平年");
		}
	}
}
