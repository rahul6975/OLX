package com.rahul.olx.CarResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class PriceCarClasses implements Serializable {

	@SerializedName("value")
	private ValueCarClasses value;

	@SerializedName("key_name")
	private String keyName;

	@SerializedName("key")
	private String key;

	public ValueCarClasses getValue(){
		return value;
	}

	public String getKeyName(){
		return keyName;
	}

	public String getKey(){
		return key;
	}
}