class Node{
    Node links[] = new Node[26];
    boolean flag = false;
    public Node(){

    }
    boolean containsKey(char ch){
        return links[ch-'a']!=null;
    }
    void put(char ch,Node node){
        links[ch-'a']=node;
    }
    Node get(char ch){
        return links[ch-'a'];
    }
    boolean setEnd(){
        flag=true;
        return flag;
    }
    boolean isEnd(){
        return flag;
    }
}

class WordDictionary {
    private Node root;
    public WordDictionary() {
        root = new Node();
    }
    
    public void addWord(String word) {
        Node node = root;
        for(int i=0;i<word.length();i++){
            if(!node.containsKey(word.charAt(i)) && word.charAt(i) != '.')
                node.put(word.charAt(i),new Node());
            node = node.get(word.charAt(i));
        }
        node.setEnd();
    }
    
    public boolean search(String word) {
        
        
        return searchHelper(word, root, 0);
        // Node node = root;
        // for(int i=0;i<word.length();i++){
        //     if(word.charAt(i) == '.'){ 
        //         continue; 
        //     } 
        //     if(!node.containsKey(word.charAt(i)))
        //         return false;
        //     node = node.get(word.charAt(i));
        // }
        // if(node.isEnd() || word.charAt(word.length()-1) == '.')
        //     return true; 
        // return false;
    }
    private boolean searchHelper(String word, Node node, int index) {
    if (index == word.length()) {
        return node.isEnd();
    }

    char currentChar = word.charAt(index);
    if (currentChar == '.') {
        // If current character is a wildcard, check all child nodes
        for (Node child : node.links) {
            if (child != null && searchHelper(word, child, index + 1)) {
                return true;
            }
        }
        return false;
    } else {
        // If current character is not a wildcard
        if (!node.containsKey(currentChar)) {
            return false;
        }
        return searchHelper(word, node.get(currentChar), index + 1);
    }
}
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */