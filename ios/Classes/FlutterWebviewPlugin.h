#import <Flutter/Flutter.h>
#import <WebKit/WebKit.h>
#import <UIKit/UIKit.h>
static FlutterMethodChannel *channel;

@interface FlutterWebviewPlugin : NSObject<FlutterPlugin>
@interface ViewController : UIViewController <WKScriptMessageHandler>
   
@end

//@property (nonatomic, retain) UIViewController *viewController;
@property (nonatomic, retain) WKWebView *webview;
@end
