package algorithms.linkedlist;

/**
 * 
 * @author Vivek
 *
 */
public class LinkedList
{
	private LinkedListNode head;
	
	private int length = 0;
	
	public LinkedList()
	{
		this.length = 0;
	}

	/**
	 * Insert the node at the beginning.
	 * 
	 * @param node
	 */
	public void insertAtBeginning(LinkedListNode node)
	{
		if(head == null)
		{
			head = node;
			return;
		}
		
		node.setNext(head);
		head = node;
		length++;
		
	}
	
	public void insertAtEnd(LinkedListNode node)
	{
		if(head == null)
		{
			head = node;
		}
		else
		{
			LinkedListNode currentnode = head;
			
			while(currentnode.getNext() != null)
			{
				currentnode = currentnode.getNext();
			}
			
			currentnode.setNext(node);
		}
	}
	
	public void insert(int data, int position)
	{
		if(head == null)
		{
			head = new LinkedListNode(data);
		}
		if(position > length)
		{
			position = length;
		}
		if(position < 0)
		{
			position = 0;
		}
		
		LinkedListNode current, previous = head;
		int pos =0;
		while(pos <= position)
		{
			
		}
		
	}
	
	public LinkedListNode removefrombegin()
	{
		return null;
	}
	
	public LinkedListNode removefromLast()
	{
		return null;
	}
	
	public void removeMatched(LinkedListNode node)
	{
		
	}
	
	public void remove(int position)
	{
		
	}
	
	public String toString()
	{
		return "";
	}
	
	public int getlength()
	{
		return length;
	}
	
	public int getPosition(int data)
	{
		return -1;
	}
	
	/**
	 * Clear the list/ remove everything from the linked List.
	 */
	public void clearList()
	{
		head = null;
		length = 0;
		
	}

	private static int listLength(LinkedListNode linkedListNode)
	{
		int length = 0;
		LinkedListNode head= linkedListNode;
		
		while(head != null)
		{
			length++;
			head= head.getNext();
		}
		return length;
	}
	
	public static void main(String[] args)
	{
		LinkedListNode linkedListNode = new LinkedListNode(1);
		System.out.println(listLength(linkedListNode));
	}
}
