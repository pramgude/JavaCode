
public class ConcatString {

	public static void main(String[] args) {
		String str1="FirstString";
		String str2="SecondString";
		char[] charArray1=str1.toCharArray();
		char[] charArray2=str2.toCharArray();
		int counter=charArray1.length+charArray2.length;
		char[] charContainer=new char[counter];
		int i=0;
		for(;i<charArray1.length;i++)
		{
			charContainer[i]=charArray1[i];
		}
		for(int j=0;i<counter;j++;i++)
		{
			charContainer[i]=charArray2[j];
		}
		String concat=new String(charContainer);
		System.out.println("String container :"+concat);

	}

}
