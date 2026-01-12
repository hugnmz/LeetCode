package com.jpademo;

import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // functional interface là 1 interface có duy nhất 1 phương thức truừ tượng
        // lambda: dung để đơn giản hóa cách triển khai của funcitonal interfaces/ Mình chỉ cần khai báo cách triển
        // khai của funcitonal interface và xử dụng nó mà ko cần phải tạo lớp triển khai
            /*
                ko cần cung cấp modifier - return type - tên phương thức
             */

        // sau khi dùng lambda
        Animal cat2 = (firstName, lastName) -> {
            return firstName + " " + lastName;
        }; // chỉ áp dụng vs phương thức
        // có 1
        // tham só

        String name = cat2.speak("Tom", "Nguyễn");
        System.out.println(name);


        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .forEach(System.out::println);
        System.out.println("-------------");
        int ans = list.stream()
                .filter(n -> n > 5)
                .reduce(0, Integer::sum);

        System.out.println(ans);
        List<String> animal = Arrays.asList("dog", "cat", "bird", "fish", "elephant", "panda", "monkey");

        List<String> longWords = animal.stream()
                .filter(a -> a.length() > 3)
                .collect(Collectors.toList());
        System.out.println(longWords);

        List<String> lo = animal.stream().toList();
    }
}
//ádasdasdasdasdaqsd
//ádadhiuqwdhg

//
//        public int missingNumber(int[] nums) {
//            int n=nums.length;
//            for(int i=0;i<nums.length;i++){
//                n+=i-nums[i];
//            }
//            return n;
//        }
