package Pages.AddPages;

import Database.DatabaseConnection;
import Pages.AdminHome;
import Pages.UserHome;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class AddReservation extends javax.swing.JFrame {

    Connection connection = DatabaseConnection.getConnection();
    private int id = -1;
    private boolean isAdmin = false;
    public AddReservation(boolean isAdmin) {
        this.isAdmin = isAdmin;
        initComponents();
        List<String> availableRooms = getAvailableRooms();
        List<String> customers = getCustomers();
        for (String room : availableRooms) {
            room_field.addItem(room);
        }
        for (String customer : customers) {
            customer_field.addItem(customer);
        }
    }
    public AddReservation() {
        initComponents();
        List<String> availableRooms = getAvailableRooms();
        List<String> customers = getCustomers();
        for (String room : availableRooms) {
            room_field.addItem(room);
        }
        for (String customer : customers) {
            customer_field.addItem(customer);
        }
    }

    public AddReservation(boolean isAdmin, int id) {
        this.isAdmin = isAdmin;
        initComponents();
        this.id = id;
        List<String> availableRooms = getAvailableRooms();
        List<String> customers = getCustomers();
        for (String room : availableRooms) {
            room_field.addItem(room);
        }
        for (String customer : customers) {
            customer_field.addItem(customer);
        }
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cancelReservation_btn = new javax.swing.JButton();
        addReservation_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        checkIn_field = new javax.swing.JTextField();
        checkOut_field = new javax.swing.JTextField();
        room_field = new javax.swing.JComboBox<>();
        customer_field = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(58, 79, 65));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(248, 246, 227));
        jLabel1.setText("ADD NEW RESERVATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(248, 246, 227));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setPreferredSize(new java.awt.Dimension(774, 278));
        jPanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel2ComponentShown(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Room Number");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Customer Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Check in Date");

        cancelReservation_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelReservation_btn.setText("Cancel");
        cancelReservation_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelReservation_btnActionPerformed(evt);
            }
        });

        addReservation_btn.setBackground(new java.awt.Color(58, 79, 65));
        addReservation_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addReservation_btn.setForeground(new java.awt.Color(248, 246, 227));
        addReservation_btn.setText("Done");
        addReservation_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addReservation_btnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Check Out Date");

        checkIn_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkIn_fieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addReservation_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelReservation_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(room_field, 0, 222, Short.MAX_VALUE)
                            .addComponent(checkIn_field))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(customer_field, 0, 218, Short.MAX_VALUE)
                            .addComponent(checkOut_field))))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(room_field, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customer_field, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(checkOut_field, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(checkIn_field, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addReservation_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelReservation_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelReservation_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelReservation_btnActionPerformed
        dispose();
        new AdminHome().setVisible(true);
    }//GEN-LAST:event_cancelReservation_btnActionPerformed

    private void addReservation_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addReservation_btnActionPerformed
        String customer_name = customer_field.getSelectedItem().toString();
        String room_id = room_field.getSelectedItem().toString();
        String check_in_date = checkIn_field.getText();
        String check_out_date = checkOut_field.getText();
        String customer_id = "";
        String query;
        if (id == -1) {
            query = "INSERT INTO reservations (customer_id, room_id, check_in_date,check_out_date) VALUES (?, ?, ?, ?)";
        } else {
            query = "UPDATE reservations SET customer_id = ?, room_id = ?, check_in_date = ?, check_out_date = ? WHERE reservations_id = " + id;
        }
        try {
            String getCustomerId = "SELECT customer_id FROM customers WHERE name = ?";
            PreparedStatement stmtCustomer = connection.prepareStatement(getCustomerId);
            stmtCustomer.setString(1, customer_name);
            ResultSet customer = stmtCustomer.executeQuery();
            if (customer.next()) {
                customer_id = customer.getString("customer_id");
            } else {
                JOptionPane.showMessageDialog(this, "Customer not found.");
            }
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, customer_id);
            stmt.setString(2, room_id);
            stmt.setString(3, check_in_date);
            stmt.setString(4, check_out_date);
            int rowsInserted = stmt.executeUpdate();

            if (rowsInserted > 0) {
                String updateStatus = "UPDATE rooms SET status = 'occupied' WHERE room_id = ?";
                PreparedStatement updateStmt = connection.prepareStatement(updateStatus);
                updateStmt.setString(1, room_id);
                updateStmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Reservation added successfully!");
                if (isAdmin) {
                    dispose();
                    new AdminHome().setVisible(true);
                } else {
                    dispose();
                    new UserHome().setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add reservation. Please try again.");
            }
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }//GEN-LAST:event_addReservation_btnActionPerformed
    private void loadData() {
        String query = "SELECT * FROM reservations WHERE reservations_id = " + id;
        String getCustomerName = "SELECT name FROM customers WHERE customer_id = (SELECT customer_id FROM reservations WHERE reservations_id = ?)";
        try {
            Statement stmt = connection.createStatement();
            PreparedStatement stmtCustomer = connection.prepareStatement(getCustomerName);
            stmtCustomer.setInt(1, id);
            
            ResultSet result = stmt.executeQuery(query);
            ResultSet customerList = stmtCustomer.executeQuery();
            
            customerList.next();
            String name = customerList.getString("name");
            customer_field.setSelectedItem(name);

            result.next();
            room_field.addItem(result.getString("room_id"));
            room_field.setSelectedItem(result.getString("room_id"));
            checkIn_field.setText(result.getString("check_in_date"));
            checkOut_field.setText(result.getString("check_out_date"));
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    private void checkIn_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkIn_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkIn_fieldActionPerformed

    private void jPanel2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel2ComponentShown


    }//GEN-LAST:event_jPanel2ComponentShown
    private List<String> getAvailableRooms() {
        List<String> availableRooms = new ArrayList<>();
        String query = "SELECT room_id FROM rooms WHERE status = 'available'";
        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String room = String.valueOf(rs.getInt("room_id"));
                availableRooms.add(room);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return availableRooms;
    }

    private List<String> getCustomers() {
        List<String> customers = new ArrayList<>();
        String query = "SELECT name FROM customers ";
        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String room = rs.getString("name");
                customers.add(room);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return customers;
    }

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
            java.util.logging.Logger.getLogger(AddReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addReservation_btn;
    private javax.swing.JButton cancelReservation_btn;
    private javax.swing.JTextField checkIn_field;
    private javax.swing.JTextField checkOut_field;
    private javax.swing.JComboBox<String> customer_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> room_field;
    // End of variables declaration//GEN-END:variables
}
