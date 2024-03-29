package app;

@Entity("user")
public class User {
	
	@Field(columnName="id", isKey=true)
	private long id;
	
	@Field
	private String name;
	
	@Field
	private String password;
	
	private int sequence;
	
	public User(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
}
