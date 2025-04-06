package midicomposition.strategy.instrument;

import javax.sound.midi.Track;

public interface InstrumentStrategy {
	/**
	 * Method prototype to apply an instrument to a track in a specified channel
	 * @param track
	 * @param channel
	 */
	public void applyInstrument(Track track, int channel);
}
