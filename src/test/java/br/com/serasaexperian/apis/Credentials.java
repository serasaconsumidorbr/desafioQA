package br.com.serasaexperian.apis;

public enum Credentials {
	
	BEAR("<<YOUR_BEAR>>"),
	API_KEY("<<YOUR_API_KEYS>>");
	
	private String value;

	Credentials(String value){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
