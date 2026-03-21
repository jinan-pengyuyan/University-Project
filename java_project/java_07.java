import java.util.*;

public class java_07{
  public static void main(String args[]){
    Scanner reader = new Scanner (System.in);
    System.out.println("请输入要处理的数：");
    int input = reader.nextInt();
    int result = reverse(input);
    System.out.println("处理结果为；" + result);
  }
  public static int reverse(int input){
    int result = 0;
    while(input != 0){
      if(result < Integer.MIN_VALUE / 10 || result > Integer.MAX_VALUE / 10){
        return 0;
      }
      int temp = input % 10;
      input = input /10;
      result = result * 10 + temp;
    }
    return result;
  }
}
