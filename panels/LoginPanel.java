import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class LoginPanel extends MyPanel{
	/*		변수선언		*/
	private JLabel laTitle;
	private JLabel laSubTitle;
	private JLabel id;
	private JTextField idTF;
	private JLabel pw;
	private JTextField pwTF;

	/*		생성자		*/
	public LoginPanel(JFrame attachTo) {
		//부모 설정
		super(attachTo);
		
		//기본 설정들
		setLayout(new GridBagLayout());
		setBackground(attachTo.getBackground());
		setSize(attachTo.getSize());

		//GridBagConstraints 만들기
		GridBagConstraints gc = new GridBagConstraints();
		gc.fill = GridBagConstraints.NONE;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = gc.NONE;
		
		//이것저것 붙이기
		laSubTitle = new JLabel("모두가 행복한");
		laSubTitle.setFont(new Font("궁서체", Font.PLAIN, 50));
		setGridBagCon(gc, 1, 0, 2, 1);
		add(laSubTitle, gc);
		
		laTitle = new JLabel("용용 부동산");
		laTitle.setFont(new Font("맑은 고딕", Font.BOLD, 80));
		setGridBagCon(gc, 2, 1, 2, 1);
		add(laTitle, gc);
		
		id = new JLabel(" 아이디 : ");
		id.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		gc.gridx = 1;
		gc.gridy = 3;
		add(id, gc);
		idTF = new JTextField(10);
		gc.gridx = 2;
		add(idTF, gc);
		
		pw = new JLabel("비밀번호 : ");
		pw.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		gc.gridx = 1;
		gc.gridy = 4;
		add(pw, gc);
	}//end constructor
	
}//end class
