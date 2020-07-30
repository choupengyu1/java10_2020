package javaSE;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte,short,int,char,String,enum
		//等值匹配
		//switch见到break退出
		int a =10,i = 2000;
		switch(a){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30天");
			break;
		case 2:
			if(i%400==0){
			System.out.println("29天");
		}
		else if(i%4==0 && i%100!=0){
			System.out.println("29天");
		}
		else{
			System.out.println("28天");
		}
			break;
		default:
			System.out.println("错误指令");
			break;
		}
	}

}
