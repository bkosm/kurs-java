package zajecia23;

public enum AuthStatus {
	BAD_LOGIN("Zostal podany bledny login"),
	BAD_PASSWORD("Zostalo podane bledne haslo"),
	BAD_FILE("Blad podczas dostepu do pliku"),
	EMPTY_FIELD("Oba pola musza byc uzupelnione"),
	SUCCESS("Logowanie udane");
	
	private String message;
	
	private AuthStatus(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
