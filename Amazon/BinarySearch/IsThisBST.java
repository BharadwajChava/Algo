/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
boolean checkBST(Node root) {
    
    if(root == null)
        return true;
    List<Integer> l = new ArrayList<Integer>();
    getList(root, l);
    for(int i = 1; i < l.size(); i++){
        if((int)l.get(i-1) >=  (int)l.get(i))
            return false;
    }
    return true;
}

void getList(Node root, List<Integer> l){
    if(root == null)
        return;
    getList(root.left, l);
    l.add(root.data);
    getList(root.right, l);
}
