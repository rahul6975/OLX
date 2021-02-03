package com.rahul.olx.MumbaiResponseClasses.MobilesInMumbai;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class MetadataMobileMumbaiClasses implements Serializable {

	@SerializedName("sections")
	private List<SectionsMobileMumbaiClasses> sections;

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
	private List<FiltersMobileMumbaiClasses> filters;

	@SerializedName("applied_sorting")
	private AppliedSortingMobileMumbaiClasses appliedSorting;

	@SerializedName("next_page_url")
	private String nextPageUrl;

	@SerializedName("applied_filters")
	private List<AppliedFiltersMobileMumbaiClasses> appliedFilters;

	@SerializedName("modified_filters")
	private ModifiedFiltersMobileMumbaiClasses modifiedFilters;

	public List<SectionsMobileMumbaiClasses> getSections(){
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

	public List<FiltersMobileMumbaiClasses> getFilters(){
		return filters;
	}

	public AppliedSortingMobileMumbaiClasses getAppliedSorting(){
		return appliedSorting;
	}

	public String getNextPageUrl(){
		return nextPageUrl;
	}

	public List<AppliedFiltersMobileMumbaiClasses> getAppliedFilters(){
		return appliedFilters;
	}

	public ModifiedFiltersMobileMumbaiClasses getModifiedFilters(){
		return modifiedFilters;
	}
}