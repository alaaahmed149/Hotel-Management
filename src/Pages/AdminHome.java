/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pages;

import Database.DatabaseConnection;
import Pages.AddPages.AddEmployee;
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

        customers_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        customers_btn.setForeground(new java.awt.Color(248, 246, 227));
        customers_btn.setText("Customers");
        customers_btn.setBorderPainted(false);
        customers_btn.setContentAreaFilled(false);
        customers_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customers_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

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
                .addContainerGap(31, Short.MAX_VALUE))
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
                .addContainerGap(28, Short.MAX_VALUE))
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
                .addComponent(SideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AdminUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminUILayout.createSequentialGroup()
                    .addGap(0, 58, Short.MAX_VALUE)
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
    private javax.swing.JButton add_emp;
    private javax.swing.JButton customers_btn;
    private javax.swing.JButton delete_btn1;
    private javax.swing.JButton delete_emp;
    private javax.swing.JButton edit_btn1;
    private javax.swing.JButton edit_emp;
    private javax.swing.JButton employees_btn;
    private javax.swing.JPanel employees_page;
    private javax.swing.JTable employees_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton reservations_btn;
    private javax.swing.JButton rooms_btn;
    private javax.swing.JButton search_btn1;
    private javax.swing.JButton search_emp;
    private javax.swing.JTextField search_field;
    private javax.swing.JTextField search_field1;
    private javax.swing.JButton signout_btn;
    private javax.swing.JButton users_btn;
    private javax.swing.JPanel users_page;
    private javax.swing.JTable users_table;
    // End of variables declaration//GEN-END:variables
}
