package com.rahul.olx.BangaloreResponseClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class DataBangaloreClasses implements Serializable {

	@SerializedName("id")
	private String id;

	@SerializedName("score")
	private Object score;

	@SerializedName("spell")
	private SpellBangaloreClasses spell;

	@SerializedName("status")
	private StatusBangaloreClasses status;

	@SerializedName("category_id")
	private String categoryId;

	@SerializedName("favorites")
	private FavoritesBangaloreClasses favorites;

	@SerializedName("images")
	private List<ImagesBangaloreClasses> images;

	@SerializedName("package")
	private JsonMemberPackageBangaloreClasses jsonMemberPackage;

	@SerializedName("is_kyc_verified_user")
	private boolean isKycVerifiedUser;

	@SerializedName("has_phone_param")
	private boolean hasPhoneParam;

	@SerializedName("locations_resolved")
	private LocationsResolvedBangaloreClasses locationsResolved;

	@SerializedName("description")
	private String description;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("inspection_info")
	private Object inspectionInfo;

	@SerializedName("title")
	private String title;

	@SerializedName("car_body_type")
	private String carBodyType;

	@SerializedName("main_info")
	private String mainInfo;

	@SerializedName("display_date")
	private String displayDate;

	@SerializedName("user_id")
	private String userId;

	@SerializedName("price")
	private PriceBangaloreClasses price;

	@SerializedName("created_at_first")
	private String createdAtFirst;

	@SerializedName("locations")
	private List<LocationsBangaloreClasses> locations;

	@SerializedName("parameters")
	private List<ParametersBangaloreClasses> parameters;

	@SerializedName("monetizationInfo")
	private Object monetizationInfo;

	public String getId(){
		return id;
	}

	public Object getScore(){
		return score;
	}

	public SpellBangaloreClasses getSpell(){
		return spell;
	}

	public StatusBangaloreClasses getStatus(){
		return status;
	}

	public String getCategoryId(){
		return categoryId;
	}

	public FavoritesBangaloreClasses getFavorites(){
		return favorites;
	}

	public List<ImagesBangaloreClasses> getImages(){
		return images;
	}

	public JsonMemberPackageBangaloreClasses getJsonMemberPackage(){
		return jsonMemberPackage;
	}

	public boolean isIsKycVerifiedUser(){
		return isKycVerifiedUser;
	}

	public boolean isHasPhoneParam(){
		return hasPhoneParam;
	}

	public LocationsResolvedBangaloreClasses getLocationsResolved(){
		return locationsResolved;
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

	public String getCarBodyType(){
		return carBodyType;
	}

	public String getMainInfo(){
		return mainInfo;
	}

	public String getDisplayDate(){
		return displayDate;
	}

	public String getUserId(){
		return userId;
	}

	public PriceBangaloreClasses getPrice(){
		return price;
	}

	public String getCreatedAtFirst(){
		return createdAtFirst;
	}

	public List<LocationsBangaloreClasses> getLocations(){
		return locations;
	}

	public List<ParametersBangaloreClasses> getParameters(){
		return parameters;
	}

	public Object getMonetizationInfo(){
		return monetizationInfo;
	}
}