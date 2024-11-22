package assignments_package;

public class Assignment_55 {

    private String privateVar = "Private";
    String defaultVar = "Default";
    protected String protectedVar = "Protected";
    public String publicVar = "Public";

    void displayAccess() {
        System.out.println(privateVar);
        System.out.println(defaultVar);
        System.out.println(protectedVar);
        System.out.println(publicVar);
    }

    public static void main(String[] args) {
    	Assignment_54 obj = new Assignment_54();
        obj.displayAccess();
    }

}
}
