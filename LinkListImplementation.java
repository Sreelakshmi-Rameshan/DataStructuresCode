package LinkListImpl;

public class LinkListImplementation { 
		
		// Method to insert a new node 
		public static LinkedList append(LinkedList list, int data) 
		{ 
			// Create a new node with given data 
			Node new_node = new Node(data,null); 
			

			// If the Linked List is empty, 
			// then make the new node as head 
			if (list.head == null) { 
				list.head = new_node; 
			} 
			else { 
				list.tail.next=new_node;
			}
				list.tail=new_node;
				return list; 
		} 

		// Method to print the LinkedList. 
		public static void printList(LinkedList list) 
		{ 
			Node currNode = list.head; 

			System.out.print("LinkedList: "); 

			// Traverse through the LinkedList 
			while (currNode != null) { 
				// Print the data at current node 
				System.out.print(currNode.data + " "); 

				// Go to next node 
				currNode = currNode.next; 
			} 
		} 
		//Method to insert a node at Nth position
		
		public static LinkedList insertAtPosition(LinkedList list,int data,int pos)
		{
			Node new_node=new Node(data,null);
			
		if(list.head==null)
		{
			if(pos==0) {
				list.head=new_node;
			}
			else {
				return null;
			}
		}
			if(list.head!=null && pos==0)
			{
				new_node.next=list.head;
				list.head=new_node;
				return list;
			}
			Node current=list.head;
			Node previous=null;
			int i=1;
			while(i<pos)
			{
				previous=current;
				current=current.next;
				
				if(current==null)
				{
					break;
				}
				i++;
			}
			new_node.next=current;
			previous.next=new_node;
			return list;
		}

		public static void main(String[] args) 
		{ 
			/* Start with the empty list. */
			LinkedList list = new LinkedList(null,null); 

			// 
			// ******INSERTION****** 
			// 

			// Insert the values 
			list = append(list, 1); 
			list = append(list, 2); 
			list = append(list, 5); 
			list = append(list, 1); 
			list = append(list, 2); 
			list = append(list, 0); 
			list = append(list, 1); 
			list = append(list, 1); 

			//list=insertAtPosition(list,15,10);
			//SortLinkedList.sortList(list);
			//DeleteNode.deleteWithoutPrev(n, list);
			// Print the LinkedList 
			printList(list); 
		} 
	} 

