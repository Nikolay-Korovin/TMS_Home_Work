package Books;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private final static String jsonFile = "src/Unit17/Task2Books/Books/src/main/java/Books/library.json";
    private final static String xmlFile = "src/Unit17/Task2Books/Books/src/main/java/Books/library.xml";

    public static void main(String[] args) throws JAXBException, IOException {
        Library library = new Library();

        Book book1 = new Book();
        book1.setNumber(1);
        book1.setTitle("book1");
        book1.setYearOfPublish(1900);
        library.getBookList().add(book1);

        Book book2 = new Book();
        book2.setNumber(2);
        book2.setTitle("book2");
        book2.setYearOfPublish(1902);
        library.getBookList().add(book2);

        marshallingLibrary(library);
        unMarshalingLibrary();
        toJson(library);
        toJavaObject();
    }

    public static void marshallingLibrary(Library library) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Library.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(library, new File(xmlFile));
    }

    private static void unMarshalingLibrary() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Library.class);
        Unmarshaller Unmarshaller = jaxbContext.createUnmarshaller();
        Library books = (Library) Unmarshaller.unmarshal(new File(xmlFile));

        for (Book book : books.getBookList()) {
            System.out.println(book.getNumber());
            System.out.println(book.getTitle());
            System.out.println(book.getYearOfPublish());
        }
    }

    private static void toJson(Library library) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(jsonFile), library);
        System.out.println("json created");
    }
    private static Library toJavaObject() throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(jsonFile), Library.class);
    }
}
