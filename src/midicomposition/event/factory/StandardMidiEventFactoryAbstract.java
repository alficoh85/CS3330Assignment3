package midicomposition.event.factory;

public class StandardMidiEventFactoryAbstract implements MidiEventFactoryAbstract{

	/**
	 * Method to create a new StandardMidiEventFactory
	 * @return
	 */
	@Override
	public MidiEventFactory createFactory() {
		return new StandardMidiEventFactory();
	}
}
