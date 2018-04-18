class Employee {
	private int id;
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	// @Override
	public String toString() {
		return "id=" + id +"\n"
				+ "name=" + name +"\n";
	}
	
	
	public static void main(String[] args) {
		Employee employee = new Employee("deva");
		
		for(int i = 0; i <= 9; i++) {
			employee.setId(i);
			System.out.println(employee);
		}
			
	
	
	}
	
}