package Algoritm.recursia;

import java.util.Arrays;

public class Podhod2 {
    public static void main(String[] args) {
        char[] arr = new char[]{'h', 'e', 'l', 'l','o',' ', 'w','o','r','l','d'};
        //iteretivnii podhod
        int left = 0;
        int rihght = arr.length-1;
        while (left < rihght) {
            char tmp = arr[left];
            arr[left++] =arr[rihght];
            arr[rihght--] = tmp;
        }
        System.out.println(Arrays.toString(arr));

        reverse(0, arr.length -1, arr);

        System.out.println(Arrays.toString(arr));
    }
    private static void reverse( int left, int right, char[] chars){
        if( left >= right) {
            return;
        }
        char tmp = chars[left];
        chars[left] =chars[right];
        chars[right] = tmp;
        reverse(left+1, right-1, chars);

    }
}
