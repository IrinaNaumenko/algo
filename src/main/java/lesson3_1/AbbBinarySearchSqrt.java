package lesson3_1;

public class AbbBinarySearchSqrt {
    public static void main(String[] args) {
        int number = 12;
        AbbBinarySearchSqrt abbBinarySearchSqrt = new AbbBinarySearchSqrt();
        System.out.println("Is square ?" + abbBinarySearchSqrt.isSquare(number));

    }
    private boolean isSquare(int number) {
        if(number <2){
            return  true;
        }
        int left = 1;
        int righr =16;
        int mid = 0;
        while (left<=righr) {
            mid = left +(righr-left)/2;
            if(mid*mid == number) {
                return true;
            }
            if(mid*mid > number){
                righr = mid -1;
            } else {
                left = mid+1;
            }
        }
        return false;
    }
}
