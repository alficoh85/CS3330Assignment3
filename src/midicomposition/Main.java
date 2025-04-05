package midicomposition;

import javax.sound.midi.*;

import midicomposition.event.data.MidiCsvParser;
import midicomposition.event.data.MidiEventData;

import java.io.*;
import java.util.*;

public class Main {
	public static void main (String [] args) {
		try {
			List<MidiEventData> midiEvents = MidiCsvParser.parseCsv("./files/mystery_song.csv");
			Sequence sequence = new Sequence(Sequence.PPQ, 384);
			Track track = sequence.createTrack();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}