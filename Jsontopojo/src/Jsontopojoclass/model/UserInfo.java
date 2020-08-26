package jsonparsing.model;

public class UserInfo {
	private Address address;

	private String name;

	private PhoneNumbers[] phoneNumbers;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PhoneNumbers[] getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(PhoneNumbers[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "UserInfo [address = " + address + ", name = " + name + ", phoneNumbers = " + phoneNumbers + "]";
	}
}