package com.davieslee.sort;

import com.alibaba.fastjson.JSONObject;

public class BubbleSort {

    public static void main(String[] args) {
        int[] data = {3,2,1,0,5,4,6};

        // 左右两个数比较，然后交换位置，一直比较到最后一个数不比较
        for(int i=0;i<data.length-1;i++){
            for(int j=0;j<data.length-1-i;j++){
                if(data[j] > data[j+1]){
                    data[j] = data[j] + data[j+1];
                    data[j+1] = data[j]-data[j+1];
                    data[j] = data[j]-data[j+1];
                }
            }
        }

        System.out.println(JSONObject.toJSONString(data));
    }
}
