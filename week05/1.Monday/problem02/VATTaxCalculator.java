package problem02;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class VATTaxCalculator {
	private HashMap<Integer,CountryVatTax> VATTaxes;
	private CountryVatTax defaultVATTax;

	public VATTaxCalculator(HashMap<Integer,CountryVatTax> VATTaxes, CountryVatTax defaultVATTax) {
		this.VATTaxes = new HashMap<>();
		this.VATTaxes.putAll(VATTaxes);
		defaultVATTax = new CountryVatTax(defaultVATTax);
	}
	
	public VATTaxCalculator(HashMap<Integer,CountryVatTax> VATTaxes) {
		this (VATTaxes, null);
	}
	
	public Double CalculateTax(double price, int countryId) throws FileNotFoundException {
		if (VATTaxes.containsKey(countryId))
		{
			return price * VATTaxes.get(countryId).getVATTax();
		}
		return CalculateTax(price);
	}

	public Double CalculateTax(double price) throws FileNotFoundException {
		if (defaultVATTax != null)
		{
			return price * defaultVATTax.getVATTax();
		}
		throw new FileNotFoundException("Not supported country.");
	}
}
