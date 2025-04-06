package midicomposition;

import javax.sound.midi.*;

import midicomposition.event.data.*;
import midicomposition.event.factory.*;
import midicomposition.strategy.instrument.*;
import midicomposition.strategy.pitch.*;

import java.io.*;
import java.util.*;

public class Main {
	public static void main (String [] args) {
		try {
			List<MidiEventData> midiEvents = MidiCsvParser.parseCsv("./files/mystery_song.csv");
			Sequence sequence = new Sequence(Sequence.PPQ, 384);
			Track track = sequence.createTrack();
			
			MidiEventFactoryAbstract factoryAbstract = new StandardMidiEventFactoryAbstract();
			//MidiEventFactoryAbstract factoryAbstract = new LegatoMidiEventFactoryAbstract();
			//MidiEventFactoryAbstract factoryAbstract = new StaccatoMidiEventFactoryAbstract();
			
			MidiEventFactory factory = factoryAbstract.createFactory();
			
			InstrumentStrategy instrumentStrategy = new ElectricBassGuitarStrategy();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}