package com.codewars.findgcf;

/**
 * Created by boysbee on 9/8/2016 AD.
 */
public class GCF {
    public int find(int a, int b) {
        return b == 0 ? a : find(b, a % b);
    }
}
