package ThanhDat._1020124_BudderedReader;

import lombok.Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;


@Data
public class _1020124ReadTextra {


    private int LoaiXe;
    private String BienSoXe;
    private String SoVeXe;
    private String ThoiGianRa;
    private String TinhTrangXe;
    public static void main(String[] args) throws IOException {
        File vao = new File("D:\\Workspace\\Java\\BT Java\\BaiGiuXe\\ra.txt");
//      Path p = new Path("D:\Workspace\Java\BT Java\BaiGiuXe\vao.txt");

        try {
            BufferedReader text = Files.newBufferedReader(vao.toPath(), StandardCharsets.UTF_8);
            String line = null;
            while (true){
                line = text.readLine();
                if (line==null){
                    break;
                }
                else{
                    System.out.println(line);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
