public class LC58{
    public static void main(String[] args) {
        String str = "Hello World";
        String[] arr = str.split(" ");
        String lw = arr[arr.length-1];
        System.out.println(lw.length());
    }
}
