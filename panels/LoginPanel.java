import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class LoginPanel extends MyPanel{
	/*		��������		*/
	private JLabel laTitle;
	private JLabel laSubTitle;
	private JLabel id;
	private JTextField idTF;
	private JLabel pw;
	private JTextField pwTF;

	/*		������		*/
	public LoginPanel(JFrame attachTo) {
		//�θ� ����
		super(attachTo);
		
		//�⺻ ������
		setLayout(new GridBagLayout());
		setBackground(attachTo.getBackground());
		setSize(attachTo.getSize());

		//GridBagConstraints �����
		GridBagConstraints gc = new GridBagConstraints();
		gc.fill = GridBagConstraints.NONE;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = gc.NONE;
		
		//�̰����� ���̱�
		laSubTitle = new JLabel("��ΰ� �ູ��");
		laSubTitle.setFont(new Font("�ü�ü", Font.PLAIN, 50));
		setGridBagCon(gc, 1, 0, 2, 1);
		add(laSubTitle, gc);
		
		laTitle = new JLabel("��� �ε���");
		laTitle.setFont(new Font("���� ���", Font.BOLD, 80));
		setGridBagCon(gc, 2, 1, 2, 1);
		add(laTitle, gc);
		
		id = new JLabel(" ���̵� : ");
		id.setFont(new Font("���� ���", Font.PLAIN, 20));
		gc.gridx = 1;
		gc.gridy = 3;
		add(id, gc);
		idTF = new JTextField(10);
		gc.gridx = 2;
		add(idTF, gc);
		
		pw = new JLabel("��й�ȣ : ");
		pw.setFont(new Font("���� ���", Font.PLAIN, 20));
		gc.gridx = 1;
		gc.gridy = 4;
		add(pw, gc);
	}//end constructor
	
}//end class
