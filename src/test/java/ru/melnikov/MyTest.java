package ru.melnikov;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@State(value = Scope.Benchmark)
@BenchmarkMode(Mode.SingleShotTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class MyTest {

    private  String IN_FILE_CISCO_XML;
    private  String OUT_FILE_CISCO_CSV;

    private String IN_FILE_BULAT_XML;
    private String OUT_FILE_BULAT_CSV;

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder().include(MyTest.class.getSimpleName()).forks(1).build();
        new Runner(opt).run();
    }

    @Setup
    public void init(){
        IN_FILE_CISCO_XML="import/cisco.xml";
        OUT_FILE_CISCO_CSV="export/cisco.csv";

        IN_FILE_BULAT_XML="import/eSoght.csv";
        OUT_FILE_BULAT_CSV="export/bulat.csv";

    }

    @Benchmark
    public void readCisco() throws JAXBException, IOException {
            Main.doXMLParse(IN_FILE_CISCO_XML,OUT_FILE_CISCO_CSV);
    }

    @Benchmark
    public void readBulat() throws IOException {
        Main.doLinesParse(IN_FILE_BULAT_XML,OUT_FILE_BULAT_CSV);
    }

}
