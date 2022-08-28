package Algoritm.recursia;

public class Recurs {
    public static void main(String[] args) {
        char[] arr = new char[]{'h', 'e', 'l', 'l','o'};//'h'->'e'->'l'->'l'->'o'->null;
        for (int i = arr.length-1; i>=0; i--){
            System.out.print("  "+arr[i]);
        }
        print(0,arr);                                   //index =3;
    }                                                        //-------------------------
    public static  void  print(int index, char[] arr){       //index =2;
                if(arr == null || index>=arr.length){        //-------------------------
            return;                                          //index = 1;
        }                                                    //-------------------------
        print(index +1, arr);                          //index =0;
        System.out.print("  " + arr[index]);
    }
}
