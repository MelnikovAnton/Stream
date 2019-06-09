package ru.melnikov;

import ru.melnikov.mypackage1.InvDetails;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Main {

    private static final String IN_FILE_CISCO_XML = "import/cisco.xml";
    private static final String OUT_FILE_CISCO_CSV = "export/cisco.csv";

    private static final String IN_FILE_BULAT_XML = "import/eSoght.csv";
    private static final String OUT_FILE_BULAT_CSV = "export/bulat.csv";


    public static void main(String[] args) {
        try {
            doXMLParse(IN_FILE_CISCO_XML, OUT_FILE_CISCO_CSV);
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }

        System.out.println("12344444");
        try {
            doLinesParse(IN_FILE_BULAT_XML, OUT_FILE_BULAT_CSV);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void doXMLParse(String uri, String out_File) throws JAXBException, IOException {

        JAXBContext context = JAXBContext.newInstance(InvDetails.class);


        Unmarshaller unmarshaller = context.createUnmarshaller();
        InvDetails ciscos = (InvDetails) unmarshaller.unmarshal(new File(uri));
        System.out.println(ciscos.getRMEPlatform().size());

        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(
                Paths.get(out_File)))) {
            ciscos.getRMEPlatform().stream()
                    .map(e -> {
                        String host = e.getCiscoNetworkElement().getOfficialHostName();
                        return new Cisco(host, e.getCiscoNetworkElement().getCiscoIfEntry());
                    })
                    .forEach(pw::println);
        }

    }

    public static void doLinesParse(String in_File, String out_File) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(in_File));
        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(
                Paths.get(out_File)))) {
            br.lines()
                    .parallel()
                    .map(Bulat::new)
                    .map(String::valueOf)
                    .forEach(pw::println);
        }

    }
}



