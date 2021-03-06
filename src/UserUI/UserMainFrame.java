package UserUI;

import VO.userDataVO; 
import VO.userAccountVO;

/**
 *
 * @author ������
 */
public class UserMainFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserMainFrame
     */
	public UserMainFrame(userDataVO data) {
        this.data = data;
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        commentjButton = new javax.swing.JButton();
        informationjButton = new javax.swing.JButton();
        orderjButton = new javax.swing.JButton();
        hoteljButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(380, 180));

        jPanel1.setBackground(new java.awt.Color(39, 43, 48));

        jPanel2.setBackground(new java.awt.Color(0, 76, 68));
        jPanel2.setLayout(null);

        commentjButton.setBackground(new java.awt.Color(0, 76, 68));
        commentjButton.setFont(new java.awt.Font("΢���ź�", 1, 24)); // NOI18N
        commentjButton.setForeground(new java.awt.Color(153, 255, 153));
        commentjButton.setText("�Ƶ�����");
        jPanel2.add(commentjButton);
        commentjButton.setBounds(420, 280, 170, 80);
        commentjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	commentjButtonActionPerformed(evt);
            }
        });

        informationjButton.setBackground(new java.awt.Color(0, 76, 68));
        informationjButton.setFont(new java.awt.Font("΢���ź�", 1, 24)); // NOI18N
        informationjButton.setForeground(new java.awt.Color(153, 255, 153));
        informationjButton.setText("������Ϣ");
        jPanel2.add(informationjButton);
        informationjButton.setBounds(110, 170, 180, 80);
        informationjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	informationjButtonActionPerformed(evt);
            }
        });

        orderjButton.setBackground(new java.awt.Color(0, 76, 68));
        orderjButton.setFont(new java.awt.Font("΢���ź�", 1, 24)); // NOI18N
        orderjButton.setForeground(new java.awt.Color(153, 255, 153));
        orderjButton.setText("�ҵĶ���");
        jPanel2.add(orderjButton);
        orderjButton.setBounds(420, 170, 170, 80);
        orderjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	orderjButtonActionPerformed(evt);
            }
        });

        hoteljButton.setBackground(new java.awt.Color(0, 76, 68));
        hoteljButton.setFont(new java.awt.Font("΢���ź�", 1, 24)); // NOI18N
        hoteljButton.setForeground(new java.awt.Color(153, 255, 153));
        hoteljButton.setText("�Ƶ�����");
        jPanel2.add(hoteljButton);
        hoteljButton.setBounds(110, 280, 180, 80);
        hoteljButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	hoteljButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("΢���ź�", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 153));
        jLabel2.setText("�û�");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(320, 60, 190, 70);

        jLabel1.setFont(new java.awt.Font("΢���ź�", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 153));
        jLabel1.setText(data.getUserName());
        jPanel2.add(jLabel1);
        jLabel1.setBounds(110, 60, 149, 70);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        
    
    private void informationjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.setVisible(false);
        new UserInformationFrame(data).setVisible(true);
    }
    
    private void commentjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	this.setVisible(false);
        new UserCommentFrame(data).setVisible(true);
    }
    
    private void orderjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }
    
    private void hoteljButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }
    

    // Variables declaration - do not modify  
    private userDataVO data;
    private javax.swing.JButton commentjButton;
    private javax.swing.JButton hoteljButton;
    private javax.swing.JButton informationjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton orderjButton;
    // End of variables declaration                   
}
