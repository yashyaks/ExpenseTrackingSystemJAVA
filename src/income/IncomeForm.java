/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package income;

import app.DBConn;
import app.QueryInterfce;
import report.ReportForm;
import app.User;
import category.CategoryForm;
import incomecategories.IncomeCategoryForm;



import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import expenses.ExpenseForm;

/**
 *
 * @author OM USKAIKAR
 */
public class IncomeForm extends javax.swing.JFrame implements QueryInterfce{
    DBConn conn=new DBConn();
    Connection con=conn.getConnection();
    Statement stmt = null;
    Statement stmt1 = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    
	
    /**
     * Creates new form ExpenseForm
     */
    public IncomeForm() {
        initComponents();
        populateCombo();
        showData();
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }
    
//    gathering the list of category data for dropdown
    public HashMap<String, Integer> populateCombo(){
        
            HashMap<String, Integer> map=new HashMap<String, Integer>();
            
           
            try {
            String query="select id, name from income_categories";
            stmt=con.createStatement();
            rs=stmt.executeQuery(query);
//            Category category;
            while(rs.next()){
                               
                categories.addItem(rs.getString("name"));
                
//                category=new Category(rs.getInt(0),rs.getString(1));
//                map.put(category.getName(), category.getId());
            }
          
            } catch (SQLException ex) {
               java.util.logging.Logger.getLogger(IncomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        return map;
    } 
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        description = new javax.swing.JTextField();
        categories = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lbl_session_user_id = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        date = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableIncome = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        expenseMenu = new javax.swing.JMenu();
        incomeMenu = new javax.swing.JMenu();
        categoryMenu = new javax.swing.JMenu();
        incomeCategoryMenu = new javax.swing.JMenu();
        Report = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Title");

        jLabel2.setText("Description ");

        description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionActionPerformed(evt);
            }
        });

        categories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriesActionPerformed(evt);
            }
        });

        jLabel3.setText("Categories");

        jLabel4.setText("Quantity");

        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        jLabel5.setText("Amount");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel6.setText("ID");

        ID.setEditable(false);

        jLabel8.setText("Date");

        clear.setText("clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(441, 441, 441))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(ID)
                                        .addGap(81, 81, 81)))
                                .addComponent(lbl_session_user_id)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(description, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categories, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quantity, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amount, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(title))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_session_user_id)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(update)
                    .addComponent(delete)
                    .addComponent(clear))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTableIncome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Title", "Description", "Category", "Quantity", "Amount", "Date"
            }
        ));
        jTableIncome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableIncomeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableIncome);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Bungee Inline", 0, 36)); // NOI18N
        jLabel7.setText("Expense Tracking System");

        jLabel9.setText("Dashboard > Income");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        expenseMenu.setText("Expense");
        expenseMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expenseMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(expenseMenu);

        incomeMenu.setText("Income");
        incomeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                incomeMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(incomeMenu);

        categoryMenu.setText("Category");
        categoryMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(categoryMenu);

        incomeCategoryMenu.setText("Income Category");
        incomeCategoryMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                incomeCategoryMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(incomeCategoryMenu);

        Report.setText("Report");
        Report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportMouseClicked(evt);
            }
        });
        jMenuBar1.add(Report);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void categoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriesActionPerformed
//      displaying data of income in table
    public ArrayList<Income> getIncomeList(){
    
        ArrayList<Income> incomeList=new ArrayList<Income>();
       //     sql query for displaying data of income in table joining category table

        String query="SELECT incomes.id,incomes.name, incomes.category_id, income_categories.name as category,incomes.description, incomes.quantity,incomes.cost,incomes.date,incomes.user_id FROM incomes LEFT JOIN income_categories ON incomes.category_id=income_categories.id where incomes.user_id='"+User.getUser_session_id()+"'"; 
        
        try{
            stmt=con.createStatement();
            rs=stmt.executeQuery(query);
            
            Income incomes;
           
            while(rs.next()){   
                incomes=new Income(rs.getInt("id"),rs.getInt("quantity"),rs.getString("category"),rs.getInt("cost"),rs.getString("name"),rs.getString("description"),rs.getDate("date"));
                System.out.println(rs.getString("date"));
                incomeList.add(incomes);
            }          
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, error.getMessage());
        }
         
        return incomeList;
    }
    
    public void showData(){
        
        ArrayList<Income> list =getIncomeList();
      
        DefaultTableModel model=(DefaultTableModel) jTableIncome.getModel();
        Object[] row=new Object[7];
        for(int i=0;i<list.size();i++){
            
            
            row[0]=list.get(i).getId();             
            row[1]=list.get(i).getTitle(); 
            row[2]=list.get(i).getDescription(); 
            row[3]=list.get(i).getCategory();
            row[4]=list.get(i).getQuantity();
            row[5]=list.get(i).getCost();
            row[6]=list.get(i).getDate();
            model.addRow(row);

        }
        
    }
    private void executeSQLQuery(String query, String message) {
        

        try {
            stmt=con.createStatement();
            if(stmt.executeUpdate(query)==1){
                 DefaultTableModel model=(DefaultTableModel)jTableIncome.getModel();
                model.setRowCount(0);
                showData();
                JOptionPane.showMessageDialog(null, message);
                new IncomeForm().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"Data not inserted ");
            }
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(IncomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        Integer users=User.user_session_id;       
//        lbl_session_user_id.setText(String.valueOf(User.getUser_session_id()));
//        String session_user_id=lbl_session_user_id.getText();
        Integer session_user_id=User.getUser_session_id();
        SimpleDateFormat dd=new SimpleDateFormat("Y-MM-dd");
        String ddd=dd.format(date.getCalendar().getTime());
        //            sql query for geting the specific item that we have selected
        try {
            String query=" SELECT id from income_categories where name = '"+categories.getSelectedItem().toString()+"' ";
            stmt1=con.createStatement();
            rs1=stmt1.executeQuery(query);
            rs1.next();
//            get the selected id 
            Integer sum=rs1.getInt(1);
            System.out.println("result "+sum);
//          Converstion of int to string
            String convertSum = Integer.toString(sum);
            // sql query for inserting expenses data
          String query1="insert into incomes(name,description,category_id,quantity,cost,date,user_id) values('"+title.getText()+"','"+description.getText()+"','"+convertSum+"','"+Integer.parseInt(quantity.getText())+"','"+Float.parseFloat(amount.getText())+"','"+ddd+"','"+User.getUser_session_id()+"')";
        String message="Successfully inserted data";
        executeSQLQuery(query1, message);
        System.out.println(query1);
        } catch (SQLException ex) {
            Logger.getLogger(IncomeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        String query="delete from incomes where id= '"+ID.getText()+"' "  ;
            conn.executeSQLQuery(this,query, "Successfully deleted");
    }//GEN-LAST:event_deleteActionPerformed

    private void jTableIncomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableIncomeMouseClicked
        // TODO add your handling code here:
        int i=jTableIncome.getSelectedRow();
        TableModel model=jTableIncome.getModel();
        ID.setText(model.getValueAt(i,0).toString());
        title.setText(model.getValueAt(i,1).toString());
        description.setText(model.getValueAt(i,2).toString());   
        categories.setSelectedItem(model.getValueAt(i,3));
        quantity.setText(model.getValueAt(i,4).toString());
        amount.setText(model.getValueAt(i,5).toString());
        date.setDate((java.util.Date) model.getValueAt(i,6));
        
    }//GEN-LAST:event_jTableIncomeMouseClicked

     
    private void expenseMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expenseMenuMouseClicked
        // TODO add your handling code here:
         new ExpenseForm().setVisible(true);
        
    }//GEN-LAST:event_expenseMenuMouseClicked

    private void categoryMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryMenuMouseClicked
        // TODO add your handling code here:
      
        new CategoryForm().setVisible(true);
    }//GEN-LAST:event_categoryMenuMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        if(title.getText().trim().isEmpty()){
          
        }else{
            SimpleDateFormat dd=new SimpleDateFormat("Y-MM-dd");
            String dates=dd.format(date.getCalendar().getTime());
            System.out.println(dates);
            String query="update incomes set name='"+title.getText()+"', description='"+description.getText()+"' , category_id='"+categories.getSelectedIndex()+"', quantity='"+Integer.parseInt(quantity.getText())+"',cost='"+Float.parseFloat(amount.getText())+"',date='"+dates+"'  where id= '"+ID.getText()+"' ";
            System.out.println(query);
            conn.executeSQLQuery(this,query, "Updated successfully");
           
        }
    }//GEN-LAST:event_updateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        new IncomeForm().setVisible(true);
    }//GEN-LAST:event_clearActionPerformed

    private void incomeCategoryMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incomeCategoryMenuMouseClicked
        // TODO add your handling code here:
         new IncomeCategoryForm().setVisible(true);
    }//GEN-LAST:event_incomeCategoryMenuMouseClicked

    private void incomeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incomeMenuMouseClicked
        // TODO add your handling code here:
        new IncomeForm().setVisible(true);
    }//GEN-LAST:event_incomeMenuMouseClicked

    private void ReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportMouseClicked
        // TODO add your handling code here:
        new ReportForm().setVisible(true);
    }//GEN-LAST:event_ReportMouseClicked

    private void descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionActionPerformed
   
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
            java.util.logging.Logger.getLogger(IncomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IncomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IncomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IncomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new IncomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JMenu Report;
    private javax.swing.JTextField amount;
    private javax.swing.JComboBox<String> categories;
    private javax.swing.JMenu categoryMenu;
    private javax.swing.JButton clear;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton delete;
    private javax.swing.JTextField description;
    private javax.swing.JMenu expenseMenu;
    private javax.swing.JMenu incomeCategoryMenu;
    private javax.swing.JMenu incomeMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableIncome;
    private javax.swing.JLabel lbl_session_user_id;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField title;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onQueryExec(String message) {
       DefaultTableModel model=(DefaultTableModel)jTableIncome.getModel();
        model.setRowCount(0);
        showData();
        JOptionPane.showMessageDialog(null, message);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onError(String message) {
    JOptionPane.showMessageDialog(null,message);   
    //To change body of generated methods, choose Tools | Templates.
    }

    
}
