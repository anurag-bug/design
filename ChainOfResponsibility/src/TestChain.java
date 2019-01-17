interface Chain{
	public abstract void process(Number number);
	public abstract void setNext(Chain nextInChain);
}
class Number{
	private int value;
	public Number(int value)
	{
		this.value=value;
	}
	public int getValue()
	{
		return value;
	}
}
class NegativeProcessor implements Chain{
	private Chain nextInChain;
	public void setNext(Chain next)
	{
		this.nextInChain=next;
	}
	public void process(Number number)
	{
		if (number.getValue()<0)
		{
			System.out.println("Negative Processor"+number.getValue());
		}
		else
		{
			nextInChain.process(number);
		}
	}
	
}
class ZeroProcessor implements Chain{
	private Chain nextInChain;
	public void setNext(Chain next)
	{
		this.nextInChain=next;
	}
	public void process(Number number)
	{
		if(number.getValue()==0)
		{
			System.out.println("Zero Processor"+number.getValue());
		}
		else
		{
			nextInChain.process(number);
		}
	}
}
class PositiveProcessor implements Chain{
	private Chain nextInChain;
	public void setNext(Chain next)
	{
		this.nextInChain=next;
	}
	public void process(Number number)
	{
		if (number.getValue()>0)
		{
			System.out.println("Positive Processor"+number.getValue());
		}
	}
	
}
public class TestChain {
	public static void main(String args[]){
		Number n1= new Number(-1);
		Number n2= new Number(0);
		Number n3= new Number(2);
		
		NegativeProcessor p1= new NegativeProcessor();
		ZeroProcessor p2= new ZeroProcessor();
		PositiveProcessor p3 = new PositiveProcessor();
		p1.setNext(p2);
		p2.setNext(p3);
		p1.process(n1);
		p1.process(n2);
		p1.process(n3);
		
	}

}
