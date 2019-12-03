
public class Parent {
	String ParentName;
	private int Property;
	
	
	public Parent() {
		
	}
	
	
	  public Parent(String parentName) {
	  
	  this.ParentName = parentName; }
	 

	public Parent(String parentName, int property) {
		this.ParentName = parentName;
		this.Property = property;
	}



	@Override
	public String toString() {
		return "Parent [ParentName=" + ParentName + ", Property=" + Property + "]";
	}



	public int getProperty() {
		return Property;
	}



	public void setProperty(int property) {
		Property = property;
	}



	public void setParentName(String parentName) {
		ParentName = parentName;
	}



	public void getParentName()
	{
		System.out.println("ParentName is public");
	
		
	}
	
	private void getParentProperty()
	{
		System.out.println("Parent property is private ");
	}
	

}
