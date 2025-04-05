package midicomposition.event.factory;

public class StandardMidiEventFactoryAbstract implements MidiEventFactoryAbstract{

	@Override
	public MidiEventFactory createFactory() {
		return new StandardMidiEventFactory();
	}
}
