/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academia2.viewr.relatorios;
import academia2.Conexao1;
import academia2.HibernateUtil;
import com.itextpdf.text.Chapter;
import java.io.FileOutputStream;
import java.io.IOException;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfDiv;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author anton
 */
public class testeRel {
    Conexao1 conn = new Conexao1();
    public static void main(String[] args) throws DocumentException, FileNotFoundException {
       // criação do objeto documento
      Document document = new Document();
      
       Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        //PESQUISA COM SQLQUERY E JOIN MAIS TRANSFORMACAO EM LISTA DO HIBERNATE.
        SQLQuery query = sesion.createSQLQuery("Select*from cliente");
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        java.util.List results = query.list();

      
      
      try {
          
          PdfWriter.getInstance(document, 
          new FileOutputStream("C:\\Users\\anton\\OneDrive\\Documentos\\NetBeansProjects\\Academia2\\LIBS EXTRAS\\PDF_DevMedia.pdf"));
          document.open();
          document.addTitle("Relatório de Clientes");
          document.addHeader("Clientes", "Clientes");
          int numPagina = 1;
        for (Object object : results) {
            Map row = (Map) object;
            document.add(new Chapter("Relatório de Clientes", numPagina));
            String nome = (String) row.get("nome");
            String endereco = (String) row.get("logradouro");
            document.add(new Paragraph(nome));
            document.add(new PdfDiv());
            document.add(new Paragraph(endereco));
            numPagina += 1;
        }
          // adicionando um parágrafo ao documento
          
          document.addSubject("Academia2 - Relatorios Cliente");
          document.addKeywords("www.tecinova.tech");
          document.addCreator("iText");
          document.addAuthor("Antonio Rony Marcelino Andrade");
}
      catch(DocumentException de) {
          System.err.println(de.getMessage());
      }
      catch(IOException ioe) {
          System.err.println(ioe.getMessage());
      }
      document.close();
  }   
    
}
