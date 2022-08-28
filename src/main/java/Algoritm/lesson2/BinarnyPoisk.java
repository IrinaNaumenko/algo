package Algoritm.lesson2;

public class BinarnyPoisk {
    public static void main(String[] args) {
        int[] arr = {-5, -2, 0, 4, 6, 6, 6, 7, 8, 12, 15, 16, 21, 24, 30};

        int target = 6;

        System.out.println(search(arr, target));

    }

    private  static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target) {

                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return left;
    }
}
