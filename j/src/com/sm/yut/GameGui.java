package com.sm.yut;


import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

public class GameGui extends JFrame implements ActionListener {
	JTextField topText;
	JButton p1,p2,result1,result2;
	JTextField explain1,explain2;
	private int location1 = 0;
	private int location2 = 0;
	JButton bottomButton1,bottomButton2;
	JTextField point1,point2;
	private int up1=0;
	private int up2=0;
	
	Player player1,player2;
	public GameGui(String user1,String user2){
		
		this.player1 =new Player(user1);
		this.player2 = new Player(user2);
		JPanel topPanel = new JPanel(new GridLayout(1, 1));
		JPanel centerPanel = new JPanel(new GridLayout(3, 2));
		JPanel bottomPanel = new JPanel();
		topText = new JTextField("윷놀이에 오신 것을 환영합니다.");
		topPanel.add(topText);
				
		p1 = new JButton(user1+" 윷던져");
		p2 = new JButton(user2+" 윷던져");
		result1 = new JButton("0");
		result2 = new JButton("0");
		explain1 = new JTextField(10);
		explain2 = new JTextField(10);
		centerPanel.add(p1);
		centerPanel.add(p2);
		centerPanel.add(result1);
		centerPanel.add(result2);
		centerPanel.add(explain1);
		centerPanel.add(explain2);
		
		point1 = new JTextField(user1+"point : "+up1);
		point2 = new JTextField(user2+"point : "+up2);
		bottomButton1 = new JButton("자동게임");
		bottomButton2 = new JButton("초기화");
		bottomPanel.add(point1);
		bottomPanel.add(bottomButton1);
		bottomPanel.add(bottomButton2);
		bottomPanel.add(point2);
		
		p1.addActionListener(this);
		p2.addActionListener(this);
		bottomButton1.addActionListener(this);
		bottomButton2.addActionListener(this);
		pack();
		
		add(topPanel,BorderLayout.PAGE_START);
		add(centerPanel,BorderLayout.CENTER);
		add(bottomPanel,BorderLayout.PAGE_END);
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == p1){
			Yut y = new Yut();
			y.roll();
			location1 += y.getNum();
			String resultS = Integer.toString(location2);
			if(location1 == location2){
				location2 = 0;
				result2.setText(Integer.toString(location2));
				explain1.setText(player2.getName()+" 말을 잡았습니다!!");
				explain2.setText(player1.getName()+" 말한테 잡혔네.. 아");				
			}else if(location1 >=30){
				location1 = 0;
				location2 = 0;
				result2.setText(Integer.toString(location1));
				explain1.setText(player1.getName()+" 승리합니다~");
				explain2.setText(player2.getName()+" 패배합니다..");
				up1++;
				point1.setText(player1.getName()+" point : "+up1);
				if(up1 >= up2){
					System.out.println(player1.getName()+" : "+up1+" , " + player2.getName()+" : "+up2);
				}else
					System.out.println(player2.getName()+" : "+up2+" , " + player1.getName()+" : "+up1);
			}else{
				Date date = new Date();
				String dateS = date.toString();
				explain1.setText(y.getNum()+" 나오네요~");
				topText.setText(dateS +" "+player1.getName()+" 윷을 던집니다!!");
			}
			result1.setText(Integer.toString(location1));
		}else if(e.getSource() == p2){
			Yut y = new Yut();
			y.roll();
			location2 += y.getNum();			
			if(location2 == location1){
				location1 = 0;
				result1.setText(Integer.toString(location1));
				explain1.setText(player1.getName()+" 말을 잡았습니다!!");
				explain2.setText(player2.getName()+" 말한테 잡혔네.. 아");			
			}else if(location2 >=30){
				location1 = 0;
				location2 = 0;
				result1.setText(Integer.toString(location1));
				explain1.setText(player1.getName()+" 패배합니다..");
				explain2.setText(player2.getName()+" 승리합니다~");
				up2++;
				point2.setText(player2.getName()+" point : "+up2);
				if(up1 >= up2){
					System.out.println(player1.getName()+" : "+up1+" , " + player2.getName()+" : "+up2);
				}else
					System.out.println(player2.getName()+" : "+up2+" , " + player1.getName()+" : "+up1);
			}else{
				Date date = new Date();
				String dateS = date.toString();
				explain2.setText(y.getNum()+" 나오네요~");
				topText.setText(dateS + " "+player2.getName()+" 윷을 던집니다!!");
			}
			result2.setText(Integer.toString(location2));
		}else if(e.getSource() == bottomButton1){
			while(location1<30 && location2 <30){
				Yut y = new Yut();
				y.roll();
				location1 += y.getNum();
				result1.setText(Integer.toString(location1));
				if(location1 < 30){
					y.roll();
					location2 += y.getNum();
					result2.setText(Integer.toString(location2));	
				}							
			}
			if(location1>location2){
				result1.setText("30");
				explain1.setText(player1.getName()+" 승리합니다~");
				explain2.setText("");
				up1++;
				point1.setText(player1.getName()+" point : "+up1);
				if(e.getSource() == bottomButton1){
					location1 = 0;
					location2 = 0;					
				}
			}else{
				result2.setText("30");
				explain2.setText(player2.getName()+" 승리합니다~");
				explain1.setText("");
				up2++;
				point2.setText(player2.getName()+" point : "+up2);
				if(e.getSource() == bottomButton1){
					location1 = 0;
					location2 = 0;					
				}				
			}
		}else if(e.getSource() == bottomButton2){
			location1 = 0;
			location2 = 0;
			result1.setText(Integer.toString(location1));
			result2.setText(Integer.toString(location2));
			if(up1 >= up2){
				System.out.println(player1.getName()+" : "+up1+" , " + player2.getName()+" : "+up2);
			}else
				System.out.println(player2.getName()+" : "+up2+" , " + player1.getName()+" : "+up1);
		}		
	}
}
