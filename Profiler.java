public class Profiler extends javax.swingJframe {

    public Profiler(){
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private String getNameEntered() {

        String name = nameTextField.getText().trim();

        if (name.length() == 0) {name ="Unknown"; }

        return name;
    }

    private int getYearsEntered() {

        int years = 0;

    }

    try {
        years = Integer.parseInt(yearsTextField.getText().trim());
    } catch (NumberFormatException e) {
            years = 0;
        }

        return years;

        private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
            System.exit(0);
        }

        private void catButtonActionPerformed(java.awt.event.ActionEvent evt) {

            Pet myPet = new Cat(getNameEntered(), getYearsEntered());

            String description = myPet.selfDescribe();
            profileTextArea.setText(description);
        
        }

        private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {

            nameTextField.setText("");
            yearsTextField.settext("");
            profileTextArea.setText("");
        }

        private void dogButtonActionPerformed(java.awt.event.ActionEvent evt) {

            Pet myPet = new Dog(getNameEntered(), getYearsEntered());
            
            String description = myPet.selfDescribe();
            profileTextArea.setText(description);
        
        }

        private void goldfishButtonActionPerformed(java.awt.event.ActionEvent evt) {

            Pet myPet = new Goldfish(getNameEntered(), getYearsEntered());
            
            String description = myPet.selfDescribe();
            profileTextArea.setText(description);
        
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable(){

            public void run() {
                new Profiler().setAvailable.setVisible(true);
            }
        });
    }


    private javax.swing.JButton catButton;
    private javax.swing.JButton dogButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton goldfishButton;
    
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jPanel11;
    private javax.swing.JLabel jPanel12;
    private javax.swing.JLabel jPanel13;

    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextArea profileTextArea;
    private javax.swing.JButton rsetButton;
    private javax.swing.JTextField yearsTextField;

}



