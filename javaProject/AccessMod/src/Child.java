
public class Child extends Parent {
	String ChildName;
	private int Property;
	
	protected String ChildHobbies;
	
	public Child(String name,String childName, int property) {
		super(name);
		//this.ParentName=ParentName;
		this.ChildName = childName;
		this.Property = property;
	}
	
	

	@Override
	public String toString() {
		return "Child [ChildName=" + ChildName + ", Property=" + Property + "]";
	}



	public int getProperty() {
		return Property;
	}



	public void setProperty(int property) {
		Property = property;
	}



	public void setChildName(String childName) {
		ChildName = childName;
	}



	public void getChildName()
	{
		System.out.println("Child name is public");
	}
	
	private void getChildProperty()
	{
		System.out.println("Chhild property is private");
	}
}
