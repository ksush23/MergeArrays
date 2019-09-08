import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int[]arr1 = new int[n1];
        for (int i = 0; i < n1; i++){
            arr1[i] = scanner.nextInt();
        }

        int n2 = scanner.nextInt();
        int[]arr2 = new int[n2];
        for (int i = 0; i < n2; i++){
            arr2[i] = scanner.nextInt();
        }

        System.out.println(Arrays.asList(mergeArrays(arr1, arr2)));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[]resultA = new int[a1.length + a2.length];

        int i = 0, j = 0;
        int k = 0;
        while (i != a1.length && j != a2.length){
            if (a1[i] <= a2[j]){
                resultA[k] = a1[i];
                i++;
            }
            else{
                resultA[k] = a2[j];
                j++;
            }
            k++;
        }

        while (i != a1.length){
            resultA[k] = a1[i];
            k++;
            i++;
        }

        while (j != a2.length){
            resultA[k] = a2[j];
            k++;
            j++;
        }

        return resultA;
    }
}
