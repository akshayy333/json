package jsonparsing.model;

/**
 * @author AKSHAY
 *
 */
public class PhoneNumbers {
	private String mobile;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "PhoneNumbers [mobile = " + mobile + "]";
	}
}
