class AriTest
{
	public static void main(String[] args){
			//����
			int num1 = 12;
			int num2 = 5;
			System.out.println(num1/num2);//2
			System.out.println(num1/num2*num2);//10
			
			//ȡģ
			int i1 = -12;
			int j1 = 5;
			System.out.println(i1%j1);//-2

			int i2 = 12;
			int j2 = -5;
			System.out.println(i2%j2);//2

			int i3 = -12;
			int j3 = -5;
			System.out.println(i3%j3);//-2
			
			//����
			int a1 = 10;
			//���߱�������ȫ��ͬ
			a1++;
			++a1;
			System.out.println(a1);

			//����һ��
			short s1 = 10;
			s1 = (short)(s1 + 1);
			System.out.println(s1);

			//��������
			short s2 = 10;
			s2++;
			System.out.println(s2);
			
			//��ϰһ�����
			byte b1 = 127;
			b1++;
			System.out.println(b1);//-128

			//��ϰ��������
			int i = 1;
			int j = i++ + ++i * i++;
			System.out.println(j);//1+3*3 
	}
}