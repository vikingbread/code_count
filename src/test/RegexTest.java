package test;
/** 
 * @author  Viking
 * @version ����ʱ�䣺2013-10-1 ����10:37:52 
 * 
 */
public class RegexTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("".matches("\\s*"));
		System.out.println("   \n".matches("\\s+"));
		System.out.println("strat with \"//\" is "+"//fafd ".startsWith("//"));
		
		String str = " a  fadfafdsf".trim();
		System.out.println(str);
		System.out.println(str.matches(".*"));
		System.out.println("flag");

	}

}