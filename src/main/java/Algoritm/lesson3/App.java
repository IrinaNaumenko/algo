package Algoritm.lesson3;

public class App {
    public static void main(String[] args) {
        int[] arr = {1, 20, 3, 5, 7, 99};

        App app = new App();
        int sumArray = app.sumArray(arr, arr.length - 1);
        System.out.println("Summ=" + sumArray);

        int maxElement = app.maxArray(arr, arr.length - 1);
        System.out.println("Max element = " + maxElement);

    }
        private  int maxArray(int[] array, int index){
        if (index == 0) {
            return  array[0];
        }
        int  element = maxArray(array, index-1);

        return Math.max(array[index], element);//array[index]

            }
    private  int sumArray(int[] array, int index) {
        if(index<0) {
            return  0;
        }
        if (index == 0) {
            return array[0];
        }
                               //array[0];
        return array[index] + sumArray(array, index-1);
    }
}
