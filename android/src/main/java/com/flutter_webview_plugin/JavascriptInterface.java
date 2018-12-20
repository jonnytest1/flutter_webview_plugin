package com.flutter_webview_plugin;

import android.content.Context;

import java.util.HashMap;
import java.util.Map;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

public class JavascriptInterface {
    Context mContext;
    MethodChannel channel;

    JavascriptInterface(Context c, MethodChannel channel) {
        mContext = c;
        this.channel=channel;
    }
    @JavascriptInterface
    void message(String message,String type) {
        Map<String, Object> messageContainer = new HashMap<>();
        messageContainer.put("type", type);
        messageContainer.put("message",message);
        channel.invokeMethod("javascriptMessage", messageContainer);
    }
}
