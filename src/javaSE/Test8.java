package javaSE;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte,short,int,char,String,enum
		//��ֵƥ��
		//switch����break�˳�
		int a =10,i = 2000;
		switch(a){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31��");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30��");
			break;
		case 2:
			if(i%400==0){
			System.out.println("29��");
		}
		else if(i%4==0 && i%100!=0){
			System.out.println("29��");
		}
		else{
			System.out.println("28��");
		}
			break;
		default:
			System.out.println("����ָ��");
			break;
		}
	}

}
