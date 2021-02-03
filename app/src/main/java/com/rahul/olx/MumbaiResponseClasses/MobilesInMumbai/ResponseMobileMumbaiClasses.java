package com.rahul.olx.MumbaiResponseClasses.MobilesInMumbai;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import com.rahul.olx.MumbaiResponseClasses.DataMumbaiClasses;

import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ResponseMobileMumbaiClasses implements Serializable {

	@SerializedName("version")
	private String version;

	@SerializedName("data")
	private List<DataMumbaiClasses> data;

	@SerializedName("metadata")
	private MetadataMobileMumbaiClasses metadata;

	@SerializedName("not_empty")
	private boolean notEmpty;

	@SerializedName("empty")
	private boolean empty;

	@SerializedName("suggested_data")
	private List<Object> suggestedData;

	public String getVersion(){
		return version;
	}

	public List<DataMumbaiClasses> getData(){
		return data;
	}

	public MetadataMobileMumbaiClasses getMetadata(){
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