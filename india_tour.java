
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.sql.*;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.border.Border;
import javax.swing.table.AbstractTableModel;
import sun.swing.SwingAccessor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class india_tour {
    String text="";
    BufferedImage imgst;
    int k=0;
    JTextArea ta;
    String s1;
    String supdate;
    JTextArea as;
    JPanel fotb;
    String fcity;
    String acc;
    String pathtp,pathff,pathsh,pathfo,pathst;
    JFrame f1;
    JTextField tf1;
    JPasswordField pf1;
    JScrollPane sptp,spff,spsh,spfo;
    NewPanel mn;
    String qus="";
    JPanel ac1=new JPanel();    
    JPanel tp1=new JPanel();
    JPanel ff1=new JPanel();
    JPanel sh1=new JPanel();
    JPanel fo1=new JPanel();
    JPanel em1=new JPanel();
    JPanel tg1=new JPanel();
    JPanel in1=new JPanel();
    JPanel ac2=new JPanel();    
    JPanel tp2=new JPanel();
    JPanel ff2=new JPanel();
    JPanel sh2=new JPanel();
    JPanel fo2=new JPanel();
    JPanel em2=new JPanel();
    JPanel tg2=new JPanel();
    JPanel in2=new JPanel();
    JPanel tb=new JPanel();
    JPanel statep=new JPanel();
    NewPanel p1;
    Border blackline;
    
    BufferedImage img,img1,img2;
    int flag=0;
    int flag1=0;
    int flag2=0;
    int flag3=0;
    int flag4=0;
    JButton pro;
    String quac="";
    String quco="";
    
    Connection connection;
    
    
    public static void setUIFont (javax.swing.plaf.FontUIResource f){
    java.util.Enumeration keys = UIManager.getDefaults().keys();
    while (keys.hasMoreElements()) {
      Object key = keys.nextElement();
      Object value = UIManager.get (key);
      if (value instanceof javax.swing.plaf.FontUIResource)
        UIManager.put (key, f);
      }
    }
    
    india_tour() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, SQLException{
       Class.forName("com.mysql.cj.jdbc.Driver");
       System.out.println("Driver Loaded");
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "mysql@123");
       System.out.println("Database Connected");
       
                    blackline =BorderFactory.createLineBorder(Color.BLACK);
    
       
        

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        setUIFont (new javax.swing.plaf.FontUIResource("HelveticaNeue",Font.PLAIN,20));
    f1=new JFrame();
    img= ImageIO.read(new File("C:/Users/hp/Desktop/Untitled-1.jpg"));
    img1= ImageIO.read(new File("C:\\Users\\hp\\Desktop\\chinmaya.jpg"));
    img2= ImageIO.read(new File("C:\\Users\\hp\\Desktop\\sup.jpg"));
    
    p1=new NewPanel(img);
    NewPanel pn=new NewPanel(img1);
    NewPanel pr=new NewPanel(img2);
    mn=new NewPanel(img1);
    
    JPanel bp=new JPanel();
    bp.setLayout(new GridLayout(9, 1));
    BPanel ac=new BPanel("Accomodation","C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\ac.png");    
    BPanel tp=new BPanel("Tourist Place","C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\tp.png");
    BPanel ff=new BPanel("Famous For","C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\ff.png");
    BPanel sh=new BPanel("Shopping Spots","C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\sh.png");
    BPanel fo=new BPanel("Food Outlets","C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\fo.png");
    BPanel em=new BPanel("Emergency","C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\em.png");
    BPanel tg=new BPanel("Tour Guide","C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\tg.png");
    BPanel in=new BPanel("Information","C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\in.png");
    BPanel back2=new BPanel("Sign Out","C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\so.png");
    BPanel stct=new BPanel("State and City","C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\stct.jpg");
    
    
    
    JLabel stname =new JLabel("State Name");
    JLabel ctname1=new JLabel("City Name");
    JButton chim=new JButton("Choose an image");
    JLabel statedes=new JLabel("State Description");
    JSeparator stnames=new JSeparator();
    JSeparator ctnames=new JSeparator();
    JTextField stnamet=new JTextField();
    JTextField ctnamet=new JTextField();
    
    JTextArea statedest=new JTextArea();
    
    statedest.setBorder(blackline);
    statedest.setLineWrap(true);
    JButton addstate=new JButton("Add State");
    JButton addcity=new JButton("Add City");
    statep.setBackground(Color.white);
    
    statep.setBounds(300, 200, 1150,850);
    stname.setBounds(100, 20, 300, 30);
    stnamet.setBounds(100, 50, 300, 30);
    stnamet.setBorder(null);
    stnamet.setOpaque(false);
    ctnamet.setBorder(null);
    ctnamet.setOpaque(false);
    stnames.setBounds(100, 80, 300, 30);
    chim.setBounds(420, 50, 200, 30);
    statedes.setBounds(100, 110, 200, 30);
    statedest.setBounds(100, 150, 520, 180);
    addstate.setBounds(100, 345, 200, 30);
    
    ctname1.setBounds(100, 375+30, 200, 30);
    ctnamet.setBounds(100, 405+30, 300, 30);
    ctnames.setBounds(100, 435+30, 300, 30);
    addcity.setBounds(420, 405+30, 200, 30);
    statep.setLayout(null);
    //statep.setBackground(Color.white);
    
    
    statep.add(stname);
    statep.add(stnamet);
    statep.add(stnames);
    statep.add(chim);
    statep.add(statedes);
    statep.add(statedest);
    statep.add(addstate);
    statep.add(ctname1);
    statep.add(ctnamet);
    statep.add(ctnames);
    statep.add(addcity);
    chim.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           JFileChooser j = new JFileChooser();
           int r=j.showOpenDialog(null);
           if(r==JFileChooser.APPROVE_OPTION){
            String path=j.getSelectedFile().getAbsolutePath().toString();
            pathst=path.replaceAll("\\\\", "/");
            
            
           }
           }
       }
    );
    
    addstate.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               try {
                   Statement s=connection.createStatement();
                   String st="Insert into state values "+"("+"'"+stnamet.getText()+"',"+"'"+statedest.getText()+"',"+"'"+pathst+"')";
                   s.executeUpdate(st);
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Something went wrong");
               }
                   
           }
       });
    addcity.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               try {
                   Statement s=connection.createStatement();
                   String st="Insert into city values "+"("+"'"+ctnamet.getText()+"',"+"'"+stnamet.getText()+"')";
                   s.executeUpdate(st);
               } catch (SQLException ex) {
                  JOptionPane.showMessageDialog(null, "Something went wrong");
               }
                   
               
           }
       });
    

    //Information
    ta=new JTextArea("");
    ta.setBounds(50,60,800,300);
    ta.setLineWrap(true);
    in1.add(ta);
    in1.setLayout(null);
    JLabel infol=new JLabel("Information");
    infol.setBounds(50, 20, 100, 30);
    in1.add(infol);
    in1.setBackground(Color.white);
    
    
                        
    
    


    
    
    
     
    
    
    
    JPanel db=new JPanel();
    db.add(ac);
    db.add(tp);
    db.add(ff);
    db.add(sh);
    db.add(fo);
    db.add(em);
    db.add(tg);
    db.add(in);
    db.add(back2);
    ac.setBounds(0, 0, 300, 45);
    tp.setBounds(0, 45, 300, 45);
    ff.setBounds(0, 90, 300, 45);
    sh.setBounds(0, 135, 300, 45);
    fo.setBounds(0, 180, 300, 45);
    em.setBounds(0, 225, 300, 45);
    tg.setBounds(0, 270, 300, 45);
    in.setBounds(0, 315, 300, 45);
    back2.setBounds(0,360, 300, 45);
    
    
    bp.setBorder(null);
    mn.setLayout(null);
    db.setBackground(Color.white);
    db.setBounds(0, 200, 300, 850);
    mn.add(db);
    db.setLayout(null);
    bp.setBounds(0, 0, 300, 400);
   
    p1.setLayout(null);
    BufferedImage ims=ImageIO.read(new File("C:\\Users\\hp\\Desktop\\gb.png"));
    NewPanel pane=new NewPanel(ims);
    pane.setBounds(0, 0, 1300, 200);
    mn.add(pane);
    
    
    JLabel l1=new JLabel("Username");
    JLabel l2=new JLabel("Password");
    JSeparator j1=new JSeparator(SwingConstants.HORIZONTAL);
    JSeparator j2=new JSeparator(SwingConstants.HORIZONTAL);
    tf1=new JTextField(15);
    pf1=new JPasswordField(15);
    JButton log=new JButton("Log In");
    JButton count=new JButton("Create an Account");
    count.setBounds(1050, 800, 200, 30);
    
    
    
    
    
    
    
    
           pr.setLayout(null);
           JLabel user =new JLabel("Username");
           JLabel pass =new JLabel("Password");
           JLabel email =new JLabel("Email");
           JLabel phone =new JLabel("Phone");
               
           JTextField usert =new JTextField();
           JPasswordField passt =new JPasswordField();
           JTextField emailt =new JTextField();
           JTextField phonet =new JTextField();
           
           usert.setBorder(null);
           usert.setOpaque(false);
           passt.setBorder(null);
           passt.setOpaque(false);
           emailt.setBorder(null);
           emailt.setOpaque(false);
           phonet.setBorder(null);
           phonet.setOpaque(false);
           
           
           JSeparator users =new JSeparator();
           JSeparator passs=new JSeparator();
           JSeparator emails =new JSeparator();
           JSeparator phones =new JSeparator();
           users.setForeground(Color.white);
           passs.setForeground(Color.white);
           emails.setForeground(Color.white);
           phones.setForeground(Color.white);
           
           JButton sup = new JButton("Sign Up");
           
           user.setBounds(750, 170+20, 100, 40);
           usert.setBounds(750, 210+20, 400, 40);
           users.setBounds(750, 250+20, 400, 20);
           pass.setBounds(750, 260+20, 100, 40);
           passt.setBounds(750, 300+20, 400, 40);
           passs.setBounds(750, 340+20, 400, 40);
           email.setBounds(750, 350+20, 100, 40);
           emailt.setBounds(750, 390+20, 400, 40);
           emails.setBounds(750, 430+20, 400, 40);
           phone.setBounds(750, 440+20, 100, 40);
           phonet.setBounds(750, 480+20, 400, 40);
           phones.setBounds(750, 520+20, 400, 40);
           
           JButton back5=new JButton("Back");
           back5.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                usert.setText("");
                passt.setText("");
                emailt.setText("");
                phonet.setText("");
                f1.getContentPane().remove(pr);
                f1.getContentPane().add(p1);
                f1.revalidate();
                f1.repaint();   
           }
       });
           back5.setBounds(750, 560+20, 180, 40);
           sup.setBounds(970, 560+20, 180, 40);
           pr.add(back5);
           pr.add(user);
           pr.add(usert);
           pr.add(users);
           pr.add(pass);
           pr.add(passt);
           pr.add(passs);
           pr.add(phone);
           pr.add(phonet);
           pr.add(phones);
           pr.add(email);
           pr.add(emailt);
           pr.add(emails);
           pr.add(sup);
           
    sup.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               try {
                   String s1=usert.getText();
                   String s2=passt.getText();
                   String s3=emailt.getText();
                   String s4=phonet.getText();
                   
                   Statement statement=connection.createStatement();
                   int resultSet=statement.executeUpdate("insert into user values " + "(" + "'" + s1+ "'" + "," +"'"+s2+"'"+ "," +"'"+s3+"'"+ "," +"'"+s4+"'"+ ")");
                   JOptionPane.showMessageDialog(null, "Account Created");
               } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Something went wrong");
               }
           }
       });
    
    count.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           
               
                   f1.getContentPane().remove(p1);
                   f1.getContentPane().add(pr);
                   f1.revalidate();
                   f1.repaint();
                   
                   
               
           
           }
       });
    
    
    
    
    
    
    
    
    
    
    Color c =new Color(255,173,51);
    
    
    
    ac1.setLayout(null);
    ac1.setBounds(300, 200, 1150, 850);
    ac1.setBackground(Color.white);
    
    JLabel cat=new JLabel("Category");
    JLabel acnon=new JLabel("AC/Non-AC");
    JLabel bud=new JLabel("Budget");
    JLabel m1=new JLabel("Min");
    JLabel m2=new JLabel("Max");
    
    JCheckBox res=new JCheckBox("Resort");
    JCheckBox hot=new JCheckBox("Hotels");
    JCheckBox inn=new JCheckBox("Inns");
    JCheckBox fh=new JCheckBox("Farmhouse");
    
    res.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if(flag2==0){
                   flag2=1;
                   qus=qus+"type='Resort'";
               }else qus=qus+"or type='Resort'";
           
           }
       });
    hot.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           if(flag2==0){
                   flag2=1;
                   qus=qus+"type='Hotel'";
               }else qus=qus+" or type='Hotel'";
           }
       });
    inn.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           if(flag2==0){
                   flag2=1;
                   qus=qus+"type='Inn'";
               }else qus=qus+" or type='Inn'";
           }
       });
    fh.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           if(flag2==0){
                   flag2=1;
                   qus=qus+"type='farmhouse'";
               }else qus=qus+" or type='farmhouse'";
               System.out.println(quac);
           }
       });
    JCheckBox acon=new JCheckBox("AC");
    acon.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           if(flag3==0){
                   flag3=1;
                   quac=quac+"AC='AC'";
               }else quac=quac+" or AC='AC'";
           }
       });
    
    JCheckBox ncon=new JCheckBox("Non-AC");
    ncon.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           if(flag3==0){
                   flag3=1;
                   quac=quac+"AC='Non-AC'";
               }else quac=quac+" or AC='Non-AC'";
           }
       });
    
    
    JSeparator mi = new JSeparator(SwingConstants.HORIZONTAL);
    JSeparator ma = new JSeparator(SwingConstants.HORIZONTAL);
    
    JTextField min=new JTextField();
    
    min.setOpaque(true);
    JTextField max=new JTextField();
    max.setOpaque(true);
    min.setBorder(null);
    max.setBorder(null);
    JButton next=new JButton("Next");
    
    
    
    
    next.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               
               try {
                   tb.removeAll();
                    quco=quco+"cost>"+Integer.parseInt(min.getText())+" and cost<"+Integer.parseInt(max.getText());

                    
                   JButton back3=new JButton("Back");
                   back3.addActionListener(new ActionListener() {
                       @Override
                       public void actionPerformed(ActionEvent e) {
                           System.out.println("Hello");   
                           mn.remove(tb);
                   mn.add(ac1);
                   mn.revalidate();
                   mn.repaint();
                   min.setText("");
                   max.setText("");
                   ncon.setSelected(false);
                   acon.setSelected(false);
                   res.setSelected(false);
                   hot.setSelected(false);
                   fh.setSelected(false);
                   inn.setSelected(false);
                   flag2=0;
                   flag3=0;
                   quco="";
                   qus="";
                   quac="";
                       }
                   });
                   back3.setBounds(450,500,100,40);
                   tb.add(back3);
                   tb.setBackground(Color.WHITE);
                   Statement st=connection.createStatement();
                   String query="select count(*) from Accomodation where city="+"'"+fcity+"' and "+"("+qus+") and "+"("+quac+") and "+"("+quco+")";
                   System.out.println(query);
                   ResultSet rs=st.executeQuery(query);
                   int row=0;
                   while(rs.next()){
                       row=rs.getInt(1);
                       System.out.println(row);
                   }
                   String[][] data=new String[row][7];
                   String[]cname={"Name","Type","AC","Cost","Website","Address","Phone"};
                   JTable table=new JTable(data,cname);
                   
                   String query1="select * from Accomodation where city="+"'"+fcity+"' and "+"("+qus+") and "+"("+quac+") and "+"("+quco+")";
                   rs=st.executeQuery(query1);
                   int i=0;
                   while(rs.next()){
                       for(int j=0;j<7;j++){
                           data[i][j]=rs.getString(j+1);
                           
                       }
                       
                       i++;
                   }
                   table.getColumnModel().getColumn(4).setPreferredWidth(300);
                   table.getColumnModel().getColumn(4).setMinWidth(300);
                   table.getColumnModel().getColumn(4).setMaxWidth(300);
                   table.setRowHeight(30);
                   JScrollPane sp=new JScrollPane(table);
                   sp.setBounds(20, 50,900 , 400);
                   tb.add(sp);
                   table.setBorder(null);
                   sp.setBorder(null);
                   tb.setLayout(null);
                   tb.setBounds(300,200,1150,850);
                   System.out.println(query);
                   mn.remove(ac1);
                   mn.add(tb);
                   mn.revalidate();
                   mn.repaint();
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Something went wrong");
               }
           }
       });
    
    

    cat.setBounds(50, 20,  100,30);
    res.setBounds(50, 60, 100, 30);
    hot.setBounds(50, 40+60, 100, 30);
    inn.setBounds(50, 80+60, 100, 30);
    fh.setBounds(50, 120+60, 150, 30);
    res.setBackground(Color.white);
    hot.setBackground(Color.white);
    inn.setBackground(Color.white);
    fh.setBackground(Color.white);
    acnon.setBounds(50, 170+60 , 100,30 );
    acon.setBounds(50,210+60,100,30);
    ncon.setBounds(50,250+60,100,30);
    acon.setBackground(Color.white);
    ncon.setBackground(Color.white);
    bud.setBounds(50, 290+60,  100,30);
    m1.setBounds(50, 330+60, 100,30);
    min.setBounds(90, 330+60, 100,30);
    mi.setBounds(90, 360+60, 100,30);
    m2.setBounds(210, 330+60, 100,30);
    ma.setBounds(260, 360+60, 100,30);
    max.setBounds(260, 330+60, 100,30);
    
    
    next.setBounds(850, 540+25, 100, 30);
    
    
    
    ac1.add(acnon);
    ac1.add(cat);
    ac1.add(res);
    ac1.add(hot);
    ac1.add(inn);
    ac1.add(fh);
    ac1.add(acon);
    ac1.add(ncon);
    ac1.add(bud);
    ac1.add(m1);
    ac1.add(m2);
    ac1.add(mi);
    ac1.add(ma);
    ac1.add(min);
    ac1.add(max);
    ac1.add(next);
    
    
    
    
    
    
    
    
    ac2.setLayout(null);
    ac2.setBackground(Color.white);
    
    
    JLabel name=new JLabel("Name");
    JLabel type=new JLabel("Type");
    JLabel anc=new JLabel("AC/Non-AC");
    JLabel cost=new JLabel("Cost");
    JLabel web=new JLabel("Website");
    JLabel add=new JLabel("Address");
    JLabel ph=new JLabel("Phone");
    
    JTextField namet = new JTextField();
    JTextField typet = new  JTextField();
    JComboBox anct = new  JComboBox();
    anct.setFont(new Font("Tahoma",Font.PLAIN,16));
    anct.addItem("Choose an Option");
    anct.addItem("AC");
    anct.addItem("Non-AC");
    JTextField costt = new  JTextField();
    JTextField webt = new  JTextField();
    JTextField addt = new  JTextField();
    JTextField pht = new  JTextField();
    
    JSeparator names= new JSeparator();
    JSeparator types=new JSeparator();
    JSeparator costs= new JSeparator();        
    JSeparator webs= new JSeparator();        
    JSeparator adds= new JSeparator();        
    JSeparator phs= new JSeparator();               
    
    
    name.setBounds(100, 20, 100, 30);
    namet.setBounds(100, 210-160, 300, 30);
    names.setBounds(100, 240-160, 300, 30);
    namet.setOpaque(false);
    namet.setBorder(null);
    
    type.setBounds(435, 180-160, 50, 30);
    typet.setBounds(435, 210-160, 150, 30);
    types.setBounds(435, 240-160, 150, 30);
    typet.setOpaque(false);
    typet.setBorder(null);
    
    anc.setBounds(100, 270-160, 100, 30);
    anct.setBounds(210, 275-160, 200, 30);
    
    cost.setBounds(100, 315-160, 50, 30);
    costt.setBounds(100, 345-160, 100, 30);
    costs.setBounds(100, 375-160, 100, 30);
    costt.setBorder(null);
    costt.setOpaque(false);
    
    web.setBounds(100, 405-160,100, 30);
    webt.setBounds(100, 435-160, 400, 30);
    webs.setBounds(100, 465-160, 400, 30);
    webt.setBorder(null);
    webt.setOpaque(false);
    
    add.setBounds(100,495-160, 100, 30);
    addt.setBounds(100,525-160, 400, 30);
    adds.setBounds(100,555-160, 400, 30);
    addt.setBorder(null);
    addt.setOpaque(false);
    ph.setBounds(100, 585-160, 400, 30);
    pht.setBounds(100,615-160, 400, 30);
    phs.setBounds(100, 645-160, 400, 30);
    pht.setBorder(null);
    pht.setOpaque(false);
   
    anct.addItemListener(new ItemListener() {
           @Override
           public void itemStateChanged(ItemEvent e) {
            String s1=e.getItem().toString();
            acc=s1;
            
           }
       });
    
    JButton addacc=new JButton("Add Accomodation");
    addacc.setBounds(100, 515, 200, 30);
    ac2.add(addacc);
    
    addacc.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               try {
                   Statement s=connection.createStatement();
                   String st="Insert into accomodation values "+"("+"'"+namet.getText()+"',"+"'"+typet.getText()+"',"+"'"+acc+"',"+costt.getText()+","+"'"+webt.getText()+"',"+"'"+addt.getText()+"',"+pht.getText()+",'"+fcity+"')";
                   s.executeUpdate(st);
                   
               } catch (SQLException ex) {
                  JOptionPane.showMessageDialog(null, "Something went wrong");
               }
           
           
           }
       });
    
    ac2.add(name);
    ac2.add(namet);
    ac2.add(names);
    ac2.add(type);
    ac2.add(types);
    ac2.add(typet);
    ac2.add(anc);
    ac2.add(anct);
    ac2.add(cost);
    ac2.add(costt);
    ac2.add(costs);
    ac2.add(web);
    ac2.add(webt);
    ac2.add(webs);
    ac2.add(add);
    ac2.add(addt);
    ac2.add(adds);
    ac2.add(ph);
    ac2.add(pht);
    ac2.add(phs);
    
    
    
    
    
    
    
    
   
    tp2.setLayout(null);
    tp2.setBackground(Color.WHITE);
    JLabel nametp=new JLabel("Name");
    JLabel des=new JLabel("Description");
    JLabel im =new JLabel("Hello");
    
    JTextField nametpt =new JTextField();
   
    nametpt.setOpaque(false);
   
   
    nametpt.setBorder(null);
    
    JTextArea dest =new JTextArea();
    JButton imb=new JButton("Choose an image");
    dest.setBorder(blackline);
    dest.setLineWrap(true);
    
    imb.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           JFileChooser j = new JFileChooser();
           int r=j.showOpenDialog(null);
           if(r==JFileChooser.APPROVE_OPTION){
            String path=j.getSelectedFile().getAbsolutePath().toString();
            pathtp=path.replaceAll("\\\\", "/");
            
            
           }
           }
       });
    
    JSeparator nametps = new JSeparator();
  
    
    nametp.setBounds(100, 150-130, 100, 30);
    nametpt.setBounds(100, 180-130, 300, 30);
    nametps.setBounds(100, 210-130, 300, 30);
   
    des.setBounds(100, 290-130, 100, 30);
    dest.setBounds(100, 330-130, 700, 200);
    im.setBounds(325,240-130, 100, 30);
    imb.setBounds(100,240-130, 200, 30);
    
    JButton addtp=new JButton("Add Tourist Place");
    addtp.setBounds(100,550-130,200,30);
    tp2.add(addtp);
    addtp.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               try {
                   Statement st=connection.createStatement();
                   String s="insert into tourist_place values"+"("+"'"+nametpt.getText()+"',"+"'"+dest.getText()+"',"+"'"+pathtp+"',"+"'"+fcity+"'"+ ")";
                   System.out.println(s);
                   st.executeUpdate(s);
               } catch (SQLException ex) {
                  JOptionPane.showMessageDialog(null, "Something went wrong");
               }
           }
       });
    tp2.add(nametp);
    tp2.add(nametpt);
    tp2.add(nametps);
    tp2.add(des);
    tp2.add(dest);
    tp2.add(im);
    tp2.add(imb);
    
    
    
    
    
    
    
    
    
    
    ff2.setLayout(null);
    ff2.setBackground(Color.WHITE);
    JLabel nameff=new JLabel("Name");
    JLabel desff=new JLabel("Description");
    JLabel imff =new JLabel("Hello");
    
    JTextField namefft =new JTextField();
    namefft.setOpaque(false);
    namefft.setBorder(null);
    
    JTextArea desfft =new JTextArea();
    JButton imffb=new JButton("Choose an image");
    imffb.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
            JFileChooser j = new JFileChooser();
            int r=j.showOpenDialog(null);
            if(r==JFileChooser.APPROVE_OPTION){
            String path=j.getSelectedFile().getAbsolutePath().toString();
            pathff=path.replaceAll("\\\\", "/");
            }
           }
           
       });
    desfft.setBorder(blackline);
    dest.setLineWrap(true);
    
    JSeparator nameffs = new JSeparator();
    
    nameff.setBounds(100, 150-130, 100, 30);
    namefft.setBounds(100, 180-130, 300, 30);
    nameffs.setBounds(100, 210-130, 300, 30);
    desff.setBounds(100, 290-130, 100, 30);
    desfft.setBounds(100, 330-130, 700, 200);
    imff.setBounds(325,240-130, 100, 30);
    imffb.setBounds(100,240-130, 200, 30);
    
    JButton addff=new JButton("Add This");
    addff.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
            try {
                   Statement st=connection.createStatement();
                   String s="insert into famous_for values"+"("+"'"+namefft.getText()+"',"+"'"+desfft.getText()+"',"+"'"+pathff+"',"+"'"+fcity+"'"+ ")";
                   System.out.println(s);
                   st.executeUpdate(s);
               } catch (SQLException ex) {
                  JOptionPane.showMessageDialog(null, "Something went wrong");
               }

           }
       });
    addff.setBounds(100,550-130,200,30);
    ff2.add(addff);
    
    
    ff2.add(nameff);
    ff2.add(namefft);
    ff2.add(nameffs);
    ff2.add(desff);
    ff2.add(desfft);
    ff2.add(imff);
    ff2.add(imffb);
    
    
    
    
    sh2.setLayout(null);
    sh2.setBackground(Color.WHITE);
    JLabel namesh=new JLabel("Name");
    JLabel dessh=new JLabel("Description");
    JLabel imsh =new JLabel("Hello");
    
    JTextField namesht =new JTextField();
    namesht.setOpaque(false);
    namesht.setBorder(null);
    
    JTextArea dessht =new JTextArea();
    JButton imshb=new JButton("Choose an image");
    imshb.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           JFileChooser j = new JFileChooser();
            int r=j.showOpenDialog(null);
            if(r==JFileChooser.APPROVE_OPTION){
            String path=j.getSelectedFile().getAbsolutePath().toString();
            pathsh=path.replaceAll("\\\\", "/");
            }
           }
       });
    dessht.setBorder(blackline);
    dessht.setLineWrap(true);
    
    JSeparator nameshs = new JSeparator();
    
    namesh.setBounds(100, 150-130, 100, 30);
    namesht.setBounds(100, 180-130, 300, 30);
    nameshs.setBounds(100, 210-130, 300, 30);
    dessh.setBounds(100, 290-130, 100, 30);
    dessht.setBounds(100, 330-130, 700, 200);
    imsh.setBounds(325,240-130, 100, 30);
    imshb.setBounds(100,240-130, 200, 30);
    
    JButton addsh=new JButton("Add Shopping Spot");
    addsh.setBounds(100,550-130,200,30);
    sh2.add(addsh);
    addsh.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           try {
                   Statement st=connection.createStatement();
                   String s="insert into shopping_spots values"+"("+"'"+namesht.getText()+"',"+"'"+dessht.getText()+"',"+"'"+pathsh+"',"+"'"+fcity+"'"+ ")";
                   System.out.println(s);
                   st.executeUpdate(s);
               } catch (SQLException ex) {
                  JOptionPane.showMessageDialog(null, "Something went wrong");
               }
           }
       });
    
    
    
    sh2.add(namesh);
    sh2.add(namesht);
    sh2.add(nameshs);
    sh2.add(dessh);
    sh2.add(dessht);
    sh2.add(imsh);
    sh2.add(imshb);
    
    
    
    
    
    
    
    fo2.setLayout(null);
    fo2.setBackground(Color.WHITE);
    JLabel namefo=new JLabel("Name");
    JLabel desfo=new JLabel("Description");
    JLabel imfo =new JLabel("Hello");
    
    JTextField namefot =new JTextField();
    namefot.setOpaque(false);
    namefot.setBorder(null);
    
    JTextArea desfot =new JTextArea();
    JButton imfob=new JButton("Choose an image");
    imfob.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           JFileChooser j = new JFileChooser();
            int r=j.showOpenDialog(null);
            if(r==JFileChooser.APPROVE_OPTION){
            String path=j.getSelectedFile().getAbsolutePath().toString();
            pathfo=path.replaceAll("\\\\", "/");
            }
           }
       });
    desfot.setBorder(blackline);
    desfot.setLineWrap(true);
    
    JSeparator namefos = new JSeparator();
    
    namefo.setBounds(100, 150-130, 100, 30);
    namefot.setBounds(100, 180-130, 300, 30);
    namefos.setBounds(100, 210-130, 300, 30);
    desfo.setBounds(100, 290-130, 100, 30);
    desfot.setBounds(100, 330-130, 700, 200);
    imfo.setBounds(325,240-130, 100, 30);
    imfob.setBounds(100,240-130, 200, 30);
    
    JButton addfo=new JButton("Add Food Outlet");
    addfo.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           try {
                   Statement st=connection.createStatement();
                   String s="insert into restraunt values"+"("+"'"+namefot.getText()+"',"+"'"+desfot.getText()+"',"+"'"+pathfo+"',"+"'"+fcity+"'"+ ")";
                   System.out.println(s);
                   st.executeUpdate(s);
               } catch (SQLException ex) {
                  JOptionPane.showMessageDialog(null, "Something went wrong");
               }
           }
       });
    addfo.setBounds(100,550-130,200,30);
    fo2.add(addfo);
    
    
    fo2.add(namefo);
    fo2.add(namefot);
    fo2.add(namefos);
    fo2.add(desfo);
    fo2.add(desfot);
    fo2.add(imfo);
    fo2.add(imfob);
    
    
    
    
    
    
    em2.setLayout(null);
    em2.setBackground(Color.WHITE);
    JLabel at=new JLabel("ATM");
    JLabel ho=new JLabel("Hospital");
    JLabel hel =new JLabel("Helpline");
    JLabel nameat=new JLabel("Name");
    JLabel nameho=new JLabel("Name");
    JLabel namehel=new JLabel("Name of the helpline");
    JLabel addat=new JLabel("Address");
    JLabel addho=new JLabel("Address");
    JLabel conho=new JLabel("Contact No.");
    JLabel helno=new JLabel("Helpline No.");
    
    
    
    JTextField nameatt=new JTextField();
    JTextField namehot=new JTextField();
    JTextField namehelt=new JTextField();
    JTextField addatt=new JTextField();
    JTextField addhot=new JTextField();
    JTextField conhot=new JTextField();
    JTextField helnot=new JTextField();
    
    JSeparator nameats=new JSeparator();
    JSeparator namehos=new JSeparator();
    JSeparator namehels=new JSeparator();
    JSeparator addats=new JSeparator();
    JSeparator addhos=new JSeparator();
    JSeparator conhos=new JSeparator();
    JSeparator helnos=new JSeparator();
    
    JButton atm=new JButton("Add ATM");
    atm.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           try {
                   Statement st=connection.createStatement();
                   String s="insert into atm values"+"("+"'"+nameatt.getText()+"',"+"'"+addatt.getText()+"',"+"'"+fcity+"'"+ ")";
                   System.out.println(s);
                   st.executeUpdate(s);
               } catch (SQLException ex) {
                  JOptionPane.showMessageDialog(null, "Something went wrong");
               }
           }
       });
    JButton hospital=new JButton("Add Hospital");
    hospital.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           try {
                   Statement st=connection.createStatement();
                   String s="insert into hospital values"+"("+"'"+namehot.getText()+"',"+"'"+addhot.getText()+"',"+conhot.getText()+","+"'"+fcity+"'"+ ")";
                   System.out.println(s);
                   st.executeUpdate(s);
               } catch (SQLException ex) {
                  JOptionPane.showMessageDialog(null, "Something went wrong");
               }
           }
       });
    JButton helpline=new JButton("Add Helpline");
    helpline.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           try {
                   Statement st=connection.createStatement();
                   String s="insert into helpline values"+"("+"'"+namehelt.getText()+"',"+helnot.getText()+","+"'"+fcity+"'"+ ")";
                   System.out.println(s);
                   st.executeUpdate(s);
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Something went wrong");
               }
           }
       });
    
    atm.setBounds(100,160,200,30);
    hospital.setBounds(330,390,200,30);
    helpline.setBounds(100,590,200,30);
    
    em2.add(atm);
    em2.add(hospital);
    em2.add(helpline);
    
    nameatt.setOpaque(false);
    nameatt.setBorder(null);
    namehot.setOpaque(false);
    namehot.setBorder(null);
    namehelt.setOpaque(false);
    namehelt.setBorder(null);
    addatt.setOpaque(false);
    addatt.setBorder(null);
    addhot.setOpaque(false);
    addhot.setBorder(null);
    conhot.setOpaque(false);
    conhot.setBorder(null);
    helnot.setOpaque(false);
    helnot.setBorder(null);
    
    at.setBounds(100, 20, 200, 30);
    nameat.setBounds(100, 70, 200, 30);
    nameatt.setBounds(100, 100, 200, 30);
    nameats.setBounds(100, 130, 200, 30);
    addat.setBounds(330, 70, 200, 30);
    addatt.setBounds(330, 100, 400, 30);
    addats.setBounds(330, 130, 400, 30);
    
    ho.setBounds(100, 220, 200, 30);
    nameho.setBounds(100, 270, 200, 30);
    namehot.setBounds(100, 300, 200, 30);
    namehos.setBounds(100, 330, 200, 30);
    addho.setBounds(330, 270, 200, 30);
    addhot.setBounds(330, 300, 400, 30);
    addhos.setBounds(330, 330, 400, 30);
    conho.setBounds(100, 360, 200, 30);
    conhot.setBounds(100, 390, 200, 30);
    conhos.setBounds(100, 420, 200, 30);
    
    hel.setBounds(100, 450, 200, 30);
    namehel.setBounds(100, 500, 200, 30);
    namehelt.setBounds(100, 530, 200, 30);
    namehels.setBounds(100, 560, 200, 30);
    helno.setBounds(330, 500, 200, 30);
    helnot.setBounds(330, 530, 200, 30);
    helnos.setBounds(330, 560, 200, 30);
    
    em2.add(at);
    em2.add(ho);
    em2.add(hel);
    em2.add(nameat);
    em2.add(nameho);
    em2.add(namehel);
    em2.add(addat);
    em2.add(addho);
    em2.add(conho);
    em2.add(helno);
    em2.add(nameatt);
    em2.add(namehot);
    em2.add(namehelt);
    em2.add(addatt);
    em2.add(addhot);
    em2.add(conhot);
    em2.add(helnot);
    em2.add(nameats);
    em2.add(namehos);
    em2.add(namehels);
    em2.add(addats);
    em2.add(addhos);
    em2.add(conhos);
    em2.add(helnos);
    
    
    
    
    
    
    tg2.setLayout(null);
    tg2.setBackground(Color.WHITE);
    JLabel nametg=new JLabel("Name");
    JLabel gen=new JLabel("Gender");
    JLabel contg =new JLabel("Contact No.");
    JLabel lang=new JLabel("Language");
    
    JTextField nametgt=new JTextField();
    JTextField gent=new JTextField();
    JTextField contgt=new JTextField();
    JTextField langtgt=new JTextField();
    
    JSeparator nametgs=new JSeparator();
    JSeparator gens=new JSeparator();
    JSeparator contgs=new JSeparator();
    JSeparator langtgs=new JSeparator();
    
    nametgt.setOpaque(false);
    nametgt.setBorder(null);
    gent.setOpaque(false);
    gent.setBorder(null);
    contgt.setOpaque(false);
    contgt.setBorder(null);
    langtgt.setOpaque(false);
    langtgt.setBorder(null);
    
 
    nametg.setBounds(100,150-130,300,30);
    nametgt.setBounds(100,180-130,300,30);
    nametgs.setBounds(100,210-130,300,30);
    gen.setBounds(100,240-130,300,30);
    gent.setBounds(100,270-130,300,30);
    gens.setBounds(100,300-130,300,30);
    contg.setBounds(100,330-130,300,30);
    contgt.setBounds(100,360-130,300,30);
    contgs.setBounds(100,390-130,300,30);
    lang.setBounds(100,420-130,300,30);
    langtgt.setBounds(100,450-130,300,30);
    langtgs.setBounds(100,480-130,300,30);
    
    JButton addtg=new JButton("Add Tour Guide");
    addtg.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           try {
                   Statement st=connection.createStatement();
                   String s="insert into tour_guide values"+"("+"'"+nametgt.getText()+"',"+"'"+gent.getText()+"',"+contgt.getText()+","+"'"+fcity+"',"+"'"+langtgt.getText()+"')";
                   System.out.println(s);
                   st.executeUpdate(s);
               } catch (SQLException ex) {
                  JOptionPane.showMessageDialog(null, "Something went wrong");
               }
           }
       });
    addtg.setBounds(100,510-130,200,30);
    tg2.add(addtg);
    
    
    tg2.add(nametg);
    tg2.add(nametgt);
    tg2.add(nametgs);
    tg2.add(gen);
    tg2.add(gent);
    tg2.add(gens);
    tg2.add(contg);
    tg2.add(contgt);
    tg2.add(contgs);
    tg2.add(lang);
    tg2.add(langtgt);
    tg2.add(langtgs);
    
    
    
    
    
    in2.setLayout(null);
    in2.setBackground(Color.WHITE);
    JLabel info=new JLabel("Information");
    
    
    JTextArea infot =new JTextArea();
    JButton addinfo=new JButton("Add Info");
    addinfo.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               try {
                   Statement st=connection.createStatement();
                   String s="insert into information values"+"('"+fcity+"',"+"'"+infot.getText()+"')";
                   System.out.println(s);
                   st.executeUpdate(s);
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Something went wrong");
               }
           }
       });
    infot.setBorder(blackline);
    infot.setLineWrap(true);
    
    
    info.setBounds(100, 150-130, 100, 30);
    infot.setBounds(100, 180-130+10, 700, 200);
    addinfo.setBounds(100, 390-130+10, 150, 30);
    
    in2.add(info);
    in2.add(infot);
    in2.add(addinfo);
    
    stct.addMouseListener(new MouseListener() {
           @Override
           public void mouseClicked(MouseEvent e) {
               try {  
                   ac.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\ac.png");
               
               tp.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\tp.png");
               ff.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\ff.png");
               sh.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\sh.png");
               fo.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\fo.png");
               em.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\em.png");
               tg.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\tg.png");
               in.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\in.png");
               
               } catch (IOException ex) {
                   JOptionPane.showMessageDialog(null, "Something went wrong");
               }
           }
           @Override
           public void mousePressed(MouseEvent e) {}
           @Override
           public void mouseReleased(MouseEvent e) {}
           @Override
           public void mouseEntered(MouseEvent e) {}
           @Override
           public void mouseExited(MouseEvent e) {}
       });
    ac.addMouseListener(new MouseListener() {
           @Override
           public void mouseClicked(MouseEvent e) {
               try {               
               stct.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\stct.jpg");    
               tp.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\tp.png");
               ff.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\ff.png");
               sh.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\sh.png");
               fo.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\fo.png");
               em.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\em.png");
               tg.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\tg.png");
               in.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\in.png");
               } catch (IOException ex) {
                  JOptionPane.showMessageDialog(null, "Something went wrong");
               }
           }
           @Override
           public void mousePressed(MouseEvent e) {}
           @Override
           public void mouseReleased(MouseEvent e) {}
           @Override
           public void mouseEntered(MouseEvent e) {}
           @Override
           public void mouseExited(MouseEvent e) {}
       });
    tp.addMouseListener(new MouseListener() {
           @Override
           public void mouseClicked(MouseEvent e) {
               try {
               stct.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\stct.jpg");
               ff.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\ff.png");
               sh.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\sh.png");
               fo.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\fo.png");
               em.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\em.png");
               tg.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\tg.png");
               in.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\in.png");
               ac.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\ac.png");
               
               } catch (IOException ex) {
                  JOptionPane.showMessageDialog(null, "Something went wrong");
               }
           }
           @Override
           public void mousePressed(MouseEvent e) {}
           @Override
           public void mouseReleased(MouseEvent e) {}
           @Override
           public void mouseEntered(MouseEvent e) {}
           @Override
           public void mouseExited(MouseEvent e) {}
       });
    ff.addMouseListener(new MouseListener() {
           @Override
           public void mouseClicked(MouseEvent e) {
               try {
               stct.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\stct.jpg");
               tp.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\tp.png");
               sh.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\sh.png");
               fo.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\fo.png");
               em.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\em.png");
               tg.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\tg.png");
               in.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\in.png");
               ac.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\ac.png");
               } catch (IOException ex) {
                   JOptionPane.showMessageDialog(null, "Something went wrong");
               }
           }
           @Override
           public void mousePressed(MouseEvent e) {}
           @Override
           public void mouseReleased(MouseEvent e) {}
           @Override
           public void mouseEntered(MouseEvent e) {}
           @Override
           public void mouseExited(MouseEvent e) {}
       });
    sh.addMouseListener(new MouseListener() {
           @Override
           public void mouseClicked(MouseEvent e) {
               try {
               stct.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\stct.jpg");
               tp.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\tp.png");
               ff.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\ff.png");
               fo.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\fo.png");
               em.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\em.png");
               tg.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\tg.png");
               in.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\in.png");
               ac.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\ac.png");
               } catch (IOException ex) {
                   JOptionPane.showMessageDialog(null, "Something went wrong");
               }
           }
           @Override
           public void mousePressed(MouseEvent e) {}
           @Override
           public void mouseReleased(MouseEvent e) {}
           @Override
           public void mouseEntered(MouseEvent e) {}
           @Override
           public void mouseExited(MouseEvent e) {}
       });
    em.addMouseListener(new MouseListener() {
           @Override
           public void mouseClicked(MouseEvent e) {
               try {
               stct.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\stct.jpg");
               tp.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\tp.png");
               ff.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\ff.png");
               sh.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\sh.png");
               fo.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\fo.png");
               tg.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\tg.png");
               in.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\in.png");
               ac.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\ac.png");
               } catch (IOException ex) {
                   JOptionPane.showMessageDialog(null, "Something went wrong");
               }
           }
           @Override
           public void mousePressed(MouseEvent e) {}
           @Override
           public void mouseReleased(MouseEvent e) {}
           @Override
           public void mouseEntered(MouseEvent e) {}
           @Override
           public void mouseExited(MouseEvent e) {}
       });
    tg.addMouseListener(new MouseListener() {
           @Override
           public void mouseClicked(MouseEvent e) {
               try {
               stct.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\stct.jpg");
               tp.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\tp.png");
               ff.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\ff.png");
               sh.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\sh.png");
               fo.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\fo.png");
               em.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\em.png");
               in.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\in.png");
               ac.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\ac.png");
               } catch (IOException ex) {
                   JOptionPane.showMessageDialog(null, "Something went wrong");
               }
           }
           @Override
           public void mousePressed(MouseEvent e) {}
           @Override
           public void mouseReleased(MouseEvent e) {}
           @Override
           public void mouseEntered(MouseEvent e) {}
           @Override
           public void mouseExited(MouseEvent e) {}
       });    
    in.addMouseListener(new MouseListener() {
           @Override
           public void mouseClicked(MouseEvent e) {
               try {
               stct.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\stct.jpg");
               tp.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\tp.png");
               ff.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\ff.png");
               sh.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\sh.png");
               fo.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\fo.png");
               em.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\em.png");
               tg.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\tg.png");
               ac.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\ac.png");
               } catch (IOException ex) {
                   JOptionPane.showMessageDialog(null, "Something went wrong");
               }
           }
           @Override
           public void mousePressed(MouseEvent e) {}
           @Override
           public void mouseReleased(MouseEvent e) {}
           @Override
           public void mouseEntered(MouseEvent e) {}
           @Override
           public void mouseExited(MouseEvent e) {}
       });    
    fo.addMouseListener(new MouseListener() {
           @Override
           public void mouseClicked(MouseEvent e) {
               try {
               stct.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\stct.jpg");
               tp.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\tp.png");
               ff.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\ff.png");
               sh.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\sh.png");
               em.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\em.png");
               tg.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\tg.png");
               in.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\in.png");
               ac.setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\ac.png");
               } catch (IOException ex) {
                  JOptionPane.showMessageDialog(null, "Something went wrong");
               }
           }
           @Override
           public void mousePressed(MouseEvent e) {}
           @Override
           public void mouseReleased(MouseEvent e) {}
           @Override
           public void mouseEntered(MouseEvent e) {}
           @Override
           public void mouseExited(MouseEvent e) {}
       }); 
        
   
    
   
    
    
    
   
    
    
                
   
    
    JLabel n3=new JLabel("Shopping Spots");
    sh1.add(n3);
    sh1.setBounds(300,200,1150,850);
    
   
    
    
    em1.setBackground(Color.WHITE);
    em1.setLayout(null);
    em1.setBounds(300,200,1150,850);
    
    
    
    
    tg1.setBounds(300,200,1150,850);
    
    
    in1.setBounds(300,200,1150,850);
    
    ac2.setBounds(300,200,1150,850);
    tp2.setBounds(300,200,1150,850);
    ff2.setBounds(300,200,1150,850);
    sh2.setBounds(300,200,1150,850);
    fo2.setBounds(300,200,1150,850);
    em2.setBounds(300,200,1150,850);
    tg2.setBounds(300,200,1150,850);
    in2.setBounds(300,200,1150,850);
    
    
    
    
    j1.setForeground(Color.white);
    j2.setForeground(Color.white);
    
        tf1.setBorder(null);
        tf1.setOpaque(false);
        pf1.setBorder(null);
        pf1.setFont(new Font("Tahoma",Font.PLAIN,20));
        pf1.setOpaque(false);
    
    l1.setBounds(790,400+25,100,30);
    tf1.setBounds(790,440+25,350,30);
    j1.setBounds(790,475+25,350,30);
    l2.setBounds(790,500+25,100,30);
    pf1.setBounds(790,540+25,350,30);
    j2.setBounds(790,575+25,350,10);
    log.setBounds(790,605+25,350,40);
    log.setBorder(null);
    
    p1.add(l1);
    p1.add(tf1);
    p1.add(j1);
    
    p1.add(l2);
    p1.add(pf1);
    p1.add(j2);
    
    p1.add(log);
    p1.add(count);
    
    
    JLabel stl=new JLabel("Choose the State");
    JLabel ct=new JLabel("Choose the City");
    JComboBox st1=new JComboBox();
    st1.addItem("Select the State");
    JComboBox ct1=new JComboBox();
        
    
    log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                    s1=tf1.getText();
                    supdate="Welcome! "+"\n"+s1;
                    as.setText(supdate);
                    System.out.println("1Name of the man"+s1);
                    String s2=pf1.getText();
                    
                if(s1.equals("admin") && s2.equals("admin")){flag1=1;}
                
                try {
                    Statement statement=connection.createStatement();
                    ResultSet resultSet=statement.executeQuery("select * from user");
                    String s3="";
                    String s4="";
                    while(resultSet.next()){
                    s3=resultSet.getString(1);
                    s4=resultSet.getString(2);
                        
                    if(s3.equals(s1)){                        
                        if(s2.equals((s4))){flag=1;}                      
                    }
                   }
                    
                    if(flag==1 || flag1==1){
                    f1.getContentPane().remove(p1);
                    f1.getContentPane().add(pn);
                    resultSet=statement.executeQuery("select * from state");
                    while(resultSet.next()){
                    st1.addItem(resultSet.getString(1));
                    }
                    f1.revalidate();
                    f1.repaint();
                    }else{
                    if(flag==0 && flag1==0 )
                    JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
                    }
                    
                } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Something went wrong");
                }              
            }
        });
        
    
        JTextArea stdes=new JTextArea("");
            stdes.setBounds(700,440,400,400);
            stdes.setBorder(null);
            stdes.setOpaque(false);
            pn.add(stdes);
        NewPanel n=new NewPanel(img);
        st1.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
        try {
        
        String cstate=e.getItem().toString();
        Statement st1=connection.createStatement();
        ResultSet r2=st1.executeQuery("select * from city where state_name="+"'"+cstate+"'");
        ct1.removeAllItems();
        ct1.addItem("Select the city");
        while(r2.next()){
            ct1.addItem(r2.getString(1));
        }
        r2=st1.executeQuery("select * from state where name="+"'"+cstate+"'");
        
        
        while(r2.next()){        
        text=r2.getString(2);
        imgst=ImageIO.read(new File(r2.getString(3)));
        }
        
        stdes.setText(text);
        statedest.revalidate();
        
        n.setImage(imgst);
        n.setBounds(700, 175, 500, 250);
        pn.add(n);
        pn.repaint();                             
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Something went wrong");
        }   catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Something went wrong");
            }
                           
        }
        });
                    
        ct1.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
        fcity=e.getItem().toString();
        }
        });
        Statement state=connection.createStatement();
        
            as=new JTextArea("");
            as.setFont(new Font("HelveticaNeue", Font.PLAIN, 50));
            as.setBorder(null);
            as.setOpaque(false);
            as.setLineWrap(true);
            as.setBounds(120, 150+25, 350, 150);
            pn.add(as);
            JTextArea as1=new JTextArea("You are just one step away from getting thebest tourism experience.");
            as1.setFont(new Font("HelveticaNeue", Font.PLAIN, 20));
            as1.setBorder(null);
            as1.setOpaque(false);
            as1.setLineWrap(true);
            as1.setBounds(120, 300+25, 400, 100);
            
            pn.add(as1);
            pn.setLayout(null);
                    
            stl.setBounds(120 ,400+35, 200, 30);
            st1.setBounds(120 ,435+35 , 300, 30);
            ct.setBounds(120 ,470+35+10, 200, 30);
            ct1.setBounds(120 ,505+35+10, 300, 30);
            
            pn.add(stl);
            pn.add(st1);
            pn.add(ct);
            pn.add(ct1);
            pro=new JButton("Proceed");
            pn.add(pro);
    
   
    JButton back1 = new JButton("Back");
    back1.setBounds(120,780,125,40);
    pn.add(back1);
    back1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                
                tf1.setText("");
                pf1.setText("");
                f1.getContentPane().remove(pn);
                f1.getContentPane().add(p1);
                f1.revalidate();
                f1.repaint();
           }
       });
    pro.setBounds(255,780,125,40);
                    
    pro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.getContentPane().remove(pn);
                if(flag1==1){
                stct.setBounds(0,405,300,45);
                db.add(stct);
                mn.add(ac2);
                }else mn.add(ac1);
                f1.getContentPane().add(mn);
                f1.revalidate();
                f1.repaint();
            }
        });
    
    f1.add(p1);
    f1.setVisible(true);
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    f1.setSize(1300, 900);
    
    sptp=new JScrollPane(tp1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    sptp.setBounds(300,200,980,650);
    spff=new JScrollPane(ff1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    spff.setBounds(300,200,980,650);
    spsh=new JScrollPane(sh1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    spsh.setBounds(300,200,980,650);
    spfo=new JScrollPane(fo1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    spfo.setBounds(300,200,980,650);
                                    
                
                        
   
    }
    
    public static void main(String[] arg) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, SQLException{
    india_tour n=new india_tour();
    
    }

    
    class NewPanel extends JPanel{
        BufferedImage img;
        public NewPanel(BufferedImage img) {
        this.img=img;
        }
        
    void setImage(BufferedImage im){
        this.img=im;
        repaint();
    } 
        
    @Override
    protected void paintComponent(Graphics g){
    
       
        g.drawImage(img, 0, 0, f1);
        
        
   
        
    }
    

}
    class BPanel extends JPanel implements MouseListener{
        String s;
        BufferedImage imgt;
        String path;
        public BPanel(String s,String path) throws IOException {
            addMouseListener(this);
            this.s=s;
            setLayout(null);
            this.path=path;
            this.setImage(path);
            
        }
        @Override
    protected void paintComponent(Graphics g){
       
      
        
       
        
        
    }
        void setImage(String path) throws IOException{
            this.removeAll();
            imgt=ImageIO.read(new File(path));
            NewPanel npsf=new NewPanel(imgt);
            npsf.setBounds(0 , 0, 300, 45);
            this.add(npsf);
        }
        @Override
        public void mouseClicked(MouseEvent e) {
            
            
            
            setBackground(Color.white);
            if(s=="Accomodation"){
                try {
                
                setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\ac1.png");
            } catch (IOException ex) {
               JOptionPane.showMessageDialog(null, "Something went wrong");
            }
                System.out.println(s);
                mn.remove(statep);
                mn.remove(ac1);
                mn.remove(tb);
                mn.remove(sptp);
                mn.remove(spff);
                mn.remove(spsh);
                mn.remove(spfo);
                mn.remove(em1);
               
                mn.remove(tg1);
                mn.remove(in1);
                
                
                
                if(flag1==1){
                mn.remove(statep);    
                mn.remove(ac2);
                mn.remove(tp2);
                mn.remove(ff2);
                mn.remove(sh2);
                mn.remove(tb);
                mn.remove(fo2);
                mn.remove(em2);
                mn.remove(tg2);
                mn.remove(in2);
                
                
                mn.add(ac2);
                mn.revalidate();
                mn.repaint();
                
                }else{
                mn.add(ac1);
                mn.revalidate();
                mn.repaint();
                }
                       
                
                
            }
            if(s=="Sign Out"){
                mn.remove(statep);
                f1.getContentPane().remove(mn);
                f1.getContentPane().add(p1);
                f1.revalidate();
                f1.repaint();
                flag1=flag=0;
                s1="";
                tf1.setText("");
                pf1.setText("");
                mn.remove(tb);
                mn.remove(ac2);
                mn.remove(tp2);
                mn.remove(ff2);
                mn.remove(sh2);
                mn.remove(fo2);
                mn.remove(em2);
                
                mn.remove(tg2);
                mn.remove(in2);
                mn.remove(ac1);
                mn.remove(sptp);
                mn.remove(spff);
                mn.remove(spsh);
                mn.remove(spfo);
                mn.remove(em1);
               
                mn.remove(tg1);
                mn.remove(in1);
                
                
            }
            if(s=="Tourist Place"){
            System.out.println(s);
            try {
                setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\tp1.png");
            } catch (IOException ex) {
               JOptionPane.showMessageDialog(null, "Something went wrong");
            }
                mn.remove(tb);
                mn.remove(ac1);
                mn.remove(sptp);
                mn.remove(spff);
                mn.remove(spsh);
                mn.remove(spfo);
                mn.remove(em1);
                tp1.removeAll();
                mn.remove(tg1);
                mn.remove(in1);
                mn.remove(statep);
                if(flag1==1){
                    mn.remove(statep);
                mn.remove(tb);
                mn.remove(ac2);
                mn.remove(tp2);
                mn.remove(ff2);
                mn.remove(sh2);
                mn.remove(fo2);
                mn.remove(em2);
                tp1.removeAll();
                mn.remove(tg2);
                mn.remove(in2);
                
                
                
                mn.add(tp2);
                mn.revalidate();
                mn.repaint();
                
                }else{
                    
                try {
                        tp1.setLayout(new BoxLayout(tp1, BoxLayout.Y_AXIS));
                        tp1.setBackground(Color.white);
                        Statement sta=connection.createStatement();
                        ResultSet rs; 
                        rs=sta.executeQuery("select count(*) from tourist_place where city="+"'"+fcity+"'");
                        
                        int count=0;
                        while(rs.next()){
                        count=rs.getInt(1);
                            
                        }
                        System.out.println(count);
                        SPanel[] tpp=new SPanel[count];
                        rs=sta.executeQuery("select * from tourist_place where city="+"'"+fcity+"'");
                        int i=0;
                        String pat="";
                        while(rs.next()){
                        tpp[i]=new SPanel(rs.getString(1),rs.getString(2) , rs.getString(3));
                        System.out.println(rs.getString(3));
                        tpp[i].setMaximumSize(new Dimension(980, 300));
                        tpp[i].setMinimumSize(new Dimension(980, 300));
                        tpp[i].setPreferredSize(new Dimension(980, 300));
                        tp1.add(tpp[i]);
                        i++;
                        }
                        sptp.getViewport().setViewPosition(new Point(0,1));
                        mn.add(sptp);
                        mn.revalidate();
                        mn.repaint();
                        
                        sptp.getViewport().setViewPosition(new Point(0,1));
                        
                    } catch (SQLException ex) {    
                   JOptionPane.showMessageDialog(null, "Something went wrong");
                } catch (IOException ex) {
                   JOptionPane.showMessageDialog(null, "Something went wrong");
                }
                    
                    
                    
                
                }
            }    
            if(s=="Famous For"){
               
                try {
                setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\ff1.png");
                
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong");
            }
                System.out.println(s);
                mn.remove(ac1);
                mn.remove(statep);
                mn.remove(tb);
                mn.remove(sptp);
                mn.remove(spff);
                mn.remove(spsh);
                mn.remove(spfo);
                mn.remove(em1);
                ff1.removeAll();
                mn.remove(tg1);
                mn.remove(in1);
                
                if(flag1==1){
                    mn.remove(tb);
                ff1.removeAll();
                mn.remove(statep);
                mn.remove(ac2);
                mn.remove(tp2);
                mn.remove(ff2);
                mn.remove(sh2);
                mn.remove(fo2);
                mn.remove(em2);
                
                mn.remove(tg2);
                mn.remove(in2);
                
                
                mn.add(ff2);
                mn.revalidate();
                mn.repaint();
                
                }else{
                    
                try {
                        ff1.setLayout(new BoxLayout(ff1, BoxLayout.Y_AXIS));
                        ff1.setBackground(Color.white);
                        Statement sta=connection.createStatement();
                        ResultSet rs; 
                        rs=sta.executeQuery("select count(*) from famous_for where city="+"'"+fcity+"'");
                        
                        int count=0;
                        while(rs.next()){
                        count=rs.getInt(1);
                            
                        }
                        System.out.println(count);
                        SPanel[] ffp=new SPanel[count];
                        rs=sta.executeQuery("select * from famous_for where city="+"'"+fcity+"'");
                        int i=0;
                        String pat="";
                        while(rs.next()){
                        ffp[i]=new SPanel(rs.getString(1),rs.getString(2) , rs.getString(3));
                        System.out.println(rs.getString(3));
                        ffp[i].setMaximumSize(new Dimension(980, 300));
                        ffp[i].setMinimumSize(new Dimension(980, 300));
                        ffp[i].setPreferredSize(new Dimension(980, 300));
                        ff1.add(ffp[i]);
                        i++;
                        }
                        
                        mn.add(spff);
                        mn.revalidate();
                        mn.repaint();
                    } catch (SQLException ex) {    
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
                    
                    
                    
                }
            }
            if(s=="Shopping Spots"){
                try {
                setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\sh1.png");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong");
            }
                System.out.println(s);
                mn.remove(ac1);
                mn.remove(statep);
                mn.remove(tb);
                mn.remove(sptp);
                mn.remove(spff);
                mn.remove(spsh);
                mn.remove(spfo);
                mn.remove(em1);
                sh1.removeAll();
                mn.remove(tg1);
                mn.remove(in1);
                if(flag1==1){
                mn.remove(ac2);
                mn.remove(statep);
                mn.remove(tp2);
                mn.remove(ff2);
                mn.remove(sh2);
                mn.remove(fo2);
                mn.remove(em2);
                sh1.removeAll();
                mn.remove(tg2);
                mn.remove(in2);
                
                
                mn.add(sh2);
                mn.revalidate();
                mn.repaint();
                
                }else{
                try {
                        sh1.setLayout(new BoxLayout(sh1, BoxLayout.Y_AXIS));
                        ff1.setBackground(Color.white);
                        Statement sta=connection.createStatement();
                        ResultSet rs; 
                        rs=sta.executeQuery("select count(*) from shopping_spots where city="+"'"+fcity+"'");
                        
                        int count=0;
                        while(rs.next()){
                        count=rs.getInt(1);
                            
                        }
                        System.out.println(count);
                        SPanel[] shp=new SPanel[count];
                        rs=sta.executeQuery("select * from shopping_spots where city="+"'"+fcity+"'");
                        int i=0;
                        String pat="";
                        while(rs.next()){
                        shp[i]=new SPanel(rs.getString(1),rs.getString(2) , rs.getString(3));
                        System.out.println(rs.getString(3));
                        shp[i].setMaximumSize(new Dimension(980, 300));
                        shp[i].setMinimumSize(new Dimension(980, 300));
                        shp[i].setPreferredSize(new Dimension(980, 300));
                        sh1.add(shp[i]);
                        i++;
                        }
                        
                        mn.add(spsh);
                        mn.revalidate();
                        mn.repaint();
                    } catch (SQLException ex) {    
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                } catch (IOException ex) {
                   JOptionPane.showMessageDialog(null, "Something went wrong");
                }
              
                            
               
                }
            }
            if(s=="Food Outlets"){
                try {
                setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\fo1.png");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong");
            }
                System.out.println(s);
                mn.remove(ac1);
                mn.remove(tb);
                mn.remove(statep);
                mn.remove(sptp);
                mn.remove(spff);
                mn.remove(spsh);
                mn.remove(spfo);
                mn.remove(em1);
                fo1.removeAll();
                mn.remove(tg1);
                mn.remove(in1);
                if(flag1==1){
                mn.remove(statep);
                mn.remove(ac2);
                mn.remove(tp2);
                mn.remove(ff2);
                mn.remove(sh2);
                mn.remove(fo2);
                mn.remove(em2);
                fo1.removeAll();
                mn.remove(tg2);
                mn.remove(in2);
                
                
                mn.add(fo2);
                mn.revalidate();
                mn.repaint();
                
                }else{
                    try {
                        fo1.setLayout(new BoxLayout(fo1, BoxLayout.Y_AXIS));
                        fo1.setBackground(Color.white);
                        Statement sta=connection.createStatement();
                        ResultSet rs; 
                        rs=sta.executeQuery("select count(*) from restraunt where city="+"'"+fcity+"'");
                        
                        int count=0;
                        while(rs.next()){
                        count=rs.getInt(1);
                            
                        }
                        System.out.println(count);
                        SPanel[] fop=new SPanel[count];
                        rs=sta.executeQuery("select * from restraunt where city="+"'"+fcity+"'");
                        int i=0;
                        String pat="";
                        while(rs.next()){
                        fop[i]=new SPanel(rs.getString(1),rs.getString(2) , rs.getString(3));
                        System.out.println(rs.getString(3));
                        fop[i].setMaximumSize(new Dimension(980, 300));
                        fop[i].setMinimumSize(new Dimension(980, 300));
                        fop[i].setPreferredSize(new Dimension(980, 300));
                        fo1.add(fop[i]);
                        i++;
                        }
                        
                        mn.add(spfo);
                        mn.revalidate();
                        mn.repaint();
                    } catch (SQLException ex) {    
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
                    
                }
            }
            if(s=="Emergency"){
                try {
                setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\em1.png");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong");
            }
                System.out.println(s);
                mn.remove(ac1);
                mn.remove(statep);
                mn.remove(tb);
                mn.remove(sptp);
                mn.remove(spff);
                mn.remove(spsh);
                mn.remove(spfo);
                mn.remove(em1);
                em1.removeAll();
                mn.remove(tg1);
                mn.remove(in1);
                
                if(flag1==1){
                    mn.remove(tb);
                mn.remove(ac2);
                mn.remove(tp2);
                mn.remove(statep);
                mn.remove(ff2);
                mn.remove(sh2);
                mn.remove(fo2);
                mn.remove(em2);
                em1.removeAll();
                mn.remove(tg2);
                mn.remove(in2);
                
                
                mn.add(em2);
                mn.revalidate();
                mn.repaint();
                
                }else{
               
                
                    try {
                        Statement s=connection.createStatement();
                        ResultSet rs;
                        int r1,r2,r3;
                        r1=r2=r3=0;
                        rs=s.executeQuery("select count(*) from atm where city="+"'"+fcity+"'");
                        while(rs.next()){
                        r1=rs.getInt(1);
                            System.out.println(r1);
                        }
                        rs=s.executeQuery("select count(*) from hospital where city="+"'"+fcity+"'");
                        while(rs.next()){
                        r2=rs.getInt(1);
                            System.out.println(r2);
                        }
                        rs=s.executeQuery("select count(*) from helpline where city="+"'"+fcity+"'");
                        while(rs.next()){
                        r3=rs.getInt(1);
                            System.out.println(r3);
                        }
                        
                        String[][] atmdata=new String[r1][2];
                        String[][] hosdata=new String[r2][3];
                        String[][] helpdata=new String[r3][2];
                        String[] atmcol={"Name","Address"};
                        String[] hoscol={"Name","Address","Phone"};
                        String[] helpcol={"Name of the helpline","Helpline No."};
                        rs=s.executeQuery("select * from atm where city="+"'"+fcity+"'");
                        int i=0;
                        while(rs.next()){
                        for(int j=0;j<2;j++){
                        atmdata[i][j]=rs.getString(j+1);
                        }
                            
                            i++;
                        }
                        JTable atmt=new JTable(atmdata,atmcol);
                        rs=s.executeQuery("select * from hospital where city="+"'"+fcity+"'");
                        i=0;
                        while(rs.next()){
                        for(int j=0;j<3;j++){
                        hosdata[i][j]=rs.getString(j+1);
                        }
                            
                            i++;
                        }
                        JTable host=new JTable(hosdata,hoscol);
                        rs=s.executeQuery("select * from helpline where city="+"'"+fcity+"'");
                        i=0;
                        while(rs.next()){
                        for(int j=0;j<2;j++){
                        helpdata[i][j]=rs.getString(j+1);
                        }
                            
                            i++;
                        }
                        
                        JTable helpt=new JTable(helpdata,helpcol);
                        JScrollPane sp1=new JScrollPane(atmt);
                        JScrollPane sp2=new JScrollPane(host);
                        JScrollPane sp3=new JScrollPane(helpt);
                        atmt.setRowHeight(30);
                        host.setRowHeight(30);
                        helpt.setRowHeight(30);
                        
                        
                        sp1.setBounds(100,60, 800, 130);
                        sp2.setBounds(100,250, 800, 130);
                        sp3.setBounds(100,440, 800, 130);
                        
                        JLabel atml=new JLabel("ATM");
                        JLabel hosl=new JLabel("Hospital");
                        JLabel helpl=new JLabel("Helpline");
                        atml.setBounds(100, 20, 100, 30);
                        hosl.setBounds(100, 210, 100, 30);
                        helpl.setBounds(100,400, 100, 30);
                        em1.add(atml);
                        em1.add(hosl);
                        em1.add(helpl);
                        
                        em1.add(sp1);
                        em1.add(sp2);
                        em1.add(sp3);
                        mn.add(em1);
                        mn.revalidate();
                        mn.repaint();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Something went wrong");
                    }
                }
            }
            
            
            if(s=="Tour Guide"){
                try {
                    int r1=0;
                    Statement s=connection.createStatement();
                    ResultSet rs;
                    rs=s.executeQuery("select count(*) from tour_guide where city="+"'"+fcity+"'");
                    while(rs.next()){
                        r1=rs.getInt(1);
                        System.out.println(r1);
                    }
                    String[][] tgdata=new String[r1][4];
                    String[] tgcol={"Name","Gender","Phone","Language"};
                    JTable tgt=new JTable(tgdata,tgcol);
                    JScrollPane sp1=new JScrollPane(tgt);
                    
                    
                    try {
                        setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\tg1.png");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Something went wrong");
                    }
                    System.out.println(s);
                    mn.remove(ac1);
                    mn.remove(sptp);
                    mn.remove(statep);
                    mn.remove(tb);
                    mn.remove(spff);
                    mn.remove(spsh);
                    mn.remove(spfo);
                    mn.remove(em1);
                    tg1.removeAll();
                    mn.remove(tg1);
                    mn.remove(in1);
                    if(flag1==1){
                        mn.remove(ac2);
                        mn.remove(tp2);
                        mn.remove(ff2);
                        mn.remove(tb);
                        mn.remove(statep);
                        mn.remove(sh2);
                        mn.remove(fo2);
                        mn.remove(em2);
                        
                        mn.remove(tg2);
                        mn.remove(in2);
                        tg1.removeAll();
                        mn.add(tg2);
                        mn.revalidate();
                        mn.repaint();
                        
                    }else{
                        
                        try {
                            tg1.setBackground(Color.white);
                            tg1.setLayout(null);
                            

                            
                            rs=s.executeQuery("select * from tour_guide where city="+"'"+fcity+"'");
                            int i=0;
                            while(rs.next()){
                                tgdata[i][0]=rs.getString(1);
                                tgdata[i][1]=rs.getString(2);
                                tgdata[i][2]=rs.getString(3);
                                tgdata[i][3]=rs.getString(5);
                                System.out.println(tgdata[i][0]);
                                
                                i++;
                            }
                            
                            tgt.setRowHeight(30);
                            tgt.repaint();
                            ((AbstractTableModel) tgt.getModel()).fireTableDataChanged();
                            
                            JLabel tgl=new JLabel("Tour Guide");
                            tgl.setBounds(100, 20, 100, 30);
                            tg1.add(tgl);
    
                            sp1.setBounds(100,60, 800, 200);
                            k=300;
                            tg1.add(sp1);
                            
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "Something went wrong");
                        }
                        
                        
                        
                        
                        mn.add(tg1);
                        mn.revalidate();
                        mn.repaint();
                    }} catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong");
            }
}
            if(s=="State and City"){
                try {
                setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\stct1.jpg");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong");
            }
                System.out.println(s);
                mn.remove(ac2);
                mn.remove(tp2);
                mn.remove(ff2);
                mn.remove(statep);
                mn.remove(sh2);
                mn.remove(fo2);
                mn.remove(em2);
                mn.remove(tb);
                mn.remove(tg2);
                mn.remove(in2);
                
                mn.add(statep);
                mn.revalidate();
                mn.repaint();
                
                
            }
            if(s=="Information"){
            System.out.println(s);
            try {
                setImage("C:\\Users\\hp\\Desktop\\JavaProgram\\JavaApplication22\\src\\data\\Panel\\in1.png");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong");
            }
                mn.remove(ac1);
                mn.remove(sptp);
                mn.remove(statep);
                mn.remove(spff);
                mn.remove(spsh);
                mn.remove(spfo);
                mn.remove(em1);
                mn.remove(tb);
                
                mn.remove(tg1);
                mn.remove(in1);
                
                if(flag1==1){
                mn.remove(ac2);
                mn.remove(tp2);
                mn.remove(ff2);
                mn.remove(statep);
                mn.remove(sh2);
                mn.remove(fo2);
                mn.remove(em2);
                mn.remove(tb);
                mn.remove(tg2);
                mn.remove(in2);
                
                
                mn.add(in2);
                mn.revalidate();
                mn.repaint();
                
                }else{
                try {
                    
                    Statement st=connection.createStatement();
                    ResultSet rs=st.executeQuery("select * from information where city="+"'"+fcity+"'");
                    while(rs.next()){
                    ta.setText(rs.getString(2));
                    }
                    mn.add(in1);
                    mn.revalidate();
                    mn.repaint();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
                }
            }
             
        }

        @Override
        public void mousePressed(MouseEvent e) {
             
            }

        @Override
        public void mouseReleased(MouseEvent e) {
            
            }

        @Override
        public void mouseEntered(MouseEvent e) {
            
            
            }

        @Override
        public void mouseExited(MouseEvent e) {
            
            }
    
    }
    
    public class SPanel extends JPanel{
      String name;
      String desc;
      String path;
    SPanel(String name, String desc, String path) throws IOException{
    this.name=name;
    this.desc=desc;
    this.path=path;
    BufferedImage pathimg=ImageIO.read(new File(path));
    NewPanel im=new NewPanel(pathimg);
    setLayout(null);
    im.setBounds(20, 20, 400, 400);
    add(im);
    JTextArea dta=new JTextArea();
    this.setBackground(Color.white);
    dta.setLineWrap(true);
    dta.setOpaque(false);
    dta.setBorder(null);
    dta.setFont(new Font("HelveticaNeue",Font.PLAIN,20));
    JLabel slabel=new JLabel(name);
    slabel.setForeground(new Color(242,63,25));
    slabel.setFont(new Font("HelveticaNeue",Font.PLAIN,30));
    
    slabel.setBounds(400,20,300,30);
    dta.setBounds(400, 60, 550, 250);
    dta.setText(desc);
    add(dta);
    add(slabel);
    }
    
    
    }
}
