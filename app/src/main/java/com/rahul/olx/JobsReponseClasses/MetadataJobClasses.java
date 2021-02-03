package com.rahul.olx.JobsReponseClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class MetadataJobClasses implements Serializable {

	@SerializedName("sections")
	private List<Object> sections;

	@SerializedName("feed_version")
	private String feedVersion;

	@SerializedName("total_ads")
	private int totalAds;

	@SerializedName("total_suggested_ads")
	private int totalSuggestedAds;

	@SerializedName("ads_on_page")
	private int adsOnPage;

	@SerializedName("total_pages")
	private int totalPages;

	@SerializedName("resultset_id")
	private String resultsetId;

	@SerializedName("suggested_sections")
	private List<Object> suggestedSections;

	@SerializedName("filters")
	private List<FiltersJobClasses> filters;

	@SerializedName("applied_sorting")
	private AppliedSortingJobClasses appliedSorting;

	@SerializedName("applied_filters")
	private List<AppliedFiltersJobClasses> appliedFilters;

	@SerializedName("modified_filters")
	private ModifiedFiltersJobClasses modifiedFilters;

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

	public int getAdsOnPage(){
		return adsOnPage;
	}

	public int getTotalPages(){
		return totalPages;
	}

	public String getResultsetId(){
		return resultsetId;
	}

	public List<Object> getSuggestedSections(){
		return suggestedSections;
	}

	public List<FiltersJobClasses> getFilters(){
		return filters;
	}

	public AppliedSortingJobClasses getAppliedSorting(){
		return appliedSorting;
	}

	public List<AppliedFiltersJobClasses> getAppliedFilters(){
		return appliedFilters;
	}

	public ModifiedFiltersJobClasses getModifiedFilters(){
		return modifiedFilters;
	}

	public String getNextPageUrl(){
		return nextPageUrl;
	}
}