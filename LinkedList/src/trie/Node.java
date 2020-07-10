package trie;

import java.util.HashMap;

public class Node {
	HashMap<Character, Node> map;
	boolean isWord;

	public Node() {
		map = new HashMap<>();
		isWord = false;
	}

	public HashMap<Character, Node> getMap() {
		return map;
	}

	public void setMap(HashMap<Character, Node> map) {
		this.map = map;
	}

	public boolean isWord() {
		return isWord;
	}

	public void setWord(boolean isWord) {
		this.isWord = isWord;
	}

	public boolean contains(char ch) {
		return map.containsKey(ch);
	}

	public void addNode(char ch) {
		if (!map.containsKey(ch)) {
			map.put(ch, new Node());
		}
	}

	public Node getNode(char ch) {
		return map.get(ch);
	}
}
