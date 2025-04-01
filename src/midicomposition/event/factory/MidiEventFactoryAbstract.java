package midicomposition.event.factory;

import javax.sound.midi.MidiEvent;
import java.io.*;
import java.util.*;

public interface MidiEventFactoryAbstract {
	MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException;
	MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException;
}
