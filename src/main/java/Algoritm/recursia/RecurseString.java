package Algoritm.recursia;

import java.util.Arrays;

public class RecurseString {
    public static void main(String[] args) {
        char[] arr = new char[]{'h', 'e', 'l', 'l','o','w','o','r','l','a'};
        //iteretivnii podhod
        int left = 0;
        int rihght = arr.length-1;
        while (left < rihght) {
            char tmp = arr[left];
            arr[left] =arr[rihght];
            arr[rihght--] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
