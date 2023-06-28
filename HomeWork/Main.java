public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		User user2 = new User("John");
		Reportable.report(user);
		Reportable.report(user2);
		Saveble.save(user);
		Saveble.save(user2);

	}
}