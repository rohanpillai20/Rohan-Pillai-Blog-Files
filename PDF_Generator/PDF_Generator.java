
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PDF_Generator {

    public static void main(String args[]) throws DocumentException {
        Document document = new Document();
        try {
            Font boldFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\dell\\Desktop\\HelloWorld.pdf"));
            document.open();
            document.add(new Paragraph("A Hello World PDF document.", boldFont));
            document.close();
            writer.close();
        } catch (DocumentException | FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }
}
