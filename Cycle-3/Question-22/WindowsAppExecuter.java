// Write a GUI program to execute 3 Windows 95 applications (Like notepad, calculator, paint) through Java.

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.io.IOException;
import java.lang.Runtime;

public class WindowsAppExecuter extends javax.swing.JFrame {

    private final String BGCOLOR = "#2c3e50";
    private final String FGCOLOR = "#ecf0f1";

    public WindowsAppExecuter() {
        initComponents();
        setTitle("Java App Executer");
        setIconImage(appIcon.getImage());
        setResizable(false);
        getContentPane().setBackground(java.awt.Color.decode(BGCOLOR));

    }

    private void initComponents() {
        appIcon = new ImageIcon("icons/applogo.png");
        notepadIcon = new ImageIcon("icons/notepad.png");
        calculatorIcon = new ImageIcon("icons/calculator.png");
        paintIcon = new ImageIcon("icons/paint.png");

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(java.awt.Color.decode(BGCOLOR));

        notepadButton = new javax.swing.JButton(notepadIcon);
        paintButton = new javax.swing.JButton(paintIcon);
        calculatorButton = new javax.swing.JButton(calculatorIcon);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setForeground(java.awt.Color.decode(FGCOLOR));
        jLabel2.setForeground(java.awt.Color.decode(FGCOLOR));
        jLabel3.setForeground(java.awt.Color.decode(FGCOLOR));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        notepadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notepadButtonActionPerformed(evt);
            }
        });

        calculatorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorButtonActionPerformed(evt);
            }
        });

        paintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paintButtonActionPerformed(evt);
            }
        });

        jLabel1.setText(" Notepad");

        jLabel2.setText(" Calculator");

        jLabel3.setText("     Paint");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60,
                                                Short.MAX_VALUE)
                                        .addComponent(notepadButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47,
                                        Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(calculatorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(paintButton, javax.swing.GroupLayout.DEFAULT_SIZE, 60,
                                                Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(60, 60, 60)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(paintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(notepadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(calculatorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel1)))
                                .addContainerGap(134, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }

    private void notepadButtonActionPerformed(java.awt.event.ActionEvent evt) {
        launchExternalApplication("notepad.exe");
    }

    private void calculatorButtonActionPerformed(java.awt.event.ActionEvent evt) {
        launchExternalApplication("calc.exe");
    }

    private void paintButtonActionPerformed(java.awt.event.ActionEvent evt) {
        launchExternalApplication("mspaint.exe");
    }

    private void launchExternalApplication(String executableName) {
        Runtime runtime = Runtime.getRuntime();
        try {
            Process process = runtime.exec(executableName);
            setVisible(false);
            process.waitFor();
            setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Something went wrong while opening " + executableName.split(".exe")[0] + " !", "Error", 0);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Something went wrong while opening " + executableName.split(".exe")[0] + " !", "Error", 0);
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WindowsAppExecuter.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowsAppExecuter.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowsAppExecuter.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowsAppExecuter.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowsAppExecuter().setVisible(true);
            }
        });
    }

    private javax.swing.JButton calculatorButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton notepadButton;
    private javax.swing.JButton paintButton;

    private javax.swing.Icon notepadIcon;
    private javax.swing.Icon calculatorIcon;
    private javax.swing.Icon paintIcon;
    private javax.swing.ImageIcon appIcon;

}
