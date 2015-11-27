
public class problem24 {

	public static String decodeUrl(String input){
		String decoded = "";
		for (int i = 0; i < input.length(); i++)
		{
			if (input.charAt(i) == '%')
			{
				String tmp = "";
				for (int j = 0; j < 2; j++)
					tmp += input.charAt(i+j+1);
				if (tmp.equals(new String ("20")))
				{
					decoded += " ";
					i += 2;
					continue;
				}
				if (tmp.equals(new String ("3A")))
				{
					decoded += ":";
					i += 2;
					continue;
				}
				if (tmp.equals(new String ("3D")))
				{
					decoded += "?";
					i += 2;
					continue;
				}
				if (tmp.equals(new String ("2F")))
				{
					decoded += "/";
					i += 2;
					continue;
				}
			}
			decoded += input.charAt(i);
		}
		return decoded;
	}

	public static void main(String[] args) {
		System.out.println(decodeUrl("kitten%20pic.jpg"));
	}

}
