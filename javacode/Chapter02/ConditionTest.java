class ConditionTest
{
	public static void main(String[] args){
		int m = 1,n = 2;
		double res = m>n?1:2.0;
		System.out.println(res);//2.0

		//ʵ��
		int week =4;
		int i;
		for (i=0; i<7 ; i++)
		{
			week+=1;
			week%=7;
			System.out.println("����������"+i+"�������"+((week==0)?"��":week));
			//System.out.println("����������"+i+"�������"+((week==0)?'��':week)); ������ַ�ת����int���������������2�������26085
		}
		double j = 0.1;
		double k = 0.2;
		System.out.println(j+k);//0.30000000000000004
	}
}