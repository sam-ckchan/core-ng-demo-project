import core.framework.impl.web.HttpStringBenchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.ChainedOptionsBuilder;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * @author neo
 */
public class Main {
    public static void main(String[] args) throws RunnerException {
        ChainedOptionsBuilder builder = new OptionsBuilder()
                .include(HttpStringBenchmark.class.getSimpleName())
                .forks(1);

//        builder.addProfiler(GCProfiler.class);
//        builder.addProfiler(StackProfiler.class)
//            .jvmArgsAppend("-Djmh.stack.lines=3");

        Options options = builder.build();
        new Runner(options).run();
    }
}
