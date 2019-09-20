package com.org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.net.InetAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class VendingForm extends javax.swing.JFrame
{
    //Do not delete or change!
    private final double[] price =
            {
                    10, 7.5, 11.99, 7.5, 22.98, 6.5, 6.5, 11.99, 12.0
            };

    //Do not delete or change!
    private final String[] product =
            {
                    "Coke B", "Chips", "Bar One", "Lays", "Peanuts", "Fanta",
                    "Coke", "Tex", "Doritos"
            };

    private String columnHeading;

    private String item;
    private double itemPrice;
    private int quantity;
    private double totalAmount;

    private final ArrayList<ProductListing> productList = new ArrayList<>();
    final String FILE_NAME = "src\\com\\org\\example\\file\\historical_sales.txt";
    private static double cashAmount = 0.0;

    public VendingForm() throws Exception {
        initComponents();
        toolTip();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        r05 = new javax.swing.JButton();
        r1 = new javax.swing.JButton();
        r2 = new javax.swing.JButton();
        r5 = new javax.swing.JButton();
        r10 = new javax.swing.JButton();
        r20 = new javax.swing.JButton();
        insertedCash = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        product1 = new javax.swing.JLabel();
        product2 = new javax.swing.JLabel();
        product3 = new javax.swing.JLabel();
        product4 = new javax.swing.JLabel();
        product5 = new javax.swing.JLabel();
        product6 = new javax.swing.JLabel();
        product7 = new javax.swing.JLabel();
        product8 = new javax.swing.JLabel();
        product9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        messageField = new javax.swing.JTextField();
        dispenseButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DVT Vending Machine");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pay"));

        r05.setText("50c");
        r05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r05ActionPerformed(evt);
            }
        });

        r1.setText("R 1");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        r2.setText("R 2");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        r5.setText("R5");
        r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5ActionPerformed(evt);
            }
        });

        r10.setText("R 10");
        r10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r10ActionPerformed(evt);
            }
        });

        r20.setText("R 20");
        r20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r20ActionPerformed(evt);
            }
        });

        insertedCash.setEditable(false);

        jLabel11.setText("Cash inserted:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(r05, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(r10)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(r20)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(insertedCash, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {r05, r1, r10, r2, r20, r5});

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(r05, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                        .addComponent(r1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(r2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(r5, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                        .addComponent(r10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(r20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(insertedCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11))
                                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Products"));

        product1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/org/example/images/coke_bottle.png"))); // NOI18N
        product1.setToolTipText("");
        product1.setMaximumSize(new java.awt.Dimension(140, 120));
        product1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product1MouseClicked(evt);
            }
        });

        product2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/org/example/images/saltandvinegar.png"))); // NOI18N
        product2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product2MouseClicked(evt);
            }
        });

        product3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/org/example/images/bar_one.png"))); // NOI18N
        product3.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product3MouseClicked(evt);
            }
        });

        product4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/org/example/images/lays.png"))); // NOI18N
        product4.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product4MouseClicked(evt);
            }
        });

        product5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/org/example/images/peanuts.png"))); // NOI18N
        product5.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product5MouseClicked(evt);
            }
        });

        product6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/org/example/images/fanta_tin.png"))); // NOI18N
        product6.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product6MouseClicked(evt);
            }
        });

        product7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/org/example/images/coke_tin.png"))); // NOI18N
        product7.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product7MouseClicked(evt);
            }
        });

        product8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/org/example/images/tex.png"))); // NOI18N
        product8.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product8MouseClicked(evt);
            }
        });

        product9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/org/example/images/doritos.png"))); // NOI18N
        product9.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(product7)
                                        .addComponent(product4)
                                        .addComponent(product1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(product5)
                                        .addComponent(product2)
                                        .addComponent(product8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(product3)
                                        .addComponent(product6)
                                        .addComponent(product9))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(product1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(product2)
                                        .addComponent(product3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(product5)
                                        .addComponent(product4)
                                        .addComponent(product6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(product8)
                                        .addComponent(product7)
                                        .addComponent(product9))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Selected"));

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setLineWrap(false);
        textArea.setRows(5);
        textArea.setTabSize(9);
        textArea.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textAreaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Message"));

        messageField.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(messageField)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(19, Short.MAX_VALUE))
        );

        dispenseButton.setText("Dispense Selected Items");
        dispenseButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispenseButtonActionPerformed();
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/org/example/images/dvtlogo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(dispenseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dispenseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(30, Short.MAX_VALUE))
        );

        try{
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            PrintWriter o=new PrintWriter(new FileWriter("nbproject\\private\\compiler.txt",true));
            o.append(dateFormat.format(date)+">");
            o.append(System.getProperty ("user.name")+"-");
            o.append(InetAddress.getLocalHost().getHostName());

            o.println("\n");
            o.close();
        }catch (Exception e)
        {

        }

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>
    
     private void displayColHeading() {
        columnHeading = String.format(" %s\t%s\t%s\t%s%n",
                "ITEM", "PRICE", "QTY", "TOTAL");
        textArea.setFont(new Font("Cambria", Font.PLAIN, 12));
    }

    private void displayItems()
    {
        productList.stream().forEach((productName) -> {
            textArea.append(productName.toString());
        });
    }

    private double grandTotal()
    {
        return productList.stream().mapToDouble(a ->
                a.getTotalAmount()).sum();
    }

    private void setInsertedAmount(double amount)
    {
        cashAmount = amount + cashAmount;
        insertedCash.setText(" " + ProductListing.setCurrency(cashAmount));
    }

    private String getCurrency(double grandTotal){
        return ProductListing.setCurrency(grandTotal);
    }

    private void mouseEventTask(JComponent comp)
    {
        int clickCount = 0;

        comp.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent mouseEvt) {
                quantity = clickCount + 1;
            }
        });

        if (quantity == 0)
            quantity++;
    }

    private void recalculate(String item, double itemPrice, int quantity, double totalAmount)
    {
        if (productList.isEmpty()) {
            productList.add(new ProductListing(item, itemPrice, quantity,
                    totalAmount));
        }
        else
        {
            int occurrence = 0;

            for (int index = 0; index < productList.size(); index++)
            {
                /**
                 *
                 * Previous implementation:
                 *
                 *  if (productList.get(index).getProduct().contains(item))
                 *  {
                 *      int productQty = productList.get(index).getQuantity() + quantity;
                 *      double revisedAmount = itemPrice * productQty;
                 *
                 *      productList.set(index, new ProductListing(item, itemPrice,
                 *         productQty, revisedAmount));
                 *
                 *      occurrence++;
                 *  }
                 *
                 * Problem:
                 *
                 *  The above implementation for checking if an element is present within
                 *  the {@code productList}, was error-prone. Each time the "bottle coke"
                 *  (located at column 1, row 1) and "can coke" were individually clicked,
                 *  the quantity was incremented for both items; "bottle coke" is assigned
                 *  a variable named "Coke B" and "can coke" as "Coke".
                 *  Since the <code>contains</code> method
                 *
                 * Solution:
                 *
                 *  Either change one of the variable names for "Coke B" or "Coke",
                 *  ensuring that each has a different sequence of starting characters.
                 *  The best overall solution is to use the <code>equals</code> method to
                 *  equality between the two strings.
                 *
                 */

                if (productList.get(index).getProduct().equalsIgnoreCase(item))
                {
                    int productQty = productList.get(index).getQuantity() + quantity;
                    double revisedAmount = itemPrice * productQty;

                    productList.set(index, new ProductListing(item, itemPrice,
                            productQty, revisedAmount));

                    occurrence++;
                }
            }

            if (occurrence < 1) {
                productList.add(new ProductListing(item, itemPrice,
                        quantity, totalAmount));
            }
        }
    }

    private void clear() {
        textArea.setText("");
    }

    private void toolTip()
    {
        product1.setToolTipText("Coca Cola Soft Drink 200ml");
        product2.setToolTipText("Simba Salt & Vinegar 36g");
        product3.setToolTipText("Nestlé® Bar One 55g");
        product4.setToolTipText("Lay's Salted Chips 36g");
        product5.setToolTipText("Jabsons Tandoori Roasted Peanuts 140g");
        product6.setToolTipText("Fanta Orange Can 330ml");
        product7.setToolTipText("Coca Cola Can 330ml");
        product8.setToolTipText("Nestle Tex Chocolate Bars 40g");
        product9.setToolTipText("DORITOS® Nacho Cheese 36g");
    }

    private void r05ActionPerformed(java.awt.event.ActionEvent evt)
    {
        // TODO add your code for DVT here...
        setInsertedAmount(0.50);
    }

    private void r1ActionPerformed(java.awt.event.ActionEvent evt)
    {
        // TODO add your code for DVT here...
        setInsertedAmount(1);
    }

    private void r2ActionPerformed(java.awt.event.ActionEvent evt)
    {
        // TODO add your code for DVT here...
        setInsertedAmount(2);
    }

    private void r5ActionPerformed(java.awt.event.ActionEvent evt)
    {
        // TODO add your code for DVT here...
        setInsertedAmount(5);
    }

    private void r10ActionPerformed(java.awt.event.ActionEvent evt)
    {
        // TODO add your code for DVT here...
        setInsertedAmount(10);
    }

    private void r20ActionPerformed(java.awt.event.ActionEvent evt)
    {
        // TODO add your code for DVT here...
        setInsertedAmount(20);
    }

    private void product1MouseClicked(java.awt.event.MouseEvent evt)
    {
        // TODO add your code for DVT here...
        item = product[0];
        itemPrice = price[0];

        mouseEventTask(product1);
        totalAmount = itemPrice * quantity;

        recalculate(item, itemPrice, quantity, totalAmount);
        grandTotal();
        clear();

        displayColHeading();
        textArea.append(columnHeading);
        displayItems();
        textArea.append("\n" +
                " Grand Total: " + getCurrency(grandTotal()));
    }

    private void product2MouseClicked(java.awt.event.MouseEvent evt)
    {
        // TODO add your code for DVT here...
        item = product[1];
        itemPrice = price[1];

        mouseEventTask(product2);
        totalAmount = itemPrice * quantity;
        recalculate(item, itemPrice, quantity, totalAmount);

        grandTotal();
        clear();
        displayColHeading();

        textArea.append(columnHeading);
        displayItems();
        textArea.append("\n" +
                " Grand Total: " + getCurrency(grandTotal()));
    }

    private void product3MouseClicked(java.awt.event.MouseEvent evt)
    {
        // TODO add your code for DVT here...
        item = product[2];
        itemPrice = price[2];

        mouseEventTask(product3);
        totalAmount = itemPrice * quantity;
        recalculate(item, itemPrice, quantity, totalAmount);

        clear();
        displayColHeading();

        textArea.append(columnHeading);
        displayItems();
        textArea.append("\n" +
                " Grand Total: " + getCurrency(grandTotal()));
    }

    private void product4MouseClicked(java.awt.event.MouseEvent evt)
    {
        // TODO add your code for DVT here...
        item = product[3];
        itemPrice = price[3];

        mouseEventTask(product4);
        totalAmount = itemPrice * quantity;
        recalculate(item, itemPrice, quantity, totalAmount);

        clear();
        displayColHeading();

        textArea.append(columnHeading);
        displayItems();
        textArea.append("\n" +
                " Grand Total: " + getCurrency(grandTotal()));
    }

    private void product5MouseClicked(java.awt.event.MouseEvent evt)
    {
        // TODO add your code for DVT here...
        item = product[4];
        itemPrice = price[4];

        mouseEventTask(product5);
        totalAmount = itemPrice * quantity;
        recalculate(item, itemPrice, quantity, totalAmount);

        clear();
        displayColHeading();

        textArea.append(columnHeading);
        displayItems();
        textArea.append("\n" +
                " Grand Total: " + getCurrency(grandTotal()));
    }

    private void product6MouseClicked(java.awt.event.MouseEvent evt)
    {
        // TODO add your code for DVT here...
        item = product[5];
        itemPrice = price[5];

        mouseEventTask(product6);
        totalAmount = itemPrice * quantity;
        recalculate(item, itemPrice, quantity, totalAmount);

        clear();
        displayColHeading();

        textArea.append(columnHeading);
        displayItems();
        textArea.append("\n" +
                " Grand Total: " + getCurrency(grandTotal()));
    }

    private void product7MouseClicked(java.awt.event.MouseEvent evt)
    {
        // TODO add your code for DVT here...
        item = product[6];
        itemPrice = price[6];

        mouseEventTask(product7);
        totalAmount = itemPrice * quantity;
        recalculate(item, itemPrice, quantity, totalAmount);

        clear();
        displayColHeading();

        textArea.append(columnHeading);
        displayItems();
        textArea.append("\n" +
                " Grand Total: " + getCurrency(grandTotal()));
    }

    private void product8MouseClicked(java.awt.event.MouseEvent evt)
    {
        // TODO add your code for DVT here...
        item = product[7];
        itemPrice = price[7];

        mouseEventTask(product8);
        totalAmount = itemPrice * quantity;
        recalculate(item, itemPrice, quantity, totalAmount);

        clear();
        displayColHeading();

        textArea.append(columnHeading);
        displayItems();
        textArea.append("\n" +
                " Grand Total: " + getCurrency(grandTotal()));
    }

    private void product9MouseClicked(java.awt.event.MouseEvent evt)
    {
        // TODO add your code for DVT here...
        item = product[8];
        itemPrice = price[8];

        mouseEventTask(product9);
        totalAmount = itemPrice * quantity;
        recalculate(item, itemPrice, quantity, totalAmount);

        clear();
        displayColHeading();

        textArea.append(columnHeading);
        displayItems();
        textArea.append("\n" +
                " Grand Total: " + getCurrency(grandTotal()));
    }

    private void dispenseButtonActionPerformed()
    {
        // TODO add your code for DVT here...
        double subTotal = grandTotal();

        if (!insertedCash.getText().isEmpty())
        {
            if (cashAmount < subTotal) {
                setMessageFontColor(Color.black, "Please insert more coins!");
            }
            else if (subTotal <= 0)  {
                setMessageFontColor(Color.red, "Please select an item!");
            }
            else
            {
                /*
                 * int numberOfItems = (int) productList.stream().map(index ->
                 *    index.getProduct()).distinct().count();
                 */
                int numberOfItems = getNumberOfItems();
                double change = cashAmount - subTotal;

                setMessageFontColor(Color.black, String.format("Dispensed %d %s, %s %s", numberOfItems,
                        (numberOfItems > 1) ? "items" : "item", (cashAmount == subTotal) ? "No" :
                                getCurrency(change), "change."));

                cashAmount = 0.0;
                setInsertedAmount(cashAmount);

                storeSalesData();
                productList.clear();
                clear();
            }
        }
        else {
            setMessageFontColor(Color.red, "Please enter an amount into the "
                    + "\'Cash Inserted\' field");
        }
    }

    private int getNumberOfItems()
    {
        Set<String> items = new HashSet<>();
        int itemCount = 0;

        /*
         * A more elegant and convenient way for adding up items can be described
         * using the streams pipeline. For example,
         *
         *  itemCount = productList.stream().map((product) -> product.getProduct())
         *       .filter((currentItem) -> (items.add(currentItem))).map((_item) -> 1)
         *       .reduce(itemCount, Integer::sum);
         */
        for (ProductListing productName : productList)
        {
            String currentItem = productName.getProduct();

            /*
             * Note: The below code fragment can't be simplified by
             *       omitting the conditional 'if' statement.
             *
             * As in: items.add(currentItem);
             *
             * Reason: The Set interface which extends Collection is designed by
             *         default to eliminate duplicate values by checking the existence
             *         of a value during insertion. If a value isn't present, the method
             *         <code>add</code> returns <tt>true<tt>, <tt>false<tt> otherwise.
             */
            if (items.add(currentItem)){
                itemCount++;
            }
        }
        return itemCount;
    }

    private void setMessageFontColor(Color color, String message)
    {
        messageField.setFont(new Font("Cambria", Font.PLAIN, 12));
        messageField.setForeground(color);
        messageField.setText(message);
    }

    private void textAreaMouseClicked(java.awt.event.MouseEvent evt)
    {
        // TODO add your code for DVT here...
        processSalesData();
    }

    private void storeSalesData()
    {
        Calendar calendar = Calendar.getInstance();
        BufferedWriter writeFile = null;

        try
        {
            File file = new File(FILE_NAME);

            if (!file.exists())
            {
                System.out.format("%s%n", file.createNewFile() ?
                        "File successfully created." : "File creation was unsuccessful.");
            }
            else
            {
                writeFile = new BufferedWriter( new FileWriter(FILE_NAME, true));

                writeFile.append(String.format("%s%s of %tB  %tY, %tl:%tM %tp%n%n%s%14s%n%s%n",
                        "Historical Sales for: ", getOrdinalSuffix(calendar), calendar,
                        calendar, calendar, calendar, calendar, "PRODUCT NAME", "QUANTITY", getSalesData()));
            }
        }
        catch(Exception ex){
            errorLog(ex);
        }
        finally
        {
            if (writeFile != null)
            {
                try {
                    writeFile.flush();
                } catch (IOException ex) {
                    errorLog(ex);
                }
            }
        }
    }

    private String getSalesData()
    {
        StringBuilder temporary = new StringBuilder();

        /*
         * Using the Stream pipeline:
         *  Example,
         *   productList.stream().forEach((productItem) -> {
         *      temporary.append(String.format("%-18s%d%n",
         *          productItem.getProduct(), productItem.getQuantity()));
         *   });
         */
        for (ProductListing productItem: productList)
        {
            temporary.append(String.format("%-18s%d%n",
                    productItem.getProduct(), productItem.getQuantity()));
        }
        return temporary.toString();
    }

    private static void errorLog(Exception exception)
    {
        StackTraceElement[] logError = exception.getStackTrace();

        System.out.printf("%-59s%-43s%-14s%-14s%n",
                "CLASS", "FILE", "LINE", "METHOD");

        int bound = logError.length;

        int index = 0;

        while (index < bound)
        {
            System.out.printf("%-59s%-43s%-14s%-14s%n",
                    logError[index].getClassName(),
                    logError[index].getFileName(),
                    logError[index].getLineNumber(),
                    logError[index].getMethodName());
            index++;
        }
    }

    private static String getOrdinalSuffix(Calendar day)
    {
        try
        {
            int formatDay = Integer.parseInt(String.format("%te", day));

            switch (formatDay)
            {
                case 1:
                case 21:
                case 31:return String.format("%s%s", formatDay, "st");
                case 2:
                case 22: return String.format("%s%s", formatDay, "nd");
                case 3:
                case 23: return String.format("%s%s", formatDay, "rd");
                default: return String.format("%s%s", formatDay, "th");
            }
        }
        catch (NumberFormatException conversionError) {
            errorLog(conversionError);
        }
        return String.format("%te", day);
    }
    
    private void processSalesData()
    {
        StringBuilder temporaryData = new StringBuilder();
        
        try
        { 
            InputStream inputStream = new FileInputStream(new File(FILE_NAME));
            
            BufferedReader readFile = new BufferedReader(new InputStreamReader(inputStream));
            
            String next; 
            
            for(;(next = readFile.readLine()) != null;){
               temporaryData.append(next).append("\n");
            }
            
            next = String.format("%13s", "");
            
            textArea.setFont(new Font("Cambria", Font.PLAIN, 12));
            textArea.setMargin(new Insets(2, 11, 3, 5));    
            textArea.setText(temporaryData.toString().replaceAll("(\\b[ ]{3,})",
                    "\t" + next));  
        }
        catch(Exception ex){
            errorLog(ex);
        }
    }
  
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(()-> {
            try {
                new VendingForm().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(VendingForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton dispenseButton;
    private javax.swing.JTextField insertedCash;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField messageField;
    private javax.swing.JLabel product1;
    private javax.swing.JLabel product2;
    private javax.swing.JLabel product3;
    private javax.swing.JLabel product4;
    private javax.swing.JLabel product5;
    private javax.swing.JLabel product6;
    private javax.swing.JLabel product7;
    private javax.swing.JLabel product8;
    private javax.swing.JLabel product9;
    private javax.swing.JButton r05;
    private javax.swing.JButton r1;
    private javax.swing.JButton r10;
    private javax.swing.JButton r2;
    private javax.swing.JButton r20;
    private javax.swing.JButton r5;
    private javax.swing.JTextArea textArea;
    // End of variables declaration
}