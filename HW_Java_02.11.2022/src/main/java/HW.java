import java.util.Random;

public class HW {
    public static void main(String[] args) {
//        int count = 0;
//        int[] arr = new int[15];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 10);
//            if (arr[i] % 2 == 0) {
//                count++;
//            }
//            System.out.print(arr[i] + " ");
//
//        }
//        System.out.println();
//        System.out.println(count);
//
//    }
        int count = 0;
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (new Random()).nextInt(10);
            if (arr[i] % 2 == 0) {
                count++;
            }
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.println(count);

    }
}