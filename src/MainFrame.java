/* ������ : ����ä
 * ���۱Ⱓ : 2015/06/08~
 * �󼼳���
 * 	06/08 -> GUI ������
 * 	06/09 -> gitHub ����, GUI ������
 * �������Ʈ
 * 	GridBagLayout -> http://sexy.pe.kr/tc/i/entry/754
 */


import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;


public class MainFrame extends JFrame{
	
	/*		������ ����	*/
	//final ����
	private final int WIDTH = 800;
	private final int HEIGHT = 600;
	
	//����
	private int now_panel = 0;
	MyPanel myPanel[] = new MyPanel[2];

	
	/*		�Լ��� ����	*/
	//�� ����
	public void start(){
		//���������� ����
		setTitle("���ε���");
		setSize(WIDTH, HEIGHT);
		setBackground(new Color(150,200,150));
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//�гε� ����, ���̱�
		myPanel[0] = new LoginPanel(this);
		
		myPanel[0].add();
		
		setVisible(true);
	}//end start()

	public static void main(String[] args) {
		//������ ��ü ��Ʈ�ٲٱ� -> ���� ����
		//UIManager.getLookAndFeelDefaults().put("defaultFont", new Font("Arial",Font.BOLD,50));
		MainFrame mf = new MainFrame();
		mf.start();
	}

}