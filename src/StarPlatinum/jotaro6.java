package StarPlatinum;

public class jotaro6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ж�һ�������Ƿ��ܱ�5��6ͬʱ��������ӡ�ܱ�5��6����������ֻ�ܱ�5��������ӡ�ܱ�5��������
		//��ֻ�ܱ�6����������ӡ�ܱ�6�����������ܱ�5��6����������ӡ���ܱ�5��6������
		int a = 18;
		if(a%5==0 && a%6==0){
			System.out.println("�ܱ�5��6����");
		}
		else if(a%5==0){
			System.out.println("ֻ�ܱ�5����");
		}
		else if(a%6==0){
			System.out.println("ֻ�ܱ�6����");
		}
		else{
			System.out.println("���ܱ�5��6����");
		}
	}

}
