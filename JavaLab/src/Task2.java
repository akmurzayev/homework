public class Task2 {
    int arr[];
    public static void findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            else if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
