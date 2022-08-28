package lesson3_1;

public class AppDS {
    public static void main(String[] args) {
        int[] arr ={ 45, 20, 15, 15, 7, 60};
        AppDS appDS = new AppDS();
        int maxElement = appDS.maxArray(arr, 0, arr.length);
        System.out.println("Max element = " + maxElement);
    }
    private  int maxArray(int[] array, int index, int end){
        if (index == end-1) {
            return  array[index];
        }

        int mid = (end+index) / 2;
        int maxLeft = maxArray(array, index, mid);
        int maxRight = maxArray(array, mid, end) ;

        //int  element = maxArray(array, index-1);
        return Math.max(array[index], Math.max(maxLeft, maxRight));

    }
}
