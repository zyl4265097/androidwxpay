package testwxpay;

import com.github.wxpay.sdk.IWXPayDomain;
import com.github.wxpay.sdk.WXPayConfig;
import com.github.wxpay.sdk.WXPayDomainSimpleImpl;
import java.io.InputStream;

/**
 * create by zhangyuanlong on 2019/9/12 14:22
 * Description
 **/
public class MyConfig extends WXPayConfig {

    //注册使用的appid
    @Override
    public String getAppID() {
        return "wx3c442ce799d42d11";
    }

    //商户号
    @Override
    public String getMchID() {
        return "1486658611";
    }

    //商户API 密匙
    @Override
    public String getKey() {
        return "192006250b4c09247ec02edce69f6a21";
    }

    //商户API证书（退款才用）
    @Override
    public InputStream getCertStream() {
        return null;
    }


    @Override
    public IWXPayDomain getWXPayDomain() {
        return WXPayDomainSimpleImpl.instance();
    }
}
