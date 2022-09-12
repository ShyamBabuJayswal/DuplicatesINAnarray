package com.company;

public class Main {
    public static int duplicates(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != arr[j]){
                arr[j+1]=arr[i];
                j++;
            }
        }
    return ++j;
    }


    public static void main(String[] args) {
	// write your code here
//        int[] arr=new int[]{0,0,0,1,1,2,2,3,3,4,4,4};
//        int  ar2=duplicates(arr);
//        System.out.println(ar2);

    }
}
