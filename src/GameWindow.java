import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class GameWindow extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JMenuBar bar;
	JMenu menuGame,menuHelp;
	JMenu menuImage;
	JMenu menuResult;
	JMenuItem oneGradeItem;
	JMenuItem twoGradeItem;
	JMenuItem musicItem,exitItem;
	JMenuItem qqImage,flowerImage,catImage,loadOtherImage;
	JMenuItem oneGradeResult,twoGradeResult;
	JMenuItem gameDescription;
	
	public GameWindow() {
		super("ƴͼС��Ϸ");
		bar = new JMenuBar();
		setJMenuBar(bar);
		menuGame = new JMenu("��Ϸ");
		menuHelp = new JMenu("����");
		
		bar.add(menuGame);
		bar.add(menuHelp);
		menuImage = new JMenu("ͼƬѡ��");
		this.qqImage = new JRadioButtonMenuItem("QQͼƬ",true);
		this.qqImage.addActionListener(this);
		this.flowerImage = new JRadioButtonMenuItem("��ͼƬ");
		this.flowerImage.addActionListener(this);
		this.catImage = new JRadioButtonMenuItem("èͼƬ");
		this.catImage.addActionListener(this);
		this.loadOtherImage = new JRadioButtonMenuItem("�ӱ���ѡ��ͼƬ");
		this.loadOtherImage.addActionListener(this);
		ButtonGroup group1 = new ButtonGroup();
		group1.add(qqImage);
		group1.add(flowerImage);
		group1.add(catImage);
		menuImage.add(qqImage);
		menuImage.add(flowerImage);
		menuImage.add(catImage);
		menuImage.addSeparator();
		menuImage.add(loadOtherImage);
		oneGradeItem = new JMenuItem("��ͨ����3*3");
		this.oneGradeItem.addActionListener(this);
		twoGradeItem = new JMenuItem("�߼�����4*4");
		this.twoGradeItem.addActionListener(this);
		ButtonGroup group2 = new ButtonGroup();
		group2.add(oneGradeItem);
		group2.add(twoGradeItem);
		musicItem = new JMenuItem("�������ֲ��ſ���");
		this.musicItem.addActionListener(this);
		menuResult = new JMenu("�鿴���а�");
		this.oneGradeResult = new JMenuItem("��ͨ��������");
		this.oneGradeResult.addActionListener(this);
		this.twoGradeResult = new JMenuItem("�߼���������");
		this.twoGradeResult.addActionListener(this);
		this.menuResult.add(this.oneGradeResult);
		this.menuResult.add(this.twoGradeResult);
		exitItem = new JMenuItem("�˳�");
		this.exitItem.addActionListener(this);
		menuGame.add(this.menuImage);
		menuGame.addSeparator();
		menuGame.add(this.oneGradeItem);
		menuGame.add(this.twoGradeItem);
		menuGame.addSeparator();
		menuGame.add(this.musicItem);
		menuGame.addSeparator();
		menuGame.add(this.menuResult);
		menuGame.addSeparator();
		menuGame.add(this.exitItem);
		this.gameDescription = new JMenuItem("��Ϸ˵��");
		this.gameDescription.addActionListener(this);
		this.menuHelp.add(this.gameDescription);
		
		
		this.setSize(400,350);
		this.setVisible(true);
		setLocationRelativeTo(null);
	}

	
	public void actionPerformed(ActionEvent arg0) {
		
	}
	public static void main(String[] args) {
		new GameWindow();
		
	}

	
}
