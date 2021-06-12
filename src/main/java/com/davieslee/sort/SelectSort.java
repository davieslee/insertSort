package com.davieslee.sort;

import com.alibaba.fastjson.JSONObject;

public class SelectSort {

    public static void main(String[] args) {
        int[] data = {3,2,1,0,5,4,6};

        // 从第一个数开始，与后面的数进行比较，有小的就保存它的下标，然后替换
        for(int i=0;i<data.length-1;i++){
            int index = i;
            for(int j=i+1;j<data.length;j++){
                if(data[j] < data[index]){
                    index = j;
                }
            }
            swap_(data,index,i);
        }

        System.out.println(JSONObject.toJSONString(data));
    }

    private static void swap_(int[] data, int index, int i) {
        int temp = data[i];
        data[i] = data[index];
        data[index] = temp;
    }
}
