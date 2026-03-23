import java.util.*;

public class java_08 {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入数组的长度：");
		int n = reader.nextInt();
		int[] height= new int[n];
		System.out.println("请输入你要处理的数组：");
		for(int i = 0; i < n; i++) {
			height[i] = reader.nextInt();
		}
		int result = maxArea(height);
		System.out.println("这个容器能容纳的水的体积为："+ result);
	}
	
	public static int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int max = 0;
		while(left < right) {
			int lessheight = Math.min(height[left], height[right]);
			int area = (right-left) * lessheight;
			max = Math.max(max, area);
			while(height[left] <= lessheight) {
				left++;
			}
			while(height[right] <= lessheight) {
				right--;
			}
		}
		return max;
	}
}
