public class LC344 {
    public static void main(String[] args) {
        String str = "hello";
        char[] a = str.toCharArray();
        int i = 0, j = a.length - 1;
        while (i < j) {
            char t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
        System.out.println(a);
    }
}
