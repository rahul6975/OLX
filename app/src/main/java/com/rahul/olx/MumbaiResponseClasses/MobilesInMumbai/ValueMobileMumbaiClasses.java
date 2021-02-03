package com.rahul.olx.MumbaiResponseClasses.MobilesInMumbai;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ValueMobileMumbaiClasses implements Serializable {

	@SerializedName("raw")
	private Object raw;

	@SerializedName("currency")
	private CurrencyMobileMumbaiClasses currency;

	@SerializedName("display")
	private String display;

	public Object getRaw(){
		return raw;
	}

	public CurrencyMobileMumbaiClasses getCurrency(){
		return currency;
	}

	public String getDisplay(){
		return display;
	}
}