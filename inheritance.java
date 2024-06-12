class ParentClass {
    void display() {
        System.out.println("Parent class method");
    }

}

    class childClass extends ParentClass{
    void show() {
        System.out.println("Child class method");
    }
}

public class inheritance {
    public static void main(String[] args) {
        childClass obj = new childClass();
        obj.display();
        obj.show();
    }
}
