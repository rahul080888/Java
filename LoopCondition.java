import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LoopCondition {

    public static void main(String[] args) {

        int i=1; //initlization

        while(i<=10)
        {
            if (i%2==0) {
                System.out.println(i + "Even");
                //i++;
                //++i;
                //i=++i;
            }
            else
            {
                System.out.println(i + "Odd");
            }
            i++;
        }

    }
}
