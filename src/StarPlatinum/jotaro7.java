package StarPlatinum;

public class jotaro7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输入一个年份，判断这个年份是否是闰年。
		int year = 2020;
		if(year%400 ==0){
			System.out.println("是闰年");
		}
		else if(year%4==0 && year%100 !=0){
			System.out.println("是闰年");
		}
		else{
			System.out.println("不是闰年");
		}
	}

}
