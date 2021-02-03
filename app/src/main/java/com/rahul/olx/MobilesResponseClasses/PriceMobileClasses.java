package com.rahul.olx.MobilesResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class PriceMobileClasses implements Serializable {

	@SerializedName("value")
	private ValueMobileClasses value;

	@SerializedName("key_name")
	private String keyName;

	@SerializedName("key")
	private String key;

	public ValueMobileClasses getValue(){
		return value;
	}

	public String getKeyName(){
		return keyName;
	}

	public String getKey(){
		return key;
	}
}