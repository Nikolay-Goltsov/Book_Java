/**
 * 
 */
/**
 * 
 */
package ru.nikolai.goltsov.DrumBass;

import javax.sound.midi.*;

/**
 * @author Hakers
 *
 */
public class MusicTest {

	/**
	 * @param args
	 */
	// Метод проигрывает MIDI файлы при помощи
	// встроенного класса Sequencer

	public void play() {
		// При помощи try/catch ловим исключения,
		// которые возникают при вызове MidiSystem.getSequencer()
		try {
			// Вызов экземпляра класса Sequencer()
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("Успешно  получили синтезатор");
			// Если поймали исключение то....
		} catch (MidiUnavailableException ex) {
			// TODO Auto-generated catch block
			System.out.println("Неудача при создании синтезатора");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicTest mt = new MusicTest();
		mt.play();

	}

}