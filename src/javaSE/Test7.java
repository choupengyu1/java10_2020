package javaSE;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2020;
		if(i%400==0){
			System.out.println(i+"是闰年");
		}
		else if(i%4==0 && i%100!=0){
			System.out.println(i+"是闰年");
		}
		else{
			System.out.println(i+"不是闰年");
		}

		
		
		//判断一个数字是否能被5和6同时整除（打印能被5和6整除），或只能被5整除（打印能被5整除），
		//或只能被6整除，（打印能被6整除），不能被5或6整除，（打印不能被5或6整除）
		int s = 36;
		if(s%5 == 0 && s%6 ==0) {
			System.out.println("能被5和6整除");
		}
		else if(s%5 == 0){
			System.out.println("只能被5整除");
		}
		else if(s%6 == 0){
			System.out.println("只能被6整除");
		}
		else{
			System.out.println("不能被5或6整除");
		}
	}

}
