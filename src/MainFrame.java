/* ������ : ����ä
 * ���۱Ⱓ : 2015/06/08~
 * �������Ʈ
 * 	GridBagLayout -> http://sexy.pe.kr/tc/i/entry/754
 */
//gitHub 06/09��ġ

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MainFrame extends JFrame{
	
	/*		������ ����	*/
	
	//final ����
	private final int WIDTH = 800;
	private final int HEIGHT = 600;
	
	/*	===========================
	  	Ŭ���� Ÿ�Կ� ���� ���̻縦 ����
	  	JPanel		-> *Panel
	  	JLabel		-> ����
	  	JTextField	-> *TF
	 	ex) loginPanel
		===========================	*/
	//�α��� â ����
	private JPanel loginPanel;
	private JLabel title;
	private JLabel subTitle;
	private JLabel id;
	private JTextField idTF;
	private JLabel pw;
	private JTextField pwTF;

	
	/*		�Լ��� ����	*/
	//GridBagConstraints ���� �Լ�
	public void setGridBagCon(GridBagConstraints gc, int x, int y, int width, int height){
		gc.gridx = x;
		gc.gridy = y;
		gc.gridwidth = width;
		gc.gridheight = height;
	}
	public void setGridBagCon(GridBagConstraints gc, int x, int y){
		gc.gridx = x;
		gc.gridy = y;
		gc.gridwidth = 1;
		gc.gridheight = 1;
	}
	
	//�α��� �г� ����
	public void setLoginPanel(){
		loginPanel = new JPanel(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		gc.fill = GridBagConstraints.NONE;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = gc.NONE;
		
		loginPanel.setBackground(this.getBackground());
		loginPanel.setSize(WIDTH, HEIGHT);
		
		subTitle = new JLabel("��ΰ� �ູ��");
		subTitle.setFont(new Font("�ü�ü", Font.PLAIN, 50));
		setGridBagCon(gc, 1, 0, 2, 1);
		loginPanel.add(subTitle, gc);
		
		title = new JLabel("��� �ε���");
		title.setFont(new Font("���� ���", Font.BOLD, 80));
		setGridBagCon(gc, 2, 1, 2, 1);
		loginPanel.add(title, gc);
		
		id = new JLabel(" ���̵� : ");
		id.setFont(new Font("���� ���", Font.PLAIN, 20));
		gc.gridx = 1;
		gc.gridy = 3;
		loginPanel.add(id, gc);
		idTF = new JTextField(10);
		gc.gridx = 2;
		loginPanel.add(idTF, gc);
		
		pw = new JLabel("��й�ȣ : ");
		pw.setFont(new Font("���� ���", Font.PLAIN, 20));
		gc.gridx = 1;
		gc.gridy = 4;
		loginPanel.add(pw, gc);
		
		//#####setBorder�� �� �����#####
	}//end setLoginPanel()
	
	//�� ����
	public void start(){
		//���������� ����
		setTitle("���ε���");
		setSize(WIDTH, HEIGHT);
		setBackground(new Color(150,200,150));
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//�гε� ����, ���̱�
		setLoginPanel();
		
		add(loginPanel);
		
		setVisible(true);
	}//end start()

	public static void main(String[] args) {
		//������ ��ü ��Ʈ�ٲٱ� -> ���� ����
		//UIManager.getLookAndFeelDefaults().put("defaultFont", new Font("Arial",Font.BOLD,50));
		MainFrame mf = new MainFrame();
		mf.start();
	}

}