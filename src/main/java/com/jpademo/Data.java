package com.jpademo;

import java.util.*;

public class Data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[m];
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ;i< n; i++){
            int x = sc.nextInt();
            nums1[i] =x;
            set.add(x);
        }
        List<Integer> list = new ArrayList<>();

        for(int i = 0 ;i< m; i++){
            int x = sc.nextInt();
            if(set.contains(x)){
                list.add(x);
                set.remove(x);
            }
        }

        list.forEach(System.out::println);




    }
}
