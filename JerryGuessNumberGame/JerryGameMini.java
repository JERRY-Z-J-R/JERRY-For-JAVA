package cxtc.jk03;  //猜数游戏最少代码实现版本
import java.util.Random;
import java.util.Scanner;
public class JerryGameMini {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++)
            if (login() == true) {jerryGame();  break;}
    }//main()
    public static boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");    String userName = scanner.next();
        System.out.print("请输入密码：");      String password = scanner.next();
        if (userName.equals("周吉瑞") && password.equals("54"))    return true;
        else    return false;
    }//login()
    public static void jerryGame() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        Random rand = new Random();     int randNum = rand.nextInt(100) + 1;
        while (true) {
            if (count >= 7)     break;
            System.out.print("请猜一个1~100的整数：");
            int userNum = scanner.nextInt();    count++;
            if (userNum == randNum)     { System.out.println("才对啦！");   break;}
            else if (userNum < randNum)     System.out.println("猜小啦！" + "还剩下" + (7 - count) + "次");
            else    System.out.println("猜大啦！" + "还剩下" + (7 - count) + "次");
        }//while
    }//jerryGame()
}