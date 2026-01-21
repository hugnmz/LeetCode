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
    }

}
/*
class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n -1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                String r = s.substring(0, i) + s.substring(i + 1);
                String r1 = s.substring(0, j) + s.substring(j + 1);
                return checkPali(r) || checkPali(r1);


            }
            i++; j--;
        }

        return true;
    }

    private boolean checkPali(String string){
        int m = string.length() - 1;
        int i = 0;
        int j =m;
        while(i < j){
            if(string.charAt(i) != string.charAt(j)) return false;
            else{
                ++i; --j;
            }
        }
        return true;
    }
}
 */

//sdfsdf