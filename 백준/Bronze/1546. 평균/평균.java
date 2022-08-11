import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double avg = 0;
        double score[] = new double[N];

        for(int i = 0 ; i < N; i++){
            score[i] = sc.nextDouble();
        }

        Arrays.sort(score);

        double M = score[N-1];

        for(int j = 0; j< score.length; j++){
            score[j] = (score[j] / M ) * 100;
            avg += score[j];
        }

        avg = avg / N;

        System.out.println(avg);

    }
}

