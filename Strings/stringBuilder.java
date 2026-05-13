public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch);
        }
        //abcdefghijklmnop
        //o(26)
        //o(26 *n^2)

        System.out.println(sb);
         System.out.println(sb.length());
        
    }
    
}
