class Hello{
public static String greet(String name){
return "Welcome to devops lab" + " " +name;
}
public static void main(String[] args){
System.out.println(greet(args[0]));
}
}
