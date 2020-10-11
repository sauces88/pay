package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @date 2020/10/11 15:41
 */
public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016102500759478";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDZEdhVGgu1tPIgqY+QKdQDyRnCx2YRfh8joDcQI22CSk6ovekxHAZKQHWmCPdZkCOPU5T+yeybvlb1TQLwKTgcoF/RPVcLsgNHDs24pgo3yw0Kfi+D6YuJtp08nRgJA/3Dyk+YCIHRxCjSX6DHjJv4wi5t6qj9E3lhXDBoM+nV/LTcoIR6ht11IdjgVqa0omfX+JTSMTEHq01FTd9rYSjEJogVMQ8/f5RkmQ17+Z7HtkTxHD7QTEbh1umVMghDyyu0/UAkEEp9+JF6TaMKrnXxwwuza6Q/om3GzRerC1RpNDETrME1OwbzPBI4I1LDmSDzWtGdk+AfRtpfn+Qk8DLJAgMBAAECggEARbzc8qJWhr8mVuYC0H8PtVOjahdjrFUHrgtoBVBMe2JiGQZCZ9uoDazd30TcKrMLKZ3hrWW0FWk2SMLAIeYsN84yWmfJkmFTej3ATAVUHQ6oFunpXAjpIoo/w9x4f1T/7yoNHjwFcR4DO2srnVCIP4grIHcWaZAbG/NhPekHxA4/lD7PeCK4QACvLqHaf1/xcjd4JhqYhJw8Wyl5x/vVQ39yg4JlnmrQBPVafxhZnxYS37CJratpwIaqCyLWTLpErdcwHdc47Ovk/M7A3RCYBM0V5o1c37qTgwCgXeCfU6oFG84P7dMEx+7mGDCdwONLKUt4jzvG1N20i9xEsFKjfQKBgQDvW+E1REsx3IBZ4hYf7xIcEmboVciAQVTwmpvt1P+WhWm/SzfnyBON7hZ/Izyx224pdJ05vnh7/wkExPXufd/hn87SBy7xgi/OuJAunXYb/RdSSjCHwkn+z6SS6AS2E/l7jsqLnt/r0znMFCe2Pd4F/zzbnaXpDOP9dQT+Kx3r8wKBgQDoKULeidh/8znBoXsz0qD61G2LyNEgKFCJ1M1vYAMuSPEp4EwvFH59KIUdsQLzU0Tci0BybxtzS8ClaJiWCiV84VOQKBk7RB48r+ss3PbsvfrhbfUYwX013IqV7HZtQdghL5a4OJbSYWn/upVMFj9wcihrTDJR9kG5xWbjolxBUwKBgFtk+dkc+plPWLL5YPlQj9moLSMJnkVarNQyNNfbPLx8tKQWVIJsIwtOncht6/79ilLJ9D7YO6kc+JSZoE4wQgwkuRP5KjONQjPsxSEHftGxEfaZ3W35AcgKAQ0XCrV7aweCvlQRle61+Ju0FnW/qccgblxtFaym/2cIB6AFVqeBAoGBAK6Nz2w44mIZgxR2EIb/V/Af5hmSrMHr7doj+S5DV0DmsQSWU1GWrB/4ZlXTsG847W6Q+KzRoycGDtuPECLHkDYbyNN7grUP21gvwLfjj3iiws3Z+c1aNYVYw45D0ysEtbcF6+GpEqUtfyA6rmQd2ib2fjNmf/MmH3bI2DpQ6eJnAoGAEDFP1DO4IC7FnFiTh4PCSVpguq8hak9MnRjryH36IuQtpZHxehogjHVWyGpyf/v2/zEEpYdr8atZGZZogC5TdmayomDXge9jYI5JRc+B/XISVOSxuGG6zY4l3a5dBKWqyIfrkVQub4rWYkRHySyEYX8PkjFAj8qeyzzbb3DmHyU=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2RHYVRoLtbTyIKmPkCnUA8kZwsdmEX4fI6A3ECNtgkpOqL3pMRwGSkB1pgj3WZAjj1OU/snsm75W9U0C8Ck4HKBf0T1XC7IDRw7NuKYKN8sNCn4vg+mLibadPJ0YCQP9w8pPmAiB0cQo0l+gx4yb+MIubeqo/RN5YVwwaDPp1fy03KCEeobddSHY4FamtKJn1/iU0jExB6tNRU3fa2EoxCaIFTEPP3+UZJkNe/mex7ZE8Rw+0ExG4dbplTIIQ8srtP1AJBBKffiRek2jCq518cMLs2ukP6Jtxs0XqwtUaTQxE6zBNTsG8zwSOCNSw5kg81rRnZPgH0baX5/kJPAyyQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:2000/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:2000/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

//   /* *//**
//     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
//     * @param sWord 要写入日志里的文本内容
//     *//*
//    public static void logResult(String sWord) {
//        FileWriter writer = null;
//        try {
//            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
//            writer.write(sWord);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (writer != null) {
//                try {
//                    writer.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }*/
}
