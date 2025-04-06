package midicomposition.strategy.pitch;

public class HigherPitchStrategy implements PitchStrategy {
	/**
	 * Method to increase pitch by 2
	 * @param note
	 * @return
	 */
	@Override
	public int modifyPitch(int note) {
		return note + 2;
	}
}
