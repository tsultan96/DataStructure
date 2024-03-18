
import java.util.ArrayList;
import java.util.List;

public class Post {
    int val;
    Post left;
    Post right;

    public Post(){

    }

    public Post(int val, Post left, Post right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public List<Integer> Solution(Post root) {
        List<Integer> result = new ArrayList<>();

        if (root == null)
            return result;

        result.addAll(Solution(root.left));
        result.addAll(Solution(root.right));
        result.add(root.val);

        return result;
    }

    public static void main(String[] args) {
        Post root = new Post(1, new Post(2,
                new Post(4, null, null),
                new Post(5, null, null)),
                new Post(3,
                        new Post(6, null, null),
                        new Post(7, null, null)));
        Post postOrder = new Post();
        List<Integer> result = postOrder.Solution(root);
        System.out.println("Post-order traversal result: " + result);
    }
}