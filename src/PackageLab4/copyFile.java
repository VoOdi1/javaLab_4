package PackageLab4;
import java.io.*;
public class copyFile {

    private  double Speed;
    private  long Time;

    public copyFile(double Speed, long Time)
    {
        this.Speed=Speed;
        this.Time=Time;
    }
    public double getSpeed()
    {
        return Speed;
    }
    public long getTime()
    {
        return Time;
    }
    public static copyFile copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = new FileInputStream(source);
        OutputStream os = new FileOutputStream(dest);
        int kol=0;
        long SizeByteFile=0;
        long  StartTime = System.nanoTime();
        try {
            byte[] buffer = new byte[4096];
            while ((kol = is.read(buffer)) > 0) {
                os.write(buffer, 0, kol);
                SizeByteFile+=kol;
            }
            long EndTime = System.nanoTime();

            return new copyFile((double)(SizeByteFile*Math.pow(10,3))/
                    ((EndTime-StartTime)*Math.pow(10,-9)),(EndTime-StartTime));


        } finally {
            is.close();
            os.close();
        }

    }


}
