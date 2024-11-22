package assignments_package;

public class Assignment_74_Encap {
	
	   private int age;
	   public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        if (age > 0) {
	            this.age = age;
	        } else {
	            System.out.println("Age must be positive.");
	        }
	    }

	
	

}
