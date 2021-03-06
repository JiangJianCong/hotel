package UserUI;

import java.rmi.RemoteException;  

import RMICLIENT.RMIClient;
import UI.InputAccountFrame;
import PO.hotelDataPO;
import PO.userAccountPO;
import PO.userDataPO;
import transform.POtoVO;
import transform.VOtoPO;
import VO.userDataVO;
import VO.hotelDataVO;
import VO.userAccountVO;
/**
 *
 * @author ������
 */
public class UserSignInFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserUIFrame
     */
    public UserSignInFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passwordjTextField = new javax.swing.JTextField();
        teljTextField = new javax.swing.JTextField();
        accountjTextField = new javax.swing.JTextField();
        checkjButton = new javax.swing.JButton();
        signInjButton = new javax.swing.JButton();
        returnjButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        checkPasswordjTextField1 = new javax.swing.JTextField();
        namejTextField = new javax.swing.JTextField();
        wemanjRadioButton = new javax.swing.JRadioButton();
        manjRadioButton = new javax.swing.JRadioButton();
        buttonGroup = new javax.swing.ButtonGroup();
        
        

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        
        buttonGroup.add(wemanjRadioButton);
        buttonGroup.add(manjRadioButton);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(39, 43, 48));
        setLocation(new java.awt.Point(380, 180));

        jPanel1.setBackground(new java.awt.Color(39, 43, 48));

        jPanel2.setBackground(new java.awt.Color(0, 76, 68));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 76, 68));
        jLabel1.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 153));
        jLabel1.setText("�ʺ� ��");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(110, 10, 100, 40);

        jLabel2.setBackground(new java.awt.Color(0, 76, 68));
        jLabel2.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 153));
        jLabel2.setText("ȷ������ �� ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(110, 110, 140, 50);

        jLabel3.setBackground(new java.awt.Color(0, 76, 68));
        jLabel3.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 153));
        jLabel3.setText("�绰 �� ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(110, 230, 110, 40);
        jPanel2.add(passwordjTextField);
        passwordjTextField.setBounds(270, 70, 297, 30);
        jPanel2.add(teljTextField);
        teljTextField.setBounds(270, 240, 297, 30);
        jPanel2.add(accountjTextField);
        accountjTextField.setBounds(270, 20, 297, 30);

        checkjButton.setBackground(new java.awt.Color(0, 76, 68));
        checkjButton.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        checkjButton.setForeground(new java.awt.Color(153, 255, 153));
        checkjButton.setText("���");
        checkjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkjButtonActionPerformed(evt);
            }
        });
        jPanel2.add(checkjButton);
        checkjButton.setBounds(600, 20, 71, 30);

        signInjButton.setBackground(new java.awt.Color(0, 76, 68));
        signInjButton.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        signInjButton.setForeground(new java.awt.Color(153, 255, 153));
        signInjButton.setText("ע��");
        signInjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInjButtonActionPerformed(evt);
            }
        });
        jPanel2.add(signInjButton);
        signInjButton.setBounds(100, 350, 120, 30);

        returnjButton.setBackground(new java.awt.Color(0, 76, 68));
        returnjButton.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        returnjButton.setForeground(new java.awt.Color(153, 255, 153));
        returnjButton.setText("����");
        returnjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnjButtonActionPerformed(evt);
            }
        });
        jPanel2.add(returnjButton);
        returnjButton.setBounds(510, 350, 110, 30);

        jLabel4.setBackground(new java.awt.Color(0, 76, 68));
        jLabel4.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 153));
        jLabel4.setText("���� �� ");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(110, 60, 110, 40);

        jLabel5.setBackground(new java.awt.Color(0, 76, 68));
        jLabel5.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 153));
        jLabel5.setText("���� �� ");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(110, 180, 110, 40);

        jLabel6.setBackground(new java.awt.Color(0, 76, 68));
        jLabel6.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 153));
        jLabel6.setText("�Ա� �� ");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(110, 280, 110, 40);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(0, 170, 740, 0);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(0, 168, 740, 10);
        jPanel2.add(checkPasswordjTextField1);
        checkPasswordjTextField1.setBounds(270, 120, 297, 30);
        jPanel2.add(namejTextField);
        namejTextField.setBounds(270, 190, 297, 30);

        wemanjRadioButton.setBackground(new java.awt.Color(0, 76, 68));
        wemanjRadioButton.setFont(new java.awt.Font("����", 0, 24)); // NOI18N
        wemanjRadioButton.setForeground(new java.awt.Color(153, 255, 153));
        wemanjRadioButton.setText("Ů");
        jPanel2.add(wemanjRadioButton);
        wemanjRadioButton.setBounds(510, 290, 49, 37);

        manjRadioButton.setBackground(new java.awt.Color(0, 76, 68));
        manjRadioButton.setFont(new java.awt.Font("����", 0, 24)); // NOI18N
        manjRadioButton.setForeground(new java.awt.Color(153, 255, 153));
        manjRadioButton.setText("��");
        jPanel2.add(manjRadioButton);
        manjRadioButton.setBounds(270, 290, 49, 37);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void checkjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	try {
        	if(RMIClient.getAccountService().checkUserIdExist(accountjTextField.getText())){
        		checkjButton.setText("��");
        	}else{
        		checkjButton.setText("��");
       		}
    	}catch (RemoteException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    		}
    }                                            

    private void signInjButtonActionPerformed(java.awt.event.ActionEvent evt) { 
    	boolean checkIsNull = false;
    	if(!passwordjTextField.getText().equals("")&&!teljTextField.getText().equals("")&&
    		!namejTextField.getText().equals("")&&!checkPasswordjTextField1.getText().equals("")&&
    		(!manjRadioButton.isSelected()||!wemanjRadioButton.isSelected()&&
    				!accountjTextField.getText().equals(""))){
    		checkIsNull = true;
    	}
    	if(checkIsNull){
    		userAccountPO accountPO = vtp.TouserAccountPO(
    				new userAccountVO(accountjTextField.getText(),passwordjTextField.getText()));
    		userDataVO DataVO = new userDataVO();
    		DataVO.setUserName(namejTextField.getText());
    		DataVO.setUserTel(teljTextField.getText());
    		DataVO.setUserCredit(100);
    		if(manjRadioButton.isSelected()){
    			DataVO.setUserSex("��");
    		}
    		else{
    			DataVO.setUserSex("Ů");
    		}
    		userDataPO DataPO = vtp.TouserDataPO(DataVO);
    		try {
        		if(RMIClient.getAccountService().userSignUp(accountPO, DataPO)){
        			new SignInSuccessFrame().setVisible(true); 
				}else{
					new SignInFailFrame().setVisible(true);
				}
        	} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }else{
    	new SignInFailFrame().setVisible(true);
    }
    	}                                             

    private void returnjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.setVisible(false);
        new UI.InputAccountFrame(this,1).setVisible(true);
    } 
    
    private POtoVO ptv = new POtoVO();
    private VOtoPO vtp = new VOtoPO();

    

    // Variables declaration - do not modify                     
    private javax.swing.JTextField accountjTextField;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JTextField checkPasswordjTextField1;
    private javax.swing.JButton checkjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton manjRadioButton;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JTextField passwordjTextField;
    private javax.swing.JButton returnjButton;
    private javax.swing.JButton signInjButton;
    private javax.swing.JTextField teljTextField;
    private javax.swing.JRadioButton wemanjRadioButton;
    // End of variables declaration                   
}