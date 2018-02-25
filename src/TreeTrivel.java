import java.util.*;

public class TreeTrivel {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    // 测试
    public static void main(String[] args)
    {
        TreeTrivel aa = new TreeTrivel();
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        /*
         * ArrayList<Integer> postorder = aa.postorderTraversal(treeNode1); for
         * (Integer temp : postorder) { System.out.print(temp + " "); }
         * System.out.println();
         */
        /*
         * ArrayList<Integer> preorder = aa.preorderTraversal(treeNode1); for
         * (Integer temp : preorder) { System.out.print(temp + " "); }
         * System.out.println();
         */

        /*
         * ArrayList<Integer> inorder = aa.inorderTraversal(treeNode1); for
         * (Integer temp : inorder) { System.out.print(temp + " "); }
         * System.out.println();
         */

        /*
         * ArrayList<Integer> inorder = aa.inorder(treeNode1); for (Integer temp
         * : inorder) { System.out.print(temp + " "); } System.out.println();
         */
//        ArrayList<Integer> postorder = aa.postorder(treeNode1);
//        for (Integer temp : postorder)
//        {
//            System.out.print(temp + " ");
//        }
//        System.out.println();
        Stack <node>pathstack=new Stack();
        node n=node.getInitNode();
        TreeTrivel  tool=new TreeTrivel();
        tool.iteratorNode(n, pathstack);
    }

    ArrayList<Integer> res = new ArrayList<Integer>();

    /*
     * 递归中序遍历
     */
    public ArrayList<Integer> inorder(TreeNode root)
    {
        if (root == null)
        {
            return this.res;
        }
        inorder1(root);
        return this.res;
    }

    private void inorder1(TreeNode root)
    {
        if (root == null)
        {
            return;
        }
        inorder1(root.left);
        this.res.add(root.val);
        inorder1(root.right);
    }

    /*
     * 非递归中序遍历 最重要的是判断结点p有没有作结点,若有则p.left进栈,并使p.left=null,否则将p.val保存到链表中,并判断p.
     * right是否为null 若不为null则把p.right进栈
     */
    public ArrayList<Integer> inorderTraversal(TreeNode root)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (root == null)
        {
            return res;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.empty())
        {
            TreeNode temp = stack.peek();
            if (temp.left == null)
            {
                TreeNode p = stack.pop();
                res.add(p.val);
                if (p.right != null)
                {
                    stack.push(temp.right);
                }

            }
            else
            {
                stack.push(temp.left);
                temp.left = null;
            }
        }
        return res;
    }

    /*
     * 递归后序遍历
     */
    public ArrayList<Integer> postorder(TreeNode root)
    {
        if (root == null)
        {
            return this.res;
        }
        postorder1(root);
        return this.res;
    }

    private void postorder1(TreeNode root)
    {
        if (root == null)
        {
            return;
        }
        postorder1(root.left);
        postorder1(root.right);
        this.res.add(root.val);
    }

    /*
     * 非递归后序遍历 思路:要保证根结点在其左孩子和右孩子访问之后才能访问,因此对于任一结点p,先将其入栈.
     * 如果p不存在左孩子和右孩子,则可直接访问;否则将p的右孩子和左孩子依次入栈然后把p的左右孩子结点赋值null,这样就保证了每次取栈顶的元素的时候
     * 左孩子在右孩子前面被访问, 左孩子和右孩子都在根结点前面被访问
     */
    public ArrayList<Integer> postorderTraversal(TreeNode root)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (root == null)
        {
            return res;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty())
        {
            TreeNode temp = stack.peek();
            if (temp.left == null && temp.right == null)
            {
                TreeNode pop = stack.pop();
                res.add(pop.val);
            }
            else
            {
                if (temp.right != null)
                {
                    stack.push(temp.right);
                    temp.right = null;
                }
                if (temp.left != null)
                {
                    stack.push(temp.left);
                    temp.left = null;
                }
            }
        }
        return res;
    }

    /*
     * 递归前序遍历
     */
    public ArrayList<Integer> preorder(TreeNode root)
    {
        if (root == null)
        {
            return this.res;
        }
        preorder1(root);
        return this.res;
    }

    private void preorder1(TreeNode root)
    {
        if (root == null)
        {
            return;
        }
        this.res.add(root.val);
        preorder1(root.left);
        preorder1(root.right);
    }

    // 非递归前序遍历
    /*
     * p.val直接保存到链表中,然后判断p.right是否为null若不为null则将p.right进栈 然后判断
     * p.left是否为null若不为null则将p.left进栈
     */
    public ArrayList<Integer> preorderTraversal(TreeNode root)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (root == null)
        {
            return res;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.empty())
        {
            TreeNode temp = stack.pop();
            res.add(temp.val);

            if (temp.right != null)
            {
                stack.push(temp.right);
            }
            if (temp.left != null)
            {
                stack.push(temp.left);
            }
        }
        return res;
    }

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int height=0;
        Queue<TreeNode> Q  =new LinkedList<>();
        Q.add(root);
        while (!Q.isEmpty()){
            height++;
            int curLevelSize=Q.size();
            int cnt=0;
            while (cnt<curLevelSize){
                TreeNode temp = Q.poll();
                cnt++;
                if(temp.left!=null){
                    Q.add(temp.left);
                }
                if(temp.right!=null){
                    Q.add(temp.right);
                }
            }
        }
        return height;
    }

    private void levelOrder(TreeNode root){
        if (root==null){
            return;
        }
        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);
        while (!Q.isEmpty()){
            TreeNode temp = Q.poll();
            System.out.println(temp.val);
            if(temp.left!=null){
                Q.add(temp.left);
            }
            if(temp.right!=null){
                Q.add(temp.right);
            }
        }
    }

    Map<String,List> pathMap=new HashMap();//记录所有从根节点到叶子结点的路径
    private void print(List lst)//打印出路径
    {
        Iterator it=lst.iterator();
        while(it.hasNext())
        {
            node n=(node)it.next();
            System.out.print(n.getText()+"-");
        }
        System.out.println();
    }
    public void iteratorNode(node n,Stack<node> pathstack)
    {
        pathstack.push(n);//入栈
        List childlist=n.getChildList();
        if(childlist==null)//没有孩子 说明是叶子结点
        {
            List lst=new ArrayList();
            Iterator stackIt=pathstack.iterator();
            while(stackIt.hasNext())
            {
                lst.add(stackIt.next());

            }
            print(lst);//打印路径
            pathMap.put(n.getText(), lst);//保存路径信息
            return;
        }else
        {
            Iterator it=childlist.iterator();
            while(it.hasNext())
            {
                node child=(node)it.next();
                iteratorNode(child,pathstack);//深度优先 进入递归
                pathstack.pop();//回溯时候出栈
            }

        }

    }
}
