import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Main04 {

    public static void main(String[] ags){


    }
    ArrayList<ArrayList<Integer>> Print(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        if(root!=null) deque.add(root);
        while (!deque.isEmpty()){
            int size = deque.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i=0; i<size; i++){
                TreeNode node = deque.poll();
                list.add(node.val);
                if(node.left !=null) deque.add(node.left);
                if(node.right !=null) deque.add(node.right);
            }
            if(list.size() >0) res.add(list);
        }
        return res;
    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
