// Write an AWT program for validating the form having a numeric field, character field, phone number, and email id.

public class FormSubmission extends javax.swing.JFrame {

        private java.awt.Button btn_submit;
        private java.awt.TextField field_char;
        private java.awt.TextField field_email;
        private java.awt.TextField field_number;
        private java.awt.TextField field_phonenumber;
        private java.awt.Label label_char;
        private java.awt.Label label_email;
        private java.awt.Label label_number;
        private java.awt.Label label_phonenumber;
        private java.awt.Panel panel1;

        public FormSubmission() {
                initComponents();
                setTitle("Form Submission");
                setLocationRelativeTo(null);
                setResizable(false);
                clearFields();
        }

        private void clearFields() {
                field_number.setText("");
                field_char.setText("");
                field_phonenumber.setText("");
                field_email.setText("");
        }

        private void initComponents() {

                panel1 = new java.awt.Panel();
                field_number = new java.awt.TextField();
                label_number = new java.awt.Label();
                label_char = new java.awt.Label();
                field_char = new java.awt.TextField();
                label_phonenumber = new java.awt.Label();
                field_phonenumber = new java.awt.TextField();
                label_email = new java.awt.Label();
                field_email = new java.awt.TextField();
                btn_submit = new java.awt.Button();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                field_number.setText("");

                label_number.setText("Roll Number");

                label_char.setText("Name");

                field_char.setText("");

                label_phonenumber.setText("Mobile Number");

                field_phonenumber.setText("");

                label_email.setText("Email Address");

                field_email.setText("");

                btn_submit.setLabel("Submit");
                btn_submit.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_submitActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(
                                panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(panel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel1Layout.createSequentialGroup().addGap(44, 44, 44)
                                                .addGroup(panel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(field_email,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                254, Short.MAX_VALUE)
                                                                .addComponent(label_email,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(field_phonenumber,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(label_phonenumber,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(field_char,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(label_char,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(field_number,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(label_number,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(btn_submit,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addContainerGap(44, Short.MAX_VALUE)));
                panel1Layout.setVerticalGroup(panel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel1Layout.createSequentialGroup().addGap(20, 20, 20)
                                                .addComponent(label_number, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(field_number, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(label_char, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(field_char, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(label_phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(field_phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(label_email, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(field_email, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28,
                                                                Short.MAX_VALUE)
                                                .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
        }

        private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {
                String number = field_number.getText();
                String name = field_char.getText();
                String phonenumber = field_phonenumber.getText();
                String email = field_email.getText();

                if (number.length() == 0 || number.length() > 4) {
                        try {
                                if (number.length() > 0) {
                                        Integer.parseInt(number);
                                }
                        } catch (NumberFormatException e) {
                                javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid roll number!");
                                return;
                        }
                        javax.swing.JOptionPane.showMessageDialog(this, "Please enter a roll number (0-100) !");
                } else if (name.length() == 0) {
                        javax.swing.JOptionPane.showMessageDialog(this, "Please enter your name!");
                } else if (phonenumber.length() != 10) {
                        try {
                                if (phonenumber.length() > 0) {
                                        Long.parseLong(phonenumber);
                                }
                        } catch (NumberFormatException e) {
                                javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid phone number!");
                                return;
                        }
                        javax.swing.JOptionPane.showMessageDialog(this,
                                        "Please enter a 10 digit phone number (without country code) !");
                } else if (email.length() < 10 || !email.contains("@") || !email.contains(".")) {
                        javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid email address!");
                } else {
                        javax.swing.JOptionPane.showMessageDialog(this, "Form submitted successfully");
                        clearFields();
                        dispose();
                }
        }

        public static void main(String args[]) {
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(FormSubmission.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(FormSubmission.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(FormSubmission.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(FormSubmission.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new FormSubmission().setVisible(true);
                        }
                });
        }

}
