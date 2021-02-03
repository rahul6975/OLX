package com.rahul.olx.BikesResponseClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class BikeResponseClass implements Serializable {

	@SerializedName("version")
	private String version;

	@SerializedName("data")
	private List<DataClass> data;

	@SerializedName("metadata")
	private MetadataClass metadata;

	@SerializedName("not_empty")
	private boolean notEmpty;

	@SerializedName("empty")
	private boolean empty;

	@SerializedName("suggested_data")
	private List<Object> suggestedData;

	public String getVersion(){
		return version;
	}

	public List<DataClass> getData(){
		return data;
	}

	public MetadataClass getMetadata(){
		return metadata;
	}

	public boolean isNotEmpty(){
		return notEmpty;
	}

	public boolean isEmpty(){
		return empty;
	}

	public List<Object> getSuggestedData(){
		return suggestedData;
	}
}