interface Iterator{
	boolean hasNext();
	Object next();
}
class OrderIterator implements Iterator{
	Order[] orders;
	int pos=-1;
	
	public OrderIterator(Order[] orders){
		this.orders=orders;
	}
	public Order next(){
		pos=pos+1;
		return orders[pos];
	}
	public boolean hasNext(){
		if(pos>=orders.length-1)
		return false;
		return true;
	}
	
}
class Order{
	public int orderId;
	public int price;
	public Order(int id,int price) {
		this.orderId=id;
		this.price=price;
	}
}
interface Collection{
	 Iterator createIterator();
}
class OrderCollection implements Collection{
	private Order[] orders=new Order[3];
	int max_items=3;
	public OrderCollection() {
		orders[0]=new Order(10,100);
		orders[1]=new Order(11,200);
		orders[2]=new Order(12,300);
	}
	public Iterator createIterator() {
		return new OrderIterator(orders);
	}
}
public class IteratorTest {
	public static void main(String args[]) {
		Collection oc = new OrderCollection();
		Iterator iterator=oc.createIterator();
		while(iterator.hasNext()) {
			Order order = (Order)iterator.next();
			System.out.println(order.orderId);
		}
	}

}
