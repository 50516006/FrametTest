package frametest;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Calculation_lib;



public class Frame_view extends Frame implements ActionListener,WindowListener
{
	private TextField text1 = new TextField("", 10);
	private TextField text2 = new TextField("", 10);
	private Button button1 = new Button("計算");
	private TextField text3 = new TextField("", 10);
	private TextField text4 = new TextField("", 10);
	private TextField text5 = new TextField("", 10);
	private TextField text6 = new TextField("", 10);

	public Frame_view()  {	
		addWindowListener(this);
		setTitle("TEST");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(text1);
		add(text2);
		add(button1);
		button1.addActionListener(this);
        add(new Label("加算"));
		add(text3);
        add(new Label("減算"));
		add(text4);
        add(new Label("乗算"));
		add(text5);
        add(new Label("除算"));
		add(text6);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Frame_view(GraphicsConfiguration gc) {
		super(gc);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Frame_view(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Frame_view(String title) throws HeadlessException {
		super(title);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		int val1 = Integer.parseInt(text1.getText());
		int val2 = Integer.parseInt(text2.getText());
		//text3.setText(String.valueOf(val1 + val2));
		Calculation_lib clib = new Calculation_lib(val1, val2);
		text3.setText(String.valueOf(clib.getPlus()));
		text4.setText(String.valueOf(clib.getMinus()));
		text5.setText(String.valueOf(clib.getProduct()));
		text6.setText(String.valueOf(clib.getDivide())+"余り"+String.valueOf(clib.getMod()));



	}

}
