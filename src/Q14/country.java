package Q14;

import java.util.Arrays;

import com.gs.collections.api.list.ImmutableList;
import com.gs.collections.impl.factory.Lists;

public class country {
	private static ImmutableList<String> country = Lists.immutable.ofAll(Arrays.asList("Brazil", "Croatia",
			"Mexico", "Cameroon", "Spain", "Netherlands", "Chile", "Australia", "Colombia", "Greece",
			"Cote d'lvoire", "Japan", "Uruguay", "Costa Rica", "England", "ltaly", "Switzerland", "Ecuador",
			"France", "Honduras", "Argentina", "Bosnia and Herzegovina", "lran", "Nigeria", "Germany",
			"Portugal", "Ghana", "USA", "Belgium", "Algeria", "Russia", "Korea Republic"));
	public country() {

	}

	public ImmutableList<String> getCountryList(){
		return country;
	}
}
