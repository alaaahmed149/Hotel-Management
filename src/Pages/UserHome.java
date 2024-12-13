/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pages;

import Database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Pages.AddPages.AddEmployee;
import Pages.AddPages.AddRoom;
import Pages.AddPages.AddCustomer;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserHome extends javax.swing.JFrame {

    /**
     * Creates new form UserHome
     */
    public UserHome() {
        initComponents();
    }
   Connection connection = DatabaseConnection.getConnection();
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminUI = new javax.swing.JPanel();
        TopNav = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        signout_btn = new javax.swing.JButton();
        SideBar = new javax.swing.JPanel();
        rooms_btn = new javax.swing.JButton();
        customers_btn = new javax.swing.JButton();
        reservations_btn = new javax.swing.JButton();
        Main = new javax.swing.JPanel();
        Welcome = new javax.swing.JPanel();
        rooms_page = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rooms_table = new javax.swing.JTable();
        search_field_room = new javax.swing.JTextField();
        add_room = new javax.swing.JButton();
        edit_room = new javax.swing.JButton();
        delete_room = new javax.swing.JButton();
        search_room = new javax.swing.JButton();
        customers_page = new javax.swing.JPanel();
        customer_page = new javax.swing.JLabel();
        search_field_customer = new javax.swing.JTextField();
        search_cust = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        customers_table = new javax.swing.JTable();
        add_cust = new javax.swing.JButton();
        edit_cust = new javax.swing.JButton();
        delete_cust = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1130, 720));
        getContentPane().setLayout(null);

        AdminUI.setBackground(new java.awt.Color(248, 246, 227));
        AdminUI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TopNav.setBackground(new java.awt.Color(58, 79, 65));

        Header.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Header.setForeground(new java.awt.Color(248, 246, 227));
        Header.setText("HOTEL : USER HOME");

        signout_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signout_btn.setForeground(new java.awt.Color(58, 79, 65));
        signout_btn.setText("SignOut");
        signout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signout_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TopNavLayout = new javax.swing.GroupLayout(TopNav);
        TopNav.setLayout(TopNavLayout);
        TopNavLayout.setHorizontalGroup(
            TopNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopNavLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 550, Short.MAX_VALUE)
                .addComponent(signout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        TopNavLayout.setVerticalGroup(
            TopNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopNavLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(signout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopNavLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Header)
                .addGap(112, 112, 112))
        );

        AdminUI.add(TopNav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1132, 62));

        SideBar.setBackground(new java.awt.Color(58, 79, 65));

        rooms_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rooms_btn.setForeground(new java.awt.Color(248, 246, 227));
        rooms_btn.setText("Rooms");
        rooms_btn.setBorderPainted(false);
        rooms_btn.setContentAreaFilled(false);
        rooms_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rooms_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rooms_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rooms_btnActionPerformed(evt);
            }
        });

        customers_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        customers_btn.setForeground(new java.awt.Color(248, 246, 227));
        customers_btn.setText("Customers");
        customers_btn.setBorderPainted(false);
        customers_btn.setContentAreaFilled(false);
        customers_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customers_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        customers_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customers_btnActionPerformed(evt);
            }
        });

        reservations_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        reservations_btn.setForeground(new java.awt.Color(248, 246, 227));
        reservations_btn.setText("Reservations");
        reservations_btn.setBorderPainted(false);
        reservations_btn.setContentAreaFilled(false);
        reservations_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reservations_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout SideBarLayout = new javax.swing.GroupLayout(SideBar);
        SideBar.setLayout(SideBarLayout);
        SideBarLayout.setHorizontalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reservations_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customers_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rooms_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SideBarLayout.setVerticalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(rooms_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customers_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reservations_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(484, Short.MAX_VALUE))
        );

        AdminUI.add(SideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 62, 220, -1));

        Main.setBackground(new java.awt.Color(248, 246, 227));
        Main.setLayout(new java.awt.CardLayout());

        Welcome.setBackground(new java.awt.Color(248, 246, 227));
        Welcome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Main.add(Welcome, "card2");

        rooms_page.setBackground(new java.awt.Color(248, 246, 227));
        rooms_page.setPreferredSize(new java.awt.Dimension(917, 670));
        rooms_page.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                rooms_pageComponentShown(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(58, 79, 65));
        jLabel3.setText("Rooms Page");

        rooms_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Room Type", "Price", "Status"
            }
        ));
        rooms_table.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                rooms_tableComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(rooms_table);

        search_field_room.setText("Search ..");

        add_room.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_room.setText("Add");
        add_room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_roomActionPerformed(evt);
            }
        });

        edit_room.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_room.setText("Edit");
        edit_room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_roomActionPerformed(evt);
            }
        });

        delete_room.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_room.setText("Delete");
        delete_room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_roomActionPerformed(evt);
            }
        });

        search_room.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search_room.setText("Search");
        search_room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_roomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rooms_pageLayout = new javax.swing.GroupLayout(rooms_page);
        rooms_page.setLayout(rooms_pageLayout);
        rooms_pageLayout.setHorizontalGroup(
            rooms_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rooms_pageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rooms_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(rooms_pageLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(search_field_room))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rooms_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete_room, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_room, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_room, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_room))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        rooms_pageLayout.setVerticalGroup(
            rooms_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rooms_pageLayout.createSequentialGroup()
                .addGroup(rooms_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rooms_pageLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(rooms_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_room, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_field_room, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(rooms_pageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(rooms_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rooms_pageLayout.createSequentialGroup()
                        .addComponent(add_room, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edit_room, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete_room, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        Main.add(rooms_page, "card3");

        customers_page.setBackground(new java.awt.Color(248, 246, 227));
        customers_page.setPreferredSize(new java.awt.Dimension(917, 670));
        customers_page.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                customers_pageComponentShown(evt);
            }
        });

        customer_page.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        customer_page.setForeground(new java.awt.Color(58, 79, 65));
        customer_page.setText("Customers Page");
        customer_page.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                customer_pageComponentShown(evt);
            }
        });

        search_field_customer.setText("Search ..");
        search_field_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_field_customerActionPerformed(evt);
            }
        });

        search_cust.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search_cust.setForeground(new java.awt.Color(58, 79, 65));
        search_cust.setText("Search");
        search_cust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_custActionPerformed(evt);
            }
        });

        customers_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Name", "Phone", "Email"
            }
        ));
        customers_table.setRowHeight(25);
        customers_table.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                customers_tableComponentShown(evt);
            }
        });
        jScrollPane4.setViewportView(customers_table);

        add_cust.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_cust.setForeground(new java.awt.Color(58, 79, 65));
        add_cust.setText("Add");
        add_cust.setMaximumSize(new java.awt.Dimension(76, 27));
        add_cust.setMinimumSize(new java.awt.Dimension(76, 27));
        add_cust.setPreferredSize(new java.awt.Dimension(76, 27));
        add_cust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_custActionPerformed(evt);
            }
        });

        edit_cust.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_cust.setForeground(new java.awt.Color(58, 79, 65));
        edit_cust.setText("Edit");
        edit_cust.setMaximumSize(new java.awt.Dimension(76, 27));
        edit_cust.setMinimumSize(new java.awt.Dimension(76, 27));
        edit_cust.setPreferredSize(new java.awt.Dimension(76, 27));
        edit_cust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_custActionPerformed(evt);
            }
        });

        delete_cust.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_cust.setForeground(new java.awt.Color(58, 79, 65));
        delete_cust.setText("Delete");
        delete_cust.setMaximumSize(new java.awt.Dimension(76, 27));
        delete_cust.setMinimumSize(new java.awt.Dimension(76, 27));
        delete_cust.setPreferredSize(new java.awt.Dimension(76, 27));
        delete_cust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_custActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout customers_pageLayout = new javax.swing.GroupLayout(customers_page);
        customers_page.setLayout(customers_pageLayout);
        customers_pageLayout.setHorizontalGroup(
            customers_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customers_pageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customers_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(customers_pageLayout.createSequentialGroup()
                        .addComponent(customer_page, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(search_field_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(customers_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_cust)
                    .addComponent(add_cust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_cust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_cust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        customers_pageLayout.setVerticalGroup(
            customers_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customers_pageLayout.createSequentialGroup()
                .addGroup(customers_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customers_pageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(customer_page, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(customers_pageLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(customers_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_field_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_cust, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customers_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customers_pageLayout.createSequentialGroup()
                        .addComponent(add_cust, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edit_cust, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_cust, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(462, Short.MAX_VALUE))
                    .addComponent(jScrollPane4)))
        );

        Main.add(customers_page, "card4");

        AdminUI.add(Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 910, 660));

        getContentPane().add(AdminUI);
        AdminUI.setBounds(0, 0, 1130, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signout_btnActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure?", "SIGN OUT", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            dispose();
            new SignIn().setVisible(true);
        }
    }//GEN-LAST:event_signout_btnActionPerformed

    private void rooms_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rooms_btnActionPerformed
        Main.removeAll();
        Main.add(rooms_page);
        Main.repaint();
        Main.revalidate();
    }//GEN-LAST:event_rooms_btnActionPerformed

    private void customers_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customers_btnActionPerformed
        Main.removeAll();
        Main.add(customers_page);
        Main.repaint();
        Main.revalidate();
    }//GEN-LAST:event_customers_btnActionPerformed

    private void add_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_roomActionPerformed
        dispose();
        new AddRoom().setVisible(true);
    }//GEN-LAST:event_add_roomActionPerformed

    private void edit_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_roomActionPerformed
        int selectedRow = rooms_table.getSelectedRow();
        if (selectedRow != -1) {
            int id = (Integer) rooms_table.getValueAt(selectedRow, 0);
            dispose();
            new AddRoom(id).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.");
        }
    }//GEN-LAST:event_edit_roomActionPerformed

    private void delete_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_roomActionPerformed

        int selectedRow = rooms_table.getSelectedRow();
        if (selectedRow != -1) {
            int pk = (Integer) rooms_table.getValueAt(selectedRow, 0);
            int response = JOptionPane.showConfirmDialog(this, "Are you sure?", "Delete record", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                deleteRow("rooms", "room_id", pk);
                rooms_table.setModel(loadTableData("rooms"));
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
    }//GEN-LAST:event_delete_roomActionPerformed

    private void search_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_roomActionPerformed

        String search_value = search_field_room.getText();
        rooms_table.setModel(getSearchResult(search_value, "rooms", "room_type"));
    }//GEN-LAST:event_search_roomActionPerformed

    private void customer_pageComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_customer_pageComponentShown

    }//GEN-LAST:event_customer_pageComponentShown

    private void search_field_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_field_customerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_field_customerActionPerformed

    private void search_custActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_custActionPerformed
        String search_value = search_field_customer.getText();
        customers_table.setModel(getSearchResult(search_value, "customers", "name"));
    }//GEN-LAST:event_search_custActionPerformed

    private void customers_tableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_customers_tableComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_customers_tableComponentShown

    private void add_custActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_custActionPerformed
        dispose();
        new AddCustomer().setVisible(true);
    }//GEN-LAST:event_add_custActionPerformed

    private void edit_custActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_custActionPerformed
        int selectedRow = customers_table.getSelectedRow();
        if (selectedRow != -1) {
            int id = (Integer) customers_table.getValueAt(selectedRow, 0);
            dispose();
               new AddCustomer(id).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.");
        }
    }//GEN-LAST:event_edit_custActionPerformed

    private void delete_custActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_custActionPerformed
        int selectedRow = customers_table.getSelectedRow();
        if (selectedRow != -1) {
            int pk = (Integer) customers_table.getValueAt(selectedRow, 0);
            int response = JOptionPane.showConfirmDialog(this, "Are you sure?", "Delete record", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                deleteRow("customers", "customer_id", pk);
                customers_table.setModel(loadTableData("customers"));
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
    }//GEN-LAST:event_delete_custActionPerformed

    private void rooms_pageComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_rooms_pageComponentShown
         rooms_table.setModel(loadTableData("rooms"));
    }//GEN-LAST:event_rooms_pageComponentShown

    private void customers_pageComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_customers_pageComponentShown
         customers_table.setModel(loadTableData("customers"));
    }//GEN-LAST:event_customers_pageComponentShown

    private void rooms_tableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_rooms_tableComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_rooms_tableComponentShown
private DefaultTableModel loadTableData(String table_name) {
        String query = "SELECT * FROM " + table_name;
        DefaultTableModel model = new DefaultTableModel();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(metaData.getColumnName(i));
            }
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return model;
    }
   private DefaultTableModel getSearchResult(String search_val, String table_name, String column) {
        String query = "SELECT * FROM " + table_name + " WHERE " + column + " LIKE '%" + search_val + "%'";
        DefaultTableModel model = new DefaultTableModel();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(metaData.getColumnName(i));
            }
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return model;
    }
    private void deleteRow(String table_name, String column, int prk) {
        String query = "DELETE FROM " + table_name + " WHERE " + column + " = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, prk);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Record has been deleted.");
                revalidate();
                repaint();
            } else {
                JOptionPane.showMessageDialog(this, "Something went wrong, please try again.");
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
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
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminUI;
    private javax.swing.JLabel Header;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel SideBar;
    private javax.swing.JPanel TopNav;
    private javax.swing.JPanel Welcome;
    private javax.swing.JButton add_cust;
    private javax.swing.JButton add_room;
    private javax.swing.JLabel customer_page;
    private javax.swing.JButton customers_btn;
    private javax.swing.JPanel customers_page;
    private javax.swing.JTable customers_table;
    private javax.swing.JButton delete_cust;
    private javax.swing.JButton delete_room;
    private javax.swing.JButton edit_cust;
    private javax.swing.JButton edit_room;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton reservations_btn;
    private javax.swing.JButton rooms_btn;
    private javax.swing.JPanel rooms_page;
    private javax.swing.JTable rooms_table;
    private javax.swing.JButton search_cust;
    private javax.swing.JTextField search_field_customer;
    private javax.swing.JTextField search_field_room;
    private javax.swing.JButton search_room;
    private javax.swing.JButton signout_btn;
    // End of variables declaration//GEN-END:variables
}
