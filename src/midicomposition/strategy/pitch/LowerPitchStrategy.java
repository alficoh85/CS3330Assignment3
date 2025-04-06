package midicomposition.strategy.pitch;

public class LowerPitchStrategy implements PitchStrategy {
	/**
	 * Method to decrease pitch by 2
	 * @param note
	 * @return
	 */
	@Override
	public int modifyPitch(int note) {
		return note - 2;
	}
}
