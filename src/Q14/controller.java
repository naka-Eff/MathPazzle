package Q14;

import com.gs.collections.api.list.ImmutableList;

public class controller {
	private static country con = new country();
	private static Q14Logic logic = new Q14Logic();

	public static void main(String[] args) {
		ImmutableList<String> list = con.getCountryList().collect(country -> country.toUpperCase());
		 logic.run(list);
	}

	// ok
	public static void testSearch() {
		Q14Logic searchTest = new Q14Logic();
		String search = searchTest.Search("Brazil");
		System.out.println(search);
		String search2 = searchTest.Search("Croatia");
		System.out.println(search2);
	}
}
