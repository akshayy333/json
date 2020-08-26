package jsonparsing;

import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import jsonparsing.model.PhoneNumbers;
import jsonparsing.model.UserInfo;

/**
 * @author AKSHAY
 *
 */
public class ParseJsonUsingJSON {

	
	public String parseToJson(UserInfo userInfoObject) {
		JSONObject jo = new JSONObject();
		jo.put("name", userInfoObject.getName());

		Map<String, String> m = new LinkedHashMap<String, String>(4);
		m.put("street", userInfoObject.getAddress().getStreet());
		jo.put("address", m);

		JSONArray ja = new JSONArray();
				PhoneNumbers[] phs = userInfoObject.getPhoneNumbers();
		for (PhoneNumbers pn : phs) {
			m = new LinkedHashMap<String, String>(2);
			m.put("mobile", pn.getMobile());
			ja.add(m);
		}
		jo.put("phoneNumbers", ja);

		String jsonString = jo.toJSONString();

		return jsonString;

	}

	
	public UserInfo parseToPojo(String jsonString) {
		JSONParser parser = new JSONParser();
		UserInfo user = new UserInfo();
		try {

			JSONObject json = (JSONObject) parser.parse(jsonString);
			String name = (String) json.get("name");
			user.setName(name);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return user;
	}

}