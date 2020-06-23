package stackImplementaion;
/**
 * Use an Array to implement 2 stack
 * @author Sri
 *
 */
public class TwoStackUsingArray {
int [] a;
int size;
int s1,s2;

public TwoStackUsingArray(int size)
{
a = new int[size];
s1 = 0;
s2 = a.length - 1;
}
/**
 * 
 * @param value to be inserted into stack
 * @param stackNumber : stack to which data has to be pushed
 * @throws StackFullException :if stack is full
 * @throws IllegalStackException: if the stack number is not 1 or 2
 */
public void push(int value,int stackNumber)throws StackFullException, IllegalStackException
{
	if(stackNumber!=1 || stackNumber!=2)
	{
		throw new IllegalStackException("stack doesnt exist");
	}
	if(s1>s2)
	{
		throw new StackFullException();
	}
	if(stackNumber==s1)
	{
		a[s1]=value;
		s1++;
	}
	else {
		a[s2]=value;
		s2--;
	}
}
	public int pop(int stackNumber) throws StackEmptyException 
	{       
		if (stackNumber != 1 && stackNumber != 2)  
			throw new IllegalArgumentException("Invalid stack number.");   
		if (stackNumber == 1 && s1 > 0)     
			return a[--s1];  
		else if (stackNumber == 2 && s2 < a.length - 1) 
			return a[++s2];    
		
		throw new StackEmptyException();
	}
}

