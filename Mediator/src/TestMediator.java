interface MediatorInterface{
	void addUser();
	void send(String msg,User user);
	void receive();
}

class ConcreteMediator implements MediatorInterface{
	private List<User> users;
	public void addUser(User user){
		users.add(user);
	}
	public void send(String msg){
		for (User x: users)
		{
			x.receive(msg);
		}
	}
}
abstract User{
	void setName(String name);
	void sendMSG(String msg);
	void receiveMSG()
	
}




public class TestMediator {

}
