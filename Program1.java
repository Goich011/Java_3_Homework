// Реализовать алгоритм сортировки слиянием.


import java.util.Arrays;

class Program1 {
    public static void main(String[] args) {
        int[] numbers = new int[] {15, 1, 10, 2, 8, -5, 19, 7, 6, 15, 10, 0, 1, -1, -7};
        int[] sorted = mergeSort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(sorted));
    }

    private static int[] mergeSort(int[] numbers, int begin, int end) {
        if (begin == end)
            return new int[] { numbers[begin] };

        int mid = (begin + end) / 2;
        int[] left = mergeSort(numbers, begin, mid);
        int[] right = mergeSort(numbers, mid + 1, end);

        int[] result = new int[end - begin + 1];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int resultIndex = 0; resultIndex < result.length; resultIndex++) {
            if (leftIndex >= left.length)
            {
                result[resultIndex] = right[rightIndex++];
            } else if (rightIndex >= right.length)
            {
                result[resultIndex] = left[leftIndex++];
            } else if (left[leftIndex] < right[rightIndex]) {
                result[resultIndex] = left[leftIndex++];
            } else {
                result[resultIndex] = right[rightIndex++];
            }
        }

        return result;

    }

}