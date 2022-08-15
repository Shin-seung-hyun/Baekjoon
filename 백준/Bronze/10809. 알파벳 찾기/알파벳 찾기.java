import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        int arr[] = new int [26];

        for(int i =0; i<arr.length; i++){
            arr[i] = -1;
        }

        for(int j =0; j< S.length(); j++) {
            if( arr[S.charAt(j) -'a'] == -1) arr[S.charAt(j) - 'a'] = j;
        }

        for(int k = 0; k < arr.length; k++){
            System.out.printf(arr[k] + " ");
        }

    }
}

