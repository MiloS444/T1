package ch.aaap.assignment.communities;

public class CommunityPostalCodeRow {

	private final String kantonShort;
	
	public String getPlaceRemark() {
		return placeRemark;
	}

	private final String placeRemark;
	
	private final String communityRemark;
	
	private final String communityName;
	
	private final String communityNo;
	
	private final String communityNameShort;
	
	private final String zipCodeRemark;
	
	private final String zipCode;
	
	private final String zipCodeAdditional;
	
	private final String zipCodeNameShort;

	public CommunityPostalCodeRow(String kantonShort, String placeRemark,
			String communityName, String communityRemark, String communityNo,
			String communityNameShort, String zipCodeRemark, String zipCode,
			String zipCodeAdditional, String zipCodeNameShort) {
		super();
		this.kantonShort = kantonShort;
		this.placeRemark = placeRemark;
		this.communityName = communityName;
		this.communityRemark = communityRemark;
		this.communityNo = communityNo;
		this.communityNameShort = communityNameShort;
		this.zipCodeRemark = zipCodeRemark;
		this.zipCode = zipCode;
		this.zipCodeAdditional = zipCodeAdditional;
		this.zipCodeNameShort = zipCodeNameShort;
	}

	public String getKantonShort() {
		return kantonShort;
	}

	public String getCommunityRemark() {
		return communityRemark;
	}

	public String getCommunityName() {
		return communityName;
	}

	public String getCommunityNo() {
		return communityNo;
	}

	public String getCommunityNameShort() {
		return communityNameShort;
	}

	public String getZipCodeRemark() {
		return zipCodeRemark;
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getZipCodeAdditional() {
		return zipCodeAdditional;
	}

	public String getZipCodeNameShort() {
		return zipCodeNameShort;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((communityName == null) ? 0 : communityName.hashCode());
		result = prime
				* result
				+ ((communityNameShort == null) ? 0 : communityNameShort
						.hashCode());
		result = prime * result
				+ ((communityNo == null) ? 0 : communityNo.hashCode());
		result = prime * result
				+ ((communityRemark == null) ? 0 : communityRemark.hashCode());
		result = prime * result
				+ ((kantonShort == null) ? 0 : kantonShort.hashCode());
		result = prime * result
				+ ((placeRemark == null) ? 0 : placeRemark.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
		result = prime
				* result
				+ ((zipCodeAdditional == null) ? 0 : zipCodeAdditional
						.hashCode());
		result = prime
				* result
				+ ((zipCodeNameShort == null) ? 0 : zipCodeNameShort.hashCode());
		result = prime * result
				+ ((zipCodeRemark == null) ? 0 : zipCodeRemark.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommunityPostalCodeRow other = (CommunityPostalCodeRow) obj;
		if (communityName == null) {
			if (other.communityName != null)
				return false;
		} else if (!communityName.equals(other.communityName))
			return false;
		if (communityNameShort == null) {
			if (other.communityNameShort != null)
				return false;
		} else if (!communityNameShort.equals(other.communityNameShort))
			return false;
		if (communityNo == null) {
			if (other.communityNo != null)
				return false;
		} else if (!communityNo.equals(other.communityNo))
			return false;
		if (communityRemark == null) {
			if (other.communityRemark != null)
				return false;
		} else if (!communityRemark.equals(other.communityRemark))
			return false;
		if (kantonShort == null) {
			if (other.kantonShort != null)
				return false;
		} else if (!kantonShort.equals(other.kantonShort))
			return false;
		if (placeRemark == null) {
			if (other.placeRemark != null)
				return false;
		} else if (!placeRemark.equals(other.placeRemark))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		if (zipCodeAdditional == null) {
			if (other.zipCodeAdditional != null)
				return false;
		} else if (!zipCodeAdditional.equals(other.zipCodeAdditional))
			return false;
		if (zipCodeNameShort == null) {
			if (other.zipCodeNameShort != null)
				return false;
		} else if (!zipCodeNameShort.equals(other.zipCodeNameShort))
			return false;
		if (zipCodeRemark == null) {
			if (other.zipCodeRemark != null)
				return false;
		} else if (!zipCodeRemark.equals(other.zipCodeRemark))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CommunityPostalCodeRow [kantonShort=" + kantonShort
				+ ", placeRemark=" + placeRemark + ", communityRemark="
				+ communityRemark + ", communityName=" + communityName
				+ ", communityNo=" + communityNo + ", communityNameShort="
				+ communityNameShort + ", zipCodeRemark=" + zipCodeRemark
				+ ", zipCode=" + zipCode + ", zipCodeAdditional="
				+ zipCodeAdditional + ", zipCodeNameShort=" + zipCodeNameShort
				+ "]";
	}	
	
	
	
}
