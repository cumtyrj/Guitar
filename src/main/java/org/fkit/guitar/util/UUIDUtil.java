package org.fkit.guitar.util;

import java.util.UUID;

public class UUIDUtil {

	public static String generate(){
		String uuidString = UUID.randomUUID().toString();
		String idString = uuidString.replace("-","");
		return idString;
	}
}
