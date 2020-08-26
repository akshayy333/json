package jsonparsing;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import jsonparsing.model.Address;
import jsonparsing.model.PhoneNumbers;
import jsonparsing.model.UserInfo;

/**
 * @author AKSHAY
 *
 */
public class Example {

	public static void main(String[] args) {

			UserInfo user = createDummyObject();

				ParseJsonUsingJSON parserJson = new ParseJsonUsingJSON();
		String jsonString = parserJson.parseToJson(user);
		System.out.print("Using JSON - JSON as string....\n" + jsonString);

			UserInfo originalObject = parserJson.parseToPojo(jsonString);
		System.out.println("\n\nUsing JSON - JSON to java pojo class....\\n" + originalObject);

		
		ParseJsonUsingGson parser = new ParseJsonUsingGson();
		String originalString = parser.parseToJson(user);
		System.out.print("\n\nUsing Gson JSON as string....\n" + originalString);

		UserInfo userInfo = parser.parseToPojo(jsonString);
		System.out.print("\n\nUsing Gson JSON to java pojo class....\n" + userInfo);

		
		PrintWriter printWriter;
		try {
			printWriter = new PrintWriter("json_example.json");
			printWriter.write(jsonString);
			printWriter.flush();
			printWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	private static UserInfo createDummyObject() {
		UserInfo userInfo = new UserInfo();
		userInfo.setName("AKSHAY");

		Address address = new Address();
		address.setStreet("krishna street");
		userInfo.setAddress(address);

		PhoneNumbers[] phoneNumbers = new PhoneNumbers[2];
		PhoneNumbers ph = new PhoneNumbers();
		ph.setMobile("99887766**");
		phoneNumbers[0] = ph;
		ph = new PhoneNumbers();
		ph.setMobile("88007766**");
		phoneNumbers[1] = ph;
		userInfo.setPhoneNumbers(phoneNumbers);

		return userInfo;
	}
}
