
public class Child  {
	 int childAge;
	 String childName;
	Parent parent;
	
	 public Child(int childAge,String childName) {
		
		this.childAge=childAge;
		this.childName=childName;
	}
	 

	public int getChildAge() {
		return childAge;
	}


	public void setChildAge(int childAge) {
		this.childAge = childAge;
	}


	public String getChildName() {
		return childName;
	}


	public void setChildName(String childName) {
		this.childName = childName;
	}

	@Override
	public String toString() {
		return "Child [childAge=" + childAge + ", childName=" + childName + "]";
	}


	public static void main(String[] args) {
		// parent=new Parent(45,"IT",60.9);
		Child c=new Child(33,"IT");
		System.out.println(c);
		

}
}