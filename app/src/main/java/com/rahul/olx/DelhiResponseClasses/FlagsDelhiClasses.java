package com.rahul.olx.DelhiResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class FlagsDelhiClasses implements Serializable {

	@SerializedName("new")
	private boolean jsonMemberNew;

	@SerializedName("hot")
	private boolean hot;

	public boolean isJsonMemberNew(){
		return jsonMemberNew;
	}

	public boolean isHot(){
		return hot;
	}
}