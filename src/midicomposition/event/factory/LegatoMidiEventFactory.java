package midicomposition.event.factory;

import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import midicomposition.event.data.MidiEventData;

public class LegatoMidiEventFactory implements MidiEventFactoryAbstract {

	@Override
	public void createMidiEvents(MidiEventData data, Track track) throws Exception {
		ShortMessage on = new ShortMessage();
		on.setMessage(ShortMessage.NOTE_ON, data.getChannel(), data.getNote(), Math.min(127, data.getVelocity() + 20, 0)));
		track.add(new MidiEvent(on, data.getStartEndTick()));
		
		ShortMessage off = new ShortMessage();
		off.setMessage(ShortMessage.NOTE_OFF, data.getChannel(), data.getNote(), 0);
		track.add(new MidiEvent(off,data.getStartEndTick()+10));
	}
}
