package problem02;

public final class CountryVatTax {
	private final int countryId;
	private final double VATTax;
	private final boolean IsDefault;

	public CountryVatTax(int countryId, double VATTax, boolean isDefault) {
		this.countryId = countryId;
		this.VATTax = VATTax;
		this.IsDefault = isDefault;
	}
	
	public CountryVatTax(CountryVatTax other) {
		this (other.countryId, other.VATTax, other.IsDefault);
	}

	public int getCountryId() {
		return countryId;
	}

	public double getVATTax() {
		return VATTax;
	}

	public boolean getIsDefault() {
		return IsDefault;
	}
}
