package in.co.rays.inheritance;

public class ParkingSlot {
	
	
	private int id;
	private String name;
	private String vechiltype;
	private String vechilnumber;
	private String entrytime;
	private boolean occupiced;
	
	
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
	public String getVechilType() {
		return vechiltype;
	}
	public void setVechilType(String vechiltype) {
		this.vechiltype = vechiltype;
	}
	public String getVechilNumber() {
		return vechilnumber;
	}
	public void setVechilNumber(String vechilnumber) {
		this.vechilnumber = vechilnumber;
	}
	public String getEntryTime() {
		return entrytime;
	}
	public void setEntryTime(String entrytime) {
		this.entrytime = entrytime;
	}
	public boolean isOccupiced() {
		return occupiced;
	}
	public void setOccupiced(boolean occupiced) {
		this.occupiced = occupiced;
	}
	

}
