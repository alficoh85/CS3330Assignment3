package midicomposition.event.factory;

public class LegatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract{

	/**
	 * Method to create a new LegatoMidiEventFactory
	 * @return
	 */
	@Override
	public MidiEventFactory createFactory() {
		return new LegatoMidiEventFactory();
	}

}
