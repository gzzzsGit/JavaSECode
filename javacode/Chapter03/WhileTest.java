/*
世界最高山峰是珠穆朗玛峰，它的高度是8848.86米，假如我有一张足够大的纸，它的厚度是0.1毫米
请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
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