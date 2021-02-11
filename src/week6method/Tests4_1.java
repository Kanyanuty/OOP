package week6method;

public class Tests4_1 {
    public static void main(String[] args)
    {
        System.out.println("Test call method by direct. ");
        Display();
        System.out.println("Test call method by class.");
        Tests4_1.Display();
    }
    public static void Display()
    {
        System.out.println("This line print in method Display.");
    }
}
