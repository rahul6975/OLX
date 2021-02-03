package com.rahul.olx.MumbaiResponseClasses.MobilesInMumbai;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class SectionsMobileMumbaiClasses implements Serializable {

	@SerializedName("id")
	private int id;

	@SerializedName("offset")
	private int offset;

	@SerializedName("criterion")
	private String criterion;

	@SerializedName("distance")
	private int distance;

	@SerializedName("relaxation_type")
	private String relaxationType;

	public int getId(){
		return id;
	}

	public int getOffset(){
		return offset;
	}

	public String getCriterion(){
		return criterion;
	}

	public int getDistance(){
		return distance;
	}

	public String getRelaxationType(){
		return relaxationType;
	}
}