/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pages;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Alaa1
 */
public class RoomsTableRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // Get the default rendering component
        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        // Softer colors with custom RGB values
        Color softRed = new Color(255, 102, 102); // Light Red
        Color softGreen = new Color(102, 255, 102); // Light Green
        // Check if the column is the "Status" column
        int statusColumnIndex = 3;
        if (column == statusColumnIndex) {
            String status = (String) value;

            // Change the background color based on the status
            if ("occupied".equalsIgnoreCase(status)) {
                cell.setBackground(softRed);
                cell.setForeground(Color.WHITE);
            } else if ("available".equalsIgnoreCase(status)) {
                cell.setBackground(softGreen);
                cell.setForeground(Color.BLACK);
            } else {
                cell.setBackground(Color.WHITE);
                cell.setForeground(Color.BLACK);
            }
        } else {
            cell.setBackground(Color.WHITE);
            cell.setForeground(Color.BLACK);
        }

        return cell;
    }
}
