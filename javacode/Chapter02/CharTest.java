class CharTest
{
	public static void main(String[] args){
		//��ʾ��ʽ1��ʹ��һ��''��ʾ���ڲ��н���һ���ַ�
		char c1 = '��';
		System.out.println("char1="+c1);

		//���벻ͨ��
		//char c1 = '';
		
		//��ʾ��ʽ2��ֱ��ͨ��Unicode����ֵ����ʾ
		char c2 = '\u0036';
		System.out.println("char2="+c2);
		
		//��ʾ��ʽ3��ͨ��ת���ַ���ʾ\+�����ַ�
		char c3 = '\''; //������
		System.out.println("char3="+c3);
		char c4 = '\\';
		System.out.println("char4="+c4);

		//��ʾ��ʽ4��ʹ�þ����ַ���Ӧ����ֵ(ASCII��)
		char c5 = 97;
		char c6 = '9';
		System.out.println("char5="+c5);
		System.out.println("char6="+c6);
	}	
}