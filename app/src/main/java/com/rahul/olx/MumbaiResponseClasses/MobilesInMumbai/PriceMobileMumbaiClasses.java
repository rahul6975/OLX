package com.rahul.olx.MumbaiResponseClasses.MobilesInMumbai;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class PriceMobileMumbaiClasses implements Serializable {

	@SerializedName("value")
	private ValueMobileMumbaiClasses value;

	@SerializedName("key_name")
	private String keyName;

	@SerializedName("key")
	private String key;

	public ValueMobileMumbaiClasses getValue(){
		return value;
	}

	public String getKeyName(){
		return keyName;
	}

	public String getKey(){
		return key;
	}
}