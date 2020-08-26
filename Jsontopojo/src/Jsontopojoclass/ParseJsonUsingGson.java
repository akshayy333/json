package jsonparsing;

import com.google.gson.Gson;

import jsonparsing.model.UserInfo;

/**
 * @author AKSHAY
 *
 */
public class ParseJsonUsingGson {

	
	public String parseToJson(UserInfo userInfoObject) {

		Gson gson = new Gson();
		String jsonString = gson.toJson(userInfoObject);

		return jsonString;

	}

	public UserInfo parseToPojo(String jsonString) {

		Gson gson = new Gson();
		UserInfo userInfo = gson.fromJson(jsonString, UserInfo.class);

		return userInfo;

	}

}