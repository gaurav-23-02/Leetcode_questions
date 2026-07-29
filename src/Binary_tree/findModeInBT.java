package Binary_tree;

import java.util.*;

public class findModeInBT {
    public static class  TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static TreeNode buildTree(Integer[]arr){
        if(arr.length==0||arr[0]==null){
            return null;
        }
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int i=1;
        while(!queue.isEmpty()&&i<arr.length){
            TreeNode curr =queue.poll();
            if(i<arr.length){
                if(arr[i]!=null){
                    curr.left=new TreeNode(arr[i]);
                    queue.add(curr.left);
                }
                i++;
            }
            if(i<arr.length){
                if(arr[i]!=null){
                    curr.right=new TreeNode(arr[i]);
                    queue.add(curr.right);
                }
                i++;
            }
        }
        return root;
    }
    public static int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode>st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            list.add(curr.val);
            if(curr.right!=null)st.push(curr.right);
            if(curr.left!=null)st.push(curr.left);
        }
        System.out.println(list);
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<list.size();i++){
            map.put(list.get(i),map.getOrDefault(list.get(i),0)+1);
        }
        System.out.println(map);
        int max=0;
        for(int x:map.values()){
            if(x>max){
                max=x;
            }
        }
        ArrayList<Integer>ans1=new ArrayList<>();
        System.out.println(max);
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==max){
                ans1.add(entry.getKey());
            }
        }
        System.out.println(ans1);

        int[]ans = new int[ans1.size()];
        int idx=0;
        for(int x:ans1){
            ans[idx++]=x;
        }
        return ans;
    }


    public static void main(String[] args) {
        Integer[]root1 = {1,null,2,2};
        TreeNode root = buildTree(root1);
        System.out.println(findMode(root));

    }
}
