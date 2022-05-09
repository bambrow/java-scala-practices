package hadoop.mapreduce;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.StringTokenizer;

public class VerboseWordMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
    private final Logger log = Logger.getLogger(VerboseWordMapper.class);
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        StringTokenizer itr = new StringTokenizer(value.toString());
        while (itr.hasMoreTokens()) {
            String word = itr.nextToken();
            log.info("获取单词: " + word);
            System.out.println("获取单词: " + word);
            context.write(new Text(word), new IntWritable(1));
        }
    }
}
