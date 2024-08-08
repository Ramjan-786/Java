package var_args;
//Note :- refer mam readme day10_help "string_date_varargs".
public class Test {

	public static void main(String... args) {
         testVarArgs(); 
         testVarArgs(new String[] {"aa","bb","cc"});
         testVarArgs("one","two","three");
	}
	
	private static void testVarArgs(String ...strings) {
		System.out.println("Strings :");
		for(String s : strings)
			System.out.println(s+"");
		System.out.println();
	} 

}
