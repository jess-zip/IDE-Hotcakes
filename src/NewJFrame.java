
import java.awt.Color;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Toolkit;
import java.awt.datatransfer.*;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.Document;
import javax.swing.text.DefaultEditorKit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.undo.UndoManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kingi
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        codigo.getDocument().addUndoableEditListener(new UndoableEditListener() {
            public void undoableEditHappened(UndoableEditEvent e) {
                um.addEdit(e.getEdit());
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        salida = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        scrollPane1 = new java.awt.ScrollPane();
        textArea2 = new java.awt.TextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        codigo = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        SaveAs = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        cut = new javax.swing.JMenuItem();
        copy = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        Compilar = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        salida.setColumns(20);
        salida.setRows(5);
        jScrollPane3.setViewportView(salida);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("algo va aqui", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("otra cosa aqui", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("ademas de esto", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("por ultimo esto", jPanel4);

        scrollPane1.add(textArea2);

        codigo.setColumns(20);
        codigo.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        codigo.setRows(5);
        codigo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                codigoPropertyChange(evt);
            }
        });
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(codigo);

        jTabbedPane1.addTab("tab1", jScrollPane1);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("New File");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Open File");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Open Proyect");
        jMenu1.add(jMenuItem3);

        jMenuItem7.setText("Close Proyect");
        jMenu1.add(jMenuItem7);

        Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jMenu1.add(Save);

        SaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        SaveAs.setText("Save As ...");
        SaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsActionPerformed(evt);
            }
        });
        jMenu1.add(SaveAs);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Close Window");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Undo");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Redo");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cut.setText("Cut");
        cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutActionPerformed(evt);
            }
        });
        jMenu2.add(cut);

        copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copy.setText("Copy");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        jMenu2.add(copy);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setText("Paste");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setText("Find");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setText("Replace");
        jMenu2.add(jMenuItem14);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setText("Find in Files");
        jMenu2.add(jMenuItem15);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setText("Replace");
        jMenu2.add(jMenuItem16);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Run");

        Compilar.setText("Start Debugging");
        Compilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompilarActionPerformed(evt);
            }
        });
        jMenu5.add(Compilar);

        jMenuItem19.setText("Run Without Debugging");
        jMenu5.add(jMenuItem19);

        jMenuItem20.setText("Stop Debugging");
        jMenu5.add(jMenuItem20);

        jMenuItem21.setText("Restart Debugging");
        jMenu5.add(jMenuItem21);

        jMenuItem22.setText("Open Configurations");
        jMenu5.add(jMenuItem22);

        jMenuItem23.setText("Add Configurations");
        jMenu5.add(jMenuItem23);

        jMenuItem24.setText("Step Over ");
        jMenu5.add(jMenuItem24);

        jMenuItem25.setText("Step Into");
        jMenu5.add(jMenuItem25);

        jMenuItem26.setText("Step Out");
        jMenu5.add(jMenuItem26);

        jMenuItem27.setText("Continue");
        jMenu5.add(jMenuItem27);

        jMenuItem28.setText("Add BreakPoint");
        jMenu5.add(jMenuItem28);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Terminal");

        jMenuItem17.setText("jMenuItem17");
        jMenu4.add(jMenuItem17);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Help");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2)
                    .addComponent(jTabbedPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    UndoManager um = new UndoManager();

    public void undo() {
        um.undo();
    }

    public void redo() {
        um.redo();
    }
    String fileName = null;
    String fileAddress = null;
    Runtime r = Runtime.getRuntime();
    Process p = null;
    String dirUsable = null;
    int posI = 0;
    int posF = 0;
    String word = "";

    public boolean es(String palabra) {
        //System.out.println(palabra);
        if (palabra.equals("program")
                || palabra.equals("if")
                || palabra.equals("else")
                || palabra.equals("fi")
                || palabra.equals("do")
                || palabra.equals("until")
                || palabra.equals("while")
                || palabra.equals("read")
                || palabra.equals("write")
                || palabra.equals("float")
                || palabra.equals("int")
                || palabra.equals("bool")
                || palabra.equals("not")
                || palabra.equals("and")
                || palabra.equals("or") //palabra.Length == 1
                ) {
            return true;
        }
        return false;
    }

    public void reservadas() {
        String texto = codigo.getText().toLowerCase();
        word = "";
        char[] array = texto.toCharArray();

        DefaultHighlighter.DefaultHighlightPainter highlightPainter = new DefaultHighlighter.DefaultHighlightPainter(Color.YELLOW);
        Highlighter h = codigo.getHighlighter();
        h.removeAllHighlights();

        char caracter;
        int index = 0;
        posI = index;
        posF = index;
        while (index < texto.length()) {
            caracter = array[index];
            switch (caracter) {
                case ' ':
                    if (es(word)) {
                        try {
                            h.addHighlight(posI, posF, highlightPainter);
                        } catch (BadLocationException e) {
                        }
                    }
                    word = "";
                    index++;
                    posI = index;
                    break;
                case '\n':
                    if (es(word)) {
                        try {
                            h.addHighlight(posI, posF, highlightPainter);
                        } catch (BadLocationException e) {
                        }
                    }
                    word = "";
                    index++;
                    posI = index;
                    break;
                case '(':
                    if (es(word)) {
                        try {
                            h.addHighlight(posI, posF, highlightPainter);
                        } catch (BadLocationException e) {
                        }
                    }
                    word = "";
                    index++;
                    posI = index;
                    break;
                case ')':
                    if (es(word)) {
                        try {
                            h.addHighlight(posI, posF, highlightPainter);
                        } catch (BadLocationException e) {
                        }
                    }
                    word = "";
                    index++;
                    posI = index;
                    break;
                case ';':
                    if (es(word)) {
                        try {
                            h.addHighlight(posI, posF, highlightPainter);
                        } catch (BadLocationException e) {
                        }
                    }
                    word = "";
                    index++;
                    posI = index;
                    break;
                case ',':
                    if (es(word)) {
                        try {
                            h.addHighlight(posI, posF, highlightPainter);
                        } catch (BadLocationException e) {
                        }
                    }
                    word = "";
                    index++;
                    posI = index;
                    break;

                case ':':
                    if (es(word)) {
                        try {
                            h.addHighlight(posI, posF, highlightPainter);
                        } catch (BadLocationException e) {
                        }
                    }
                    word = "";
                    index++;
                    posI = index;
                    break;
                case '+':
                    if (es(word)) {
                        try {
                            h.addHighlight(posI, posF, highlightPainter);
                        } catch (BadLocationException e) {
                        }
                    }
                    word = "";
                    index++;
                    posI = index;
                    break;
                case '-':
                    if (es(word)) {
                        try {
                            h.addHighlight(posI, posF, highlightPainter);
                        } catch (BadLocationException e) {
                        }
                    }
                    word = "";
                    index++;
                    posI = index;
                    break;
                case '*':
                    if (es(word)) {
                        try {
                            h.addHighlight(posI, posF, highlightPainter);
                        } catch (BadLocationException e) {
                        }
                    }
                    word = "";
                    index++;
                    posI = index;
                    break;
                case '/':
                    if (es(word)) {
                        try {
                            h.addHighlight(posI, posF, highlightPainter);
                        } catch (BadLocationException e) {
                        }
                    }
                    word = "";
                    index++;
                    posI = index;
                    break;
                case '^':
                    if (es(word)) {
                        try {
                            h.addHighlight(posI, posF, highlightPainter);
                        } catch (BadLocationException e) {
                        }
                    }
                    word = "";
                    index++;
                    posI = index;
                    break;
                case '<':
                    if (es(word)) {
                        try {
                            h.addHighlight(posI, posF, highlightPainter);
                        } catch (BadLocationException e) {
                        }
                    }
                    word = "";
                    index++;
                    posI = index;
                    break;
                case '>':
                    if (es(word)) {
                        try {
                            h.addHighlight(posI, posF, highlightPainter);
                        } catch (BadLocationException e) {
                        }
                    }
                    word = "";
                    index++;
                    posI = index;
                    break;
                case '=':
                    if (es(word)) {
                        try {
                            h.addHighlight(posI, posF, highlightPainter);
                        } catch (BadLocationException e) {
                        }
                    }
                    word = "";
                    index++;
                    posI = index;
                    break;
                case '!':
                    if (es(word)) {
                        try {
                            h.addHighlight(posI, posF, highlightPainter);
                        } catch (BadLocationException e) {
                        }
                    }
                    word = "";
                    index++;
                    posI = index;
                    break;
                case '{':
                    if (es(word)) {
                        try {
                            h.addHighlight(posI, posF, highlightPainter);
                        } catch (BadLocationException e) {
                        }
                    }
                    word = "";
                    index++;
                    posI = index;
                    break;
                case '}':
                    if (es(word)) {
                        try {
                            h.addHighlight(posI, posF, highlightPainter);
                        } catch (BadLocationException e) {
                        }
                    }
                    word = "";
                    index++;
                    posI = index;
                    break;

                default:
                    word += caracter;
                    index++;
                    posF = index;
                    break;
            }
        }

    }
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.setSelectedFile(fc.getCurrentDirectory());
        fc.setDialogTitle("Directory Chooser");
        fc.setMultiSelectionEnabled(false);
        String line = null;

        int retVal = fc.showOpenDialog(this);
        if (retVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            String currentFileBeingEdited = file.getAbsolutePath();
            fileName = file.getName();
            System.out.println(fileName);
            fileAddress = currentFileBeingEdited.replace(fileName, "");
            this.setTitle(fileName);

            BufferedReader br = null;
            try {

                br = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            // TODO Auto-generated catch block
            codigo.setText("");

            try {
                line = br.readLine();

            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

            while (line != null) {
                codigo.append(line + "\n");
                try {
                    line = br.readLine();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        }

reservadas();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        undo();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        redo();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void SaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAsActionPerformed
        SaveAs();
    }//GEN-LAST:event_SaveAsActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        Save();
    }//GEN-LAST:event_SaveActionPerformed
    final Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
    private void cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutActionPerformed
        String selection = codigo.getSelectedText();
        StringSelection data = new StringSelection(selection);
        clip.setContents(data, data);
        codigo.replaceRange("", codigo.getSelectionStart(), codigo.getSelectionEnd());
    }//GEN-LAST:event_cutActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        String selection = codigo.getSelectedText();
        StringSelection data = new StringSelection(selection);
        clip.setContents(data, data);
    }//GEN-LAST:event_copyActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        Transferable clipdata = clip.getContents(clip);
        try {
            if (clipdata.isDataFlavorSupported(DataFlavor.imageFlavor)) {
                String s = (String) (clipdata.getTransferData(DataFlavor.imageFlavor));
                codigo.replaceSelection(s);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void CompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompilarActionPerformed
        Save();
        salida.setText("");
        dirUsable = fileAddress + fileName;
        String replace = dirUsable.replace("\\", "\\\\");

        try {
            ////////////////////////////////////////////////////////
            ////////////////////////////////////////////////////////
            /////////////////////////////////////////////////////////
            //aqui poner la direccion de su ejecutable 
            //aqui poner la direccion de su ejecutable
            p = r.exec("C:\\Users\\jessi\\Desktop\\IDE-Hotcakes\\Cs\\Cs\\bin\\Debug\\net5.0\\Cs.exe  " + replace);

            /* Se obtiene el stream de salida del programa */
            InputStream is = p.getInputStream();
            /* Se prepara un BufferedReader para poder leer la salida más comodamente. */
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
// Se lee la primera linea
            String aux = br.readLine();

            // Mientras se haya leido alguna linea
            while (aux != null) {
                // Se escribe la linea en pantalla
                salida.append(aux + "\n");

                // y se lee la siguiente.
                aux = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error a; ejecutar");
        }

    }//GEN-LAST:event_CompilarActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed


    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_codigoKeyTyped

    private void codigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyReleased
        // TODO add your handling code here:
        reservadas();
    }//GEN-LAST:event_codigoKeyReleased

    private void codigoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_codigoPropertyChange
        // TODO add your handling code here:
      
    }//GEN-LAST:event_codigoPropertyChange

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Compilar;
    private javax.swing.JMenuItem Save;
    private javax.swing.JMenuItem SaveAs;
    private javax.swing.JTextArea codigo;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea salida;
    private java.awt.ScrollPane scrollPane1;
    private java.awt.TextArea textArea2;
    // End of variables declaration//GEN-END:variables

    private void SaveAs() {
        FileDialog fd = new FileDialog(this, "save", FileDialog.SAVE);
        fd.setVisible(true);

        if (fd.getFile() != null) {
            fileName = fd.getFile();
            fileAddress = fd.getDirectory();

            this.setTitle(fileName);
        }
        try {
            FileWriter fw = new FileWriter(fileAddress + fileName);
            fw.write(codigo.getText());
            fw.close();
        } catch (Exception e) {
            System.out.println("diantre paso algo mal");
        }
    }

    private void Save() {

        if (fileName == null) {
            SaveAs();
        } else {
            try {

                FileWriter fw = new FileWriter(fileAddress + fileName);
                fw.write(codigo.getText());
                fw.close();
            } catch (Exception e) {
                System.out.println("diantre paso algo mal");
            }
        }
    }

}
