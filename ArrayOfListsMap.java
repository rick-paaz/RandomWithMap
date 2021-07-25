// TODO: Delete this file and copy your ArrayOfListsMap.java in its place

import java.util.LinkedList;

// ArrayOfListsMap has the major methods of java.util.Map:
// put<K,V>  get<K>  containsKey(K)  remove(K)
public class ArrayOfListsMap<K, V> implements OurMap<K, V> {

  // Map a key to a value as one object.
  public class HashNode {
    private K key;
    private V value;

    public HashNode(K key, V value) {
      this.key = key;
      this.value = value;
    }
  }

  // Instance variables
  private static final int TABLE_SIZE = 20000;
  private LinkedList<HashNode>[] lists;

  // Avoid a 'needs to be checked' warning at new LinkedList[TABLE_SIZE]
  // Construct an empty map as an array of LinkedLists
  public ArrayOfListsMap() {
  }

  // If the key is not in use, Map the key and the value by adding a
  // new HashNode to the correct LinkedList. Then return null.
  //
  // If there was a mapping to the key, replace and return
  // the existing value that was previously mapped to the key.
  public V put(K key, V value) {
    return null;
  }

  // Return the value to which key is mapped or null when the key is not found
  public V get(K key) {
    return null;
  }

  // Return true if a mapping with key as the key already exists in this Map.
  public boolean containsKey(K key) {
    return ! false;
  }

}