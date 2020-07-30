package javaSE;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序。
		int a = 1,b = 2,c;
		c = a;
		a = b;
		b = c;
		System.out.println(a+","+b);
		//给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12注：分解数字既可以先除后模也可以先模后除。
		int d = 345;
		int	d1 = d % 10,d2 = d/10%10,d3=d/100;
		System.out.println(d1+d2+d3);
		//华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去32，乘以5再除以9就行了，将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行
		double hua = 10.1;
		double she = (10.1 - 32) *5/9;
		double h = she*9/5+32;
		System.out.println(she+","+h);
		//给定一个任意的大写字母A~Z，转换为小写字母。
		char hah = 'A';
		char haha = (char)('A'+32);
		System.out.println(haha);
	}

}
