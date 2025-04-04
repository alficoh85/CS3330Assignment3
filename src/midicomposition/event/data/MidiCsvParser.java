package midicomposition.event.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MidiCsvParser {
	public static List<MidiEventData> parseCsv(String filepath) {
		List<MidiEventData> eventList = new ArrayList<MidiEventData>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(filepath));
			String line = br.readLine();
            while (line != null) {
                // TODO make new MidiEventData item with items from the line being read turned to ints
                line = br.readLine();
            }
            return null;
		}
		catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}