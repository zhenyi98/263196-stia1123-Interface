public class Method1 implements MyInterface {
    @Override
    public void sayHello(){
        System.out.println("Hello Methodl");
    }

    public static void main(String[] args) {
        Method1 Method1 = new Method1();
        Method1.sayHello();
    }

}