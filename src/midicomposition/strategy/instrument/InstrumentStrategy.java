package midicomposition.strategy.instrument;

import javax.sound.midi.Track;

public interface InstrumentStrategy {
	public void applyInstrument(Track track, int channel);
}
