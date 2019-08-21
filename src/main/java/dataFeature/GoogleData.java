package dataFeature;

public class GoogleData {
	
	public String textTest;
	public String textSuggestByGoogle;
	public int registerExpected;
	
	public GoogleData() {
		
		this.textTest = "Pruebaz";
		this.textSuggestByGoogle = "Pruebas";
		this.registerExpected = 6;
	}

	public String getTextTest() {
		return textTest;
	}

	public String getTextSuggestByGoogle() {
		return textSuggestByGoogle;
	}

	public int getRegisterExpected() {
		return registerExpected;
	}

}
