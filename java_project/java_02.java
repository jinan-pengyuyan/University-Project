import java.util.*

public class java_o2{
  public static viod main(String arg[]){
    Scanner reader = new Scanner(System.in);
    int n = reader.nextInt();
    int[] nums = new int[n];
    bubble_sort(nums, n);
    for(int i = 0; i < n; i++){
      System.out.print(num[i] + " ");
    }
  }

  public void bubble_sort(int[] nums ,int n){
    int last;    //当前排序的最后一位
    int sort = n;    //判断是否排序 为 0 时未排序
    while(sort > 0){
      last = 0;
      for(int i = 1, i < sort, i++){
        if(nums[i-1] > nums[i+1]){
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
