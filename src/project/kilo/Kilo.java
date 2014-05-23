/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project.kilo;

import java.util.Random;
import javax.swing.*;


/**
 *
 * @author jingyaoqin
 */
public class Kilo extends javax.swing.JFrame {

    private int QuestionNum;
    private Questions q;


    
    
    public Kilo() 
    {
        AlbumList test = new AlbumList();
        Song pa = new Song("Paranoid Anroid", "OK Computer", "Radiohead", 1997);
        Album ok = new Album(pa);
        Song air = new Song("Airbag", "OK Computer", "Radiohead", 1997);
        ok.addSong(air);
        test.addAlbum(ok);
        Song ld = new Song("Let Down", "OK Computer", "Radiohead", 1997);
        test.addListSong(ld);
        Song come = new Song("Come Together", "Abbey Road", "The Beatles", 1969);
        test.addListSong(come);
        test.addListSong(new Song("Karma Police", "OK Computer", "Radiohead", 1997));
        test.addListSong(new Song ("Doe Deer", "Crystal Castles II", "Crystal Castles", 2010));
        test.addListSong(new Song("Buddy Holly", "Weezer", "Weezer", 1994));
        test.addListSong(new Song("On a Plain", "Nevermind", "Nirvana", 1991));
        
        q = new Questions(test);
        initComponents();
    }
    
    private void RightAnswer(){
        JOptionPane.showMessageDialog(null, "Correct Answer!");
        q.score += 10;
        UpdateDisplay();
    }
    
    private void WrongAnswer(){
         JOptionPane.showMessageDialog(null, "Wrong Answer!");
         q.strikes += 1;
         if(q.strikes == 3){
             JOptionPane.showMessageDialog(null, "Game Over!");
             NewGame();
             return;
         }
         UpdateDisplay();
    }
    
    private void NewGame(){
        q.score = 0;
        q.strikes = 0;
        UpdateDisplay();
    }
    
    private void UpdateDisplay(){
        q.askQuestion();
        Score.setText (String.valueOf(q.score));
        Strike.setText (String.valueOf(q.strikes));
        Question.setText (q.question);
        OptionA.setText (q.RandomAnswers[0]);
        OptionB.setText (q.RandomAnswers[1]);
        OptionC.setText (q.RandomAnswers[2]);
        OptionD.setText (q.RandomAnswers[3]);
    }
     
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        jDialog1 = new javax.swing.JDialog();
        jOptionPane1 = new javax.swing.JOptionPane();
        jDialog2 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jDialog3 = new javax.swing.JDialog();
        jDialog4 = new javax.swing.JDialog();
        jFrame2 = new javax.swing.JFrame();
        jDialog5 = new javax.swing.JDialog();
        jDialog6 = new javax.swing.JDialog();
        jDialog7 = new javax.swing.JDialog();
        jDialog8 = new javax.swing.JDialog();
        jOptionPane2 = new javax.swing.JOptionPane();
        QuestionOptions = new javax.swing.JPanel();
        OptionD = new javax.swing.JLabel();
        ButtonA = new javax.swing.JButton();
        ButtonC = new javax.swing.JButton();
        ButtonB = new javax.swing.JButton();
        ButtonD = new javax.swing.JButton();
        OptionA = new javax.swing.JLabel();
        OptionB = new javax.swing.JLabel();
        OptionC = new javax.swing.JLabel();
        ButtonNewgame = new javax.swing.JButton();
        LabelScore = new javax.swing.JLabel();
        Score = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Replay = new javax.swing.JButton();
        PausePlay = new javax.swing.JButton();
        Stop = new javax.swing.JButton();
        LabelStrike = new javax.swing.JLabel();
        Strike = new javax.swing.JLabel();
        Question = new javax.swing.JLabel();
        LabelQuestionNO = new javax.swing.JLabel();
        QuestionNumber = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog5Layout = new javax.swing.GroupLayout(jDialog5.getContentPane());
        jDialog5.getContentPane().setLayout(jDialog5Layout);
        jDialog5Layout.setHorizontalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog5Layout.setVerticalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog6Layout = new javax.swing.GroupLayout(jDialog6.getContentPane());
        jDialog6.getContentPane().setLayout(jDialog6Layout);
        jDialog6Layout.setHorizontalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog6Layout.setVerticalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog7Layout = new javax.swing.GroupLayout(jDialog7.getContentPane());
        jDialog7.getContentPane().setLayout(jDialog7Layout);
        jDialog7Layout.setHorizontalGroup(
            jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog7Layout.setVerticalGroup(
            jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog8Layout = new javax.swing.GroupLayout(jDialog8.getContentPane());
        jDialog8.getContentPane().setLayout(jDialog8Layout);
        jDialog8Layout.setHorizontalGroup(
            jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog8Layout.setVerticalGroup(
            jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        QuestionOptions.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        OptionD.setText("jLabel4");

        ButtonA.setText("A");
        ButtonA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonAMouseClicked(evt);
            }
        });

        ButtonC.setText("C");
        ButtonC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCMouseClicked(evt);
            }
        });

        ButtonB.setText("B");
        ButtonB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonBMouseClicked(evt);
            }
        });

        ButtonD.setText("D");
        ButtonD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonDMouseClicked(evt);
            }
        });

        OptionA.setText("jLabel1");

        OptionB.setText("jLabel2");

        OptionC.setText("jLabel3");

        javax.swing.GroupLayout QuestionOptionsLayout = new javax.swing.GroupLayout(QuestionOptions);
        QuestionOptions.setLayout(QuestionOptionsLayout);
        QuestionOptionsLayout.setHorizontalGroup(
            QuestionOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionOptionsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(QuestionOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuestionOptionsLayout.createSequentialGroup()
                        .addComponent(ButtonD)
                        .addGap(18, 18, 18)
                        .addComponent(OptionD))
                    .addGroup(QuestionOptionsLayout.createSequentialGroup()
                        .addComponent(ButtonA)
                        .addGap(18, 18, 18)
                        .addComponent(OptionA))
                    .addGroup(QuestionOptionsLayout.createSequentialGroup()
                        .addComponent(ButtonB)
                        .addGap(18, 18, 18)
                        .addComponent(OptionB))
                    .addGroup(QuestionOptionsLayout.createSequentialGroup()
                        .addComponent(ButtonC)
                        .addGap(18, 18, 18)
                        .addComponent(OptionC)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        QuestionOptionsLayout.setVerticalGroup(
            QuestionOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuestionOptionsLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(QuestionOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonA)
                    .addComponent(OptionA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(QuestionOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonB)
                    .addComponent(OptionB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(QuestionOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonC)
                    .addComponent(OptionC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(QuestionOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonD)
                    .addComponent(OptionD))
                .addContainerGap())
        );

        ButtonNewgame.setText("New Game");
        ButtonNewgame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonNewgameMouseClicked(evt);
            }
        });

        LabelScore.setText("Your Score：");

        Score.setText("jLabel7");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Replay.setText("Replay");

        PausePlay.setText("Pause/Play");

        Stop.setText("Stop");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PausePlay)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(Replay))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(Stop)))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Replay)
                .addGap(18, 18, 18)
                .addComponent(PausePlay)
                .addGap(18, 18, 18)
                .addComponent(Stop)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LabelStrike.setText("Strike: ");

        Strike.setText("jLabel2");

        Question.setText("jLabel3");

        LabelQuestionNO.setText("QuestionNO.");

        QuestionNumber.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QuestionOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(ButtonNewgame, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelScore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Score))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelStrike)
                        .addGap(74, 74, 74)
                        .addComponent(Strike)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelQuestionNO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuestionNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Score)
                            .addComponent(LabelScore))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelStrike)
                            .addComponent(Strike)))
                    .addComponent(ButtonNewgame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question)
                    .addComponent(LabelQuestionNO)
                    .addComponent(QuestionNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(QuestionOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonNewgameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonNewgameMouseClicked
        NewGame();
        
        //and play the song 
    }//GEN-LAST:event_ButtonNewgameMouseClicked

    private void ButtonAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAMouseClicked
        //stop music
        if (OptionA.getText().equals(q.RightAnswer))
            RightAnswer();
        else
            WrongAnswer();
    }//GEN-LAST:event_ButtonAMouseClicked

    private void ButtonBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBMouseClicked
        if (OptionB.getText().equals(q.RightAnswer))
            RightAnswer();
        else
            WrongAnswer();
    }//GEN-LAST:event_ButtonBMouseClicked

    private void ButtonCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCMouseClicked
        if (OptionC.getText().equals(q.RightAnswer))
            RightAnswer();
        else
            WrongAnswer();
    }//GEN-LAST:event_ButtonCMouseClicked

    private void ButtonDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDMouseClicked
        if (OptionD.getText().equals(q.RightAnswer))
            RightAnswer();
        else
            WrongAnswer();
    }//GEN-LAST:event_ButtonDMouseClicked

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
            java.util.logging.Logger.getLogger(Kilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                
                
        
                new Kilo().setVisible(true);
            }
        });
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonA;
    private javax.swing.JButton ButtonB;
    private javax.swing.JButton ButtonC;
    private javax.swing.JButton ButtonD;
    private javax.swing.JButton ButtonNewgame;
    private javax.swing.JLabel LabelQuestionNO;
    private javax.swing.JLabel LabelScore;
    private javax.swing.JLabel LabelStrike;
    private javax.swing.JLabel OptionA;
    private javax.swing.JLabel OptionB;
    private javax.swing.JLabel OptionC;
    private javax.swing.JLabel OptionD;
    private javax.swing.JButton PausePlay;
    private javax.swing.JLabel Question;
    private javax.swing.JLabel QuestionNumber;
    private javax.swing.JPanel QuestionOptions;
    private javax.swing.JButton Replay;
    private javax.swing.JLabel Score;
    private javax.swing.JButton Stop;
    private javax.swing.JLabel Strike;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JDialog jDialog6;
    private javax.swing.JDialog jDialog7;
    private javax.swing.JDialog jDialog8;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private java.awt.List list1;
    // End of variables declaration//GEN-END:variables
}