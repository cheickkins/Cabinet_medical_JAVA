/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

import dao.Connectdb;
import java.sql.Connection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author diarr
 */
public class ReportOrdonnance {
      public  void afficher_report() {
    try {
     Connection conn = Connectdb.getInstance();
     HashMap param = new HashMap();
			
 JasperPrint print = JasperFillManager.fillReport("ireport/reoportOrdonnance.jasper", param, conn);
         JRViewer viewer=new JRViewer(print); 

            JFrame frame = new JFrame("ORDONNANCE");
            frame.getContentPane().add(viewer);
            frame.setExtendedState(frame.MAXIMIZED_BOTH);
            frame.pack();
            frame.setVisible(true);
        } catch (JRException ex) {
       Logger.getLogger(ReportPatient.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
