package javaSE;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2020;
		if(i%400==0){
			System.out.println(i+"������");
		}
		else if(i%4==0 && i%100!=0){
			System.out.println(i+"������");
		}
		else{
			System.out.println(i+"��������");
		}

		
		
		//�ж�һ�������Ƿ��ܱ�5��6ͬʱ��������ӡ�ܱ�5��6����������ֻ�ܱ�5��������ӡ�ܱ�5��������
		//��ֻ�ܱ�6����������ӡ�ܱ�6�����������ܱ�5��6����������ӡ���ܱ�5��6������
		int s = 36;
		if(s%5 == 0 && s%6 ==0) {
			System.out.println("�ܱ�5��6����");
		}
		else if(s%5 == 0){
			System.out.println("ֻ�ܱ�5����");
		}
		else if(s%6 == 0){
			System.out.println("ֻ�ܱ�6����");
		}
		else{
			System.out.println("���ܱ�5��6����");
		}
	}

}
