package encapsulation;

public class Crown {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setName("suresh");
		System.out.println("Name = "+ e.getName());
		e.setEid(1010);
		System.out.println("Employee Id = "+e.getEid());

	}

}
