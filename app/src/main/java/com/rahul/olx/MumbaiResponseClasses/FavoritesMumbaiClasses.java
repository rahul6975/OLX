package com.rahul.olx.MumbaiResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class FavoritesMumbaiClasses implements Serializable {

	@SerializedName("count")
	private int count;

	@SerializedName("count_label")
	private String countLabel;

	@SerializedName("count_label_next")
	private String countLabelNext;

	@SerializedName("count_label_prev")
	private String countLabelPrev;

	public int getCount(){
		return count;
	}

	public String getCountLabel(){
		return countLabel;
	}

	public String getCountLabelNext(){
		return countLabelNext;
	}

	public String getCountLabelPrev(){
		return countLabelPrev;
	}
}