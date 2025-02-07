// Problem: Design Add and Search Words Data Structure

class WordDictionary {

    class TrieNode {
        TrieNode children[];
        boolean isLast;
        TrieNode() {
            children=new TrieNode[26];
            isLast=false;
        }
    }

    TrieNode root=new TrieNode();

    public WordDictionary() {
        
    }
    
    public void addWord(String word) {
        TrieNode node=root;
        for(char c:word.toCharArray())
        {
            TrieNode curr=node.children[c-'a'];
            if(curr==null)
            {
                node.children[c-'a']=new TrieNode();
                curr=node.children[c-'a'];
            }
            node=curr;
        }
        node.isLast=true;
    }
    
    public boolean search(String word) {
        return find(0, word, root);
    }

    public boolean find(int index, String word, TrieNode node) {
        if(index==word.length()-1)
        {
            if(word.charAt(index)=='.')
            {
                for(int i=0; i<26; i++)
                {
                    if(node.children[i]!=null && node.children[i].isLast)
                    {
                        return true;
                    }
                }
                return false;
            }

            if(node.children[word.charAt(index)-'a']!=null && node.children[word.charAt(index)-'a'].isLast)
            {
                return true;
            }
            return false;
        }

        if(word.charAt(index)=='.')
        {
            for(int i=0; i<26; i++)
            {
                if(node.children[i]!=null && find(index+1, word, node.children[i]))
                {
                    return true;
                }
            }
            return false;
        }

        if(node.children[word.charAt(index)-'a']!=null)
        {
            return find(index+1, word, node.children[word.charAt(index)-'a']);
        }
        return false;
    }
}
