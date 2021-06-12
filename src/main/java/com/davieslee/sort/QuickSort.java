package com.davieslee.sort;

import com.alibaba.fastjson.JSONObject;

public class QuickSort {

    public static void main(String[] args) {
        int[] data = {3,2,1,0,5,4,6};

        // 选出基准数，快排的核心就是边比较边排序，先从后往前，再从前往后，优化点就是选一个好的基准数
        sort_(data,0,data.length-1);

        System.out.println(JSONObject.toJSONString(data));
    }

    private static void sort_(int[] data, int left, int right) {
        int base = data[left];
        int ll = left;
        int rr = right;
        while (ll < rr){
            while (ll < rr && data[rr] >= base){
                rr--;
            }
            if(ll<rr){
                data[ll] = data[ll]+data[rr];
                data[rr] = data[ll]-data[rr];
                data[ll] = data[ll]-data[rr];
                ll++;
            }
            while (ll < rr && data[ll] < base){
                ll++;
            }
            if(ll<rr){
                data[ll] = data[ll]+data[rr];
                data[rr] = data[ll]-data[rr];
                data[ll] = data[ll]-data[rr];
                rr--;
            }
        }
        if(left < ll){
            sort_(data,left,ll-1);
        }
        if(rr < right){
            sort_(data,ll+1,right);
        }
    }
}
