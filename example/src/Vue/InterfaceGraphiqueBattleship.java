package Vue;


import Modele.Bateau;

import java.awt.Color;
import java.awt.EventQueue;
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


	protected int PositionXY;

	
	
	
	
	
	public InterfaceGraphiqueBattleship() {
		JFrame f = new JFrame("GridButton");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(createGridPanel());
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
	}




	public JButton getGridButton(int PositionX, int PositionY) {
        int index = PositionX * N + PositionY;
        return list.get(index);
        
    }
	
	

    public JButton createGridButton(final int PositionX, final int PositionY) {
      JButton b = new JButton( + PositionX + "" + (PositionY));
      
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton gb = InterfaceGraphiqueBattleship.this.getGridButton(PositionX, PositionY);
                ((JButton)e.getSource()).setBackground(Color.red);
                
               
        


       
               
            }
        });
        return b;
    }

    public JPanel createGridPanel() {
        JPanel p = new JPanel(new GridLayout(10,10 ));
       
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
