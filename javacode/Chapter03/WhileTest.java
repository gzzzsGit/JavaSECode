/*
�������ɽ������������壬���ĸ߶���8848.86�ף���������һ���㹻���ֽ�����ĺ����0.1����
���ʣ����۵����ٴΣ������۳����������ĸ߶�?
*/
class WhileTest
{
	public static void main(String args[]){
		double paper = 0.1;
		double mount = 8848.86*1e3;
		int i = 0;
		/*
		while(paper<mount){
			paper *=2;
			i++;
		}
		*/
		do{
			paper *=2;
			i++;
		}while(paper<mount);
		for(j = 1;j<5;j++);
		System.out.println(i);
		System.out.println(j);
	}
}