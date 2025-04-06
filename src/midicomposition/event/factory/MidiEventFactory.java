package midicomposition.event.factory;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;

public interface MidiEventFactory{
	/**
	 * Method prototype to create a new NOTE_ON MidiEvent
	 * @param tick
	 * @param note
	 * @param velocity
	 * @param channel
	 * @return
	 * @throws InvalidMidiDataException
	 */
	MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException;
	
	/**
	 * Method prototype to create a new NOTE_OFF MidiEvent
	 * @param tick
	 * @param note
	 * @param channel
	 * @return
	 * @throws InvalidMidiDataException
	 */
	MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException;
}