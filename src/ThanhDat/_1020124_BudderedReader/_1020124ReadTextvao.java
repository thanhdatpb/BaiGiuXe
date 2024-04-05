package ThanhDat._1020124_BudderedReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
//import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;



public class _1020124ReadTextvao {

    private int LoaiXe;
    private String BienSoXe;
    private String SoVeXe;
    private String ThoiGianVao;
    private String TinhTrangXe;
    public static void main(String[] args) throws IOException {
        File vao = new File("D:\\Workspace\\Java\\BT Java\\BaiGiuXe\\vao.txt");
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
