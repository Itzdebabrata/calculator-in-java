import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class cal extends Frame implements ActionListener 
{
	TextField tf;
	Label l1;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,ba,bm,bs,bd,be,clr,bn,bp,del,dot;
	Font f;
	static double d1,d2;
	static double ch;
	public cal(String title)
		{
		super(title);
		setSize(500,500);
		setLayout(null);
		setBackground(Color.BLACK);
		l1=new Label("My calculator");
		l1.setBackground(Color.cyan);
   		tf=new TextField(18);
		tf.setEditable(false);
		b1=new Button("0");
		b2=new Button("1");
		b3=new Button("2");
		b4=new Button("3");
		b5=new Button("4");
		b6=new Button("5");
		b7=new Button("6");
		b8=new Button("7");
		b9=new Button("8");
		b10=new Button("9");
		ba=new Button("+");
		bs=new Button("-");
		bm=new Button("*");
 		bd=new Button("/");
		be=new Button("=");
		clr=new Button("clr");
		bn=new Button("Off");
		bp=new Button("%");
		del=new Button("del");
		dot=new Button(".");
		f=new Font("Arial",Font.BOLD,30);
		l1.setFont(f);
		tf.setFont(f);
		b1.setFont(f);
		b2.setFont(f);
		b3.setFont(f);
		b4.setFont(f);
		b5.setFont(f);
		b6.setFont(f);
		b7.setFont(f);
		b8.setFont(f);
		b9.setFont(f);
		b10.setFont(f);
		ba.setFont(f);
		bs.setFont(f);
		bm.setFont(f);
		bd.setFont(f);
		be.setFont(f);
		clr.setFont(f);
		bn.setFont(f);
		bp.setFont(f);
		del.setFont(f);
		dot.setFont(f);

		l1.setBounds(60,40,200,40);
		add(l1);
		tf.setBounds(60,80,200,40);
		add(tf);
		bn.setBounds(60,120,50,40);
		add(bn);
		clr.setBounds(110,120,50,40);
		add(clr);
		del.setBounds(160,120,50,40);
		add(del);
		bp.setBounds(210,120,50,40);
		add(bp);
		b2.setBounds(60,160,50,40);
		add(b2);
		b3.setBounds(110,160,50,40);
		add(b3);
		b4.setBounds(160,160,50,40);
		add(b4);
		ba.setBounds(210,160,50,40);
		add(ba);
		b5.setBounds(60,200,50,40);
		add(b5);
		b6.setBounds(110,200,50,40);
		add(b6);
		b7.setBounds(160,200,50,40);
		add(b7);
		bs.setBounds(210,200,50,40);
		add(bs);
		b8.setBounds(60,240,50,40);
		add(b8);
		b9.setBounds(110,240,50,40);
		add(b9);
		b10.setBounds(160,240,50,40);
		add(b10);
		bm.setBounds(210,240,50,40);
		add(bm);
		b1.setBounds(60,280,50,40);
		add(b1);
		dot.setBounds(110,280,50,40);
		add(dot);
		bd.setBounds(160,280,50,40);
		add(bd);
		be.setBounds(210,280,50,40);
		add(be);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		ba.addActionListener(this);
		bs.addActionListener(this);
		bm.addActionListener(this);
		bd.addActionListener(this);
		clr.addActionListener(this);
		be.addActionListener(this);
		bn.addActionListener(this);
		bp.addActionListener(this);
		del.addActionListener(this);
		dot.addActionListener(this);
		
		setVisible(true);
		}
		public void actionPerformed(ActionEvent ae)
			{
			Button bb=(Button)ae.getSource();
			String txt=tf.getText();
			if(bb==dot)
				{
				tf.setText(txt+".");
				}
			if(bb==del)
				{
				String s=tf.getText();
				int d=s.length();
				StringBuffer sb=new StringBuffer(s);
				sb.deleteCharAt((d-1));
				s=sb.toString();
				tf.setText(s);
				}
			if(bb==bn)
				{
				tf.setEditable(true);
				bn.setLabel("On");
				}
			if(bb==b1)
				{
				tf.setText(txt+"0");
				}
			if(bb==b2)
				{
				tf.setText(txt+"1");
				}
			if(bb==b3)
				{
				tf.setText(txt+"2");
				}
			if(bb==b4)
				{
				tf.setText(txt+"3");
				}
			if(bb==b5)
				{
				tf.setText(txt+"4");
				}
			if(bb==b6)
				{
				tf.setText(txt+"5");
				}
			if(bb==b7)
				{
				tf.setText(txt+"6");
				}
			if(bb==b8)
				{
				tf.setText(txt+"7");
				}
			if(bb==b9)
				{
				tf.setText(txt+"8");
				}
			if(bb==b10)
				{
				tf.setText(txt+"9");
				}
			if(bb==ba)
				{
				ch=1;
				d1=Double.parseDouble(tf.getText());
 				tf.setText("");
				}
			if(bb==bs)
				{
				ch=2;
				d1=Double.parseDouble(tf.getText());
 				tf.setText("");
				}
			if(bb==bm)
				{
				ch=3;
				d1=Double.parseDouble(tf.getText());
 				tf.setText("");
				}
			if(bb==bd)
				{
				ch=4;
				d1=Double.parseDouble(tf.getText());
 				tf.setText("");
				}
			if(bb==bp)
				{
				ch=5;
				d1=Double.parseDouble(tf.getText());
 				tf.setText("");
				}
			if(bb==clr)
				{
 				tf.setText("");
				}
			if(bb==be)
				{
				d2=Double.parseDouble(tf.getText());
				if(ch==1)
					{
					d1=d1+d2;
					tf.setText(String.valueOf(d1));
					}
				if(ch==2)
					{
					d1=d1-d2;
					tf.setText(String.valueOf(d1));
					}
				if(ch==3)
					{
					d1=d1*d2;
					tf.setText(String.valueOf(d1));
					}
				if(ch==4 )
					{
					d1=d1/d2;
					tf.setText(String.valueOf(d1));
					}
				if(ch==5)
					{
					 d1=((d1/d2)*100);
					tf.setText(String.valueOf(d1));
					}
				}
			}

		public static void main(String args[])
		{
		new cal("calculator");
		}
}
