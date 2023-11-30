import java.util.Scanner;
 
class Node{
	int data;
	Node next;
	Node prev;
}
class DoublyLL{
	static Node head = null;
	static Node temp = null;
 
	static void deleteNode(int data){
		int flag = 0;
		Node pNode = null;
		if(head == null){
			System.out.println("List Empty");
		}
		else{
			while(temp != null){
				if(temp.data == data){
					temp.next.prev = pNode;
					if(pNode != null){
						pNode.next = temp.next;
					}
					flag = 1;
					break;
				}
				pNode = temp;
				temp = temp.next;
			}
			if(flag == 0){
				System.out.println("Node not found");
			}
			temp = head;
			displayList();
		}
	}
	static void createList(int size){
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < size; i++){
			Node newNode = new Node();
			System.out.print(">>>");
			newNode.data = sc.nextInt();
 
			if(head == null){
				newNode.next = newNode.prev = null;
				head = temp = newNode;
			}
			else{
				temp.next = newNode;
				newNode.prev = temp;
				newNode.next = null;
				temp = newNode;
			}
		}
		temp = head;
	}
	static void displayList(){
		if(head == null){
			System.out.println("Empty List. Create one\n");
		}
		else{
			while(temp.next != null){
				System.out.print(temp.data+" --> ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
		temp = head;
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int n = sc.nextInt();
		createList(n);
		displayList(); 
		sc.nextLine();
		while(true){
			System.out.print("Delete element? : ");
			char op = sc.nextLine().charAt(0);
			if(op == 'y'){
				System.out.print("Enter element: ");
				int el = sc.nextInt();
				deleteNode(el);
			}
			else{
				break;
			}
			sc.nextLine();
		}
	}
}
