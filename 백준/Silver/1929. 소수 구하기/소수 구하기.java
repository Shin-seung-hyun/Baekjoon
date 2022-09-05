
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        for(int i =M; i <=N; i++){
            boolean check = false;

            if( i == 1 )continue;
            else if( i == 2 ) System.out.println(2);
            else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        check = true;
                        break;
                    }

                }
                if (check == false) System.out.println(i);
            }
        }

    }
}
