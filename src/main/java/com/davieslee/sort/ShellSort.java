package com.davieslee.sort;

import com.alibaba.fastjson.JSONObject;

public class ShellSort {

    public static void main(String[] args) {
        int[] data = {3,2,1,0,5,4,6};
        int n = data.length;

        // 为了优化插入排序，进行拆分，然后进行排序
        for(int add = n/2;add >0;add /= 2){
            for(int i=add;i<n;i++){
                int value = data[i];
                int j = i-add;
                for(;j>=0;j-=add){
                    if(data[j] > value){
                        data[j+add] = data[j];
                    }else {
                        break;
                    }
                }
                data[j+add] = value;
            }
        }

        System.out.println(JSONObject.toJSONString(data));
    }
}
