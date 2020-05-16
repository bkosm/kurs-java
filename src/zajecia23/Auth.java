package zajecia23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class Auth {
	final private String FILE_PATH = "./baza-danych.txt";
	
	public Auth() {
	}
	
	public AuthStatus verify(String username, String password) {
		
		if (username == null || password == null || username.trim().isEmpty() || password.trim().isEmpty()) {
			return AuthStatus.EMPTY_FIELD;
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
			String line;
			
			while ((line = br.readLine()) != null) {
				String[] pair = line.split(";");
				
				if (pair[0].equals(username)) {
					
					String hash = createHash(password);
					
					if ((hash != null) && pair[1].equals(hash)) {
						return AuthStatus.SUCCESS;
					} else {
						return AuthStatus.BAD_PASSWORD;
					}
				}
			}
			
			return AuthStatus.BAD_LOGIN;
			
		} catch (IOException e) {
			return AuthStatus.BAD_FILE;
			
		}	
	}
	
	private String createHash(String password) {
		
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(password.getBytes());
			
			byte[] digest = md.digest();
			String hash = DatatypeConverter.printHexBinary(digest).toLowerCase();
			
			return hash;
			
		} catch (NoSuchAlgorithmException e) {
			return null;
		}	
	}
}
