import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();

        for(int i =0; i< C; i++){
            int num = sc.nextInt();
            int arr[] = new int[num];
            int sum = 0;

            for(int j = 0; j < num; j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            double avg = sum / num;
            int cnt = 0;

            for(int k = 0; k < num; k++){
               if(arr[k] > avg ) cnt++;
            }

            double result = ((double)cnt /(double)num) * 100;
            System.out.printf("%.3f%%\n", result);

        }

    }
}

