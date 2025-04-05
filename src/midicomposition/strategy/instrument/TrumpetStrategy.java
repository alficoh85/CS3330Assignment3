package midicomposition.strategy.instrument;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class TrumpetStrategy implements InstrumentStrategy {
	
	@Override
	public void applyInstrument(Track track, int channel) {
		ShortMessage programChange = new ShortMessage();
        try {
            programChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, 56, 0);
            MidiEvent event = new MidiEvent(programChange, 0);
            track.add(event);
        } 
        catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
	}
}