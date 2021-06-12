package com.davieslee.sort;


import com.alibaba.fastjson.JSONObject;

public class InsertSort {

    public static void main(String[] args) {
        int[] data = {3,2,1,0,5,4,6};

        for(int i=1;i<data.length;i++){
            int value = data[i];
            int j =i-1;
            for(;j>=0;j--){
                if(data[j] > value){
                    data[j+1] = data[j];
                }else {
                    break;
                }
            }
            data[j+1] = value;
        }
        System.out.println(JSONObject.toJSONString(data));
    }

}
