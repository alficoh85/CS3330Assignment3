package midicomposition.event.factory;

import javax.sound.midi.ShortMessage;

public class LegatoMidiEventFactory implements MidiEventFactoryAbstract {

	@Override
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
		return new MidiEvent(new ShortMessage(ShortMessage.NOTE_ON, channel, note, velocity), tick);
	}

	@Override
	public MidiEvent createNoteOff(int tick, int note) {
		return new MidiEvent(new ShortMessage(ShortMessage.NOTE_OFF, channel, note, 0), tick + 80);
	}

}
