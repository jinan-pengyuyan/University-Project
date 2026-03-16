import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class java_04 {
	public static void main(String arg[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入要计算的字符串");
		String str = reader.next();
		int result = find_longest_subString(str);
		System.out.println("这段字符串的最长不含重复的字串的长度为：" + result);
	}

	public static int find_longest_subString(String str) {
		Set<Character> hasappeal = new HashSet<Character>();
		int n = str.length();
		int rk = -1;
		int result = 0;
		for (int i = 0; i < n; ++i) {
			if (i != 0) {
				hasappeal.remove(str.charAt(i));
			}
			while (rk + 1 < n && !hasappeal.contains(str.charAt(rk + 1))) {
				hasappeal.add(str.charAt(rk + 1));
				++rk;
			}
			result = Math.max(result, rk - i + 1);
		}
		return result;
	}
}
