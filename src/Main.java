public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 9, 4, 99, 120, 1, 3, 10};

        System.out.println("Array antes de ordenar:");
        QuickSort.printArray(arr);

        QuickSort.quickSort(arr, 0, arr.length - 1);

        System.out.println("\nArray después de ordenar:");
        QuickSort.printArray(arr);
    }
}

