package midicomposition.event.factory;

public class StaccatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract{

	/**
	 * Method to create a new StaccatoMidiEventFactory
	 * @return
	 */
	@Override
	public MidiEventFactory createFactory() {
		return new StaccatoMidiEventFactory();
	}

}
