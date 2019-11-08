package app;
 
/**
 * Modifier
 */
class Modifier {
    
    void defaultMethod() {
        System.out.println(" ini adalah default method");
    }

    public void publicMethod() {
        System.out.println("ini adalah public method");
    }

    protected String privateMethod() {
        return "ini adaalah private method";
    }

    protected void protectedMethod() {
        System.out.println("ini adalah protected method");
    }

    final void finalMethod() {
        System.out.println("ini adalah final method");
    }

    static void staticMethod() {
        System.out.println(" ini adalah static method");
    }
 
}
