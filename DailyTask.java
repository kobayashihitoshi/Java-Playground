import java.util.Scanner;

public class DailyTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//for(int i = 0; i < 5; i++) {
		//	System.out.println("数字を入力してください。");
		//	int n = sc.nextInt();
		//	
		//	String result = (n > 0) ? "Positive" : (n < 0) ? "Negative" : "Zero";
		//	System.out.println(result);
		//}
		
		int n = 0;
		
		while(n != 999){
			System.out.println("数字を入力してください。（999で終了）");
			n = sc.nextInt();
			
			if (n == 999){
				break;
			}
			
			String result = (n > 0) ? "Positive" : (n < 0) ? "Negative" : "Zero";
			System.out.println(result);
		}
		
		System.out.println("プログラムが終了しました。");
		sc.close();
   	}
}