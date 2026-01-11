package com.jpademo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        m = sc.nextInt();
        int[] nums = new int[m];
        for(int i = 0; i< m; i++){
            nums[i] = sc.nextInt();
        }
        int n = nums.length;
        List<String> list = new ArrayList<>();
        int j = 0;
        for(int i = 0; i<n-1; i++){
            if( nums[i + 1] - nums[i] != 1){
                if( nums[i] == nums[j]){
                    list.add(String.valueOf(nums[j]));
                }else{
                    list.add(nums[j] + "->" + nums[i]);
                }

                j = i + 1;
            }
        }

        if(n > 0){
            if(nums[n - 1] == nums[j]){
                list.add(String.valueOf(nums[j]));
            }else{
                list.add(nums[j] + "->" + nums[n - 1]);
            }
        }

        for(String s : list){
            System.out.println(s);
        }
    }

}