import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JPanel;

//����Panel���� superClass

public class MyPanel extends JPanel{
	/*		��������		*/
	JFrame attachTo;	//�гε��� ���� JFrame
	
	
	/*		������		*/
	public MyPanel(JFrame attachTo){
		this.attachTo = attachTo;
	}
	
	
	/*		static�Լ�		*/
	//GridBagConstraints ���� �Լ�
	public static void setGridBagCon(GridBagConstraints gc, int x, int y, int width, int height) {
		gc.gridx = x;
		gc.gridy = y;
		gc.gridwidth = width;
		gc.gridheight = height;
	}
	public static void setGridBagCon(GridBagConstraints gc, int x, int y) {
		gc.gridx = x;
		gc.gridy = y;
		gc.gridwidth = 1;
		gc.gridheight = 1;
	}
	
	
	/*		�Լ�		*/
	//attachTo�� MyPanel�� ���̴� �Լ�
	//���� ���� �� setVisible�� true�� �����Ѵ�.
    public void add(){
    	attachTo.add(this);
    	this.setVisible(true);
    }
    //attachTo���� MyPanel�� ����� �Լ�
    //���� setVisible�� false�� �� ��, �����.
    private void delete(){
    	this.setVisible(false);
    	attachTo.getContentPane().remove(this);
    }
    
}//end MyPanel
