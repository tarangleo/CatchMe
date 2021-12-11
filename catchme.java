import java.awt.*; 
import java.awt.event.*;
import java.awt.image.*;
import java.io.File;
//import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.*; 

 
class catchme extends Frame {

	JButton btn;
	Random r;
        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("C:\\Users\\taran\\OneDrive\\Documents\\NetBeansProjects\\mavenproject1\\src\\main\\java\\theif.jpg");
	int diff=0;
        int count=1;
        catchme() 
        {
		setLayout(null);
		r=new Random();
                Image j=i.getScaledInstance(250, 250, Image.SCALE_DEFAULT);
//                BufferedImage tempPNG = ImageIO.read(new File("C:\\Users\\taran\\OneDrive\\Documents\\NetBeansProjects\\mavenproject1\\src\\main\\java\\theif.png"));
//                final int color = tempPNG.getRGB(0, 0);
//
//                final Image imageWithTransparency = makeColorTransparent(tempPNG, new Color(color));
                               
                JLabel background;
                setSize(1600, 1200);
                setLayout(null);
            // setDefaultCloseOperation(EXIT_ON_CLOSE);
                Image img = t.getImage("C:\\Users\\taran\\OneDrive\\Documents\\NetBeansProjects\\mavenproject1\\src\\main\\java\\theif.jpg");
                Image img1=img.getScaledInstance(1500, 1100, Image.SCALE_DEFAULT);
                background = new JLabel("", new ImageIcon(img1), JLabel.CENTER);
                background.setBounds(-20, 0, 1600, 1200);
                add(background);
                

                btn=new JButton( new ImageIcon(j));
		btn.setBounds(250,250,250,250);
		
		add(btn);
	
		setBounds(400,400,1600,1200);
		
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
                    Image j1=i.getScaledInstance(250-diff, 250-diff, Image.SCALE_DEFAULT);
                    btn.setIcon(new ImageIcon(j1));
                    btn.setBounds(250,250,250-diff,250-diff);
                    setTitle("LEVEL"+count);
                    // You Won Page
                    
                    
                });
                
		setVisible(true);
	}
        
//        public static BufferedImage imageToBufferedImage(final Image image)
//        {
//            final BufferedImage bufferedImage =
//            new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
//            final Graphics2D g2 = bufferedImage.createGraphics();
//            g2.drawImage(image, 0, 0, null);
//            g2.dispose();
//            return bufferedImage;
//        }
//        public static Image makeColorTransparent(final BufferedImage im, final Color color)
//        {
//            final ImageFilter filter = new RGBImageFilter()
//            {
//         // the color we are looking for (white)... Alpha bits are set to opaque
//                public int markerRGB = color.getRGB() | 0xFFFFFFFF;
//
//                public final int filterRGB(final int x, final int y, final int rgb)
//                    {
//                        if ((rgb | 0xFF000000) == markerRGB)
//                        {
//               // Mark the alpha bits as zero - transparent
//                            return 0x00FFFFFF & rgb;
//                        }
//                        else
//                        {
//               // nothing to do
//                           return rgb;
//                        }
//                    }
//             };
//
//            final ImageProducer ip = new FilteredImageSource(im.getSource(), filter);
//            return Toolkit.getDefaultToolkit().createImage(ip);
//        }
}