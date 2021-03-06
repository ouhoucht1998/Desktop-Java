/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PFE.GUI;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.UnderlineStyle;
import jxl.format.VerticalAlignment;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author MOHAMED
 */
public class rech_all_pdt_in_facture extends javax.swing.JFrame {

    /**
     * Creates new form rech_all_pdt_in_facture
     */
    private static DefaultTableModel  mode3_1;
    private static   Object[] row3_1 = new Object[4];
    private  static  FactFrPdt  factfrpdt=new FactFrPdt();
    private static  int  tr=0;
    public rech_all_pdt_in_facture() {
        initComponents();
        mode3_1=(DefaultTableModel)  tab.getModel();
 txt_idfact_btn3_1.setBorder(BorderFactory.createLineBorder(new Color(45,18,232)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbel_idfact_btn3_1 = new javax.swing.JLabel();
        Rechercher_btn3_1 = new javax.swing.JButton();
        txt_idfact_btn3_1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        pdf3_1 = new javax.swing.JButton();
        execl3_1 = new javax.swing.JButton();
        Fermer_btn3_1 = new javax.swing.JButton();
        Modifier_btn3_1 = new javax.swing.JButton();
        Supprimer_btn3_1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbel_idfact_btn3_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbel_idfact_btn3_1.setText("Identifiant de la facture : ");
        getContentPane().add(lbel_idfact_btn3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 160, 30));

        Rechercher_btn3_1.setText("Rechercher");
        Rechercher_btn3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rechercher_btn3_1ActionPerformed(evt);
            }
        });
        getContentPane().add(Rechercher_btn3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 110, 30));

        txt_idfact_btn3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idfact_btn3_1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_idfact_btn3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 300, 30));

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identifiant Produit", "Designation du Produit", "Quantité", "Prix  d'achat"
            }
        ));
        jScrollPane1.setViewportView(tab);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 180, 860, 150));

        pdf3_1.setText("PDF");
        pdf3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdf3_1ActionPerformed(evt);
            }
        });
        getContentPane().add(pdf3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 220, 80, 30));

        execl3_1.setText("EXCEL");
        execl3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                execl3_1ActionPerformed(evt);
            }
        });
        getContentPane().add(execl3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 270, 80, 30));

        Fermer_btn3_1.setText("Fermer");
        Fermer_btn3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fermer_btn3_1ActionPerformed(evt);
            }
        });
        getContentPane().add(Fermer_btn3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 100, 30));

        Modifier_btn3_1.setText("Modifier");
        Modifier_btn3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modifier_btn3_1ActionPerformed(evt);
            }
        });
        getContentPane().add(Modifier_btn3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 100, 30));

        Supprimer_btn3_1.setText("Supprimer");
        Supprimer_btn3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Supprimer_btn3_1ActionPerformed(evt);
            }
        });
        getContentPane().add(Supprimer_btn3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PFE/GUI/background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Modifier_btn3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modifier_btn3_1ActionPerformed






                int i = tab.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable

                   
                 
                     
         new ajout_modif_produit_in_facture(1,txt_idfact_btn3_1.getText(), mode3_1.getValueAt(i,0).toString(),Double.parseDouble(mode3_1.getValueAt(i,2).toString()),Double.parseDouble(mode3_1.getValueAt(i,3).toString()),"rech_all_pdt_in_facture").setVisible(true);



                }
















    }//GEN-LAST:event_Modifier_btn3_1ActionPerformed

    private void Fermer_btn3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fermer_btn3_1ActionPerformed
             this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_Fermer_btn3_1ActionPerformed

    private void Rechercher_btn3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rechercher_btn3_1ActionPerformed
        // TODO add your handling code here:
         if(txt_idfact_btn3_1.getText().isEmpty() ){txt_idfact_btn3_1.setBorder(BorderFactory.createLineBorder(Color.RED));} 
                     
                     
                     
if(!txt_idfact_btn3_1.getText().isEmpty() ){
 txt_idfact_btn3_1.setBorder(BorderFactory.createLineBorder(new Color(45,18,232)));

 
    AffichIdFactFrPdt(txt_idfact_btn3_1.getText());
    
    
}
    }//GEN-LAST:event_Rechercher_btn3_1ActionPerformed

    private void txt_idfact_btn3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idfact_btn3_1ActionPerformed
        // TODO add your handling code here:
        
 if(txt_idfact_btn3_1.getText().isEmpty() ){txt_idfact_btn3_1.setBorder(BorderFactory.createLineBorder(Color.RED));} 
                                          
if(!txt_idfact_btn3_1.getText().isEmpty() ){
 txt_idfact_btn3_1.setBorder(BorderFactory.createLineBorder(new Color(45,18,232)));

 
    AffichIdFactFrPdt(txt_idfact_btn3_1.getText());
    
    
}
        
        
        
    }//GEN-LAST:event_txt_idfact_btn3_1ActionPerformed

    private void Supprimer_btn3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Supprimer_btn3_1ActionPerformed
        // TODO add your handling code here:
        
        
         // i = the index of the selected row
                int i = tab.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable


                    JLabel message = new JLabel("Veuillez Supprimer Cette Facture ?     ");
                    JLabel title = new JLabel("Message Information !");
                    UIManager.put("OptionPane.buttonFont",new Font("Times New Roman ",0,12));
                    message.setFont(new Font("Times New Roman", 0, 14));
                    title.setFont(new Font("Times New Roman", 0, 14));

                    if( JOptionPane.showConfirmDialog(null, message,title.getText(),JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION){

                    
                   factfrpdt.SuppFactFrPdt(txt_idfact_btn3_1.getText(),mode3_1.getValueAt(i, 0).toString());

                   mode3_1.removeRow(i);

                    }

                }
        
        
        
        
        
        
        
    }//GEN-LAST:event_Supprimer_btn3_1ActionPerformed

    private void pdf3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdf3_1ActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
        
        
        
     if(mode3_1.getRowCount()>=1){             
         try {
  Document document = new Document();
  
  
JFileChooser fileChooser = new JFileChooser();
fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
fileChooser.showOpenDialog(null);
File selectedFile = fileChooser.getSelectedFile();
String  file=selectedFile.getAbsolutePath();
if(!selectedFile.getAbsolutePath().endsWith(".pdf")){
 file=selectedFile.getAbsolutePath()+".pdf";  
}
  
  
 
  PdfWriter.getInstance(document, new FileOutputStream(file));
  document.open();
  float fntSize, lineSpacing;
  Fact  factfr = new Fact();
     
   fntSize = 10.0f;
  lineSpacing = 20.8f;
  Image   image=Image.getInstance("C:\\Users\\HP\\Desktop\\Documents\\NetBeansProjects\\Acceuil\\src\\main\\images\\logo_4.png");
  image.setWidthPercentage(100);
  image.setAlignment(Element.ALIGN_LEFT);
  document.add(image);

  Paragraph   p3 =  new Paragraph("\n\nIdentifiant Du Facture  :   "+txt_idfact_btn3_1.getText(), new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.TIMES_ROMAN, 12));
  p3.setAlignment(Element.ALIGN_LEFT);
  document.add(p3);

  
  
  Paragraph   p4 =  new Paragraph("La Date Du Facture :   "+factfr.Rechidfact(txt_idfact_btn3_1.getText()).getDate_t(), new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.TIMES_ROMAN, 12));
  p4.setAlignment(Element.ALIGN_LEFT);
  document.add(p4);
  
    document.add( Chunk.NEWLINE );

  Paragraph   p5 =  new Paragraph("   La List Des  Produits     ", new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.TIMES_ROMAN, 14));
  p5.setAlignment(Element.ALIGN_CENTER);
  document.add(p5);
          
          
          
          
          
  PdfPTable table =  new PdfPTable(4);
  
  table.setWidthPercentage(105);
  table.setHorizontalAlignment(Element.ALIGN_BOTTOM);
  PdfPCell cel1;
  table.setWidths(new float[] { 131,130,130,130 });
  com.itextpdf.text.Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD, BaseColor.WHITE);
  com.itextpdf.text.Font font2 = FontFactory.getFont(FontFactory.TIMES_ROMAN, fntSize);

            cel1 = new PdfPCell(new Phrase("Identifiant  Produit ", font));
            cel1.setFixedHeight(20);
            cel1.setBackgroundColor(BaseColor.GRAY);
            cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cel1);
      
            cel1 = new PdfPCell(new Phrase("Designation du Produit", font));
            cel1.setBackgroundColor(BaseColor.GRAY);
            cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cel1);
            
            cel1 = new PdfPCell(new Phrase("Quantité   ", font));
            cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cel1.setBackgroundColor(BaseColor.GRAY);
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cel1);
        
            
            cel1 = new PdfPCell(new Phrase("Prix d'achat  ", font));
            cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cel1.setBackgroundColor(BaseColor.GRAY);
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cel1);
            
    
            
        
          
            
    ArrayList   <FactFrPdt> list =factfrpdt.RechIdFactFrPdt(txt_idfact_btn3_1.getText());
    Produit  pdt = new Produit();
    for(FactFrPdt   factfrpdt  :  list){        

        
        
           cel1 = new PdfPCell(new Phrase(factfrpdt.getIdPdt(), font2));
            cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cel1);
      
      
      
      cel1 = new PdfPCell(new Phrase(pdt.RechIdPdt(factfrpdt.getIdPdt()).getDesigPdt(), font2));
            cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cel1);
      
      cel1 = new PdfPCell(new Phrase(factfrpdt.getQteAchatPdt()+"", font2));
            cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cel1);
      
      
     cel1 = new PdfPCell(new Phrase(factfrpdt.getPrxAchatPdt()+"", font2));
            cel1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cel1);
      
      
       
      
      
      
      
       
    }
                   
          JOptionPane.showMessageDialog(null, "PDF a éte enregistrer  ","Message Information",JOptionPane.INFORMATION_MESSAGE);
        
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            

   
   
   
   
    document.add( new Phrase("\n") );
    document.add(table);
    document.add( Chunk.NEWLINE );

 SimpleDateFormat simpleFormatter = new SimpleDateFormat("   dd/MM/yyyy  hh:mm:ss  ");
 String date=simpleFormatter.format(new Date());
 Paragraph  p2 = new Paragraph(date,FontFactory.getFont(FontFactory.TIMES_ROMAN,12));
 p2.setAlignment(Element.ALIGN_RIGHT);
 document.add(p2);

           
                    
  
  
  
  
  
  
  
    document.close();

  
  
} catch (Exception e) {
}        
                 
                 
                 
     }               
                 
                 
                 
                 
                 
                 
                 
           

    }//GEN-LAST:event_pdf3_1ActionPerformed

    private void execl3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_execl3_1ActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
             
                 if(mode3_1.getRowCount()>=1){
    try {

 File selectedFile=null;       
JFileChooser fileChooser = new JFileChooser();
fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
fileChooser.showOpenDialog(null);
selectedFile = fileChooser.getSelectedFile();
if(selectedFile!=null){
    

 String  file=selectedFile.getAbsolutePath();
if(!selectedFile.getAbsolutePath().endsWith(".xls")){
 file=selectedFile.getAbsolutePath()+".xls";  
}
  
    WritableWorkbook workbook = Workbook.createWorkbook(new File(file));
    WritableSheet writablesheet1 = workbook.createSheet("Sheet1", 0);
    WritableFont times10pt = new WritableFont(WritableFont.TIMES, 12,WritableFont.BOLD);
    WritableFont times12pt = new WritableFont(WritableFont.TIMES, 11);
     int  rows =6;
   // Define the cell format
   WritableCellFormat  times = new WritableCellFormat(times10pt);
   WritableCellFormat  times2 = new WritableCellFormat(times12pt);
   times.setBorder(jxl.format.Border.ALL, BorderLineStyle.THIN, Colour.BLACK);
   times2.setBorder(jxl.format.Border.ALL, BorderLineStyle.THIN, Colour.BLACK);
   times.setBackground(Colour.WHITE);
   times.setAlignment(Alignment.CENTRE);
   times.setVerticalAlignment(VerticalAlignment.CENTRE);
   
    times2.setAlignment(Alignment.CENTRE);
    times2.setVerticalAlignment(VerticalAlignment.CENTRE);
   WritableCellFormat cellFormat = new WritableCellFormat(times);
   cellFormat.setBackground(Colour.YELLOW);
   cellFormat.setBorder(jxl.format.Border.ALL, BorderLineStyle.THIN);
   // Lets automatically wrap the cells
   // Create create a bold font with unterlines
   WritableFont times10ptBoldUnderline = new WritableFont(
   WritableFont.TIMES, 12, WritableFont.BOLD, false,
   UnderlineStyle.SINGLE);
   // Lets automatically wrap the cells

   Label label;
   Fact factfr = new Fact();
   label = new Label(2, 0, "           Stock  Super Marché  ", new WritableCellFormat(new WritableFont(
   WritableFont.TIMES, 16, WritableFont.BOLD)));
   writablesheet1.addCell(label);
  
    label = new Label(0, 1, "Identifiant Du Facture  :   "+txt_idfact_btn3_1.getText(), new WritableCellFormat(new WritableFont(
   WritableFont.TIMES, 12, WritableFont.BOLD)));
   writablesheet1.addCell(label);
  
   label = new Label(0, 2, "Date Du Facture  :     "+factfr.Rechidfact(txt_idfact_btn3_1.getText()).getDate_t(), new WritableCellFormat(new WritableFont(
   WritableFont.TIMES, 12, WritableFont.BOLD)));
   writablesheet1.addCell(label);
  








   label = new Label(2, 3, "Les  Produits de La   Factures "+txt_idfact_btn3_1.getText(), new WritableCellFormat(new WritableFont(
   WritableFont.TIMES, 14, WritableFont.BOLD)));
   writablesheet1.addCell(label);
    
   
   
   
   
   
   writablesheet1.setRowView(5, 26*24);
   writablesheet1.setColumnView(1,35);
   Label label1 = new Label(1,5,"Identifiant Produit",cellFormat);
   writablesheet1.setColumnView(2, 35);
   Label label2 = new Label(2,5,"Designation du Produit",cellFormat);
   writablesheet1.setColumnView(3, 35);
   Label label3 = new Label(3,5,"Quantité ",cellFormat);
    
   writablesheet1.setColumnView(4, 35);
   Label label4 = new Label(4,5,"Prix d'achat ",cellFormat);
    
   
   
    
   
   
    
    writablesheet1.addCell(label1);
    writablesheet1.addCell(label2);
    writablesheet1.addCell(label3);
    writablesheet1.addCell(label4);

    
    
        
        
   ArrayList   <FactFrPdt> list =factfrpdt.RechIdFactFrPdt(txt_idfact_btn3_1.getText());
    Produit  pdt = new Produit();
    for(FactFrPdt   factfrpdt  :  list){        

        
     writablesheet1.setColumnView(0,30); 
     writablesheet1.addCell(new Label(1,rows,factfrpdt.getIdPdt(),times2));
     
     writablesheet1.setColumnView(1,30);
     writablesheet1.addCell(new Label(2,rows,pdt.RechIdPdt(factfrpdt.getIdPdt()).getDesigPdt(),times2));
     
     
     
     
     writablesheet1.setColumnView(2,30);
     writablesheet1.addCell(new Label(3,rows,factfrpdt.getPrxAchatPdt()+"",times2));        
    
     
       
     
     writablesheet1.setColumnView(4,30);
     writablesheet1.addCell(new Label(4,rows,factfrpdt.getQteAchatPdt()+"",times2));        
        
        
        
        
        
      rows++;  
        
        
        
        
    }
  
         JOptionPane.showMessageDialog(null, "Excel a éte enregistrer  ","Message Information",JOptionPane.INFORMATION_MESSAGE);

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
    workbook.write();
    workbook.close();
    
}}  
    
catch (WriteException e) {JOptionPane.showMessageDialog(null, e);}
catch (IOException ex) {}        
                         
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
             }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_execl3_1ActionPerformed

    
           public static  void  AffichIdFactFrPdt  (String IdFactFr) {
      
    if(tr==0){  
      
      if(factfrpdt.RechIdFactFrPdt(IdFactFr)!=null){
  
 
  ArrayList<FactFrPdt>  list_factfrpdt=factfrpdt.RechIdFactFrPdt(IdFactFr);
  Produit  pdt =  new Produit();
 
    for(FactFrPdt   factfrpdt : list_factfrpdt){
     
        row3_1[0]=factfrpdt.getIdPdt();
        row3_1[1]=pdt.RechIdPdt(factfrpdt.getIdPdt()).getDesigPdt();
        row3_1[2]=factfrpdt.getQteAchatPdt()+"";
        row3_1[3]=factfrpdt.getPrxAchatPdt()+"";

            mode3_1.addRow(row3_1);
   
        }           
                  
          
          
          
          
          
          
   

            
     }else{
          
        mode3_1.setRowCount(0);
    
    
     JLabel message = new JLabel("IdFactFr  inexistant ");
     JLabel title = new JLabel("Message Information !");
     UIManager.put("OptionPane.okButtonText", " Oui");
     UIManager.put("OptionPane.buttonFont", new Font("Times New Roman ",0,12)); 
     JOptionPane.showMessageDialog(null, message,title.getText(),JOptionPane.INFORMATION_MESSAGE);
          
      }
      tr=1;    
      return ;
           
 

            
            
            
        }else if(tr==1){
        tr=0;
        mode3_1.setRowCount(0);
        AffichIdFactFrPdt(IdFactFr);
  
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
            java.util.logging.Logger.getLogger(rech_all_pdt_in_facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rech_all_pdt_in_facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rech_all_pdt_in_facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rech_all_pdt_in_facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rech_all_pdt_in_facture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Fermer_btn3_1;
    private javax.swing.JButton Modifier_btn3_1;
    private javax.swing.JButton Rechercher_btn3_1;
    private javax.swing.JButton Supprimer_btn3_1;
    private javax.swing.JButton execl3_1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbel_idfact_btn3_1;
    private javax.swing.JButton pdf3_1;
    private javax.swing.JTable tab;
    private javax.swing.JTextField txt_idfact_btn3_1;
    // End of variables declaration//GEN-END:variables
}
