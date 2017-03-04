import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WordcountMapper extends Mapper <Object,Text,Text,IntWritable> {
	public void map(Object key, Text value, Context context) throws IOException, InterruptedException{
		StringTokenizer st = new StringTokenizer(value.toString());
		System.out.println(key);
		while ( st.hasMoreTokens()){
			context.write(new Text(st.nextToken()), new IntWritable(1));
		}
		
	}
}
