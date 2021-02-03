package com.rahul.olx.BangaloreResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class PriceBangaloreClasses implements Serializable {

	@SerializedName("value")
	private ValueBangaloreClasses value;

	@SerializedName("key_name")
	private String keyName;

	@SerializedName("key")
	private String key;

	public ValueBangaloreClasses getValue(){
		return value;
	}

	public String getKeyName(){
		return keyName;
	}

	public String getKey(){
		return key;
	}
}