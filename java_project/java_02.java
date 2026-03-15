import java.util.*;

public class java_02 {
	public static void main(String arg[]){
    Scanner reader = new Scanner(System.in);
    System.out.println("请输入排序数的个数：");
    int n = reader.nextInt();
    int[] nums = new int[n];
    System.out.println("请输入要排序的数");
    int i;
    for(i = 0; i < n; i++){
    	nums[i] = reader.nextInt();
    }
    bubble_sort(nums, n);
    for(i = 0; i < n; i++){
      System.out.print(nums[i] + " ");
    }
  }

	public static void bubble_sort(int[] nums ,int n){
    int last;    //当前排序的最后一位
    int sort = n;    //判断是否排序 为 0 时未排序
    int i;
    while(sort > 0){
      last = 0;
      for(i = 1; i < sort; i++){
        if(nums[i-1] > nums[i]){
          int temp = nums[i-1];
          nums[i-1] = nums[i];
          nums[i] = temp;
          last = i;
        }
      }
        sort = last;
        if(sort == 0){
          break;
      }
    }
  }
}
