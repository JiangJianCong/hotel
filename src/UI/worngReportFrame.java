package UI;

public class worngReportFrame extends javax.swing.JFrame {

    /**
     * Creates new form worngReportFrame
     */
    public worngReportFrame(String str) {
    	this.worngString = str;
        initComponents();
    }

                       
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        reportLabel = new javax.swing.JLabel();
        result = new javax.swing.JScrollPane();
        resultArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        this.setAlwaysOnTop(true);
        
        setLocation(new java.awt.Point(500, 400));
        resultArea.setText(worngString);
        
        reportLabel.setText("´íÎó±¨¸æ");

        resultArea.setEditable(false);
        resultArea.setColumns(20);
        resultArea.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14)); // NOI18N
        resultArea.setLineWrap(true);
        resultArea.setRows(5);
        result.setViewportView(resultArea);

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(result)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(reportLabel)
                .addGap(125, 125, 125))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addComponent(reportLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        
        pack();
    }
   
    private String worngString;
    // Variables declaration - do not modify                     
    private javax.swing.JPanel bgPanel;
    private javax.swing.JLabel reportLabel;
    private javax.swing.JScrollPane result;
    private javax.swing.JTextArea resultArea;
    // End of variables declaration                   
}