package com.CA.login;

import org.apache.commons.codec.binary.Base64;

public class Encrypt {

	public static void main(String[] args) {
	String str="Shumu@9634";
	
	
	byte[] encodeString=Base64.encodeBase64(str.getBytes());
	System.out.println("encode string: "+new String(encodeString));

	}

}
