import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //숫자 N
        int range = 1 ; //벌집의 범위
        int cnt = 1; // 벌집의 겹수

        while(N > range){

            range = range + cnt * 6;
            cnt ++;
        }

        System.out.println(cnt);
    }
}