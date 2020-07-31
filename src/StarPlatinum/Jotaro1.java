package StarPlatinum;

public class Jotaro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//给定一个成绩a，使用switch结构求出a的等级。
		//A：90-100，B：80-89，C：70-79，D：60-69，E：0~59。
		int a = 59;
		switch(a/10){
		case 10:
		case 9:
			System.out.println("优秀");
			break;
		case 8:
			System.out.println("良好");
			break;
		case 7:
			System.out.println("中等");
			break;
		case 6:
			System.out.println("及格");
			break;
		default:
			System.out.println("垃圾");
		}
	}

}
