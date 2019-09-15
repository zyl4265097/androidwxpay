package testwxpay;

import com.github.wxpay.sdk.WXPay;
import java.util.HashMap;
import java.util.Map;

/**
 * create by zhangyuanlong on 2019/9/12 14:33
 * Description
 **/
public class WXPayExample2 {
    public static void main(String[] args) throws Exception {
        orderQuery();
    }

    //订单查询
    public static void orderQuery(){
        MyConfig config = new MyConfig();
        WXPay wxpay = null;
        try {
            wxpay = new WXPay(config);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Map<String, String> data = new HashMap<String, String>();
        data.put("out_trade_no", "2016090910595900000013");

        try {
            Map<String, String> resp = wxpay.orderQuery(data);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
