
public class TestString {

	public static void main(String[] args) {
		
		String str1 = "Aaron is a programmer";
        String str2 = "Aaron is not programmer";

        boolean value = str1.endsWith(str2);

        
        System.out.println(value);
        System.out.println(str1.contains(str2));
	}
}
