import java.awt.*; 
import java.awt.event.*;
/*import java.awt.image.*;
import java.io.File;*/
//import java.io.IOException;
import java.util.Random;
import javax.swing.*; 
import java.util.Timer;
import java.util.TimerTask;
 
class catchme extends Frame {

	private Timer mGameTimer;
        private int mTimeLeft = 300;
        private final long mDelay = 1000; // Start after 1 second
        private final long mPeriod = 1000; // Ticks every 1 second
        
        JLabel label1 = new JLabel(""),score_label=new JLabel("SCORE");
        JButton btn,sound_button;
	Random r;
        String message="GAME OVER";
        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("C:\\Users\\taran\\OneDrive\\Documents\\NetBeansProjects\\mavenproject1\\src\\main\\java\\theif.png");
	int diff=0;
        int count=1;
        int caught=0;
        String s;
        Sound sound_youwon=new Sound("C:\\Users\\taran\\OneDrive\\Documents\\NetBeansProjects\\mavenproject1\\src\\main\\java\\smb_world_clear.wav",0);
        Sound sound_gameover=new Sound("C:\\Users\\taran\\OneDrive\\Documents\\NetBeansProjects\\mavenproject1\\src\\main\\java\\gameover.wav",0);
        
        Sound sound_bg=new Sound("C:\\Users\\taran\\OneDrive\\Documents\\NetBeansProjects\\mavenproject1\\src\\main\\java\\gamesample1.wav",1);
        catchme(String s) 
        {
                this.s=s;
                SetupTimer();
		setLayout(null);
                
                //sound button
                
                Image icon_sound1=t.getImage("C:\\Users\\taran\\OneDrive\\Documents\\NetBeansProjects\\mavenproject1\\src\\main\\java\\sound.png");
                Image icon_sound=icon_sound1.getScaledInstance(80, 60, Image.SCALE_DEFAULT);
                sound_button=new JButton(new ImageIcon(icon_sound));
                sound_button.setBounds(1450,50,50,50);
                add(sound_button);
                sound_button.addActionListener((ActionEvent e) -> {
                    sound_bg.music();
                    sound_bg.k1++;
            
                    sound_bg.count++; 
                });
                
                //background
                JLabel background;
                setSize(1600, 1200);
                setLayout(null);
                
                Image img = t.getImage("C:\\Users\\taran\\OneDrive\\Documents\\NetBeansProjects\\mavenproject1\\src\\main\\java\\2.png");
                Image img1=img.getScaledInstance(1500, 1100, Image.SCALE_DEFAULT);
                background = new JLabel("", new ImageIcon(img1), JLabel.CENTER);
                background.setBounds(-20, 0, 1600, 1200);
                add(background);
                
                
                //score label
                 score_label.setFont(new Font("Comic", Font.BOLD, 20));
                 score_label.setForeground(Color.gray);
                 score_label.setBounds(40, 10, 250, 100);
                 add(score_label);
                 
                 
                 
                //Timer label
                label1.setFont(new Font("Comic", Font.BOLD, 30));
               label1.setForeground(Color.gray);
                label1.setBounds(50, 50, 250, 100);
                add(label1);
                
                //theif image button
                r=new Random();
                Image j=i.getScaledInstance(220, 250, Image.SCALE_DEFAULT);
                
                btn=new JButton( new ImageIcon(j));
		btn.setBounds(250,250,180,220);
		add(btn);
                
		btn.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent me){
				btn.setLocation(8+r.nextInt(1300),31+r.nextInt(700));
			}
		});
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseMoved(MouseEvent me){
				setBackground(Color.white);
				setTitle("LEVEL"+count);
			}
		});
                btn.addActionListener((java.awt.event.ActionEvent evt) -> {
                    
                    count++;
                    diff+=30;
                    Image j1=i.getScaledInstance(250-diff-20, 250-diff-20, Image.SCALE_DEFAULT);
                    btn.setIcon(new ImageIcon(j1));
                    btn.setBounds(250,250,180-diff,220-diff);
                    setTitle("LEVEL"+count);
                    if (count==5)
                    {
                        caught=1;
                        if (mTimeLeft!=0)
                        {
                             message="You won";
                        }
                        youWonPage w=new youWonPage(300-mTimeLeft,s,message);
                        sound_youwon.c.start();
                        setVisible(false); //you can't see me!
                        dispose(); //Destroy the JFrame object

                    }
                    Sound sound_levelclear=new Sound("C:\\Users\\taran\\OneDrive\\Documents\\NetBeansProjects\\mavenproject1\\src\\main\\java\\level_clear.wav",0);
                    sound_levelclear.c.start();
                  });
                
                //frame setup
                setBounds(0,0,1600,1200);
		setVisible(true);
	}
        
        //method of score
        private void SetupTimer() {
            mGameTimer = new Timer();

            TimerTask task = new TimerTask() {
            @Override
            public void run() {
                while (true) {
                    if (caught==1) {
                        mTimeLeft--;
                        mGameTimer.cancel();
                        // Handle your game over thing
                        break;
                    } 
                    else if (mTimeLeft==0)
                        {
                             
                             youWonPage w=new youWonPage(0,s,message);
                             sound_gameover.c.start();
                             mGameTimer.cancel();
                             break;
                        }
                    else {
                        mTimeLeft--;
                        System.out.println(mTimeLeft);
                        label1.setText(String.valueOf(mTimeLeft));
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }
            }
        };

        mGameTimer.scheduleAtFixedRate(task, mDelay, mPeriod);
    }

}