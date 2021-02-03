package com.rahul.olx.KolKataResponseClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class DataKolkataClasses implements Serializable {

	@SerializedName("id")
	private String id;

	@SerializedName("score")
	private Object score;

	@SerializedName("spell")
	private SpellKolkataClasses spell;

	@SerializedName("status")
	private StatusKolkataClasses status;

	@SerializedName("category_id")
	private String categoryId;

	@SerializedName("favorites")
	private FavoritesKolkataClasses favorites;

	@SerializedName("location_source")
	private Object locationSource;

	@SerializedName("kycVerifiedUser")
	private boolean kycVerifiedUser;

	@SerializedName("has_phone_param")
	private boolean hasPhoneParam;

	@SerializedName("republish_date")
	private Object republishDate;

	@SerializedName("description")
	private String description;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("inspection_info")
	private Object inspectionInfo;

	@SerializedName("title")
	private String title;

	@SerializedName("partner_id")
	private Object partnerId;

	@SerializedName("price")
	private PriceKolkataClasses price;

	@SerializedName("valid_to")
	private String validTo;

	@SerializedName("partner_code")
	private Object partnerCode;

	@SerializedName("views")
	private Object views;

	@SerializedName("monetizationInfo")
	private MonetizationInfoKolkataClasses monetizationInfo;

	@SerializedName("images")
	private List<ImagesKolkataClasses> images;

	@SerializedName("package")
	private JsonMemberPackageKolkataClasses jsonMemberPackage;

	@SerializedName("is_kyc_verified_user")
	private boolean isKycVerifiedUser;

	@SerializedName("locations_resolved")
	private LocationsResolvedKolkataClasses locationsResolved;

	@SerializedName("revision")
	private int revision;

	@SerializedName("main_info")
	private String mainInfo;

	@SerializedName("display_date")
	private String displayDate;

	@SerializedName("replies")
	private Object replies;

	@SerializedName("user_id")
	private String userId;

	@SerializedName("calls")
	private Object calls;

	@SerializedName("created_at_first")
	private String createdAtFirst;

	@SerializedName("locations")
	private List<LocationsKolkataClasses> locations;

	@SerializedName("parameters")
	private List<ParametersKolkataClasses> parameters;

	@SerializedName("extra_parameters")
	private Object extraParameters;

	public String getId(){
		return id;
	}

	public Object getScore(){
		return score;
	}

	public SpellKolkataClasses getSpell(){
		return spell;
	}

	public StatusKolkataClasses getStatus(){
		return status;
	}

	public String getCategoryId(){
		return categoryId;
	}

	public FavoritesKolkataClasses getFavorites(){
		return favorites;
	}

	public Object getLocationSource(){
		return locationSource;
	}

	public boolean isKycVerifiedUser(){
		return kycVerifiedUser;
	}

	public boolean isHasPhoneParam(){
		return hasPhoneParam;
	}

	public Object getRepublishDate(){
		return republishDate;
	}

	public String getDescription(){
		return description;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public Object getInspectionInfo(){
		return inspectionInfo;
	}

	public String getTitle(){
		return title;
	}

	public Object getPartnerId(){
		return partnerId;
	}

	public PriceKolkataClasses getPrice(){
		return price;
	}

	public String getValidTo(){
		return validTo;
	}

	public Object getPartnerCode(){
		return partnerCode;
	}

	public Object getViews(){
		return views;
	}

	public MonetizationInfoKolkataClasses getMonetizationInfo(){
		return monetizationInfo;
	}

	public List<ImagesKolkataClasses> getImages(){
		return images;
	}

	public JsonMemberPackageKolkataClasses getJsonMemberPackage(){
		return jsonMemberPackage;
	}

	public boolean isIsKycVerifiedUser(){
		return isKycVerifiedUser;
	}

	public LocationsResolvedKolkataClasses getLocationsResolved(){
		return locationsResolved;
	}

	public int getRevision(){
		return revision;
	}

	public String getMainInfo(){
		return mainInfo;
	}

	public String getDisplayDate(){
		return displayDate;
	}

	public Object getReplies(){
		return replies;
	}

	public String getUserId(){
		return userId;
	}

	public Object getCalls(){
		return calls;
	}

	public String getCreatedAtFirst(){
		return createdAtFirst;
	}

	public List<LocationsKolkataClasses> getLocations(){
		return locations;
	}

	public List<ParametersKolkataClasses> getParameters(){
		return parameters;
	}

	public Object getExtraParameters(){
		return extraParameters;
	}
}