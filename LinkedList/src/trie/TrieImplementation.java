package trie;

public class TrieImplementation {
	Node root;

	public TrieImplementation() {
		root = new Node();
	}
	
	public void insert(String word)
	{
		char[] ch = word.toCharArray();
		Node current=root;
		for(int i=0;i<ch.length;i++)
		{
			if(!current.contains(ch[i]))
		
				current.addNode(ch[i]);
			current=current.getNode(ch[i]);	
		}
		current.setWord(true);
	}
	public boolean hasPrefix(String prefix)
	{
		char[] ch=prefix.toCharArray();
		Node current=root;
		for(int i=0;i<ch.length;i++)
		{
			if(!current.contains(ch[i]))
				return false;
			current=current.getNode(ch[i]);
		}
		return true;
		}
	public boolean hasWord(String word)
	{
		char[] ch=word.toCharArray();
		Node current=root;
		for(int i=0;i<ch.length;i++)
		{
			if(!current.contains(ch[i]))
				return false;
			current=current.getNode(ch[i]);
		}
		return current.isWord();
		}
}
