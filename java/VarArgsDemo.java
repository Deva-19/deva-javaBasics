class VarArgsDemo {
	
	static public void team(int...number) {
		for(int i : number)  {
			System.out.println(i + "");
		}
	}
	public static void main(String[] args) {
		// VarArgsDemo varArgsDemo = new VarArgsDemo();
		// varArgsDemo.team(3,4,6,8);
		team(3,4,6,8);
	}
}