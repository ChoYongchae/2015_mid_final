/* 제작자 : 조용채
 * 제작기간 : 2015/06/08~
 * 참고사이트
 * 	GridBagLayout -> http://sexy.pe.kr/tc/i/entry/754
 */
//gitHub 06/09설치

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
	
	/*		변수들 선언	*/
	
	//final 변수
	private final int WIDTH = 800;
	private final int HEIGHT = 600;
	
	/*	===========================
	  	클래스 타입에 따라 접미사를 붙임
	  	JPanel		-> *Panel
	  	JLabel		-> 생략
	  	JTextField	-> *TF
	 	ex) loginPanel
		===========================	*/
	//로그인 창 변수
	private JPanel loginPanel;
	private JLabel title;
	private JLabel subTitle;
	private JLabel id;
	private JTextField idTF;
	private JLabel pw;
	private JTextField pwTF;

	
	/*		함수들 선언	*/
	//GridBagConstraints 설정 함수
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
	
	//로그인 패널 관리
	public void setLoginPanel(){
		loginPanel = new JPanel(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		gc.fill = GridBagConstraints.NONE;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = gc.NONE;
		
		loginPanel.setBackground(this.getBackground());
		loginPanel.setSize(WIDTH, HEIGHT);
		
		subTitle = new JLabel("모두가 행복한");
		subTitle.setFont(new Font("궁서체", Font.PLAIN, 50));
		setGridBagCon(gc, 1, 0, 2, 1);
		loginPanel.add(subTitle, gc);
		
		title = new JLabel("용용 부동산");
		title.setFont(new Font("맑은 고딕", Font.BOLD, 80));
		setGridBagCon(gc, 2, 1, 2, 1);
		loginPanel.add(title, gc);
		
		id = new JLabel(" 아이디 : ");
		id.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		gc.gridx = 1;
		gc.gridy = 3;
		loginPanel.add(id, gc);
		idTF = new JTextField(10);
		gc.gridx = 2;
		loginPanel.add(idTF, gc);
		
		pw = new JLabel("비밀번호 : ");
		pw.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		gc.gridx = 1;
		gc.gridy = 4;
		loginPanel.add(pw, gc);
		
		//#####setBorder로 더 깔끔히#####
	}//end setLoginPanel()
	
	//총 관리
	public void start(){
		//메인프레임 설정
		setTitle("용용부동산");
		setSize(WIDTH, HEIGHT);
		setBackground(new Color(150,200,150));
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//패널들 설정, 붙이기
		setLoginPanel();
		
		add(loginPanel);
		
		setVisible(true);
	}//end start()

	public static void main(String[] args) {
		//프레임 전체 폰트바꾸기 -> 아직 실패
		//UIManager.getLookAndFeelDefaults().put("defaultFont", new Font("Arial",Font.BOLD,50));
		MainFrame mf = new MainFrame();
		mf.start();
	}

}