package com.company;

/**
 * Created by douqing on 17-5-12.
 */
public class exce5 {

    public int search(int port) {
        int i = 0;
        int[] arr1 = new int[12];
        while (++i < port) {
            if (arr1[1] > port) {
                return arr1[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {


        int port = 10;
        exce5 e5 = new exce5();
        e5.search(port);
    }
}
