//��ϰ�������·ݺ����ڣ������һ���еĵڼ���
import java.util.Scanner;
class SwitchCaseTest1
{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("������2023����·ݣ� ");
		int month = input.nextInt();
		System.out.println("������"+month+"��"+"���գ� ");
		int day = input.nextInt();
		int sumDays = 0;
		switch(month){
			case 12:
				sumDays += 30;
			case 11:
				sumDays += 31;
			case 10:
				sumDays += 30;
			case 9:
				sumDays += 31;
			case 8:
				sumDays += 31;
			case 7:
				sumDays += 30;
			case 6:
				sumDays += 31;
			case 5:
				sumDays += 30;
			case 4:
				sumDays += 31;
			case 3:
				sumDays += 28;
			case 2:
				sumDays += 31;
			case 1:
				sumDays += day;
		}
		 System.out.println("2023���"+month+"��"+day+"����һ���еĵ�"+sumDays+"��" );
	}
}