package sep_05;
class Node
{
	int data;
	Node nextNode;
	public Node(int data)
	{
		this.data = data;
		this.nextNode=null;
	}
}
class SingleLinkedList 
{
	  
	  Node Head=null;
	  Node Tail=null;
	  int size =0;
	  public void insert(int data)
	  {
		Node n = new Node(data);
	    if(size==0)
	    {
	    	Head=n;
	    	
		 }
	    else if(size>0)
	    {
	    	Tail.nextNode =n;
	    }
	    Tail=n;
    	size++;
	  }
	  
	  public void getHead(int data) 
	  {
	        if(size == 0) 
	        {
	            System.out.println("List is empty");
	            return;
	        }
	        else 
	        {

	            if(Head.data == data) 
	            {
	                Head = Head.nextNode;
	                return;
	            }
	        
	        }    
	    }

	    public void getTail() 
	    {
	        System.out.println("tail value:"+Tail.data);
	    }

	    public void getSize() 
	    {
	        System.out.println(size);
	    }
	    
	    
	  public void display()
	  {
		  Node currentNode = Head;
		  if(size == 0)
		  {
			  System.out.println("list is empty");
		      return;
		  }
		  System.out.println("nodes of single linked list:");
		  while(currentNode!=null)
		  {
			 System.out.println(currentNode.data + " ");
			 currentNode = currentNode.nextNode;
		  }
		  System.out.println();
		  
	  }
	  
	  
	  public void find(int data) 
	  {
	        if(size > 0) {

	            if(Head.data == data || Tail.data == data) 
	            {
	                System.out.println("exists");
	                return;
	            }

	            Node curNode = Head;
	            while(true) 
	            {
	                if(curNode.data == data) 
	                {
	                    System.out.println("exists");
	                    return;
	                }
	                
	                if(curNode.nextNode == null) {
	                    System.out.println("not exists");
	                	break;
					}else {
						curNode = curNode.nextNode;
					}
	            }
	        }
	        else 
	        {
	            System.out.println("List is empty");
	        }
	  }

	  
	  
	   public void delete(int data) 
	   {

	        if(size == 0) 
	        {
	            System.out.println("List is empty");
	            return;
	        }
	        else 
	        {

	            if(Head.data == data) {
	                Head = Head.nextNode;
	                return;
	            }

	            Node prevNode = null;
	            Node curNode = Head;

	            while(curNode.nextNode != null) 
	            {

	                if(curNode.data == data) 
	                {
	                    prevNode.nextNode = curNode.nextNode;
	                    size--;
	                    return;
	                }
	                else 
	                {
	                    prevNode = curNode;
	                    curNode = curNode.nextNode;
	                }
	            }

	            if(curNode.data == Tail.data) 
	            {
	                Tail = prevNode;
	                size--;
	                if(size == 1) 
	                {
	                    Head.nextNode = null;
	                }
	            }
	        }

	    }
	   
	   
	  	  public static void main(String[] args)
	  {
		SingleLinkedList sl = new  SingleLinkedList();
		sl.insert(1);
		sl.insert(2);
		sl.insert(3);
		sl.insert(4);
		sl.getHead(1);
		//sl.getTail();
		
		sl.display();
		sl.delete(3);
		sl.display();
		//sl.display();
		//sl.find(2);
		sl.getTail();
		sl.getSize();
		sl.find(4);
		
	  }
	  

}


