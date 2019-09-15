# androidwxpay
一个在android端生成微信商品订单收款码，并能收到支付状态的例子。关联：微信支付，二维码收款，Native支付，统一下单


#### 前提
* 已经申请好微信商户号，并且开通了native支付，绑定了微信开放平台里面申请的appID（绑定操作只有商户超级管理员有权限）
* 已经申请好微信开放平台，审核通过了一个app(这样才有appID)。然后进商户号进行appid绑定，开放平台帐号注意点击确定通过

#### 使用
* MyConfig 中设置appid、商户号、商户API 密匙
* 目前给两个main函数，一个用于下单，一个用于查询订单付款状态。
至于怎么在安卓程序里面run Main 方法，这里就不说了
* 这个例子没在activity里面写什么东西，sync一下直接run 两个main方法就行
* 没接zxing，拿到支付链接后自己想办法生成二维码，这不是这个demo的重点

* 下单不需要cer12证书，退款才需要

run WXPayExample后，得到的 code_url=weixin://wxpay/*** 就是收款码的链接

#### 参考链接：

[微信支付开发文档——统一下单](https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=9_1)

[微信支付开发文档——查询订单](https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=9_2)

[微信支付java端（服务端）SDK封装](https://github.com/aohanhongzhi/weixinpaySDK)
