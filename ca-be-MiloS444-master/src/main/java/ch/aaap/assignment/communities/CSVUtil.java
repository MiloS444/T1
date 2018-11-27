package ch.aaap.assignment.communities;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

/**
* This is a helper class to read the provided CSV
*
* You don't have adapt anything within this class!
*/
public class CSVUtil {

	static final String communityListFileName = "/politicalCommunities.csv";
	static final String communityPostalCodeFileName = "/postalCommunities.csv";

	private CSVUtil() {

	}

	protected static Set<CommunityListRow> getCommunityListRows()
			throws RuntimeException {
		try {
			InputStream is = CSVUtil.class
					.getResourceAsStream(communityListFileName);
			Reader reader = new InputStreamReader(is);
			CSVParser parser = new CSVParser(reader,
					CSVFormat.DEFAULT.withHeader());

			Set<CommunityListRow> models = new HashSet<CommunityListRow>();

			for (final CSVRecord record : parser) {
				CommunityListRow currentRow = new CommunityListRow(
						record.get("GDEKT"), record.get("GDEBZNR"),
						record.get("GDENR"), record.get("GDENAME"),
						record.get("GDENAMK"), record.get("GDEBZNA"),
						record.get("GDEKTNA"), record.get("GDEMUTDAT"));
				models.add(currentRow);
			}
			parser.close();
			return models;

		} catch (IOException e) {
			throw new RuntimeException(
					"Could not parse political communities csv", e);
		}

	}

	protected static Set<CommunityPostalCodeRow> getCommunityPostalCodeRows()
			throws RuntimeException {

		try {
			InputStream is = CSVUtil.class
					.getResourceAsStream(communityPostalCodeFileName);
			Reader reader = new InputStreamReader(is);
			CSVParser parser = new CSVParser(reader,
					CSVFormat.DEFAULT.withHeader());
			Set<CommunityPostalCodeRow> models = new HashSet<CommunityPostalCodeRow>();
			for (final CSVRecord record : parser) {
				CommunityPostalCodeRow currentRow = new CommunityPostalCodeRow(
						record.get("KTKZ"), record.get("OHW"),
						record.get("ORTNAME"), record.get("GHW"),
						record.get("GDENR"), record.get("GDENAMK"),
						record.get("PHW"), record.get("PLZ4"),
						record.get("PLZZ"), record.get("PLZNAMK"));
				models.add(currentRow);
			}
			parser.close();
			return models;
		} catch (IOException e) {
			throw new RuntimeException("could not parse postal community csv",
					e);
		}

	}
}
