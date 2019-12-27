package Tree;

import utils.TreeNode;

public class Problem40 {
    public boolean IsBalanced_Solution(TreeNode root) {
        return process(root).isB;
    }

    public static ReturnData process(TreeNode head){
        if(head==null){
            return new ReturnData(true,0);//若为空，平衡
        }
        ReturnData leftData=process(head.left);
        if(!leftData.isB){
            return new ReturnData(false,0);//若左为否，平衡
        }
        ReturnData rightData=process(head.right);
        if(!rightData.isB){
            return new ReturnData(false,0);//若右为否，平衡
        }
        if(Math.abs(leftData.h-rightData.h)>1){
            return new ReturnData(false,0);
        }
        return new ReturnData(true,Math.max(leftData.h,rightData.h)+1);
    }
    //定义递归数据返回结构
    public static class ReturnData{
        public boolean isB;//是否平衡
        public int h;//高度
        public ReturnData(boolean isB,int h){
            this.isB=isB;
            this.h=h;
        }
    }
}
