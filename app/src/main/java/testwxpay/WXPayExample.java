package testwxpay;

import com.github.wxpay.sdk.WXPay;
import java.util.HashMap;
import java.util.Map;

/**
 * create by zhangyuanlong on 2019/9/12 14:33
 * Description
 **/
public class WXPayExample {
    public static void main(String[] args) throws Exception {
        unifiedOrder();
    }

    //统一下单
    public static void unifiedOrder(){
        MyConfig config = new MyConfig();
        WXPay wxpay = null;
        try {
            wxpay = new WXPay(config);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Map<String, String> data = new HashMap<String, String>();
        data.put("body", "抱抱氧第一次收款");
        data.put("out_trade_no", "2016090910595900000013");
        data.put("device_info", "");
        data.put("fee_type", "CNY");
        data.put("total_fee", "1");
        data.put("spbill_create_ip", "123.12.12.123");
        data.put("notify_url", "http://pay.ncmed.cn/pay.aspx");
        data.put("trade_type", "NATIVE");  // 此处指定为扫码支付
        data.put("product_id", "12");

        try {
            Map<String, String> resp = wxpay.unifiedOrder(data);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
