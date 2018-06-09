import java.util.Base64;
import java.util.UUID;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.ArrayList;
class Base64_
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");

		try	{
			// Encode using basic encoder
			String base64encodedString = Base64.getEncoder().encodeToString("TutorialsPoint?java8".getBytes("utf-8"));
			System.out.println("Base64 Encoded String (Basic) :" + base64encodedString);

			// Decode
			byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
			System.out.println("Original String: " + new String(base64decodedBytes, "utf-8"));

			base64encodedString = Base64.getUrlEncoder().encodeToString("TutorialsPoint?java8".getBytes("utf-8"));
			System.out.println("Base64 Encoded String (URL) :" + base64encodedString);

			StringBuilder stringBuilder = new StringBuilder();
			List string = new ArrayList();
			for (int i = 0; i < 10; ++i) {
				String str = UUID.randomUUID().toString();
				stringBuilder.append(str);
				string.add(str);
			 }
			System.out.println("-------------");
			string.forEach(System.out::println);
			System.out.println("-------------");
			byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
			String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
			System.out.println("Base64 Encoded String (MIME) :" + mimeEncodedString);

		} catch(UnsupportedEncodingException e) {
			System.out.println("Error :" + e.getMessage());
		}
	}
}
