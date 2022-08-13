public class Main {
    public static void main(String[] args) {

        int index = 10000;
        boolean[] number = new boolean[index];

        for(int i=0; i<number.length; i++) {

            if(d(i+1) < index+1)

                number[d(i+1)-1] = true;
        }

        //셀프 넘버 출력 부분
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<number.length; i++) {
            if(number[i] == false) {
                sb.append(i+1).append('\n');
            }
        }
        System.out.println(sb);

    }

    public static int d(int num){

        int sum = num;

        while(num !=0){
            sum = sum + (num % 10);
            num = num / 10;
        }

        return sum;

    }

}

