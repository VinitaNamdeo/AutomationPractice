package api.payload;

public class Pet {
	int id;
	String name;
	int statuStatus=0;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStatuStatus() {
		return statuStatus;
	}
	public void setStatuStatus(int statuStatus) {
		this.statuStatus = statuStatus;
	}
}
