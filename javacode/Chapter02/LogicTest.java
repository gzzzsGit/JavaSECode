class LogicTest
{
	public static void main(String[] args){
		//��ͬ�㣺���Ǳ�ʾ��
		boolean b1 = true;
		int num1 = 1;
		if (b1 & num1++>0)
			System.out.println("�Ұ������");//�Ұ������
		else
			System.out.println("����������");
		System.out.println(num1);//2
		boolean b2 = true;
		int num2 = 1;
		if (b2 && num2++>0)
			System.out.println("�Ұ������");//�Ұ������	
		else
			System.out.println("����������");
		System.out.println(num2);//2

		//��ͬ�㣺&&��һ�������������������ˣ�����Ĳ���ִ��
		b1 = false;
		num1 = 1;
		if (b1 & num1++>0)
			System.out.println("�Ұ������");
		else
			System.out.println("����������");//����������
		System.out.println(num1);//2
		b2 = false;
		num2 = 1;
		if (b2 && num2++>0)
			System.out.println("�Ұ������");	
		else
			System.out.println("����������");//����������
		System.out.println(num2);//1


		//******************************************
		//��ͬ�㣺||��һ�������������˲���ִ�к����	
		boolean b3 = true;
		int num3 = 1;
		if (b3 | num3++>0)
			System.out.println("�Ұ������");//�Ұ������
		else
			System.out.println("����������");
		System.out.println(num3);//2
		boolean b4 = true;
		int num4 = 1;
		if (b4 || num4++>0)
			System.out.println("�Ұ������");//�Ұ������	
		else
			System.out.println("����������");
		System.out.println(num4);//1
		
		//��ͬ�㣺
		b3 = false;
		num3 = 1;
		if (b3 | num3++>0)
			System.out.println("�Ұ������");//�Ұ������
		else
			System.out.println("����������");
		System.out.println(num3);//2
		b4 = false;
		num4 = 1;
		if (b4 || num4++>0)
			System.out.println("�Ұ������");//�Ұ������	
		else
			System.out.println("����������");
		System.out.println(num4);//2
	}
}