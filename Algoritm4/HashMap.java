package Algoritm4;

public class HashMap<K, V> {

	private static final int INT_BUCKET_COUNT = 16;
	private Bucket[] buckets;
	private int size;
	private static final double LOAD_FACTOR = 0.5;

	public int getSize() {
		return size;
	}

	class Entity {
		K key;
		V value;
	}

	class Bucket<K, V> {
		Node head;

		class Node {
			Node next;
			Entity value;
		}

		public V add(Entity entity) {
			Node node = new Node();
			node.value = entity;
			if (head != null) {
				Node currentNode = head;
				while (true) {
					if (currentNode.value.key.equals(entity.key)) {
						V buf = (V) currentNode.value.value;
						currentNode.value.value = entity.value;
						return buf;
					}
					if (currentNode.next != null) {
						currentNode = currentNode.next;
					} else {
						currentNode.next = node;
						return null;
					}
				}
			}
			head = node;
			return null;
		}

		public V get(K key) {
			Node node = head;
			while (node != null) {
				if (node.value.key.equals(key)) {
					return (V) node.value.value;
				}
				node = node.next;
			}
			return null;
		}

		public V delete(K key) {
			if (head == null)
				return null;
			if (head.value.key.equals(key)) {
				V buf = (V) head.value.value;
				head = head.next;
				return buf;
			} else {
				Node node = head;
				while (node.next != null) {
					if (node.next.value.key.equals(key)) {
						V buf = (V) node.next.value.value;
						node.next = head.next.next;
						return buf;
					}
					node = node.next;
				}
				return null;
			}
		}
	}

	private int calculateIndex(K key) {
		return Math.abs(key.hashCode()) % buckets.length;
	}

	private void recalculation() {
		size = 0;
		Bucket<K, V>[] old = buckets;
		buckets = new Bucket[size * 2];
		for (int i = 0; i < old.length; i++) {
			Bucket<K, V> bucket = old[i];
			if (bucket != null) {
				Bucket.Node node = bucket.head;
				while (node != null) {
					put((K) node.value.key, (V) node.value.value);
					node = node.next;
				}
			}
			old[i] = null;
		}
	}

	public V put(K key, V value) {
		if (buckets.length * LOAD_FACTOR <= size) {
			recalculation();
		}
		int index = calculateIndex(key);
		Bucket bucket = buckets[index];
		if (bucket == null) {
			bucket = new Bucket();
			buckets[index] = bucket;
		}
		Entity entity = new Entity();
		entity.key = key;
		entity.value = value;
		V res = (V) bucket.add(entity);
		if (res == null) {
			size++;
		}
		return res;
	}

	public V get(K key) {
		int index = calculateIndex(key);
		Bucket bucket = buckets[index];
		if (bucket == null)
			return null;
		return (V) bucket.get(key);
	}

	public V delete(K key) {
		int index = calculateIndex(key);
		Bucket bucket = buckets[index];
		if (bucket == null)
			return null;
		V res = (V) bucket.delete(key);
		if (res != null) {
			size--;
		}
		return res;
	}

	public HashMap() {
		buckets = new Bucket[INT_BUCKET_COUNT];
	}

	public HashMap(int initCount) {
		buckets = new Bucket[initCount];
	}
}
