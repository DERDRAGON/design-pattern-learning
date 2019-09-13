package com.der.simpleFactoryMode.version1;

public class Bird {
	
	private static final Wing[] wings = new Wing[2];
	
	public static void setLeftWings(Wing wing) {
		wings[0] = wing;
	}
	
	public static void setRightWings(Wing wing) {
		wings[1] = wing;
	}
	
	public static void setNextWings(Wing wing) {
		wings[2] = wing;
	}
	
	public static void main(String[] args) {
		Wing wing1 = new Wing("1");
		Wing wing2 = new Wing("2");
//		Wing wing3 = new Wing();
		setLeftWings(wing1);
		setRightWings(wing2);
//		setNextWings(wing3);
		for (Wing wing : wings) {
			System.out.println(wing);
		}
	}

}
