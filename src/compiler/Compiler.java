
package compiler;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import compiler.g1Lexer;
import compiler.g1Parser;

public class Compiler extends javax.swing.JFrame {

    /**
     * Creates new form Compiler
     */
    public Compiler() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Input");

        jButton1.setText("submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel2.setText("result");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data Type", "Variable"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        

// TODO add your handling code here:
        String code=jTextArea1.getText();
        String lines[]=code.split(";");
        String var="";
        String keyword="";
        String digits="";
        String op="";
        String ch="'";
        String literals="";
        String[] array1={};
        String[] array2={};
        int ind1=0;
        int ind2=0;
        int cc=0;
        char[] opsArray = new char[] {'-','=','*','/'};
        char[] lit = new char[] {'"'};
        for(int i=0;i<lines.length;i++)
        {
            cc++;
        	String words[]=lines[i].split(" ");
            for(int j=0;j<words.length;j++)
            {
            
            StringBuilder sb = new StringBuilder();
            
                for(int k=0;k<words[j].length();k++)
                {
/*                if(new String(lit).indexOf(words[j].charAt(k)) == 1)
                {
                System.out.print("hello");
                }
                    
  */                  if(new String(opsArray).indexOf(words[j].charAt(k)) == -1/* ||words[j].charAt(k-1)=='e'*/ )
                {
                    sb.append(words[j].charAt(k));
                 
                       //detcting characters           
                    
                }
                 
                /*else if(words[j].charAt(k-1)=='e')
                {
                sb.append(words[j].charAt(k));
                continue;
                }*/
                
                if((!(new String(opsArray).indexOf(words[j].charAt(k)) == -1) )|| k>=(words[j].length()-1))
                {   
                
                    
                    
                    if(Pattern.compile("char|int|float|bool|string|long|if|else|for|while|do|switch|return|continue").matcher(sb.toString()).find())
                    {
                        if(!keyword.contains(sb.toString()))
                        keyword=sb.toString();
                    
//                    array1[ind1]=sb.toString();
  //                  ind1++;
                    }
                    else if(sb.toString().matches("[A-Za-z][A-Za-z0-9_]*"))
                    {
                        if(!var.contains(sb.toString()))
                        var=sb.toString();
    //                array2[ind2]=sb.toString();
      //              ind2++;
                    }
                    sb.delete(0, sb.length());
                    if(!(new String(opsArray).indexOf(words[j].charAt(k)) == -1) )
                        sb.append(words[j].charAt(k));
                        if(!op.contains(sb.toString()))
                        op=sb.toString();
                        sb.delete(0, sb.length());
                }
                        
                }
                
            }
            model.addRow(new Object[]{keyword, var});
    		
            CharStream charStream=new ANTLRStringStream(lines[i]+";");
    		g1Lexer lexer=new g1Lexer(charStream);

    		TokenStream tokenStream=new CommonTokenStream(lexer);
    		g1Parser parser=new g1Parser(tokenStream);
    		try {
    			parser.declstmt();
    		} catch (RecognitionException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    				
    			}
        }
        


        
        String dt1=(String)jTable1.getModel().getValueAt(0, 0);
        String dt2=(String)jTable1.getModel().getValueAt(1, 0);
        //System.out.println(dt1+" "+dt2);
        dt1=dt1.trim();
        dt2=dt2.trim();
        if(!(dt1.equals(dt2)))
        {JOptionPane.showMessageDialog(null, "types are not compatible");}

  //for(int i=0;i<2;i++)
//      System.out.println(array1[0]+"   "+array2[0]);
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Compiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compiler().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration                   
}
