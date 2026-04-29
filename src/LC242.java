public class LC242{
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        if(s.length()!=t.length()){
            System.out.println("Not a Valid anagram");
        }
        int[] freq = new int[26];
        for(int i =0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int j =0;j<freq.length;j++){
            if(freq[j]!=0){
                System.out.println("Not a Valid anagram");
            }
        }
        System.out.println("Valid anagram");
    }
}
