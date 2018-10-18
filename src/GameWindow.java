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
		super("拼图小游戏");
		bar = new JMenuBar();
		setJMenuBar(bar);
		menuGame = new JMenu("游戏");
		menuHelp = new JMenu("帮助");
		
		bar.add(menuGame);
		bar.add(menuHelp);
		menuImage = new JMenu("图片选择");
		this.qqImage = new JRadioButtonMenuItem("QQ图片",true);
		this.qqImage.addActionListener(this);
		this.flowerImage = new JRadioButtonMenuItem("花图片");
		this.flowerImage.addActionListener(this);
		this.catImage = new JRadioButtonMenuItem("猫图片");
		this.catImage.addActionListener(this);
		this.loadOtherImage = new JRadioButtonMenuItem("从本地选择图片");
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
		oneGradeItem = new JMenuItem("普通级别3*3");
		this.oneGradeItem.addActionListener(this);
		twoGradeItem = new JMenuItem("高级级别4*4");
		this.twoGradeItem.addActionListener(this);
		ButtonGroup group2 = new ButtonGroup();
		group2.add(oneGradeItem);
		group2.add(twoGradeItem);
		musicItem = new JMenuItem("背景音乐播放控制");
		this.musicItem.addActionListener(this);
		menuResult = new JMenu("查看排行榜");
		this.oneGradeResult = new JMenuItem("普通级别排行");
		this.oneGradeResult.addActionListener(this);
		this.twoGradeResult = new JMenuItem("高级级别排行");
		this.twoGradeResult.addActionListener(this);
		this.menuResult.add(this.oneGradeResult);
		this.menuResult.add(this.twoGradeResult);
		exitItem = new JMenuItem("退出");
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
		this.gameDescription = new JMenuItem("游戏说明");
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
