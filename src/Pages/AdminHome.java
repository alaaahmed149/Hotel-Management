/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pages;

import Database.DatabaseConnection;
import Pages.AddPages.AddEmployee;
import Pages.AddPages.AddRoom;
import Pages.AddPages.AddCustomer;
import Pages.AddPages.AddReservation;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminHome extends javax.swing.JFrame {
    public AdminHome() {
        initComponents();
    }

    Connection connection = DatabaseConnection.getConnection();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AdminUI = new javax.swing.JPanel();
        TopNav = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        signout_btn = new javax.swing.JButton();
        SideBar = new javax.swing.JPanel();
        employees_btn = new javax.swing.JButton();
        users_btn = new javax.swing.JButton();
        rooms_btn = new javax.swing.JButton();
        customers_btn = new javax.swing.JButton();
        reservations_btn = new javax.swing.JButton();
        Main = new javax.swing.JPanel();
        Welcome = new javax.swing.JPanel();
        employees_page = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        search_field = new javax.swing.JTextField();
        search_emp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        employees_table = new javax.swing.JTable();
        add_emp = new javax.swing.JButton();
        edit_emp = new javax.swing.JButton();
        delete_emp = new javax.swing.JButton();
        users_page = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        search_btn1 = new javax.swing.JButton();
        search_field1 = new javax.swing.JTextField();
        add_btn1 = new javax.swing.JButton();
        edit_btn1 = new javax.swing.JButton();
        delete_btn1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        users_table = new javax.swing.JTable();
        rooms_page = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rooms_table = new javax.swing.JTable();
        add_room = new javax.swing.JButton();
        edit_room = new javax.swing.JButton();
        delete_room = new javax.swing.JButton();
        search_field_room = new javax.swing.JTextField();
        search_room = new javax.swing.JButton();
        customers_page = new javax.swing.JPanel();
        delete_cust = new javax.swing.JButton();
        customer_page = new javax.swing.JLabel();
        search_field_customer = new javax.swing.JTextField();
        search_cust = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        customers_table = new javax.swing.JTable();
        add_cust = new javax.swing.JButton();
        edit_cust = new javax.swing.JButton();
        reservation_page = new javax.swing.JPanel();
        delete_reser = new javax.swing.JButton();
        search_field_reservations = new javax.swing.JTextField();
        search_reser = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        reservations_table1 = new javax.swing.JTable();
        add_reser = new javax.swing.JButton();
        edit_reser = new javax.swing.JButton();
        customer_page1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(248, 246, 227));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 881, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1130, 720));
        getContentPane().setLayout(null);

        AdminUI.setBackground(new java.awt.Color(248, 246, 227));

        TopNav.setBackground(new java.awt.Color(58, 79, 65));

        Header.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Header.setForeground(new java.awt.Color(248, 246, 227));
        Header.setText("HOTEL : ADMIN HOME");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap())
        );

        SideBar.setBackground(new java.awt.Color(58, 79, 65));

        employees_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        employees_btn.setForeground(new java.awt.Color(248, 246, 227));
        employees_btn.setText("Employees");
        employees_btn.setBorderPainted(false);
        employees_btn.setContentAreaFilled(false);
        employees_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        employees_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        employees_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employees_btnActionPerformed(evt);
            }
        });

        users_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        users_btn.setForeground(new java.awt.Color(248, 246, 227));
        users_btn.setText("Users");
        users_btn.setBorderPainted(false);
        users_btn.setContentAreaFilled(false);
        users_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        users_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        users_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                users_btnActionPerformed(evt);
            }
        });

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
        reservations_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservations_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SideBarLayout = new javax.swing.GroupLayout(SideBar);
        SideBar.setLayout(SideBarLayout);
        SideBarLayout.setHorizontalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reservations_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customers_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rooms_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(users_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employees_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SideBarLayout.setVerticalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(employees_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(users_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rooms_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customers_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reservations_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
        );

        Main.setBackground(new java.awt.Color(248, 246, 227));
        Main.setLayout(new java.awt.CardLayout());

        Welcome.setBackground(new java.awt.Color(248, 246, 227));

        javax.swing.GroupLayout WelcomeLayout = new javax.swing.GroupLayout(Welcome);
        Welcome.setLayout(WelcomeLayout);
        WelcomeLayout.setHorizontalGroup(
            WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 917, Short.MAX_VALUE)
        );
        WelcomeLayout.setVerticalGroup(
            WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );

        Main.add(Welcome, "card4");

        employees_page.setBackground(new java.awt.Color(248, 246, 227));
        employees_page.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                employees_pageComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(58, 79, 65));
        jLabel1.setText("Employees Page");

        search_field.setText("Search ..");
        search_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_fieldActionPerformed(evt);
            }
        });

        search_emp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search_emp.setForeground(new java.awt.Color(58, 79, 65));
        search_emp.setText("Search");
        search_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_empActionPerformed(evt);
            }
        });

        employees_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "Position", "Email"
            }
        ));
        employees_table.setRowHeight(25);
        employees_table.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                employees_tableComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(employees_table);

        add_emp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_emp.setForeground(new java.awt.Color(58, 79, 65));
        add_emp.setText("Add");
        add_emp.setMaximumSize(new java.awt.Dimension(76, 27));
        add_emp.setMinimumSize(new java.awt.Dimension(76, 27));
        add_emp.setPreferredSize(new java.awt.Dimension(76, 27));
        add_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_empActionPerformed(evt);
            }
        });

        edit_emp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_emp.setForeground(new java.awt.Color(58, 79, 65));
        edit_emp.setText("Edit");
        edit_emp.setMaximumSize(new java.awt.Dimension(76, 27));
        edit_emp.setMinimumSize(new java.awt.Dimension(76, 27));
        edit_emp.setPreferredSize(new java.awt.Dimension(76, 27));
        edit_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_empActionPerformed(evt);
            }
        });

        delete_emp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_emp.setForeground(new java.awt.Color(58, 79, 65));
        delete_emp.setText("Delete");
        delete_emp.setMaximumSize(new java.awt.Dimension(76, 27));
        delete_emp.setMinimumSize(new java.awt.Dimension(76, 27));
        delete_emp.setPreferredSize(new java.awt.Dimension(76, 27));
        delete_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_empActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout employees_pageLayout = new javax.swing.GroupLayout(employees_page);
        employees_page.setLayout(employees_pageLayout);
        employees_pageLayout.setHorizontalGroup(
            employees_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employees_pageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(employees_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(employees_pageLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(employees_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_emp)
                    .addComponent(add_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        employees_pageLayout.setVerticalGroup(
            employees_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employees_pageLayout.createSequentialGroup()
                .addGroup(employees_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(employees_pageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(employees_pageLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(employees_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(employees_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(employees_pageLayout.createSequentialGroup()
                        .addComponent(add_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edit_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        Main.add(employees_page, "card2");

        users_page.setBackground(new java.awt.Color(248, 246, 227));
        users_page.setForeground(new java.awt.Color(58, 79, 65));
        users_page.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                users_pageComponentShown(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(58, 79, 65));
        jLabel2.setText("Users Page");

        search_btn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search_btn1.setForeground(new java.awt.Color(58, 79, 65));
        search_btn1.setText("Search");
        search_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btn1ActionPerformed(evt);
            }
        });

        search_field1.setText("Search ..");

        add_btn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_btn1.setForeground(new java.awt.Color(58, 79, 65));
        add_btn1.setText("Add");
        add_btn1.setMaximumSize(new java.awt.Dimension(76, 27));
        add_btn1.setMinimumSize(new java.awt.Dimension(76, 27));
        add_btn1.setPreferredSize(new java.awt.Dimension(76, 27));
        add_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn1ActionPerformed(evt);
            }
        });

        edit_btn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_btn1.setForeground(new java.awt.Color(58, 79, 65));
        edit_btn1.setText("Edit");
        edit_btn1.setMaximumSize(new java.awt.Dimension(76, 27));
        edit_btn1.setMinimumSize(new java.awt.Dimension(76, 27));
        edit_btn1.setPreferredSize(new java.awt.Dimension(76, 27));
        edit_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btn1ActionPerformed(evt);
            }
        });

        delete_btn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_btn1.setForeground(new java.awt.Color(58, 79, 65));
        delete_btn1.setText("Delete");
        delete_btn1.setMaximumSize(new java.awt.Dimension(76, 27));
        delete_btn1.setMinimumSize(new java.awt.Dimension(76, 27));
        delete_btn1.setPreferredSize(new java.awt.Dimension(76, 27));
        delete_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btn1ActionPerformed(evt);
            }
        });

        users_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        users_table.setRowHeight(25);
        jScrollPane3.setViewportView(users_table);

        javax.swing.GroupLayout users_pageLayout = new javax.swing.GroupLayout(users_page);
        users_page.setLayout(users_pageLayout);
        users_pageLayout.setHorizontalGroup(
            users_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(users_pageLayout.createSequentialGroup()
                .addGroup(users_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(users_pageLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(search_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(users_pageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(users_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_btn1))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        users_pageLayout.setVerticalGroup(
            users_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(users_pageLayout.createSequentialGroup()
                .addGroup(users_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(users_pageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(users_pageLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(users_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(users_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(users_pageLayout.createSequentialGroup()
                        .addComponent(add_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edit_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        Main.add(users_page, "card3");

        rooms_page.setBackground(new java.awt.Color(248, 246, 227));
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
                "Room Number", "Bed Type", "Price", "Avallable"
            }
        ));
        jScrollPane2.setViewportView(rooms_table);

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

        search_field_room.setText("Search ..");

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
                .addGroup(rooms_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(rooms_pageLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_field_room, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rooms_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rooms_pageLayout.createSequentialGroup()
                        .addComponent(search_room)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(rooms_pageLayout.createSequentialGroup()
                        .addGroup(rooms_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edit_room, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete_room, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_room, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        rooms_pageLayout.setVerticalGroup(
            rooms_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rooms_pageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rooms_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rooms_pageLayout.createSequentialGroup()
                        .addGroup(rooms_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_field_room, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_room, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(rooms_pageLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(rooms_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rooms_pageLayout.createSequentialGroup()
                        .addComponent(add_room, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edit_room, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete_room, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Main.add(rooms_page, "card5");

        customers_page.setBackground(new java.awt.Color(248, 246, 227));
        customers_page.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                customers_pageComponentShown(evt);
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
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(customers_pageLayout.createSequentialGroup()
                        .addComponent(add_cust, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edit_cust, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_cust, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        Main.add(customers_page, "card6");

        reservation_page.setBackground(new java.awt.Color(248, 246, 229));
        reservation_page.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                reservation_pageComponentShown(evt);
            }
        });

        delete_reser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_reser.setForeground(new java.awt.Color(58, 79, 65));
        delete_reser.setText("Delete");
        delete_reser.setMaximumSize(new java.awt.Dimension(76, 27));
        delete_reser.setMinimumSize(new java.awt.Dimension(76, 27));
        delete_reser.setPreferredSize(new java.awt.Dimension(76, 27));
        delete_reser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_reserActionPerformed(evt);
            }
        });

        search_field_reservations.setText("Search ..");
        search_field_reservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_field_reservationsActionPerformed(evt);
            }
        });

        search_reser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search_reser.setForeground(new java.awt.Color(58, 79, 65));
        search_reser.setText("Search");
        search_reser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_reserActionPerformed(evt);
            }
        });

        reservations_table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation ID", "Customer ID", "Room ID", "Check In Date", "Check Out Date"
            }
        ));
        reservations_table1.setRowHeight(25);
        reservations_table1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                reservations_table1ComponentShown(evt);
            }
        });
        jScrollPane5.setViewportView(reservations_table1);

        add_reser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_reser.setForeground(new java.awt.Color(58, 79, 65));
        add_reser.setText("Add");
        add_reser.setMaximumSize(new java.awt.Dimension(76, 27));
        add_reser.setMinimumSize(new java.awt.Dimension(76, 27));
        add_reser.setPreferredSize(new java.awt.Dimension(76, 27));
        add_reser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_reserActionPerformed(evt);
            }
        });

        edit_reser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_reser.setForeground(new java.awt.Color(58, 79, 65));
        edit_reser.setText("Edit");
        edit_reser.setMaximumSize(new java.awt.Dimension(76, 27));
        edit_reser.setMinimumSize(new java.awt.Dimension(76, 27));
        edit_reser.setPreferredSize(new java.awt.Dimension(76, 27));
        edit_reser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_reserActionPerformed(evt);
            }
        });

        customer_page1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        customer_page1.setForeground(new java.awt.Color(58, 79, 65));
        customer_page1.setText("Reservations Page");
        customer_page1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                customer_page1ComponentShown(evt);
            }
        });

        javax.swing.GroupLayout reservation_pageLayout = new javax.swing.GroupLayout(reservation_page);
        reservation_page.setLayout(reservation_pageLayout);
        reservation_pageLayout.setHorizontalGroup(
            reservation_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservation_pageLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(reservation_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(reservation_pageLayout.createSequentialGroup()
                        .addComponent(customer_page1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_field_reservations, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(reservation_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_reser)
                    .addComponent(add_reser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_reser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_reser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        reservation_pageLayout.setVerticalGroup(
            reservation_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservation_pageLayout.createSequentialGroup()
                .addGroup(reservation_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reservation_pageLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(reservation_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_field_reservations, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_reser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(reservation_pageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(customer_page1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reservation_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(reservation_pageLayout.createSequentialGroup()
                        .addComponent(add_reser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edit_reser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_reser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        Main.add(reservation_page, "card7");

        javax.swing.GroupLayout AdminUILayout = new javax.swing.GroupLayout(AdminUI);
        AdminUI.setLayout(AdminUILayout);
        AdminUILayout.setHorizontalGroup(
            AdminUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(TopNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AdminUILayout.createSequentialGroup()
                .addComponent(SideBar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(918, 918, 918))
            .addGroup(AdminUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminUILayout.createSequentialGroup()
                    .addGap(0, 213, Short.MAX_VALUE)
                    .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        AdminUILayout.setVerticalGroup(
            AdminUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminUILayout.createSequentialGroup()
                .addComponent(TopNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AdminUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminUILayout.createSequentialGroup()
                    .addGap(0, 72, Short.MAX_VALUE)
                    .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(AdminUI);
        AdminUI.setBounds(0, 0, 1130, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void users_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_users_btnActionPerformed
        Main.removeAll();
        Main.add(users_page);
        Main.repaint();
        Main.revalidate();
    }//GEN-LAST:event_users_btnActionPerformed

    private void signout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signout_btnActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure?", "SIGN OUT", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            dispose();
            new SignIn().setVisible(true);
        }
    }//GEN-LAST:event_signout_btnActionPerformed

    private void employees_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employees_btnActionPerformed
        Main.removeAll();
        Main.add(employees_page);
        Main.repaint();
        Main.revalidate();
    }//GEN-LAST:event_employees_btnActionPerformed

    private void search_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_empActionPerformed
        String search_value = search_field.getText();
        employees_table.setModel(getSearchResult(search_value, "employees", "name"));
    }//GEN-LAST:event_search_empActionPerformed

    private void add_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_empActionPerformed
        dispose();
        new AddEmployee().setVisible(true);
    }//GEN-LAST:event_add_empActionPerformed

    private void edit_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_empActionPerformed
        int selectedRow = employees_table.getSelectedRow();
        if (selectedRow != -1) {
            int id = (Integer) employees_table.getValueAt(selectedRow, 0);
            dispose();
            new AddEmployee(id).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.");
        }
    }//GEN-LAST:event_edit_empActionPerformed

    private void delete_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_empActionPerformed
        int selectedRow = employees_table.getSelectedRow();
        if (selectedRow != -1) {
            int pk = (Integer) employees_table.getValueAt(selectedRow, 0);
            int response = JOptionPane.showConfirmDialog(this, "Are you sure?", "Delete record", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                deleteRow("employees", "employee_id", pk);
                employees_table.setModel(loadTableData("employees"));
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
    }//GEN-LAST:event_delete_empActionPerformed

    private void employees_tableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_employees_tableComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_employees_tableComponentShown

    private void employees_pageComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_employees_pageComponentShown
        employees_table.setModel(loadTableData("employees"));
    }//GEN-LAST:event_employees_pageComponentShown

    private void search_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_btn1ActionPerformed

    private void add_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_btn1ActionPerformed

    private void edit_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_btn1ActionPerformed

    private void delete_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_btn1ActionPerformed

    private void users_pageComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_users_pageComponentShown
        users_table.setModel(loadTableData("users"));
    }//GEN-LAST:event_users_pageComponentShown

    private void rooms_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rooms_btnActionPerformed
        Main.removeAll();
        Main.add(rooms_page);
        Main.repaint();
        Main.revalidate();
    }//GEN-LAST:event_rooms_btnActionPerformed

    private void rooms_pageComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_rooms_pageComponentShown
        rooms_table.setModel(loadTableData("rooms"));
    }//GEN-LAST:event_rooms_pageComponentShown

    private void add_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_roomActionPerformed
        dispose();
        new AddRoom().setVisible(true);
    }//GEN-LAST:event_add_roomActionPerformed

    private void search_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_roomActionPerformed

         String search_value = search_field_room.getText();
         rooms_table.setModel(getSearchResult(search_value, "rooms", "room_type"));
    }//GEN-LAST:event_search_roomActionPerformed

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
    
    private void search_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_fieldActionPerformed

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

    private void customers_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customers_btnActionPerformed
        Main.removeAll();
        Main.add(customers_page);
        Main.repaint();
        Main.revalidate();
    }//GEN-LAST:event_customers_btnActionPerformed

    private void customer_pageComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_customer_pageComponentShown
       
    }//GEN-LAST:event_customer_pageComponentShown

    private void customers_pageComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_customers_pageComponentShown
        customers_table.setModel(loadTableData("customers"));
    }//GEN-LAST:event_customers_pageComponentShown

    private void delete_reserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_reserActionPerformed
         int selectedRow = reservations_table1.getSelectedRow();
        if (selectedRow != -1) {
            int pk = (Integer) reservations_table1.getValueAt(selectedRow, 0);
            int response = JOptionPane.showConfirmDialog(this, "Are you sure?", "Delete record", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                deleteRow("reservations", "reservation_id", pk);
                reservations_table1.setModel(loadTableData("reservations"));
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
    
    }//GEN-LAST:event_delete_reserActionPerformed

    private void search_field_reservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_field_reservationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_field_reservationsActionPerformed

    private void search_reserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_reserActionPerformed
      String search_value = search_field_reservations.getText();
      reservations_table1.setModel(getSearchResult(search_value, "reservations", "reservation_id"));
    }//GEN-LAST:event_search_reserActionPerformed

    private void reservations_table1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_reservations_table1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_reservations_table1ComponentShown

    private void add_reserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_reserActionPerformed
       dispose();
        new AddReservation().setVisible(true);
    }//GEN-LAST:event_add_reserActionPerformed

    private void edit_reserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_reserActionPerformed
         int selectedRow = reservations_table1.getSelectedRow();
        if (selectedRow != -1) {
            int id = (Integer) reservations_table1.getValueAt(selectedRow, 0);
            dispose();
           new AddReservation(id).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.");
        }
    }//GEN-LAST:event_edit_reserActionPerformed

    private void customer_page1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_customer_page1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_customer_page1ComponentShown

    private void reservations_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservations_btnActionPerformed
        Main.removeAll();
        Main.add(reservation_page);
        Main.repaint();
        Main.revalidate();
    }//GEN-LAST:event_reservations_btnActionPerformed

    private void reservation_pageComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_reservation_pageComponentShown
       reservations_table1.setModel(loadTableData("reservations"));
    }//GEN-LAST:event_reservation_pageComponentShown
    
    private void rooms_tableComponentShown(java.awt.event.ComponentEvent evt) {                                               
        
    }   
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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
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
    private javax.swing.JButton add_btn1;
    private javax.swing.JButton add_cust;
    private javax.swing.JButton add_emp;
    private javax.swing.JButton add_reser;
    private javax.swing.JButton add_room;
    private javax.swing.JLabel customer_page;
    private javax.swing.JLabel customer_page1;
    private javax.swing.JButton customers_btn;
    private javax.swing.JPanel customers_page;
    private javax.swing.JTable customers_table;
    private javax.swing.JButton delete_btn1;
    private javax.swing.JButton delete_cust;
    private javax.swing.JButton delete_emp;
    private javax.swing.JButton delete_reser;
    private javax.swing.JButton delete_room;
    private javax.swing.JButton edit_btn1;
    private javax.swing.JButton edit_cust;
    private javax.swing.JButton edit_emp;
    private javax.swing.JButton edit_reser;
    private javax.swing.JButton edit_room;
    private javax.swing.JButton employees_btn;
    private javax.swing.JPanel employees_page;
    private javax.swing.JTable employees_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel reservation_page;
    private javax.swing.JButton reservations_btn;
    private javax.swing.JTable reservations_table1;
    private javax.swing.JButton rooms_btn;
    private javax.swing.JPanel rooms_page;
    private javax.swing.JTable rooms_table;
    private javax.swing.JButton search_btn1;
    private javax.swing.JButton search_cust;
    private javax.swing.JButton search_emp;
    private javax.swing.JTextField search_field;
    private javax.swing.JTextField search_field1;
    private javax.swing.JTextField search_field_customer;
    private javax.swing.JTextField search_field_reservations;
    private javax.swing.JTextField search_field_room;
    private javax.swing.JButton search_reser;
    private javax.swing.JButton search_room;
    private javax.swing.JButton signout_btn;
    private javax.swing.JButton users_btn;
    private javax.swing.JPanel users_page;
    private javax.swing.JTable users_table;
    // End of variables declaration//GEN-END:variables
}
