package midicomposition.strategy.instrument;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class AcousticGrandPianoStrategy implements InstrumentStrategy {
	/**
	 * Instrument number for acoustic grand piano
	 */
	private static final int INSTRUMENT_NUMBER = 0;

	/**
	 * Applies acoustic grand piano instrument to a track in a specified channel
	 * @param track
	 * @param channel
	 */
	@Override
	public void applyInstrument(Track track, int channel) {
		ShortMessage programChange = new ShortMessage();
        try {
            programChange.setMessage(ShortMessage.PROGRAM_CHANGE, channel, INSTRUMENT_NUMBER, 0);
            MidiEvent event = new MidiEvent(programChange, 0);
            track.add(event);
        } 
        catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
	}
}
