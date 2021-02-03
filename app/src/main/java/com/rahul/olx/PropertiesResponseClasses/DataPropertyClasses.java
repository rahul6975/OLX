package com.rahul.olx.PropertiesResponseClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class DataPropertyClasses implements Serializable {

	@SerializedName("id")
	private String id;

	@SerializedName("score")
	private Object score;

	@SerializedName("spell")
	private SpellPropertyClasses spell;

	@SerializedName("status")
	private StatusPropertyClasses status;

	@SerializedName("category_id")
	private String categoryId;

	@SerializedName("favorites")
	private FavoritesPropertyClasses favorites;

	@SerializedName("location_source")
	private Object locationSource;

	@SerializedName("kycVerifiedUser")
	private boolean kycVerifiedUser;

	@SerializedName("has_phone_param")
	private boolean hasPhoneParam;

	@SerializedName("republish_date")
	private String republishDate;

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
	private PricePropertyClasses price;

	@SerializedName("valid_to")
	private String validTo;

	@SerializedName("partner_code")
	private Object partnerCode;

	@SerializedName("views")
	private Object views;

	@SerializedName("monetizationInfo")
	private Object monetizationInfo;

	@SerializedName("images")
	private List<ImagesPropertyClasses> images;

	@SerializedName("package")
	private JsonMemberPackagePropertyClasses jsonMemberPackage;

	@SerializedName("is_kyc_verified_user")
	private boolean isKycVerifiedUser;

	@SerializedName("locations_resolved")
	private LocationsResolvedPropertyClasses locationsResolved;

	@SerializedName("revision")
	private int revision;

	@SerializedName("main_info")
	private Object mainInfo;

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
	private List<LocationsPropertyClasses> locations;

	@SerializedName("parameters")
	private List<ParametersPropertyClasses> parameters;

	@SerializedName("extra_parameters")
	private Object extraParameters;

	public String getId(){
		return id;
	}

	public Object getScore(){
		return score;
	}

	public SpellPropertyClasses getSpell(){
		return spell;
	}

	public StatusPropertyClasses getStatus(){
		return status;
	}

	public String getCategoryId(){
		return categoryId;
	}

	public FavoritesPropertyClasses getFavorites(){
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

	public String getRepublishDate(){
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

	public PricePropertyClasses getPrice(){
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

	public Object getMonetizationInfo(){
		return monetizationInfo;
	}

	public List<ImagesPropertyClasses> getImages(){
		return images;
	}

	public JsonMemberPackagePropertyClasses getJsonMemberPackage(){
		return jsonMemberPackage;
	}

	public boolean isIsKycVerifiedUser(){
		return isKycVerifiedUser;
	}

	public LocationsResolvedPropertyClasses getLocationsResolved(){
		return locationsResolved;
	}

	public int getRevision(){
		return revision;
	}

	public Object getMainInfo(){
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

	public List<LocationsPropertyClasses> getLocations(){
		return locations;
	}

	public List<ParametersPropertyClasses> getParameters(){
		return parameters;
	}

	public Object getExtraParameters(){
		return extraParameters;
	}
}