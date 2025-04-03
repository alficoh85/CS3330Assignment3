package midicomposition.event.factory;

import midicomposition.data.MidiEventData;
import javax.sound.midi.*;

public class StandardMidiEventFactory implements MidiEventFactoryAbstract {

	@Override
	public void createMidiEvents(midicomposition.event.data.MidiEventData data, Track track) throws InvalidMidiDataException {
		ShortMessage on = new ShortMessage();
        on.setMessage(ShortMessage.NOTE_ON, data.getChannel(), data.getNote(), data.getVelocity());
        track.add(new MidiEvent(on, data.getStartEndTick()));

        ShortMessage off = new ShortMessage();
        off.setMessage(ShortMessage.NOTE_OFF, data.getChannel(), data.getNote(), 0);
        track.add(new MidiEvent(off, data.getStartEndTick() + 1));
	}


}
