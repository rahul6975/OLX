package com.rahul.olx.ElectronicsResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ValueElectronicClasses implements Serializable {

	@SerializedName("raw")
	private Object raw;

	@SerializedName("currency")
	private CurrencyElectronicClasses currency;

	@SerializedName("display")
	private String display;

	public Object getRaw(){
		return raw;
	}

	public CurrencyElectronicClasses getCurrency(){
		return currency;
	}

	public String getDisplay(){
		return display;
	}
}