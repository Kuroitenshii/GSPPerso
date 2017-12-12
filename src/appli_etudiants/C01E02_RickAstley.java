/*
 * This example is part of the iText 7 tutorial.
 */
package appli_etudiants;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.test.annotations.WrapToTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.text.StyleConstants;

/**
 * Simple List example.
 */
@WrapToTest
public class C01E02_RickAstley {

    public static final String DEST = "results/chapter01/CV.pdf";
    private Personne info;

    public C01E02_RickAstley(Personne info) {
        this.info = info;
        Connect.getConnect();
    }

    public static void main(String args[], Personne info) throws IOException, SQLException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new C01E02_RickAstley(info).createPdf(DEST);
    }

    public void createPdf(String dest) throws IOException, SQLException {
        //Initialize PDF writer
        PdfWriter writer = new PdfWriter(dest);

        //Initialize PDF document
        PdfDocument pdf = new PdfDocument(writer);

        // Initialize document
        Document document = new Document(pdf);

        // Create a PdfFont
        PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
        // Add a Paragraph
        document.add(new Paragraph(info.getPrenom() + " " + info.getNom()).setFont(font).setFontSize(20));
        // Create a List
        List list = new List()
                .setSymbolIndent(12)
                .setListSymbol("\u2022")
                .setFont(font)
                .setFontSize(11);
        // Add ListItem objects
        list.add(new ListItem(info.getRue()))
                .add(new ListItem(info.getCp()))
                .add(new ListItem(info.getVille()))
                .add(new ListItem(info.getCourriel()))
                .add(new ListItem(info.getTelPerso()))
                .add(new ListItem(info.getTelPro()));
        // Add the list
        document.add(list);
        ResultSet titre = Connect.requete("select libelle_titre from cv_titre where id_utilisateur=" + info.getId());
        if (titre.next()) {
            document.add(new Paragraph(titre.getString("libelle_titre")).setFont(font).setFontSize(20).setMarginTop(15));
        }
        ResultSet xpPro = Connect.requete("select * from cv_experience_prof where id_utilisateur=" + info.getId());
        document.add(new Paragraph("EXPÉRIENCE PROFESSIONELLE").setFont(font).setFontSize(16).setMarginTop(10).setFontColor(Color.BLUE).setBorderBottom(new SolidBorder(Color.BLUE, 1)).setMarginBottom(-5));
        while (xpPro.next()) {
            document.add(new Paragraph(xpPro.getString("date_experience_prof")).setFont(font).setFontSize(10).setFontColor(Color.BLUE).setBold());
            document.add(new Paragraph(xpPro.getString("titre_experience_prof")).setFont(font).setFontSize(9).setMarginLeft(10).setMarginTop(-8));            
            ResultSet activite = Connect.requete("select * from cv_activite where id_experience_prof="+xpPro.getInt("id_experience_prof"));
            while(activite.next()){
                document.add(new Paragraph(activite.getString("activite")).setFont(font).setFontSize(8).setMarginLeft(20).setMarginTop(-8));
            }            
        }
        document.add(new Paragraph("FORMATION").setFont(font).setFontSize(15).setMarginTop(10).setFontColor(Color.BLUE).setBorderBottom(new SolidBorder(Color.BLUE, 1)).setMarginBottom(-5));
        ResultSet form = Connect.requete("select * from cv_formation where id_utilisateur=" + info.getId());
        while (form.next()) {
            document.add(new Paragraph(form.getString("annee")).setFont(font).setFontSize(10).setFontColor(Color.BLUE).setBold());
            document.add(new Paragraph(form.getString("libelle_formation")).setFont(font).setFontSize(9).setMarginLeft(10).setMarginTop(-8));            
            document.add(new Paragraph(form.getString("lieu")).setFont(font).setFontSize(8).setMarginLeft(20).setMarginTop(-8));         
        }
        document.add(new Paragraph("INFORMATIQUE").setFont(font).setFontSize(15).setMarginTop(10).setFontColor(Color.BLUE).setBorderBottom(new SolidBorder(Color.BLUE, 1)).setMarginBottom(-5));
        ResultSet infor = Connect.requete("select * from cv_informatique where id_utilisateur=" + info.getId());
        while (infor.next()) {
            document.add(new Paragraph(infor.getString("libelle_informatique")).setFont(font).setFontSize(10).setFontColor(Color.BLUE).setBold());
            document.add(new Paragraph(infor.getString("description")).setFont(font).setFontSize(8).setMarginLeft(10).setMarginTop(-8));     
        }
        document.add(new Paragraph("LANGUES").setFont(font).setFontSize(15).setMarginTop(10).setFontColor(Color.BLUE).setBorderBottom(new SolidBorder(Color.BLUE, 1)).setMarginBottom(-5));
        ResultSet langue = Connect.requete("select * from cv_langue where id_utilisateur=" + info.getId());
        while (langue.next()) {
            document.add(new Paragraph(langue.getString("libelle_langue")).setFont(font).setFontSize(10).setFontColor(Color.BLUE).setBold());
            document.add(new Paragraph(langue.getString("niveau")).setFont(font).setFontSize(8).setMarginLeft(10).setMarginTop(-8));     
        }
        document.add(new Paragraph("CENTRE D'INTERET").setFont(font).setFontSize(15).setMarginTop(10).setFontColor(Color.BLUE).setBorderBottom(new SolidBorder(Color.BLUE, 1)).setMarginBottom(-5));
        ResultSet hobbie = Connect.requete("select * from cv_centre_interet where id_utilisateur=" + info.getId());
        while (hobbie.next()) {
            document.add(new Paragraph(hobbie.getString("libelle_centre_interet")).setFont(font).setFontSize(10).setFontColor(Color.BLUE).setBold());
            document.add(new Paragraph(hobbie.getString("description")).setFont(font).setFontSize(8).setMarginLeft(10).setMarginTop(-8));     
        }
        

        //Close document
        document.close();
    }
}
