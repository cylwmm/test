import java.util.*;


public class Main05 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 计算出每一天感染数量需要等几天才会有降低
     * @param nums int整型一维数组 一段时间内的感染数量数组
     * @return int整型一维数组
     */
    public static void main(String[] args){
        int[] nums = new int[]{2340,2344,2323,2422,1221,1435,1235,1224};
        System.out.println(covid(nums));
    }
    public static int[] covid (int[] nums) {
        // write code here
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length - 1; i++){
            int count = 0;
            for (int j=i+1; j<nums.length; j++){
                if(nums[j] >= nums[i]){
                    count++;
                }else{
                    res[i] = count+1;
                    break;
                }
            }
        }
        return res;
    }
}