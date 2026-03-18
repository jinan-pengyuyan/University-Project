import java.util.*;

public class java_06 {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入你要处理的字符串：");
		String str = reader.next();
		System.out.println("请输入你要求的行数：");
		int n = reader.nextInt();
		String result = convert(str, n);
		System.out.print("处理的结果为：" + result);
	}

	public static String convert(String str, int n) {
		int len = str.length();
		int t = 2 * n - 2;
		int row = n;
		int col = (len + t - 1) / t * (row - 1);
		if (n == 1 || len <= n) {
			return str;
		}
		char[][] ch = new char[row][col];
		for (int i = 0, x = 0, y = 0; i < len; i++) {
			ch[x][y] = str.charAt(i);
			if (i % t < row - 1) {
				x++;
			} else {
				x--;
				y++;
			}
		}
		StringBuffer result = new StringBuffer();
		for (char[] rs : ch) {
			for (char i : rs) {
				if (i != 0) {
					result.append(i);
				}
			}
		}
		return result.toString();
	}
}
