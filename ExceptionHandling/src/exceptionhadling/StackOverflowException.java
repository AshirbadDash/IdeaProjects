package exceptionhadling;

public class StackOverflowException
{
    public static void main(String[] args) {
        //stackoverflow error
        add();
    }
    Static void add()
    {
        add();
    }
}
