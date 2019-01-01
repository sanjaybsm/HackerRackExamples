import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        HashMap<Integer,Integer> sockPair = new HashMap<>();
        Arrays.stream(ar).forEach(x -> sockPair.put(x,sockPair.get(x) != null ?
                Integer.valueOf(sockPair.get(x)+1):Integer.valueOf(1)));
        int pair = 0;
/*
        for(Integer value: sockPair.values()){
            pair = pair+value/2;
        }*/

        pair = sockPair.values().stream().mapToInt(i -> i / 2).sum();

        System.out.println(pair);

        return pair ;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

       /* bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
*/
        scanner.close();
    }
}
