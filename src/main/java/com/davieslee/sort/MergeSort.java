package com.davieslee.sort;

import com.alibaba.fastjson.JSONObject;

public class MergeSort {

    public static void main(String[] args) {
        int[] data = {3,2,1,0,5,4,6};
        sort_(data,0,data.length-1);
        System.out.println(JSONObject.toJSONString(data));
    }

    private static void sort_(int[] data, int left, int right) {
       if(left < right){
           int mid = (left+right)/2;
           // 拆分
           sort_(data,left,mid);
           sort_(data,mid+1,right);
           // 合并
           merge_(data,left,mid,right);
       }
    }

    private static void merge_(int[] data, int left, int mid, int right) {
        // 利用一个空数组来装排好序的
        int[] temp = new int[data.length];
        int loc = left;// 空数组的下标
        int ll = left;
        int rr = mid+1;
        while (ll <= mid && rr <= right){
            if (data[ll] < data[rr]){
                temp[loc++] = data[ll++];
            }else {
                temp[loc++] = data[rr++];
            }
        }
        while(ll <= mid){
            temp[loc++] = data[ll++];
        }
        while(rr <= right){
            temp[loc++] = data[rr++];
        }

        for(int i=left;i<=right;i++){
            data[i] = temp[i];
        }
    }
}
