1. leetCode最长公共子串问题地址：https://leetcode-cn.com/problems/maximum-length-of-repeated-subarray/comments/
2. leetCode最长公共子序列问题没有描述

## 前言
> 最长公共子串和最长公共子序列是两个问题，他们的定义不一样
> 最长公共子串很好理解就是两个字符串相同的子串长度，比如13467和13469的公共子串是1346
> 通俗理解比如13579和243759的公共子序列是37，35，39，59
## 最长公共子串求解
定义： 最长公共子串很好理解就是两个字符串相同的子串长度，比如13467和13469的公共子串是1346
#### 描述
>给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。

#### 使用动态规划算法
[推荐一篇好理解的文章](https://blog.csdn.net/someone_and_anyone/article/details/81044153)
使用到的关键点：
1. 初始化DP二维数组
2. DP二维数组填充的值对应的状态转移方程![](https://img-blog.csdn.net/20161116111138893)
```java 
class Solution {
    public int findLength(int[] A, int[] B) {
        int max = Integer.MIN_VALUE;
        int[][] dp = new int[A.length][B.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B[0]) {
                dp[i][0] = 1;
            }
            else {
                dp[i][0] = 0;
            }
        }
        for (int j = 0; j < B.length; j++) {
            if (B[j] == A[0]) {
                dp[0][j] = 1;
            }
            else {
                dp[0][j] = 0;
            }
        }
        for (int cow = 1; cow < A.length; cow++) {
            for (int col = 1; col < B.length; col++) {
                if (A[cow] == B[col]) {
                    dp[cow][col] = dp[cow-1][col-1] + 1;
                } 
                max = max > dp[cow][col]? max : dp[cow][col];
            }
        }
        return max;
    }
}
```

## 最长公共子序列
定义：通俗理解比如13579和243759的公共子序列是37，35，39，59
#### 算法解决
[推荐一篇好理解的文章](https://blog.csdn.net/someone_and_anyone/article/details/81044153)
1. 初始化DP二维数组
2. DP二维数组填充的值对应的状态转移方程
![](https://img-blog.csdn.net/20161116110820862)
```java 
class Solution {
    public int findLength(int[] A, int[] B) {
    
        int[][] dp = new int[A.length][B.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B[0]) {
                dp[i][0] = 1;
            }
            else {
                dp[i][0] = 0;
            }
        }
        for (int j = 0; j < B.length; j++) {
            if (B[j] == A[0]) {
                dp[0][j] = 1;
            }
            else {
                dp[0][j] = 0;
            }
        }
        for (int cow = 1; cow < A.length; cow++) {
            for (int col = 1; col < B.length; col++) {
                if (A[cow] == B[col]) {
                    dp[cow][col] = dp[cow-1][col-1] + 1;
                } 
                else {
                    dp[cow][col] = Math.max(dp[cow][col-1] , dp[cow-1][col]);
                }
            }
        }
        return dp[A.length-1][B.length-1];
    }
}
```
