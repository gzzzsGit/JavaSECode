/*
1. �����������ͺ�String������
2. ʹ��һ��""���и�ֵ
3. String �ڲ�������0����1�������ַ�
4. String�������������(����boolean)ֻ�����������㣬��"+"
*/
class StringTest
{
	public static void main(String[] args){
		String str1 = "hellow";
		System.out.println("str1:"+str1);
		
		String str2 = "";
		String str3 = "a";//��char c1 = 'a'����һ������
		
		int num = 10;
		boolean b1 = true;
		System.out.println(str1+num+b1);
		
		float f1 = 14.22f;
		String res = str1 + f1 + true + num;//��Ҫ��String���洢���
		System.out.println(res);
		
		//���뱨��,��Ԫ����� '+' �Ĳ��������ʹ���
		//boolean���ͺ������������Ͳ���ֱ������
		//String error = f1 + b1 +str1;

	}
}