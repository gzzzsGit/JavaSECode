class SetValueTest
{
	public static void main(String[] args){
		
		//������ֵ
		int a1,b1;
		a1 = b1 = 10;
		System.out.println("a1:"+a1+"\tb1:"+b1);

		//������ʽ2��
		int a2 = 10,b2 =10;
		System.out.println("a2:"+a2+"\tb2:"+b2);
		
		//+= -= *= /=
		int i = 5;
		i += 5;//������i=i+5
		System.out.println(i);

		//����:+= -= *= /=���㲻��ı���������
		byte j = 5;
		j += 5;
		//j =j+5 ���벻ͨ��
		System.out.println(j);

		int x = 1;
		x*=0.1;//�൱��x = (int)(x*0.1)
		System.out.println(x);//0

		//��ϰ��
		int i1 = 10;
		i1 += i++ + ++i;
		System.out.println(i1);//32
	}
}