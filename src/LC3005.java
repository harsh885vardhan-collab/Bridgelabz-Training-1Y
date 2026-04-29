package com.gla.strings;
public class LC3005 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3, 2, 3, 4};
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;
            int c = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    c++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + "-:" + c);
        }
    }
}
