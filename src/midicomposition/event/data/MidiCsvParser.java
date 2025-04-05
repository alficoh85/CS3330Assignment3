package midicomposition.event.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.ShortMessage;

public class MidiCsvParser {
	/**
	 * Method to parse csv folder into a list of MidiEventData objects
	 * @param filepath
	 * @return
	 */
	public static List<MidiEventData> parseCsv(String filepath) {
		List<MidiEventData> eventList = new ArrayList<MidiEventData>();
		try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
			String line = br.readLine();
            while (line != null) {
            	MidiEventData lineEvent = null;
            	String[] splitLine = line.split(",");
            	int lineStartEndTick = Integer.parseInt(splitLine[0]);
            	int lineChannel = Integer.parseInt(splitLine[2]);
            	int lineNote = Integer.parseInt(splitLine[3]);
            	int lineVelocity = Integer.parseInt(splitLine[4]);
            	int lineInstrument = Integer.parseInt(splitLine[5]);
            	
            	if (splitLine[1].length() == 10) {
            		lineEvent = new MidiEventData(lineStartEndTick, lineVelocity, lineNote, lineChannel, ShortMessage.NOTE_ON, lineInstrument);
            	}
            	else if (splitLine[1].length() == 11) {
            		lineEvent = new MidiEventData(lineStartEndTick, lineVelocity, lineNote, lineChannel, ShortMessage.NOTE_OFF, lineInstrument);
            	}
            	
            	if (lineEvent != null) {
					eventList.add(lineEvent);
            	}
                line = br.readLine();
            }
            return eventList;
		}
		catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}