import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JPanel;

//여러Panel들의 superClass

public class MyPanel extends JPanel{
	/*		변수선언		*/
	JFrame attachTo;	//패널들을 붙일 JFrame
	
	
	/*		생성자		*/
	public MyPanel(JFrame attachTo){
		this.attachTo = attachTo;
	}
	
	
	/*		static함수		*/
	//GridBagConstraints 설정 함수
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
	
	
	/*		함수		*/
	//attachTo에 MyPanel을 붙이는 함수
	//먼저 붙인 후 setVisible을 true로 설정한다.
    public void add(){
    	attachTo.add(this);
    	this.setVisible(true);
    }
    //attachTo에서 MyPanel을 떼어내는 함수
    //먼저 setVisible을 false로 한 뒤, 떼어낸다.
    private void delete(){
    	this.setVisible(false);
    	attachTo.getContentPane().remove(this);
    }
    
}//end MyPanel
