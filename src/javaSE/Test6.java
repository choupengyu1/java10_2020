package javaSE;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��֪a,b�������ͱ�����д����a,b���������е�ֵ�����ĳ���
		int a = 1,b = 2,c;
		c = a;
		a = b;
		b = c;
		System.out.println(a+","+b);
		//����һ��0��1000�����������λ���ĺͣ�����345�Ľ����3+4+5��12ע���ֽ����ּȿ����ȳ���ģҲ������ģ�����
		int d = 345;
		int	d1 = d % 10,d2 = d/10%10,d3=d/100;
		System.out.println(d1+d2+d3);
		//�����¶Ⱥ������¶Ȼ���ת�����ӻ��϶ȱ�����϶���ֻҪ��ȥ32������5�ٳ���9�����ˣ������϶�ת�ɻ��϶ȣ�ֱ�ӳ���9������5���ټ���32����
		double hua = 10.1;
		double she = (10.1 - 32) *5/9;
		double h = she*9/5+32;
		System.out.println(she+","+h);
		//����һ������Ĵ�д��ĸA~Z��ת��ΪСд��ĸ��
		char hah = 'A';
		char haha = (char)('A'+32);
		System.out.println(haha);
	}

}
