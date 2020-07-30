package TheWorld;

public class Dio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 由命令行输入一个4位整数，求将该数反转以后的数，
		// 如原数为1234，反转后的数位4321。
		
		 /* int a =5678; int i= a/1000;
		  int j= a/100%10;
		  int x= a/10%10; 
		  int y=a%10;
		  System.out.println(y+""+x+""+j+""+i);
		 */
		int a = 1234;
		for(int i =0;i<=3;i++){
			int b = a%10;
			System.out.print(b);
			a/=10;
		}
	}

}
