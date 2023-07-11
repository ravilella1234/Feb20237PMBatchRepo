package miscellaneous;

import org.apache.commons.codec.binary.Base64;

public class EncodingAndDecodingStrings 
{

	public static void main(String[] args) 
	{
		String password = "test1234";
		System.out.println("Password : " +  password);
		
		byte[] encodingString = Base64.encodeBase64(password.getBytes());
		System.out.println("encoding String : "+ new String(encodingString));
		
		byte[] decodeString = Base64.decodeBase64(encodingString);
		System.out.println("Decoded String : " +  new String(decodeString));
	}

}
