
public class minute {

	public static void main(String[] args) {
		int value_min = 3456789;
		int year = value_min/(60*24*365);
		int rem = value_min%(60*24*365);
		int days = rem/(60*24);
		System.out.println(value_min+" minutes is approximately "+year+ " years and "+days+" days");
         
	}

}
