package com.selenium.qr.web;

import com.google.zxing.NotFoundException;
import com.selenium.qr.web.util.QrUtil;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;


class QrApplicationTests {

    /**
     * 测试创建二维码
     */
    @Test
    public void testCreateQr() {
        try {
            QrUtil.createQr("https://blog.csdn.net/qq_45453266/article/details/103285051", 500, 500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 测试创建带logo的二维码
     */
    @Test
    public void testCreateQrWithLogo() {
        try {
            QrUtil.createQrWithLogo("https://blog.csdn.net/qq_45453266/article/details/103285051", 500, 500,10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试识别二维码
     */
    @Test
    public void testRecogQr() throws IOException, NotFoundException {
        System.out.println(QrUtil.recogQr(new File("C:\\src\\idea\\qr-java\\qr.png")));
        System.out.println(QrUtil.recogQr(new File("C:\\src\\idea\\qr-java\\qrwithlogo.png")));
    }

}
