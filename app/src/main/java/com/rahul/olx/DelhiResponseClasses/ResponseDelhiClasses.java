package com.rahul.olx.DelhiResponseClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import com.rahul.olx.MumbaiResponseClasses.DataMumbaiClasses;

import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ResponseDelhiClasses implements Serializable {

	@SerializedName("version")
	private String version;

	@SerializedName("data")
	private List<DataDelhiClasses> data;

	@SerializedName("metadata")
	private MetadataDelhiClasses metadata;

	@SerializedName("empty")
	private boolean empty;

	@SerializedName("not_empty")
	private boolean notEmpty;

	@SerializedName("suggested_data")
	private List<Object> suggestedData;

	public String getVersion(){
		return version;
	}

	public List<DataDelhiClasses> getData(){
		return data;
	}

	public MetadataDelhiClasses getMetadata(){
		return metadata;
	}

	public boolean isEmpty(){
		return empty;
	}

	public boolean isNotEmpty(){
		return notEmpty;
	}

	public List<Object> getSuggestedData(){
		return suggestedData;
	}
}