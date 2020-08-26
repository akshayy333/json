## Convert java object to jsong string and jsong string to java object - JSON
json Dependency
<!-- https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple -->
		<dependency>
			<groupId>com.googlecode.json-simple</groupId>
			<artifactId>json-simple</artifactId>
			<version>1.1.1</version>
		</dependency> 
	
## Convert java object to jsong string and jsong string to java object - Gson
Gson Dependency
<!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
		<dependency>
			<groupId>com.google.code.gson</groupId>
			<artifactId>gson</artifactId>
			<version>2.8.5</version>
		</dependency>
		

		// example using JSON
		// Step1 - a - convert java object to json string
		ParseJsonUsingJSON parserJson = new ParseJsonUsingJSON();
		String jsonString = parserJson.parseToJson(user);
		System.out.print("Using JSON - JSON as string....\n" + jsonString);

		// Step1 - b - convert jsong string to java object
		UserInfo originalObject = parserJson.parseToPojo(jsonString);
		System.out.println("\n\nUsing JSON - JSON to java pojo class....\\n" + originalObject);

		// Preferred approach- writing less code
		// example using google gson
		// Step2 a - java object to json string
		ParseJsonUsingGson parser = new ParseJsonUsingGson();
		String originalString = parser.parseToJson(user);
		System.out.print("\n\nUsing Gson JSON as string....\n" + originalString);

		// Step2 - b - convert jsong string to java object
		UserInfo userInfo = parser.parseToPojo(jsonString);
		System.out.print("\n\nUsing Gson JSON to java pojo class....\n" + userInfo);

## References-
### Convert json string to Java pojo classes   
http://pojo.sodhanalibrary.com/
### Online view json - json formater
http://jsonviewer.stack.hu/

