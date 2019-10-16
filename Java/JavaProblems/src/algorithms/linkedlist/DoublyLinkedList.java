package algorithms.linkedlist;

public class DoublyLinkedList
{
	private DoublyLinkedListNode head;
	
	private DoublyLinkedListNode tail ;
	
	private int length;
	
	public DoublyLinkedList()
	{
		head = new DoublyLinkedListNode(Integer.MIN_VALUE, null, null);
		tail = new DoublyLinkedListNode(Integer.MIN_VALUE,head, null);
		head.setNext(tail);
		length = 0;
	}
	
	public void insertAtBeginning(DoublyLinkedListNode node)
	{
	
	}
	
	public void insertAtEnd(DoublyLinkedListNode node)
	{
		
	}
	
	public void insert(int data, int position)
	{
		
		
	}

	public DoublyLinkedListNode removeFromBegin()
	{
		return null;
	}
	
	public DoublyLinkedListNode removeFromLast()
	{
		return null;
	}
	
	public void removeMatched(DoublyLinkedListNode node)
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
}
