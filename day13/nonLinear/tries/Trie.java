package DSA.nonLinear.tries;

import java.util.Arrays;
import java.util.List;

class TrieNode{
    TrieNode[] children;
    boolean wordEnd;
    TrieNode(){
        wordEnd=false;
        children=new TrieNode[26];
    }
}
public class Trie {
    //insert &Search
    //aryan->{a,r,y,a,n}
    static void insertWord(TrieNode root,String word){
        /*we will start with root &check if the node exists
        If exists,we will traverse vis the node
        if not,we will create the node
         */
        TrieNode curr=root;
        for(char ch:word.toCharArray()){
            if(curr.children[ch-'a']==null){
                //null means node is not present
                //so we create a node of that character
                curr.children[ch-'a']=new TrieNode();
            }
            //Move to the children node for next character
            curr=curr.children[ch-'a'];
        }
        curr.wordEnd=true;//we have inserted word
    }
    static boolean searchWord(TrieNode root,String word){
        TrieNode curr=root;
        for(char ch: word.toCharArray()){
            if(curr.children[ch-'a']==null){
                //The first letter (node) doesn't exist
                //so the whole word is not present
                return false;
            }
            curr=curr.children[ch-'a'];

        }
        return curr.wordEnd;//If true-exists or else false
    }
    static boolean startsWith(TrieNode root,String prefix){
        TrieNode curr=root;
        for(char ch: prefix.toCharArray()){
            if(curr.children[ch-'a']==null){
                //The first letter (node) doesn't exist
                //so the whole prefix is not present
                return false;
            }
            curr=curr.children[ch-'a'];

        }
        return true;//If true-exists or else false
    }

    public static void main(String[] args) {
        TrieNode root=new TrieNode();
        List<String> inputWords= Arrays.asList("sam","ram","shyam","sun","man");
        for(String word:inputWords){
            insertWord(root,word);
        }
        List<String> searchWords= Arrays.asList("sam","mam","shyam","manju","ranju");
        for(String word:searchWords){
            if(searchWord(root,word)){
                System.out.println(word +"present in trie");
            }else{
                System.out.println(word +"not present in trie");
            }
        }
        System.out.println(startsWith(root,"ma"));
        System.out.println(startsWith(root,"sa"));
        System.out.println(startsWith(root,"ya"));
    }}
