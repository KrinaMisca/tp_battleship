package Vue;

import java.awt.Color;
import Tools.Tools;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfaceGraphiqueBattleship {
	public static final int N = 10;

	public final List<JButton> list = new ArrayList<JButton>();

	public int PositionX;
	public int PositionY;
	protected int index;

	public InterfaceGraphiqueBattleship() {
		JFrame f = new JFrame("GridButton");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(createGridPanel());
		f.pack();
		f.setLocationRelativeTo(null);
		f.setVisible(true);

	}

	public JButton getGridButton(int PositionX, int PositionY) {
		index = PositionX * 10 + PositionY;
		System.out.println(index);
		return list.get(index);

	}

	public int getPositionX() {
		return PositionX;
	}

	public void setPositionX(int positionX) {
		PositionX = positionX;
	}

	public int getPositionY() {
		return PositionY;
	}

	public void setPositionY(int positionY) {
		PositionY = positionY;
	}

	public List<JButton> getList() {
		return list;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public JButton createGridButton(int PositionX, int PositionY) {
		JButton b = new JButton(PositionX + "" + (PositionY));

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton gb = InterfaceGraphiqueBattleship.this.getGridButton(PositionX, PositionY);

			}
		});
		return b;
	}

	public JPanel createGridPanel() {
		JPanel p = new JPanel(new GridLayout(10, 10));

		for (int i = 0; i < 10 * 10; i++) {
			int PositionY = i % 10;
			int PositionX = i / 10;
			JButton gb = createGridButton(PositionX, PositionY);
			list.add(gb);

			p.add(gb);

		}
		return p;
	}

}
