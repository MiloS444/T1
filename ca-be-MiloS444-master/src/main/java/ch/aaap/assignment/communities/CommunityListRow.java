package ch.aaap.assignment.communities;

public class CommunityListRow {

	private final String kantonShort;

	private final String districtNo;

	private final String communityNo;

	private final String communityName;

	private final String communityNameShort;

	private final String districtName;

	private final String kantonName;

	private final String lastUpdateDate;

	public CommunityListRow(String kantonShort, String districtNo, String communityNo,
			String communityName, String communityNameShort, String districtName, String kantonName,
			String lastUpdateDate) {
		super();
		this.kantonShort = kantonShort;
		this.districtNo = districtNo;
		this.communityNo = communityNo;
		this.communityName = communityName;
		this.communityNameShort = communityNameShort;
		this.districtName = districtName;
		this.kantonName = kantonName;
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getKantonShort() {
		return kantonShort;
	}

	public String getDistrictNo() {
		return districtNo;
	}

	public String getCommunityName() {
		return communityName;
	}

	public String getCommunityNameShort() {
		return communityNameShort;
	}

	public String getKantonName() {
		return kantonName;
	}

	public String getLastUpdateDate() {
		return lastUpdateDate;
	}

	public String getCommunityNo() {
		return communityNo;
	}

	public String getDistrictName() {
		return districtName;
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
				+ ((districtName == null) ? 0 : districtName.hashCode());
		result = prime * result
				+ ((districtNo == null) ? 0 : districtNo.hashCode());
		result = prime * result
				+ ((kantonName == null) ? 0 : kantonName.hashCode());
		result = prime * result
				+ ((kantonShort == null) ? 0 : kantonShort.hashCode());
		result = prime * result
				+ ((lastUpdateDate == null) ? 0 : lastUpdateDate.hashCode());
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
		CommunityListRow other = (CommunityListRow) obj;
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
		if (districtName == null) {
			if (other.districtName != null)
				return false;
		} else if (!districtName.equals(other.districtName))
			return false;
		if (districtNo == null) {
			if (other.districtNo != null)
				return false;
		} else if (!districtNo.equals(other.districtNo))
			return false;
		if (kantonName == null) {
			if (other.kantonName != null)
				return false;
		} else if (!kantonName.equals(other.kantonName))
			return false;
		if (kantonShort == null) {
			if (other.kantonShort != null)
				return false;
		} else if (!kantonShort.equals(other.kantonShort))
			return false;
		if (lastUpdateDate == null) {
			if (other.lastUpdateDate != null)
				return false;
		} else if (!lastUpdateDate.equals(other.lastUpdateDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CommunityListRow [kantonShort=" + kantonShort + ", districtNo="
				+ districtNo + ", communityNo=" + communityNo
				+ ", communityName=" + communityName + ", communityNameShort="
				+ communityNameShort + ", districtName=" + districtName
				+ ", kantonName=" + kantonName + ", lastUpdateDate="
				+ lastUpdateDate + "]";
	}

	
	
}
