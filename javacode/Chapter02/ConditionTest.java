class ConditionTest
{
	public static void main(String[] args){
		int m = 1,n = 2;
		double res = m>n?1:2.0;
		System.out.println(res);//2.0

		//实用
		int week =4;
		int i;
		for (i=0; i<7 ; i++)
		{
			week+=1;
			week%=7;
			System.out.println("今天是周四"+i+"天后是周"+((week==0)?"日":week));
			//System.out.println("今天是周四"+i+"天后是周"+((week==0)?'日':week)); 会把日字符转化成int，输出今天是周四2天后是周26085
		}
		double j = 0.1;
		double k = 0.2;
		System.out.println(j+k);//0.30000000000000004
	}
}