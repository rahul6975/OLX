package com.rahul.olx.KolKataResponseClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ResponseKolkataClasses implements Serializable {

	@SerializedName("version")
	private String version;

	@SerializedName("data")
	private List<DataKolkataClasses> data;

	@SerializedName("metadata")
	private MetadataKolkataClasses metadata;

	@SerializedName("not_empty")
	private boolean notEmpty;

	@SerializedName("empty")
	private boolean empty;

	@SerializedName("suggested_data")
	private List<Object> suggestedData;

	public String getVersion(){
		return version;
	}

	public List<DataKolkataClasses> getData(){
		return data;
	}

	public MetadataKolkataClasses getMetadata(){
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