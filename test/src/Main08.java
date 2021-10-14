public class Main08 {
        public static void main(String[] args){
            String res =  change("123 welcome to Innovation works.");
            System.out.println(res);
        }
        public static String change (String str) {
            // write code here
            String[] str1 = str.split(" ");
            StringBuffer res = new StringBuffer();
            for (int i=str1.length-1; i>=0; i--){
                res.append(str1[i]).append(" ");
            }
            return new String(res).trim();
        }
}