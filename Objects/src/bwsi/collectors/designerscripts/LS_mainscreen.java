package bwsi.collectors.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_mainscreen{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("toolbar").vw.setTop((int)((0d * scale)));
if ((anywheresoftware.b4a.keywords.LayoutBuilder.getScreenSize()>6.5d)) { 
;
views.get("toolbar").vw.setHeight((int)((68d * scale)));
;}else{ 
;
if ((BA.ObjectToBoolean( String.valueOf(anywheresoftware.b4a.keywords.LayoutBuilder.isPortrait())))) { 
;
views.get("toolbar").vw.setHeight((int)((55d * scale)));
;}else{ 
;
views.get("toolbar").vw.setHeight((int)((42d * scale)));
;};
;};
views.get("pnluser").vw.setTop((int)((views.get("toolbar").vw.getTop() + views.get("toolbar").vw.getHeight())-(1d * scale)));
views.get("pnluser").vw.setHeight((int)((20d / 100 * height) - ((views.get("toolbar").vw.getTop() + views.get("toolbar").vw.getHeight())-(1d * scale))));
views.get("pnluser").vw.setLeft((int)((0d / 100 * width)));
views.get("pnluser").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("lbluser").vw.setTop((int)((views.get("pnluser").vw.getHeight())/2d - (views.get("lbluser").vw.getHeight() / 2)));
views.get("lbluser").vw.setLeft((int)((2d / 100 * width)));
views.get("lbluser").vw.setWidth((int)((views.get("pnluser").vw.getWidth())-(2d / 100 * width) - ((2d / 100 * width))));
views.get("pnlmain").vw.setTop((int)((views.get("pnluser").vw.getTop() + views.get("pnluser").vw.getHeight())+(5d * scale)));
views.get("pnlmain").vw.setHeight((int)((85d / 100 * height) - ((views.get("pnluser").vw.getTop() + views.get("pnluser").vw.getHeight())+(5d * scale))));
views.get("pnlmain").vw.setLeft((int)((0d / 100 * width)));
views.get("pnlmain").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("mainmenu").vw.setTop((int)((96d / 100 * height) - (views.get("mainmenu").vw.getHeight())));
views.get("pnltoday").vw.setTop((int)((10d * scale)));
views.get("pnltoday").vw.setLeft((int)((2d / 100 * width)));
views.get("pnltoday").vw.setWidth((int)((47d / 100 * width) - ((2d / 100 * width))));
views.get("todayicon").vw.setLeft((int)((views.get("pnltoday").vw.getWidth())-(2d / 100 * width) - (views.get("todayicon").vw.getWidth())));
views.get("todayicon").vw.setTop((int)((10d * scale)));
views.get("lblcoltoday").vw.setTop((int)((15d * scale)));
views.get("lblcoltoday").vw.setLeft((int)((3d / 100 * width)));
views.get("lblcoltoday").vw.setWidth((int)((views.get("pnltoday").vw.getWidth())-(1d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 35;BA.debugLine="lblToday.SetTopAndBottom(lblColToday.Bottom - 5dip, pnlToday.Height - 1%y)"[MainScreen/General script]
views.get("lbltoday").vw.setTop((int)((views.get("lblcoltoday").vw.getTop() + views.get("lblcoltoday").vw.getHeight())-(5d * scale)));
views.get("lbltoday").vw.setHeight((int)((views.get("pnltoday").vw.getHeight())-(1d / 100 * height) - ((views.get("lblcoltoday").vw.getTop() + views.get("lblcoltoday").vw.getHeight())-(5d * scale))));
//BA.debugLineNum = 36;BA.debugLine="lblToday.SetLeftAndRight(1%x, lblColToday.Right)"[MainScreen/General script]
views.get("lbltoday").vw.setLeft((int)((1d / 100 * width)));
views.get("lbltoday").vw.setWidth((int)((views.get("lblcoltoday").vw.getLeft() + views.get("lblcoltoday").vw.getWidth()) - ((1d / 100 * width))));
//BA.debugLineNum = 38;BA.debugLine="pnlTotal.Top = 10dip"[MainScreen/General script]
views.get("pnltotal").vw.setTop((int)((10d * scale)));
//BA.debugLineNum = 39;BA.debugLine="pnlTotal.SetLeftAndRight(pnlToday.Right + 6.2%x, pnlMain.Width - 2%x)"[MainScreen/General script]
views.get("pnltotal").vw.setLeft((int)((views.get("pnltoday").vw.getLeft() + views.get("pnltoday").vw.getWidth())+(6.2d / 100 * width)));
views.get("pnltotal").vw.setWidth((int)((views.get("pnlmain").vw.getWidth())-(2d / 100 * width) - ((views.get("pnltoday").vw.getLeft() + views.get("pnltoday").vw.getWidth())+(6.2d / 100 * width))));
//BA.debugLineNum = 41;BA.debugLine="TotalIcon.Right = pnlTotal.Width - 2%x"[MainScreen/General script]
views.get("totalicon").vw.setLeft((int)((views.get("pnltotal").vw.getWidth())-(2d / 100 * width) - (views.get("totalicon").vw.getWidth())));
//BA.debugLineNum = 42;BA.debugLine="TotalIcon.Top = 10dip"[MainScreen/General script]
views.get("totalicon").vw.setTop((int)((10d * scale)));
//BA.debugLineNum = 44;BA.debugLine="lblColTotal.Top = 15dip"[MainScreen/General script]
views.get("lblcoltotal").vw.setTop((int)((15d * scale)));
//BA.debugLineNum = 45;BA.debugLine="lblColTotal.SetLeftAndRight(3%x, pnlTotal.Width - 1%x)"[MainScreen/General script]
views.get("lblcoltotal").vw.setLeft((int)((3d / 100 * width)));
views.get("lblcoltotal").vw.setWidth((int)((views.get("pnltotal").vw.getWidth())-(1d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 47;BA.debugLine="lblTotal.SetTopAndBottom(lblColTotal.Bottom - 5dip, pnlTotal.Height - 1%y)"[MainScreen/General script]
views.get("lbltotal").vw.setTop((int)((views.get("lblcoltotal").vw.getTop() + views.get("lblcoltotal").vw.getHeight())-(5d * scale)));
views.get("lbltotal").vw.setHeight((int)((views.get("pnltotal").vw.getHeight())-(1d / 100 * height) - ((views.get("lblcoltotal").vw.getTop() + views.get("lblcoltotal").vw.getHeight())-(5d * scale))));
//BA.debugLineNum = 48;BA.debugLine="lblTotal.SetLeftAndRight(1%x, lblColTotal.Right)"[MainScreen/General script]
views.get("lbltotal").vw.setLeft((int)((1d / 100 * width)));
views.get("lbltotal").vw.setWidth((int)((views.get("lblcoltotal").vw.getLeft() + views.get("lblcoltotal").vw.getWidth()) - ((1d / 100 * width))));
//BA.debugLineNum = 53;BA.debugLine="Line1.HorizontalCenter = pnlMain.Width / 2"[MainScreen/General script]
views.get("line1").vw.setLeft((int)((views.get("pnlmain").vw.getWidth())/2d - (views.get("line1").vw.getWidth() / 2)));
//BA.debugLineNum = 54;BA.debugLine="Line1.SetTopAndBottom(5dip, pnlTotal.Bottom + 10dip)"[MainScreen/General script]
views.get("line1").vw.setTop((int)((5d * scale)));
views.get("line1").vw.setHeight((int)((views.get("pnltotal").vw.getTop() + views.get("pnltotal").vw.getHeight())+(10d * scale) - ((5d * scale))));
//BA.debugLineNum = 56;BA.debugLine="Line2.Top = Line1.Bottom + 3dip"[MainScreen/General script]
views.get("line2").vw.setTop((int)((views.get("line1").vw.getTop() + views.get("line1").vw.getHeight())+(3d * scale)));
//BA.debugLineNum = 57;BA.debugLine="Line2.SetLeftAndRight(2%x, pnlMain.Width - 2%x)"[MainScreen/General script]
views.get("line2").vw.setLeft((int)((2d / 100 * width)));
views.get("line2").vw.setWidth((int)((views.get("pnlmain").vw.getWidth())-(2d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 59;BA.debugLine="pnlButtons.SetLeftAndRight(0, pnlMain.Width)"[MainScreen/General script]
views.get("pnlbuttons").vw.setLeft((int)(0d));
views.get("pnlbuttons").vw.setWidth((int)((views.get("pnlmain").vw.getWidth()) - (0d)));
//BA.debugLineNum = 60;BA.debugLine="pnlButtons.SetTopAndBottom(Line2.Bottom + 5dip, pnlMain.Height - 1%y)"[MainScreen/General script]
views.get("pnlbuttons").vw.setTop((int)((views.get("line2").vw.getTop() + views.get("line2").vw.getHeight())+(5d * scale)));
views.get("pnlbuttons").vw.setHeight((int)((views.get("pnlmain").vw.getHeight())-(1d / 100 * height) - ((views.get("line2").vw.getTop() + views.get("line2").vw.getHeight())+(5d * scale))));
//BA.debugLineNum = 62;BA.debugLine="btnBillInquiry.SetLeftAndRight(2%x, 32%x)"[MainScreen/General script]
views.get("btnbillinquiry").vw.setLeft((int)((2d / 100 * width)));
views.get("btnbillinquiry").vw.setWidth((int)((32d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 63;BA.debugLine="btnBillInquiry.SetTopAndBottom(1%y, 18%y)"[MainScreen/General script]
views.get("btnbillinquiry").vw.setTop((int)((1d / 100 * height)));
views.get("btnbillinquiry").vw.setHeight((int)((18d / 100 * height) - ((1d / 100 * height))));
//BA.debugLineNum = 65;BA.debugLine="imgInquiry.HorizontalCenter = btnBillInquiry.Width /2"[MainScreen/General script]
views.get("imginquiry").vw.setLeft((int)((views.get("btnbillinquiry").vw.getWidth())/2d - (views.get("imginquiry").vw.getWidth() / 2)));
//BA.debugLineNum = 66;BA.debugLine="imgInquiry.Top = 8dip"[MainScreen/General script]
views.get("imginquiry").vw.setTop((int)((8d * scale)));
//BA.debugLineNum = 68;BA.debugLine="lblInquiry.SetLeftAndRight(1%x, btnBillInquiry.Width - 1%x)"[MainScreen/General script]
views.get("lblinquiry").vw.setLeft((int)((1d / 100 * width)));
views.get("lblinquiry").vw.setWidth((int)((views.get("btnbillinquiry").vw.getWidth())-(1d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 69;BA.debugLine="lblInquiry.SetTopAndBottom(imgInquiry.Bottom, btnBillInquiry.Height - 5dip)"[MainScreen/General script]
views.get("lblinquiry").vw.setTop((int)((views.get("imginquiry").vw.getTop() + views.get("imginquiry").vw.getHeight())));
views.get("lblinquiry").vw.setHeight((int)((views.get("btnbillinquiry").vw.getHeight())-(5d * scale) - ((views.get("imginquiry").vw.getTop() + views.get("imginquiry").vw.getHeight()))));
//BA.debugLineNum = 71;BA.debugLine="btnBillPayments.SetLeftAndRight(35%x, 65%x)"[MainScreen/General script]
views.get("btnbillpayments").vw.setLeft((int)((35d / 100 * width)));
views.get("btnbillpayments").vw.setWidth((int)((65d / 100 * width) - ((35d / 100 * width))));
//BA.debugLineNum = 72;BA.debugLine="btnBillPayments.SetTopAndBottom(1%y, 18%y)"[MainScreen/General script]
views.get("btnbillpayments").vw.setTop((int)((1d / 100 * height)));
views.get("btnbillpayments").vw.setHeight((int)((18d / 100 * height) - ((1d / 100 * height))));
//BA.debugLineNum = 74;BA.debugLine="imgBillsPayment.HorizontalCenter = btnBillPayments.Width /2"[MainScreen/General script]
views.get("imgbillspayment").vw.setLeft((int)((views.get("btnbillpayments").vw.getWidth())/2d - (views.get("imgbillspayment").vw.getWidth() / 2)));
//BA.debugLineNum = 75;BA.debugLine="imgBillsPayment.Top = 8dip"[MainScreen/General script]
views.get("imgbillspayment").vw.setTop((int)((8d * scale)));
//BA.debugLineNum = 77;BA.debugLine="lblBillsPayment.SetLeftAndRight(1%x, btnBillPayments.Width - 1%x)"[MainScreen/General script]
views.get("lblbillspayment").vw.setLeft((int)((1d / 100 * width)));
views.get("lblbillspayment").vw.setWidth((int)((views.get("btnbillpayments").vw.getWidth())-(1d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 78;BA.debugLine="lblBillsPayment.SetTopAndBottom(imgBillsPayment.Bottom, btnBillInquiry.Height - 5dip)"[MainScreen/General script]
views.get("lblbillspayment").vw.setTop((int)((views.get("imgbillspayment").vw.getTop() + views.get("imgbillspayment").vw.getHeight())));
views.get("lblbillspayment").vw.setHeight((int)((views.get("btnbillinquiry").vw.getHeight())-(5d * scale) - ((views.get("imgbillspayment").vw.getTop() + views.get("imgbillspayment").vw.getHeight()))));
//BA.debugLineNum = 80;BA.debugLine="btnOtherPayments.SetLeftAndRight(68%x, 98%x)"[MainScreen/General script]
views.get("btnotherpayments").vw.setLeft((int)((68d / 100 * width)));
views.get("btnotherpayments").vw.setWidth((int)((98d / 100 * width) - ((68d / 100 * width))));
//BA.debugLineNum = 81;BA.debugLine="btnOtherPayments.SetTopAndBottom(1%y, 18%y)"[MainScreen/General script]
views.get("btnotherpayments").vw.setTop((int)((1d / 100 * height)));
views.get("btnotherpayments").vw.setHeight((int)((18d / 100 * height) - ((1d / 100 * height))));
//BA.debugLineNum = 83;BA.debugLine="imgOthersPayment.HorizontalCenter = btnOtherPayments.Width /2"[MainScreen/General script]
views.get("imgotherspayment").vw.setLeft((int)((views.get("btnotherpayments").vw.getWidth())/2d - (views.get("imgotherspayment").vw.getWidth() / 2)));
//BA.debugLineNum = 84;BA.debugLine="imgOthersPayment.Top = 8dip"[MainScreen/General script]
views.get("imgotherspayment").vw.setTop((int)((8d * scale)));
//BA.debugLineNum = 86;BA.debugLine="lblOthersPayment.SetLeftAndRight(1%x, btnOtherPayments.Width - 1%x)"[MainScreen/General script]
views.get("lblotherspayment").vw.setLeft((int)((1d / 100 * width)));
views.get("lblotherspayment").vw.setWidth((int)((views.get("btnotherpayments").vw.getWidth())-(1d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 87;BA.debugLine="lblOthersPayment.SetTopAndBottom(imgOthersPayment.Bottom, btnOtherPayments.Height - 5dip)"[MainScreen/General script]
views.get("lblotherspayment").vw.setTop((int)((views.get("imgotherspayment").vw.getTop() + views.get("imgotherspayment").vw.getHeight())));
views.get("lblotherspayment").vw.setHeight((int)((views.get("btnotherpayments").vw.getHeight())-(5d * scale) - ((views.get("imgotherspayment").vw.getTop() + views.get("imgotherspayment").vw.getHeight()))));
//BA.debugLineNum = 89;BA.debugLine="btnReports.SetLeftAndRight(2%x, 32%x)"[MainScreen/General script]
views.get("btnreports").vw.setLeft((int)((2d / 100 * width)));
views.get("btnreports").vw.setWidth((int)((32d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 90;BA.debugLine="btnReports.SetTopAndBottom(21%y, 38%y)"[MainScreen/General script]
views.get("btnreports").vw.setTop((int)((21d / 100 * height)));
views.get("btnreports").vw.setHeight((int)((38d / 100 * height) - ((21d / 100 * height))));
//BA.debugLineNum = 92;BA.debugLine="imgReports.HorizontalCenter = btnReports.Width /2"[MainScreen/General script]
views.get("imgreports").vw.setLeft((int)((views.get("btnreports").vw.getWidth())/2d - (views.get("imgreports").vw.getWidth() / 2)));
//BA.debugLineNum = 93;BA.debugLine="imgReports.Top = 8dip"[MainScreen/General script]
views.get("imgreports").vw.setTop((int)((8d * scale)));
//BA.debugLineNum = 95;BA.debugLine="lblReports.SetLeftAndRight(1%x, btnReports.Width - 1%x)"[MainScreen/General script]
views.get("lblreports").vw.setLeft((int)((1d / 100 * width)));
views.get("lblreports").vw.setWidth((int)((views.get("btnreports").vw.getWidth())-(1d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 96;BA.debugLine="lblReports.SetTopAndBottom(imgReports.Bottom, btnReports.Height - 5dip)"[MainScreen/General script]
views.get("lblreports").vw.setTop((int)((views.get("imgreports").vw.getTop() + views.get("imgreports").vw.getHeight())));
views.get("lblreports").vw.setHeight((int)((views.get("btnreports").vw.getHeight())-(5d * scale) - ((views.get("imgreports").vw.getTop() + views.get("imgreports").vw.getHeight()))));
//BA.debugLineNum = 98;BA.debugLine="btnSettings.SetLeftAndRight(35%x, 65%x)"[MainScreen/General script]
views.get("btnsettings").vw.setLeft((int)((35d / 100 * width)));
views.get("btnsettings").vw.setWidth((int)((65d / 100 * width) - ((35d / 100 * width))));
//BA.debugLineNum = 99;BA.debugLine="btnSettings.SetTopAndBottom(21%y, 38%y)"[MainScreen/General script]
views.get("btnsettings").vw.setTop((int)((21d / 100 * height)));
views.get("btnsettings").vw.setHeight((int)((38d / 100 * height) - ((21d / 100 * height))));
//BA.debugLineNum = 101;BA.debugLine="imgSettings.HorizontalCenter = btnSettings.Width /2"[MainScreen/General script]
views.get("imgsettings").vw.setLeft((int)((views.get("btnsettings").vw.getWidth())/2d - (views.get("imgsettings").vw.getWidth() / 2)));
//BA.debugLineNum = 102;BA.debugLine="imgSettings.Top = 8dip"[MainScreen/General script]
views.get("imgsettings").vw.setTop((int)((8d * scale)));
//BA.debugLineNum = 104;BA.debugLine="lblSettings.SetLeftAndRight(1%x, btnSettings.Width - 1%x)"[MainScreen/General script]
views.get("lblsettings").vw.setLeft((int)((1d / 100 * width)));
views.get("lblsettings").vw.setWidth((int)((views.get("btnsettings").vw.getWidth())-(1d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 105;BA.debugLine="lblSettings.SetTopAndBottom(imgSettings.Bottom, btnSettings.Height - 5dip)"[MainScreen/General script]
views.get("lblsettings").vw.setTop((int)((views.get("imgsettings").vw.getTop() + views.get("imgsettings").vw.getHeight())));
views.get("lblsettings").vw.setHeight((int)((views.get("btnsettings").vw.getHeight())-(5d * scale) - ((views.get("imgsettings").vw.getTop() + views.get("imgsettings").vw.getHeight()))));
//BA.debugLineNum = 107;BA.debugLine="btnSync.SetLeftAndRight(68%x, 98%x)"[MainScreen/General script]
views.get("btnsync").vw.setLeft((int)((68d / 100 * width)));
views.get("btnsync").vw.setWidth((int)((98d / 100 * width) - ((68d / 100 * width))));
//BA.debugLineNum = 108;BA.debugLine="btnSync.SetTopAndBottom(21%y, 38%y)"[MainScreen/General script]
views.get("btnsync").vw.setTop((int)((21d / 100 * height)));
views.get("btnsync").vw.setHeight((int)((38d / 100 * height) - ((21d / 100 * height))));
//BA.debugLineNum = 110;BA.debugLine="imgSync.HorizontalCenter = btnSync.Width /2"[MainScreen/General script]
views.get("imgsync").vw.setLeft((int)((views.get("btnsync").vw.getWidth())/2d - (views.get("imgsync").vw.getWidth() / 2)));
//BA.debugLineNum = 111;BA.debugLine="imgSync.Top = 8dip"[MainScreen/General script]
views.get("imgsync").vw.setTop((int)((8d * scale)));
//BA.debugLineNum = 113;BA.debugLine="lblSync.SetLeftAndRight(1%x, btnSync.Width - 1%x)"[MainScreen/General script]
views.get("lblsync").vw.setLeft((int)((1d / 100 * width)));
views.get("lblsync").vw.setWidth((int)((views.get("btnsync").vw.getWidth())-(1d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 114;BA.debugLine="lblSync.SetTopAndBottom(imgSync.Bottom, btnSync.Height - 5dip)"[MainScreen/General script]
views.get("lblsync").vw.setTop((int)((views.get("imgsync").vw.getTop() + views.get("imgsync").vw.getHeight())));
views.get("lblsync").vw.setHeight((int)((views.get("btnsync").vw.getHeight())-(5d * scale) - ((views.get("imgsync").vw.getTop() + views.get("imgsync").vw.getHeight()))));

}
}