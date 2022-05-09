package hadoop.mapreduce;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.log4j.Logger;

import java.io.IOException;

public class VerboseWordReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
    private final Logger log = Logger.getLogger(VerboseWordReducer.class);
    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
        int wordCount = 0;
        for (IntWritable value : values) {
            wordCount += value.get();
        }
        log.info("最终统计: " + key.toString() + "," + wordCount);
        System.out.println("最终统计: " + key.toString() + ", " + wordCount);
        context.write(key, new IntWritable(wordCount));
    }
}
