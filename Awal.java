package tampilan;
public class Awal extends javax.swing.JFrame {

   
    public Awal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    private void initComponents() {

        pe11 = new tampilan.pe1();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 12));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Apid\\Documents\\Icon\\Open\\Open_16x16.png")); 
        jButton1.setText(" MASUK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); 
        jLabel1.setText("PENYEWAAN RENTAL MOBIL JAKARTA TIMUR");

        javax.swing.GroupLayout pe11Layout = new javax.swing.GroupLayout(pe11);
        pe11.setLayout(pe11Layout);
        pe11Layout.setHorizontalGroup(
            pe11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pe11Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(pe11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pe11Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pe11Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18))))
        );
        pe11Layout.setVerticalGroup(
            pe11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pe11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pe11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pe11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        Login aa = new Login();
        aa.setVisible(true);
    }

    @param args 
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Awal().setVisible(true);
            }
        });
    }
 
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private tampilan.pe1 pe11;
   
}
