package midicomposition.event.factory;

import midicomposition.event.data.*;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.Track;

public interface MidiEventFactoryAbstract {
	void createMidiEvents(MidiEventData data, Track track) throws Exception;
}
