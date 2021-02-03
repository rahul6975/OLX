package com.rahul.olx.BangaloreResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class StatusBangaloreClasses implements Serializable {

	@SerializedName("status")
	private String status;

	@SerializedName("allow_edit")
	private boolean allowEdit;

	@SerializedName("ban_reason_id")
	private Object banReasonId;

	@SerializedName("display")
	private String display;

	@SerializedName("translated_display")
	private String translatedDisplay;

	@SerializedName("link")
	private Object link;

	@SerializedName("flags")
	private FlagsBangaloreClasses flags;

	@SerializedName("message")
	private Object message;

	public String getStatus(){
		return status;
	}

	public boolean isAllowEdit(){
		return allowEdit;
	}

	public Object getBanReasonId(){
		return banReasonId;
	}

	public String getDisplay(){
		return display;
	}

	public String getTranslatedDisplay(){
		return translatedDisplay;
	}

	public Object getLink(){
		return link;
	}

	public FlagsBangaloreClasses getFlags(){
		return flags;
	}

	public Object getMessage(){
		return message;
	}
}