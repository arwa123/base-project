package com.company.enums;

public enum Status {

	active, inactive;

	public static Status getEnum(String value) {
		if (null == value)
			return null;
		return Status.valueOf(value);
	}

	public static String getStringValue(Status status) {
		if (null == status)
			return null;
		return status.name();
	}

}
