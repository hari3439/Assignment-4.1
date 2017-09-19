public class Acad6 {
    public int foo() {
        return 10;
    }
    public char foo() { // compiler error: foo() is already defined
        return 'a';
    }
    public static void main(String args[])
    { 
    }
}

yes it is possible by same return type.