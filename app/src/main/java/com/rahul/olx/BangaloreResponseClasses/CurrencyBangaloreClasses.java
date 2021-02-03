package com.rahul.olx.BangaloreResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class CurrencyBangaloreClasses implements Serializable {

	@SerializedName("iso_4217")
	private String iso4217;

	@SerializedName("pre")
	private String pre;

	public String getIso4217(){
		return iso4217;
	}

	public String getPre(){
		return pre;
	}
}