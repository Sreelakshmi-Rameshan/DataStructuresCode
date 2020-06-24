package stackImplementaion;

import java.util.Stack;

public class ExpressionEvaluation {

	static Stack <Integer> operand=new Stack<> ();
	static Stack<Character> operator=new Stack<>();
	
	public static int Evaluate(char[] expression)
	{
		if(expression==null || expression.length==0)
		{
			return -1;
		}
		for(char ch : expression)
		{
			if(isOperand(ch))
			{
			operand.push(ch-'0');	
			}
			else if(isOperator(ch))
			{
				while(!operator.isEmpty()&& precedence(operator.peek())>=precedence(ch))
				{
					process(operator,operand);
				}
				operator.push(ch);
			}
		}
			while(!operator.isEmpty())
			{
				process(operator,operand);
			}
		return operand.pop();
	}

	private static void process(Stack<Character> operator, Stack<Integer> operand) {
		int num2 = operand.pop();
		int num1 = operand.pop();
		char op = operator.pop();
		int result = 0;
		switch(op)
		{        
		case '/': result = num1 / num2;
		break;
		case '*': result = num1 * num2;
		break;
		case '+': result = num1 + num2;
		break;
		case '-': result = num1 - num2;
		break;
		}
		operand.push(result);
	}

	private static int precedence(char ch) {
		switch (ch) {
		case '/':
		case '*':
			return 2;
		case '+':
		case '-':
			return 1;
		default:
			throw new IllegalArgumentException("Invalid operator: " + ch);
		}
	}

	private static boolean isOperator(char ch) {
		return ch == '+' || ch == '-' || ch == '*' || ch == '/';
	}

	private static boolean isOperand(char ch) {
		 return (ch >= '0') && (ch <= '9');
	}
	
	public static void main(String []args)
	{
		char [] exp=new char[9];
		exp[0]='1';
		exp[1]='+';
		exp[2]='2';
		exp[3]='/';
		exp[4]='1';
		exp[5]='+';
		exp[6]='3';
		exp[7]='*';
		exp[8]='2';
		
		System.out.println(exp);
		int result=Evaluate(exp);
		System.out.println(result);
	}
}
