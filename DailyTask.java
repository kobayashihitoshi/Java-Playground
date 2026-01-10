import java.util.Scanner;
	public class DailyTask {
    	public static void main(String[] args) {
    		System.out.println("数字を入力してください。");
    		Scanner sc = new Scanner(System.in);
    		int n = sc.nextInt();
        	
        	String result = (n > 0) ? "Positive" : (n < 0) ? "Negative" : "Zero";
        	
        	System.out.println(result);
    	}
	}