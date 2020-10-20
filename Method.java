public class Method
{
public static void main(String[] args)
{
System.out.println("invoking another method to print welcome");
printWelcome("WELCOME");
}
public static void printWelcome(String Greeting)
{
System.out.println("Greeting:"+Greeting);
}
}
