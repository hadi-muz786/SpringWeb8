package paccck8;

public class OfficeInf {
	private String name;
	private String Address;
	private String PhoNum;
	private String mail;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhoNum() {
		return PhoNum;
	}

	public void setPhoNum(String phoNum) {
		PhoNum = phoNum;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "OfficeInf [name=" + name + ", Address=" + Address + ", PhoNum=" + PhoNum + ", mail=" + mail + "]";
	}

}
