import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] mas = {-10,2,1,0,-12,4,100,12};
        Sort(mas);
        System.out.println(Arrays.toString(mas));
    }
        private  static void swap(int[] array, int ind1, int ind2) {
            int tmp = array[ind1];
            array[ind1] = array[ind2];
            array[ind2] = tmp;
        }
    public static void Sort(int[]array){
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
    }

}
