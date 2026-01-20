import java.util.Scanner;

public class DailyTask {
	public static void main(String[] args) {
		tention();
	}
	public static void tention () {
		Scanner sc = new Scanner(System.in);

		//for(int i = 0; i < 5; i++) {
		//	System.out.println("数字を入力してください。");
		//	int n = sc.nextInt();
		//
		//	String result = (n > 0) ? "Positive" : (n < 0) ? "Negative" : "Zero";
		//	System.out.println(result);
		//}
		int n = 0;
		int count = 0;
		int pCount = 0;
		int nCount = 0;
		int zCount = 0;
		String result;

		while (n != 999) {
			System.out.println("数字を入力してください。（999で終了）");
			n = sc.nextInt();
		if (n == 999) {
				break;
			}

			result = (n > 0) ? "Positive" : (n < 0) ? "Negative" : "Zero";
			System.out.println(result);
			count++;
		if (result.equals("Positive")) {
				pCount++;
			} else if (result.equals("Negative")) {
				nCount++;
			} else {
				zCount++;
			}
		}
		System.out.println("プログラムが終了しました。");
		System.out.println("プログラム実行回数：" + count + "回");
		System.out.println("Positive：" + pCount + "回");
		System.out.println("Negative：" + nCount + "回");
		System.out.println("Zero：" + zCount + "回");
		sc.close();
	}

}