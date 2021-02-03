package com.rahul.olx.PropertiesResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class PricePropertyClasses implements Serializable {

	@SerializedName("value")
	private ValuePropertyClasses value;

	@SerializedName("key_name")
	private String keyName;

	@SerializedName("key")
	private String key;

	public ValuePropertyClasses getValue(){
		return value;
	}

	public String getKeyName(){
		return keyName;
	}

	public String getKey(){
		return key;
	}
}