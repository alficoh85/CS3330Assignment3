package midicomposition.event.data;

public class MidiEventData {
	/**
	 * Instance variables
	 */
	private int startEndTick, velocity, note, channel, noteOnOff;
	
	/**
	 * Instance variable
	 */
	private int instrument;
		
	/**
	 * Parameterized constructor for MidiEventData
	 * @param startEndTick
	 * @param velocity
	 * @param note
	 * @param channel
	 * @param noteOnOff
	 * @param instrument
	 */
	public MidiEventData(int startEndTick, int velocity, int note, int channel, int noteOnOff, int instrument) {
		this.startEndTick = startEndTick;
		this.velocity = velocity;
		this.note = note;
		this.channel = channel;
		this.noteOnOff = noteOnOff;
		this.instrument = instrument;
	}

	/**
	 * Accessor method for startEndTick
	 * @return
	 */
	public int getStartEndTick() {
		return startEndTick;
	}

	/**
	 * Mutator method for startEndTick
	 * @param startEndTick
	 */
	public void setStartEndTick(int startEndTick) {
		this.startEndTick = startEndTick;
	}

	/**
	 * Accessor method for velocity
	 * @return
	 */
	public int getVelocity() {
		return velocity;
	}

	/**
	 * Mutator method for velocity
	 * @param velocity
	 */
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	/**
	 * Accessor method for note
	 * @return
	 */
	public int getNote() {
		return note;
	}

	/**
	 * Mutator method for note
	 * @param note
	 */
	public void setNote(int note) {
		this.note = note;
	}

	/**
	 * Accessor method for channel
	 * @return
	 */
	public int getChannel() {
		return channel;
	}

	/**
	 * Mutator method for channel
	 * @param channel
	 */
	public void setChannel(int channel) {
		this.channel = channel;
	}

	/**
	 * Accessor method for noteOnOff
	 * @return
	 */
	public int getNoteOnOff() {
		return noteOnOff;
	}

	/**
	 * Mutator method for noteOnOff
	 * @param noteOnOff
	 */
	public void setNoteOnOff(int noteOnOff) {
		this.noteOnOff = noteOnOff;
	}

	/**
	 * Accessor method for instrument
	 * @return
	 */
	public int getInstrument() {
		return instrument;
	}

	/**
	 * Mutator method for instrument
	 * @param instrument
	 */
	public void setInstrument(int instrument) {
		this.instrument = instrument;
	}
}