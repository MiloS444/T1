package ch.aaap.assignment.communities;

import java.util.HashSet;
import java.util.Set;

public class CommunityMain {

	private final Set<CommunityListRow> politicalCommunities;
	private final Set<CommunityPostalCodeRow> postalcommunities;
	public InnerJoin[] ij;
	private Set<InnerJoin> InnerJoinSet;

	public CommunityMain() {
		politicalCommunities = CSVUtil.getCommunityListRows();
		postalcommunities = CSVUtil.getCommunityPostalCodeRows();
		InnerJoinSet = null;

	}
	public void start()
	{
		InnerJoinSet = (Set<InnerJoin>) this.createModel(politicalCommunities,postalcommunities);
		long i = this.getAmountOfCommunitiesInKanton("ZH");
		System.out.println("Vrednosti za kanton: " + i);



		System.out.print("Ovo je district: ");
		System.out.println(this.getDistrictForZipCode("8305"));

		i = this.findCommunitiesWhereCommunityShortNameAndZipCodeShortNameEqual1();

		System.out.println(i);



	}

	public static void main(String[] args) {

		CommunityMain main = new CommunityMain();
		main.start();

		System.err.println("community count: "
				+ main.politicalCommunities.size());
		System.err.println("community postal code count: "
				+ main.postalcommunities.size());

		System.err.println("1st of community list: "
				+ main.politicalCommunities.iterator().next());
		System.err.println("1st of community postal code list: "
				+ main.postalcommunities.iterator().next());

	}

	/**
	 * Create a model / data structure that combines the input sets.
	 *
	 * @param communities
	 * @param communityPostalCodes
	 * @return
	 */
	public Object createModel(Set<CommunityListRow> communities,
			Set<CommunityPostalCodeRow> communityPostalCodes) {
		int i = 0;
		int j = 0;


		Set<InnerJoin> SIJ = new HashSet<InnerJoin>();

		for( CommunityListRow c1 : communities)
		{
			for(CommunityPostalCodeRow p1: communityPostalCodes)
			{
				String str1 = c1.getCommunityNo();
				String str2 = p1.getCommunityNo();
				if (str1.equals(str2))
				{
					InnerJoin IJtmp = new InnerJoin(
							p1.getKantonShort(), p1.getPlaceRemark(), p1.getCommunityRemark(),p1.getCommunityName(),p1.getCommunityNo(),p1.getCommunityNameShort(),
							p1.getZipCodeRemark(),p1.getZipCode(),p1.getZipCodeAdditional(),p1.getZipCodeNameShort(),c1.getKantonShort(),c1.getDistrictNo(),
							c1.getCommunityNo(), c1.getCommunityName(), c1.getCommunityNameShort(), c1.getDistrictName(),
							c1.getKantonName(),c1.getLastUpdateDate()
					);
					SIJ.add(IJtmp);
				}
			}
		}
		return SIJ;
	}

	/**
	 *
	 * @param kantonShort
	 * @return
	 */


	public long getAmountOfCommunitiesInKanton(String kantonShort) {

		long result = 0;
		for (CommunityListRow IJ1 : politicalCommunities)
		{

			if (IJ1.getKantonShort().equals(kantonShort)) {
				result++;
			}
		}
		return result;
	}
	/**
	 *
	 * @param zipCode
	 * @return
	 */
	public String getDistrictForZipCode(String zipCode) {

		String result = "";

		for (InnerJoin IJ1 : InnerJoinSet)
		{
			String tmp = IJ1.getPostal_zipCode();
			if (tmp.equals(zipCode))
				return IJ1.getCom_districtName();

		}
		System.out.println("-------------> Nije pronaden " + result);
		return result;
	}

	/**
	 *
	 * @return
	 */
	public Set<CommunityIdentity> findCommunitiesWhereCommunityShortNameAndZipCodeShortNameEqual() {

		int i = 0;
		for (InnerJoin IJ1 : InnerJoinSet)
		{

			if (IJ1.getCom_communityNameShort().equals(IJ1.getPostal_zipCodeNameShort()))
				i++;

		}
		return null;

	}

	public int findCommunitiesWhereCommunityShortNameAndZipCodeShortNameEqual1() {

		int i = 0;
		int i1 = 0;
		int i2 = 0;
		int i3 = 0;
		int i4 = 0;
		int i5 = 0;

		for (InnerJoin IJ1 : InnerJoinSet)
		{

			if (IJ1.getPostal_communityNameShort().equals(IJ1.getPostal_zipCodeNameShort()))
				i++;
			if (IJ1.getCom_communityNameShort().equals(IJ1.getPostal_zipCodeNameShort()))
				i1++;

			if (IJ1.getPostal_communityNameShort().equals(IJ1.getCom_communityName()))
				i2++;
			if (IJ1.getPostal_communityNameShort().equals(IJ1.getCom_communityNameShort()))
				i3++;

			if (IJ1.getPostal_zipCodeNameShort().equals(IJ1.getCom_communityName()))
				i4++;
			if (IJ1.getPostal_zipCodeNameShort().equals(IJ1.getCom_communityNameShort()))
				i5++;

		}

		System.out.println(i + " " + i1 + " " + i2 + " " + i3 + " " + i4 + " " + i5);
		return i;

	}
}


	/*
	public long getAmountOfCommunitiesInKanton(String kantonShort) {
		long result = 0;
		int kk = 0;
		for (InnerJoin IJ1 : InnerJoinSet)
		{
			kk++;
			String s1 = kantonShort;
			String s2 = "";
			if ( (IJ1!=null) && !IJ1.getCom_kantonShort().isEmpty())
			{
				s2 = IJ1.getCom_kantonShort();
			}


		//	System.out.println("Ovo je kk: = " + kk + ">"+s2+"<"+">"+kantonShort+"<");
			if (s1.equals(s2)) {
		//		System.out.println("BIO JE CIRIH " + kk + IJ1.getKantonShort());
				result++;
			}
		}
		return result;
	}
*/