public class MultiplesBelow100{
    public static void main(String[] args) {
        int num = 7;
        for(int i=1; i < 100; i++) {
            if(i % num == 0)
                System.out.println(i);
        }
    }
}