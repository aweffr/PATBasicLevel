package y1001;

/*
 * 1001正确能提交的代码如下
 */

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int inputNum = in.nextInt();
          
    int cnt = 0;
    
    while (inputNum != 1) {
      if (inputNum % 2 == 0) inputNum /= 2;
      else                   inputNum = (3*inputNum + 1) / 2;
      cnt += 1;
    }
    
    System.out.println(cnt);
  }
}