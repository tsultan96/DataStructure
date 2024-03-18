/**
 * Pre
 */
public class Pre {

    public Pre(){

    }

    void preOrdering(char[] tree){
        System.out.println(tree.length);
        preRecur(tree, 0, "root");
    }

    void preRecur(char[] tree, int root, String str){
        if(root >= tree.length || tree[root]=='\0'){
            return;
        }
        else{
            System.out.println(tree[root]+" "+str);
            //root left right

            preRecur(tree, 2*root+1, "left");

            preRecur(tree, 2*root+2, "right");
        }
    }

    public static void main(String[] args) {
        char [] tree = {'T','N', 'L','S','P','X','W'};
        Pre preOrder = new Pre();
        preOrder.preOrdering(tree);
    }
}