package enums;

import java.util.*;

public class EnumTwoPowerExample {
	public enum AccessRights {
		ALLOW_INSPECTION_INSTALLED_CONFIGURATION_PROFILES(1 << 0),
		ALLOW_INSTALLATION_REMOVAL_CONFIGURATION_PROFILES(1 << 1),
		ALLOW_DEVICE_LOCK_PASSCODE_REMOVAL(1 << 2),
		ALLOW_DEVICE_ERASE(1 << 3),
		ALLOW_QUERY_DEVICE_INFORMATION(1 << 4),
		ALLOW_QUERY_NETWORK_INFORMATION(1 << 5),
		ALLOW_INSPECTION_INSTALLED_PROVISIONING_PROFILES(1 << 6),
		ALLOW_INSTALLATION_REMOVAL_PROVISIONING_PROFILES(1 << 7),
		ALLOW_INSPECTION_INSTALLED_APPLICATIONS(1 << 8),
		ALLOW_RESTRICTION_QUERIES(1 << 9),
		ALLOW_SECURITY_QUERIES(1 << 10),
		ALLOW_SETTINGS_MANIPULATION(1 << 11),
		ALLOW_APP_MANAGEMENT(1 << 12);
		
		private final int permissionFlagValue;
		
		AccessRights(int permissionFlagValue) {
			this.permissionFlagValue = permissionFlagValue;
		}
		
		public int getPermissionFlagValue() {
			return permissionFlagValue;
		}
	}
	
	
	private Set<AccessRights> getAll() {
		Set<AccessRights> permissions = EnumSet.allOf(AccessRights.class);
		
		
		return permissions;
	}
	
	public void setTest() {
		System.out.println(AccessRights.ALLOW_APP_MANAGEMENT.permissionFlagValue);
	}
	
	
	
	public static void main(String args[]) {
		EnumTwoPowerExample e = new EnumTwoPowerExample();
		//System.out.println(enumTwoPowerExample.getAll());
		
		e.setTest();
		
		
	}
	
}
