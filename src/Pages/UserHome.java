package Pages;

import Database.CurrentUser;
import Database.DatabaseConnection;
import Pages.AddPages.AddRoom;
import Pages.AddPages.AddCustomer;
import Pages.AddPages.AddReservation;
import Utilities.LoggerUtil;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserHome extends javax.swing.JFrame {

    public UserHome() {
        initComponents();
        current_user.setText(CurrentUser.getUsername());
    }
    Connection connection = DatabaseConnection.getConnection();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminUI = new javax.swing.JPanel();
        TopNav = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        signout_btn = new javax.swing.JButton();
        current_user = new javax.swing.JLabel();
        SideBar = new javax.swing.JPanel();
        rooms_btn = new javax.swing.JButton();
        customers_btn = new javax.swing.JButton();
        reservations_btn = new javax.swing.JButton();
        Main = new javax.swing.JPanel();
        Welcome = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        rooms_dashboard = new javax.swing.JButton();
        cust_dashboard = new javax.swing.JButton();
        reser_dashboard = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rooms_page = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        search_field_room = new javax.swing.JTextField();
        add_room = new javax.swing.JButton();
        edit_room = new javax.swing.JButton();
        delete_room = new javax.swing.JButton();
        search_room = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        rooms_table = new javax.swing.JTable();
        customers_page = new javax.swing.JPanel();
        customer_page = new javax.swing.JLabel();
        search_field_customer = new javax.swing.JTextField();
        search_cust = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        customers_table = new javax.swing.JTable();
        add_cust = new javax.swing.JButton();
        edit_cust = new javax.swing.JButton();
        delete_cust = new javax.swing.JButton();
        reservation_page = new javax.swing.JPanel();
        delete_reser = new javax.swing.JButton();
        search_field_reservations = new javax.swing.JTextField();
        search_reser = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        reservations_table1 = new javax.swing.JTable();
        add_reser = new javax.swing.JButton();
        edit_reser = new javax.swing.JButton();
        customer_page1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOTEL | USER HOME");
        setMinimumSize(new java.awt.Dimension(1130, 720));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(null);

        AdminUI.setBackground(new java.awt.Color(248, 246, 227));
        AdminUI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TopNav.setBackground(new java.awt.Color(58, 79, 65));

        Header.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Header.setForeground(new java.awt.Color(248, 246, 227));
        Header.setText("HOTEL | USER HOME");
        Header.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeaderMouseClicked(evt);
            }
        });

        signout_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signout_btn.setForeground(new java.awt.Color(58, 79, 65));
        signout_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        signout_btn.setText("SignOut");
        signout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signout_btnActionPerformed(evt);
            }
        });

        current_user.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        current_user.setForeground(new java.awt.Color(248, 246, 227));
        current_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        current_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile-user.png"))); // NOI18N
        current_user.setText("  username");
        current_user.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                current_userComponentShown(evt);
            }
        });

        javax.swing.GroupLayout TopNavLayout = new javax.swing.GroupLayout(TopNav);
        TopNav.setLayout(TopNavLayout);
        TopNavLayout.setHorizontalGroup(
            TopNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopNavLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 406, Short.MAX_VALUE)
                .addComponent(current_user, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        TopNavLayout.setVerticalGroup(
            TopNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopNavLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(TopNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(current_user, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        rooms_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rooms.png"))); // NOI18N
        rooms_btn.setText(" Rooms");
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
        customers_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customers.png"))); // NOI18N
        customers_btn.setText(" Customers");
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
        reservations_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reservations.png"))); // NOI18N
        reservations_btn.setText(" Reservations");
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
                .addContainerGap()
                .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rooms_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reservations_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customers_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        Welcome.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(58, 79, 65));
        jLabel4.setText("Dashboard");
        Welcome.add(jLabel4);
        jLabel4.setBounds(10, 10, 300, 48);

        rooms_dashboard.setBackground(new java.awt.Color(248, 246, 227));
        rooms_dashboard.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        rooms_dashboard.setForeground(new java.awt.Color(58, 79, 65));
        rooms_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bedroom.png"))); // NOI18N
        rooms_dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rooms_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rooms_dashboardActionPerformed(evt);
            }
        });
        Welcome.add(rooms_dashboard);
        rooms_dashboard.setBounds(20, 70, 408, 208);

        cust_dashboard.setBackground(new java.awt.Color(248, 246, 227));
        cust_dashboard.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        cust_dashboard.setForeground(new java.awt.Color(58, 79, 65));
        cust_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tourist.png"))); // NOI18N
        cust_dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cust_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cust_dashboardActionPerformed(evt);
            }
        });
        Welcome.add(cust_dashboard);
        cust_dashboard.setBounds(460, 70, 408, 208);

        reser_dashboard.setBackground(new java.awt.Color(248, 246, 227));
        reser_dashboard.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        reser_dashboard.setForeground(new java.awt.Color(58, 79, 65));
        reser_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/schedule.png"))); // NOI18N
        reser_dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reser_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reser_dashboardActionPerformed(evt);
            }
        });
        Welcome.add(reser_dashboard);
        reser_dashboard.setBounds(20, 320, 408, 208);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(58, 79, 65));
        jLabel7.setText("Rooms");
        Welcome.add(jLabel7);
        jLabel7.setBounds(20, 290, 200, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(58, 79, 65));
        jLabel8.setText("Customers");
        Welcome.add(jLabel8);
        jLabel8.setBounds(460, 290, 190, 25);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(58, 79, 65));
        jLabel9.setText("Reservations");
        Welcome.add(jLabel9);
        jLabel9.setBounds(20, 540, 109, 25);

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

        rooms_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Type", "Price", "Status"
            }
        ));
        rooms_table.setRowHeight(25);
        jScrollPane2.setViewportView(rooms_table);

        javax.swing.GroupLayout rooms_pageLayout = new javax.swing.GroupLayout(rooms_page);
        rooms_page.setLayout(rooms_pageLayout);
        rooms_pageLayout.setHorizontalGroup(
            rooms_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rooms_pageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rooms_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rooms_pageLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(search_field_room, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(rooms_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete_room, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_room, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_room, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_room))
                .addContainerGap(23, Short.MAX_VALUE))
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
                .addGroup(rooms_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rooms_pageLayout.createSequentialGroup()
                        .addComponent(add_room, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edit_room, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete_room, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
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
                        .addComponent(delete_cust, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        Main.add(customers_page, "card4");

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
                .addContainerGap()
                .addGroup(reservation_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(reservation_pageLayout.createSequentialGroup()
                        .addComponent(customer_page1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(search_field_reservations, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(reservation_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_reser)
                    .addComponent(add_reser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_reser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_reser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        reservation_pageLayout.setVerticalGroup(
            reservation_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservation_pageLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(reservation_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customer_page1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(reservation_pageLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(reservation_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_reser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_field_reservations, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reservation_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reservation_pageLayout.createSequentialGroup()
                        .addComponent(add_reser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edit_reser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_reser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        Main.add(reservation_page, "card7");

        AdminUI.add(Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 910, 660));

        getContentPane().add(AdminUI);
        AdminUI.setBounds(0, 0, 1130, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signout_btnActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure?", "SIGN OUT", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            LoggerUtil.logAction(this.getClass(), CurrentUser.getUsername() + " has signed out.");
            CurrentUser.clearUser();
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
        new AddRoom(false).setVisible(true);
    }//GEN-LAST:event_add_roomActionPerformed

    private void edit_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_roomActionPerformed
        int selectedRow = rooms_table.getSelectedRow();
        if (selectedRow != -1) {
            int id = (Integer) rooms_table.getValueAt(selectedRow, 0);
            dispose();
            new AddRoom(false, id).setVisible(true);
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
                LoggerUtil.logAction(this.getClass(), CurrentUser.getUsername() + " has deleted a room.");
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
        new AddCustomer(false).setVisible(true);
    }//GEN-LAST:event_add_custActionPerformed

    private void edit_custActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_custActionPerformed
        int selectedRow = customers_table.getSelectedRow();
        if (selectedRow != -1) {
            int id = (Integer) customers_table.getValueAt(selectedRow, 0);
            dispose();
            new AddCustomer(false, id).setVisible(true);
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
                LoggerUtil.logAction(this.getClass(), CurrentUser.getUsername() + " has deleted a customer.");
                customers_table.setModel(loadTableData("customers"));
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
    }//GEN-LAST:event_delete_custActionPerformed

    private void rooms_pageComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_rooms_pageComponentShown
        rooms_table.setModel(loadTableData("rooms"));
        try {
            String updateStatus = "UPDATE rooms SET status = 'available' WHERE room_id NOT IN (SELECT DISTINCT room_id FROM reservations)";
            PreparedStatement updateStmt = connection.prepareStatement(updateStatus);
            int result = updateStmt.executeUpdate();
            if (result > 0) {
                rooms_table.setModel(loadTableData("rooms"));
                rooms_table.getColumnModel().getColumn(3).setCellRenderer(new RoomsTableRenderer());
            }
        } catch (Exception ex) {
            LoggerUtil.logError(this.getClass(), "Failed to update rooms page. ", ex);
        }
        rooms_table.getColumnModel().getColumn(3).setCellRenderer(new RoomsTableRenderer());
    }//GEN-LAST:event_rooms_pageComponentShown

    private void customers_pageComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_customers_pageComponentShown
        customers_table.setModel(loadTableData("customers"));
    }//GEN-LAST:event_customers_pageComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        int countRooms = countRows("rooms", "room_id");
        rooms_dashboard.setText(String.valueOf(countRooms));
        int countCustomers = countRows("customers", "customer_id");
        cust_dashboard.setText(String.valueOf(countCustomers));
        int countReservations = countRows("reservations", "reservations_id");
        reser_dashboard.setText(String.valueOf(countReservations));
    }//GEN-LAST:event_formComponentShown

    private void HeaderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseClicked
        Main.removeAll();
        Main.add(Welcome);
        Main.repaint();
        Main.revalidate();
    }//GEN-LAST:event_HeaderMouseClicked

    private void reservations_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservations_btnActionPerformed
        Main.removeAll();
        Main.add(reservation_page);
        Main.repaint();
        Main.revalidate();
    }//GEN-LAST:event_reservations_btnActionPerformed

    private void delete_reserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_reserActionPerformed
        int selectedRow = reservations_table1.getSelectedRow();
        if (selectedRow != -1) {
            int pk = (Integer) reservations_table1.getValueAt(selectedRow, 0);
            int response = JOptionPane.showConfirmDialog(this, "Are you sure?", "Delete record", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                deleteRow("reservations", "reservations_id", pk);
                LoggerUtil.logAction(this.getClass(), CurrentUser.getUsername() + " has deleted a reservation.");
                try {
                    String room_id = reservations_table1.getValueAt(selectedRow, 2).toString();
                    String updateStatus = "UPDATE rooms SET status = 'available' WHERE room_id = ?";
                    PreparedStatement updateStmt = connection.prepareStatement(updateStatus);
                    updateStmt.setString(1, room_id);
                    int result = updateStmt.executeUpdate();
                    if (result > 0) {
                        rooms_table.setModel(loadTableData("rooms"));
                        rooms_table.getColumnModel().getColumn(3).setCellRenderer(new RoomsTableRenderer());
                    }
                } catch (Exception ex) {
                    LoggerUtil.logError(this.getClass(), "Failed to upate reservations page. ", ex);
                }
                reservations_table1.setModel(loadTableData("reservations"));
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
    }//GEN-LAST:event_delete_reserActionPerformed

    private void search_field_reservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_field_reservationsActionPerformed

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
        new AddReservation(false).setVisible(true);
    }//GEN-LAST:event_add_reserActionPerformed

    private void edit_reserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_reserActionPerformed
        int selectedRow = reservations_table1.getSelectedRow();
        if (selectedRow != -1) {
            int id = (Integer) reservations_table1.getValueAt(selectedRow, 0);
            dispose();
            new AddReservation(false, id).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.");
        }
    }//GEN-LAST:event_edit_reserActionPerformed

    private void customer_page1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_customer_page1ComponentShown

    }//GEN-LAST:event_customer_page1ComponentShown

    private void reservation_pageComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_reservation_pageComponentShown
        reservations_table1.setModel(loadTableData("reservations"));
    }//GEN-LAST:event_reservation_pageComponentShown

    private void rooms_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rooms_dashboardActionPerformed
        Main.removeAll();
        Main.add(rooms_page);
        Main.repaint();
        Main.revalidate();
    }//GEN-LAST:event_rooms_dashboardActionPerformed

    private void cust_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cust_dashboardActionPerformed
        Main.removeAll();
        Main.add(customers_page);
        Main.repaint();
        Main.revalidate();
    }//GEN-LAST:event_cust_dashboardActionPerformed

    private void reser_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reser_dashboardActionPerformed
        Main.removeAll();
        Main.add(reservation_page);
        Main.repaint();
        Main.revalidate();
    }//GEN-LAST:event_reser_dashboardActionPerformed

    private void current_userComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_current_userComponentShown

    }//GEN-LAST:event_current_userComponentShown

    private int countRows(String table_name, String pk) {
        int count = 0;
        try {
            String query = "SELECT COUNT(" + pk + ") AS result FROM " + table_name;
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            count = rs.getInt("result");
        } catch (Exception ex) {
            LoggerUtil.logError(this.getClass(), "Failed to count " + table_name + "'s rows . ", ex);
        }
        return count;
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
        } catch (Exception ex) {
            LoggerUtil.logError(this.getClass(), "Failed to get " + table_name + " table. ", ex);
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
        } catch (Exception ex) {
            LoggerUtil.logError(this.getClass(), "Failed to get " + table_name + "'s search result. ", ex);
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
        } catch (Exception ex) {
            LoggerUtil.logError(this.getClass(), "Failed to delete " + table_name + " selected row. ", ex);
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
    private javax.swing.JButton add_reser;
    private javax.swing.JButton add_room;
    private javax.swing.JLabel current_user;
    private javax.swing.JButton cust_dashboard;
    private javax.swing.JLabel customer_page;
    private javax.swing.JLabel customer_page1;
    private javax.swing.JButton customers_btn;
    private javax.swing.JPanel customers_page;
    private javax.swing.JTable customers_table;
    private javax.swing.JButton delete_cust;
    private javax.swing.JButton delete_reser;
    private javax.swing.JButton delete_room;
    private javax.swing.JButton edit_cust;
    private javax.swing.JButton edit_reser;
    private javax.swing.JButton edit_room;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton reser_dashboard;
    private javax.swing.JPanel reservation_page;
    private javax.swing.JButton reservations_btn;
    private javax.swing.JTable reservations_table1;
    private javax.swing.JButton rooms_btn;
    private javax.swing.JButton rooms_dashboard;
    private javax.swing.JPanel rooms_page;
    private javax.swing.JTable rooms_table;
    private javax.swing.JButton search_cust;
    private javax.swing.JTextField search_field_customer;
    private javax.swing.JTextField search_field_reservations;
    private javax.swing.JTextField search_field_room;
    private javax.swing.JButton search_reser;
    private javax.swing.JButton search_room;
    private javax.swing.JButton signout_btn;
    // End of variables declaration//GEN-END:variables
}
