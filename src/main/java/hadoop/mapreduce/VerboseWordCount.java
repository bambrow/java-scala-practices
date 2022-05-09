package hadoop.mapreduce;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.log4j.Logger;

import java.io.IOException;

public class VerboseWordCount {
    private static final Logger log = Logger.getLogger(VerboseWordCount.class);

    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
        if (args.length != 2) {
            System.out.println("Usage: WordCount <input dir> <output dir>");
            System.exit(-1);
        }

        log.info("创建任务中...");
        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf, "Verbose Word Count");
        job.setJarByClass(VerboseWordCount.class);
        FileInputFormat.setInputPaths(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));
        job.setMapperClass(VerboseWordMapper.class);
        job.setReducerClass(VerboseWordReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        boolean success = job.waitForCompletion(true);
        log.info("任务完成，是否运行成功: " + success);
        System.exit(success ? 0 : 1);
    }
}
