package com.rahul.olx.KolKataResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ParametersKolkataClasses implements Serializable {

	@SerializedName("type")
	private String type;

	@SerializedName("key")
	private String key;

	@SerializedName("value")
	private String value;

	@SerializedName("key_name")
	private String keyName;

	@SerializedName("formatted_value")
	private String formattedValue;

	@SerializedName("value_name")
	private String valueName;

	public String getType(){
		return type;
	}

	public String getKey(){
		return key;
	}

	public String getValue(){
		return value;
	}

	public String getKeyName(){
		return keyName;
	}

	public String getFormattedValue(){
		return formattedValue;
	}

	public String getValueName(){
		return valueName;
	}
}