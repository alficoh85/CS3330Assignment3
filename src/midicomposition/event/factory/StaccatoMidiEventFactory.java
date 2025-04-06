package midicomposition.event.factory;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
import midicomposition.event.data.MidiEventData;

public class StaccatoMidiEventFactory implements MidiEventFactory {
	/**
	 * Reduction for ticks of NOTE_OFF MidiEvent objects
	 */
	private static final int STACCATO_REDUCTION = 10;

	/**
	 * Method to create a NOTE_ON MidiEvent
	 * @param tick
	 * @param note
	 * @param velocity
	 * @param channel
	 * @return
	 * @throws InvalidMidiDataException
	 */
	@Override
    public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
        ShortMessage message = new ShortMessage();
        message.setMessage(ShortMessage.NOTE_ON, channel, note, velocity);
        return new MidiEvent(message, tick);
    }

	/**
	 * Method to create a NOTE_OFF MidiEvent with Legato extension
	 * @param tick
	 * @param note
	 * @param channel
	 * @return
	 * @throws InvalidMidiDataException
	 */
    @Override
    public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
        ShortMessage message = new ShortMessage();
        message.setMessage(ShortMessage.NOTE_OFF, channel, note, 0);
        return new MidiEvent(message, tick - STACCATO_REDUCTION);
    }

}
