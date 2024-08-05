
public class tester_boiz {

	public static void main(String[] args) {
		SinglyLinkedList banana = new SinglyLinkedList();
		banana.insertNode(5);
		banana.insertNode(8);
		banana.insertNode(19);
		banana.insertNode(7);
		banana.insertNode(21);
		int counter = 4;
		/*SinglyLinkedListNode last = banana.tail;
		SinglyLinkedListNode current = bana;*/
		for (int y = counter; y >= 0; y--) {
			SinglyLinkedListNode now = banana.head;
			for (int x = 0; x <= y; x++) {
				if(now.next != null) {
					now = now.next;
				}
			}
			printSinglyLinkedList(now,"\n");
		}
	}
	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}
	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}

			this.tail = node;
		}
	}
	public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }

}
