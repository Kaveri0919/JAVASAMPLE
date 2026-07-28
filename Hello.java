class Hello{
	public static void main(String[] args){
		String name=System.getenv("USERNAME_VAR");
		if(name!=null){
			System.out.println("HELLO,"+" " +name);
		}
		else {
			System.out.println("Environment Variable not set!");
		}
	}	
}	
