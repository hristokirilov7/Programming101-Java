package problem02;

public class Country {
	private final String mCountryId;
	private final String mName;
	private final boolean mIsDefault;
	private final double mVatTax;
	
	public Country(String CountryId, String name, boolean isDefault, double vatTax) {
		mCountryId = CountryId;
		mName = name;
		mIsDefault = isDefault;
		mVatTax = vatTax;
	}
	
	public Country(Country other) {
		this (other.mCountryId, other.mName, other.mIsDefault, other.mVatTax);
	}

	public String getCountryId() {
		return mCountryId;
	}

	public String getName() {
		return mName;
	}

	public boolean isDefault() {
		return mIsDefault;
	}

	public double getVatTax() {
		return mVatTax;
	}
	
	
}
