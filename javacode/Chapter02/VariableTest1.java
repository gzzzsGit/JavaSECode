/*
���Ի����������ͼ������������ﲻ����boolean����
������������
1.�Զ���������
2.ǿ������ת��
*/

class VariableTest1
{
	public static void main(String[] args){
		//byte��short��char-> int-> long-> float-> double
		byte b1 = 2;
		short s1 = b1;
		int i1 = s1;
		long l1 = i1;
		float f1 = l1;
		double d1 = f1;
		System.out.println(d1);

		//�������1��byte��short֮�������㣬
		//���벻ͨ��,��intת����short���ܻ�����ʧ
		//short s2 = b1+s1;
		int i2 = b1+s1;
		System.out.println(i2);

		//���벻ͨ��,��intת����short���ܻ�����ʧ
		//byte b2 = b1+b1;
		int i3 = b1+b1;
		System.out.println(i3);
		
		//�������2:char
		char c1 = 'a';
		//���벻ͨ��,��intת����char���ܻ�����ʧ
		//char c2 = c1+b1;
		int i4 = c1+b1;;
		System.out.println(i4);//99

		//*************************************
		long l2 = 132L;
		long l3 = 132;//���Ϊ�Զ���������(int->long)
		
		//���벻ͨ��,132132132132������int���ͷ�Χ
		//long l4 = 132132132132;
		long l4 = 132132132132L;
		
		//���벻ͨ��,�������Զ����������Ĺ���(double->float)
		//float = 1.32;
		

		//ǿ������ת��
		short s2 = (short)l3;
		System.out.println(s2);

		//������ʧ1:
		float f3 = 3.3f;
		int i5 = (int)f3;
		System.out.println(i5);//3

		//������ʧ2:
		long l5 = 128;
		byte b2 = (byte)l5;
		System.out.println(b2);//1000 0000 �Ĳ�����-128

		//�������ã�
		short s3 = 13;
		calculate((int)s3);

	}
	public static void calculate(int num){
		System.out.println("this num is:"+num);
	}
}