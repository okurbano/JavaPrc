package encapsulation;

public class Employee {
	
	private String name;
	private int eid;
	
	public void setName(String x)
	{
		name=x;
		
	}
	
	public String getName()
	{
		return name;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}


}
