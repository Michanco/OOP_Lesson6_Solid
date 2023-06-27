public class User {
	private String name;
	
	public User(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void save(){
		Outputable.outSave(name);
	}
	
	public void report(){
		Outputable.outReport(name);
	}
}