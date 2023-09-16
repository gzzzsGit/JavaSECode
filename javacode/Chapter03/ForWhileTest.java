import java.util.Scanner;
class ForWhileTest
{
	public static void main(String[] args){
		int positiveNum = 0;
		int negativeNum = 0;
		int input = 0;
		Scanner scan = new Scanner(System.in);
		while(true){
			input = scan.nextInt();
			if (input>0)
			{
				positiveNum+=1;
			}
			else if(input<0){
				negativeNum+=1;
			}
			else
				break;
		}
		System.out.println("正数的个数为："+positiveNum);
		System.out.println("负数的个数为："+negativeNum);
		scan.close();
	}	
}