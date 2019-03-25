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
	// ����� ����������� MIDI ����� ��� ������
	// ����������� ������ Sequencer

	public void play() {
		// ��� ������ try/catch ����� ����������,
		// ������� ��������� ��� ������ MidiSystem.getSequencer()
		try {
			// ����� ���������� ������ Sequencer()
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("�������  �������� ����������");
			// ���� ������� ���������� ��....
		} catch (MidiUnavailableException ex) {
			// TODO Auto-generated catch block
			System.out.println("������� ��� �������� �����������");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicTest mt = new MusicTest();
		mt.play();

	}

}
