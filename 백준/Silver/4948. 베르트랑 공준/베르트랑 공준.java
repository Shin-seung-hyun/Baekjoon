import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int cnt = 0;
            if(n == 0) break;

            boolean check[] = new boolean[2*n +1]; // 0 ~ 2n

            //false 가 소수 true 가 소수가 아닌 수
            check[0] = true;
            check[1] = true;

            //에라토스테네스의 체
            for (int i = 2; i <= Math.sqrt(check.length); i++) {
                //이미 체크한 것이라면
                if(check[i] == true) continue;

                for( int j = i * i; j< check.length; j = j+i){
                    check[j] = true;
                }

            }

            //n보다 크고, 2n보다 작거나 같은 소수
            for(int i = n+1; i< check.length; i++){
                if(check[i] == false) cnt++;
            }
            System.out.println(cnt);

        }

    }
}