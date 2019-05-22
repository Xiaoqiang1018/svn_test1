package com.test.demomybatis.api;

import com.sun.rowset.internal.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

public class ExcelDemo {
    private void createExcel(PageInfo<Network> networkPageInfo, HttpServletResponse response) throws Exception {
        List<Network> datas = networkPageInfo.getList();
        Workbook excel = new SXSSFWorkbook();
        Sheet sheet = excel.createSheet("登陆数据");
        Row title = sheet.createRow(0);//表头
        title.createCell(0).setCellValue("id");
        title.createCell(1).setCellValue("域名");
        title.createCell(2).setCellValue("端口号");
        title.createCell(3).setCellValue("ip");
        title.createCell(4).setCellValue("状态");
        if (datas != null) {
            for (int i = 0; i < datas.size(); i++) {
                Network network = datas.get(i);
                Row dataRow = sheet.createRow(i + 1);//表头
                dataRow.createCell(0).setCellValue(network.getId());
                dataRow.createCell(1).setCellValue(network.getDomain());
                dataRow.createCell(2).setCellValue(network.getPort());
                dataRow.createCell(3).setCellValue(network.getIp());
                dataRow.createCell(4).setCellValue(network.getStatus());
            }
        }
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        response.setHeader("Content-disposition", "attachment;filename=" + "host_name.xlsx");
        OutputStream out = response.getOutputStream();
        excel.write(out);//向响应中输出
        out.flush();
        out.close();
        excel.close();
    }
}
