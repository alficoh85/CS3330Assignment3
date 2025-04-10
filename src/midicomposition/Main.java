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
			instrumentStrategy.applyInstrument(track, 0);
			instrumentStrategy = new TrumpetStrategy();
			instrumentStrategy.applyInstrument(track, 1);
			
			PitchStrategy pitchStrategy = new HigherPitchStrategy();
			
			for (MidiEventData event : midiEvents) {
				int modifiedNote = pitchStrategy.modifyPitch(event.getNote());
				modifiedNote = pitchStrategy.modifyPitch(modifiedNote);
				
				if (event.getNoteOnOff() == ShortMessage.NOTE_ON) {
					track.add(factory.createNoteOn(event.getStartEndTick(), modifiedNote, event.getVelocity(), event.getChannel()));
				}
				else {
					track.add(factory.createNoteOff(event.getStartEndTick(), modifiedNote, event.getChannel()));
				}
			}
			
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.setSequence(sequence);
			sequencer.start();
			
			while (sequencer.isRunning() | sequencer.isOpen()) {
				Thread.sleep(100);
			}
			Thread.sleep(500);
			sequencer.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}