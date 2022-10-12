package com.ggollinder.util;

import java.security.MessageDigest;

public class EncryptionUtil {

	// MD5
	public String getMD5(String pwd) {
		
		String MD5 = "";
		
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(pwd.getBytes());
	        byte byteData[] = md.digest();
	        
	        StringBuffer sb = new StringBuffer();
	        for (int i = 0; i < byteData.length; i++) {
	            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
	        }
	        
	        MD5 = sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
			MD5 = null;
		}
        
		return MD5;
	}
	
	// SHA256
	public String getSHA256(String pwd) {
		
		String SHA = "";
		
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(pwd.getBytes("UTF-8"));
			
			StringBuffer hexString = new StringBuffer();
			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}
			
			SHA = hexString.toString();
		} catch(Exception e) {
			e.printStackTrace();
			SHA = null;
		}
		
		return SHA;
	}
	
}
