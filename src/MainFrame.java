/* 제작자 : 조용채
 * 제작기간 : 2015/06/08~
 * 상세내용
 * 	06/08 -> GUI 디자인
 * 	06/09 -> gitHub 연동, GUI 디자인
 * 참고사이트
 * 	GridBagLayout -> http://sexy.pe.kr/tc/i/entry/754
 */


import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;


public class MainFrame extends JFrame{
	
	/*		변수들 선언	*/
	//final 변수
	private final int WIDTH = 800;
	private final int HEIGHT = 600;
	
	//변수
	private int now_panel = 0;
	MyPanel myPanel[] = new MyPanel[2];

	
	/*		함수들 선언	*/
	//총 관리
	public void start(){
		//메인프레임 설정
		setTitle("용용부동산");
		setSize(WIDTH, HEIGHT);
		setBackground(new Color(150,200,150));
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//패널들 설정, 붙이기
		myPanel[0] = new LoginPanel(this);
		
		myPanel[0].add();
		
		setVisible(true);
	}//end start()

	public static void main(String[] args) {
		//프레임 전체 폰트바꾸기 -> 아직 실패
		//UIManager.getLookAndFeelDefaults().put("defaultFont", new Font("Arial",Font.BOLD,50));
		MainFrame mf = new MainFrame();
		mf.start();
	}

}