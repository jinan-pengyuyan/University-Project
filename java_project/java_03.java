import java.util.Scanner;

public class java_03{
  public static void main(String args[]){
    Scanner reader = new Scanner(System.in);
    System.out.println("请输入楼梯的阶数");
    int n = reader.nextInt();
    int result = climb_stairs(n);
    System.out.println("一共有"+result+"种上楼梯的方法");
  }

public static int climb_stairs(int n){
  int[] ways = new int[n];
  ways[0] = 1;
  ways[1] = 2;
  if(n == 1){
    return ways[0];
  }else if(n == 2){
    return ways[1];
  }else{
    for(int i = 2; i < n; i++){
    ways[i] = ways[i-2] + ways[i-1];
    }
    return ways[n-1];
  }
  
