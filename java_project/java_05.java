import java.util.*;


public class java_05{
  public static void main(String args[]){
    Scanner reader = new Scanner(System.in);
    System.out.println("请输入要查找的字符串");
    String s = reader.next();
    String substring = find_longest_palindrome(s);
    System.out.println("这段字符串的最长回文子串为"+ substring);
  }

  public static String find_longest_palindrome(String s){
    char[] str = s.toCharArray();
    int begin = 0;
    int maxlen = 1;
    int len = str.length;
    boolean dp[][] = new boolean[len][len];
    for(int i = 0; i < len; i++){
      dp[i][i] = true;
    }
    for(int l = 2; l <= len; l++){
      for(int i = 0; i < len; i++){
        int j = i + l -1;
        if(j >= len) {
        	break;
        }
        if(str[i] == str[j]){
          if(l < 3){
            dp[i][j] = true;
          }else if(dp[i+1][j-1]){
            dp[i][j] = dp[i+1][j-1];
          }
        }
        else{
          dp[i][j] = false;
        }
        if(dp[i][j] && l > maxlen){
          maxlen = l;
          begin = i;
        }
      }
    }
    return s.substring(begin,begin+maxlen);
  }
}
        
          
      

