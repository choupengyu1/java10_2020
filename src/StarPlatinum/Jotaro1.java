package StarPlatinum;

public class Jotaro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ���ɼ�a��ʹ��switch�ṹ���a�ĵȼ���
		//A��90-100��B��80-89��C��70-79��D��60-69��E��0~59��
		int a = 59;
		switch(a/10){
		case 10:
		case 9:
			System.out.println("����");
			break;
		case 8:
			System.out.println("����");
			break;
		case 7:
			System.out.println("�е�");
			break;
		case 6:
			System.out.println("����");
			break;
		default:
			System.out.println("����");
		}
	}

}
