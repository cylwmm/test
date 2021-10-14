import java.util.*;


class Main01 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param seed char字符型一维数组 字符种子
     * @param size int整型 验证码长度
     * @return string字符串一维数组
     */
    static ArrayList<String> res = new ArrayList<>();
    static StringBuilder tmp = new StringBuilder();
    static boolean[] biaoji;
    public static String[] Permutation (char[] seed, int size) {
        // write code here
        biaoji = new boolean[seed.length];

        backing(seed, size, tmp);
        String[] re = new String[res.size()];

        for (int i=0; i<re.length; i++){
            re[i] = res.get(i);
        }
        return re;
    }
    public static void backing(char[] seed, int size,StringBuilder tmp){
        if(tmp.length() >= size){
            res.add(tmp.toString());    
            return;
        }
        for(int i=0; i<seed.length; i++){
            if(!biaoji[i]){
                biaoji[i] = true;
                tmp.append(seed[i]);
                backing(seed,size,tmp);
                tmp.deleteCharAt(tmp.length() - 1);
                biaoji[i] = false;
            }
        }
    }
    public static void main(String[] args){
        char[] x = new char[]{'0','1','2'};
        Permutation(x,2);
    }
}