import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[9];
        int max =0;
        int max_index = 0;

        for(int i = 0; i<9; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i< 9; i++){
            if(arr[i] > max){
                max = arr[i];
                max_index = i;
            }
        }

        System.out.println(max);
        System.out.println(max_index+1);

    }
}