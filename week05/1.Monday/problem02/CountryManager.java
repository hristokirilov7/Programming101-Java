package problem02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountryManager {
	private static CountryManager sCountryManager;
	private HashMap<String, Country> mCountries = new HashMap<>();

	private CountryManager() {

	}

	public static CountryManager getInstance() {
		if (sCountryManager == null) {
			sCountryManager = new CountryManager();
		}
		return sCountryManager;
	}
	

	public void changeDefaultCountry(Country defaultCountry) {
		// git pull
	}
}
