package StarPlatinum;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class jotaro8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��0��100�ķ������������0��100֮�䣬��ӡ������Ч�����ݷ����ȼ���ӡA,B,C,D,E��
		int a = 49;
		if(a<0 && a>100){
			System.out.println("��ӡ������Ч");
			return;
		}
		switch(a/10){
		case 10:
		case 9:
			System.out.println("�����ȼ�A");
			break;
		case 8:
			System.out.println("�����ȼ�B");
			break;
		case 7:
			System.out.println("�����ȼ�C");
			break;
		case 6:
			System.out.println("�����ȼ�D");
			break;
		case 5:
			System.out.println("�����ȼ�E");
			break;
	    default:
	    	System.out.println("��������");
		}
	}

}
