import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); 

        for(int i = 0; i < T; i++){
            int R = Integer.parseInt(sc.next());
            String str = sc.next(); 
            String P [] = new String[str.length() * R];

            for(int j =0; j < P.length; j +=R ){
                for(int k = 0 ; k< R; k++){
                    P[j + k] = Character.toString(str.charAt(j/R));
                }
            }

            for(int k = 0; k < P.length; k++){
                System.out.print(P[k]);
            }
            System.out.println();

        }

    }
}

