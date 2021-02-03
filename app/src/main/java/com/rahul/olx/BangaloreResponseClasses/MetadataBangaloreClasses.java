package com.rahul.olx.BangaloreResponseClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class MetadataBangaloreClasses implements Serializable {

	@SerializedName("sections")
	private List<Object> sections;

	@SerializedName("feed_version")
	private String feedVersion;

	@SerializedName("total_ads")
	private int totalAds;

	@SerializedName("total_suggested_ads")
	private int totalSuggestedAds;

	@SerializedName("resultset_id")
	private String resultsetId;

	@SerializedName("suggested_sections")
	private List<Object> suggestedSections;

	@SerializedName("filters")
	private List<Object> filters;

	@SerializedName("applied_filters")
	private List<Object> appliedFilters;

	@SerializedName("modified_filters")
	private ModifiedFiltersBangaloreClasses modifiedFilters;

	@SerializedName("next_page_url")
	private String nextPageUrl;

	public List<Object> getSections(){
		return sections;
	}

	public String getFeedVersion(){
		return feedVersion;
	}

	public int getTotalAds(){
		return totalAds;
	}

	public int getTotalSuggestedAds(){
		return totalSuggestedAds;
	}

	public String getResultsetId(){
		return resultsetId;
	}

	public List<Object> getSuggestedSections(){
		return suggestedSections;
	}

	public List<Object> getFilters(){
		return filters;
	}

	public List<Object> getAppliedFilters(){
		return appliedFilters;
	}

	public ModifiedFiltersBangaloreClasses getModifiedFilters(){
		return modifiedFilters;
	}

	public String getNextPageUrl(){
		return nextPageUrl;
	}
}