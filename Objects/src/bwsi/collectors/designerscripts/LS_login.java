package bwsi.collectors.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_login{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[Login/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="UserNameAnchor.SetLeftAndRight(10%x, 90%x)"[Login/General script]
views.get("usernameanchor").vw.setLeft((int)((10d / 100 * width)));
views.get("usernameanchor").vw.setWidth((int)((90d / 100 * width) - ((10d / 100 * width))));
//BA.debugLineNum = 4;BA.debugLine="UserNameAnchor.Top = 28%y"[Login/General script]
views.get("usernameanchor").vw.setTop((int)((28d / 100 * height)));
//BA.debugLineNum = 5;BA.debugLine="UserNameIcon.Left = 2%x"[Login/General script]
views.get("usernameicon").vw.setLeft((int)((2d / 100 * width)));
//BA.debugLineNum = 6;BA.debugLine="UserNameIcon.SetTopAndBottom(1%y, UserNameAnchor.Height - 1%y)"[Login/General script]
views.get("usernameicon").vw.setTop((int)((1d / 100 * height)));
views.get("usernameicon").vw.setHeight((int)((views.get("usernameanchor").vw.getHeight())-(1d / 100 * height) - ((1d / 100 * height))));
//BA.debugLineNum = 7;BA.debugLine="txtUserName.SetLeftAndRight(UserNameIcon.Right, UserNameAnchor.Width - 1%x)"[Login/General script]
views.get("txtusername").vw.setLeft((int)((views.get("usernameicon").vw.getLeft() + views.get("usernameicon").vw.getWidth())));
views.get("txtusername").vw.setWidth((int)((views.get("usernameanchor").vw.getWidth())-(1d / 100 * width) - ((views.get("usernameicon").vw.getLeft() + views.get("usernameicon").vw.getWidth()))));
//BA.debugLineNum = 8;BA.debugLine="txtUserName.SetTopAndBottom(1%y, UserNameAnchor.Height - 1%y)"[Login/General script]
views.get("txtusername").vw.setTop((int)((1d / 100 * height)));
views.get("txtusername").vw.setHeight((int)((views.get("usernameanchor").vw.getHeight())-(1d / 100 * height) - ((1d / 100 * height))));
//BA.debugLineNum = 10;BA.debugLine="PasswordAnchor.SetLeftAndRight(10%x, 90%x)"[Login/General script]
views.get("passwordanchor").vw.setLeft((int)((10d / 100 * width)));
views.get("passwordanchor").vw.setWidth((int)((90d / 100 * width) - ((10d / 100 * width))));
//BA.debugLineNum = 11;BA.debugLine="PasswordAnchor.Top = UserNameAnchor.Bottom + 15dip"[Login/General script]
views.get("passwordanchor").vw.setTop((int)((views.get("usernameanchor").vw.getTop() + views.get("usernameanchor").vw.getHeight())+(15d * scale)));
//BA.debugLineNum = 12;BA.debugLine="PasswordIcon.Left = 2%x"[Login/General script]
views.get("passwordicon").vw.setLeft((int)((2d / 100 * width)));
//BA.debugLineNum = 13;BA.debugLine="PasswordIcon.SetTopAndBottom(1%y, PasswordAnchor.Height - 1%y)"[Login/General script]
views.get("passwordicon").vw.setTop((int)((1d / 100 * height)));
views.get("passwordicon").vw.setHeight((int)((views.get("passwordanchor").vw.getHeight())-(1d / 100 * height) - ((1d / 100 * height))));
//BA.debugLineNum = 14;BA.debugLine="txtPassword.SetLeftAndRight(PasswordIcon.Right, PasswordAnchor.Width - 10%x)"[Login/General script]
views.get("txtpassword").vw.setLeft((int)((views.get("passwordicon").vw.getLeft() + views.get("passwordicon").vw.getWidth())));
views.get("txtpassword").vw.setWidth((int)((views.get("passwordanchor").vw.getWidth())-(10d / 100 * width) - ((views.get("passwordicon").vw.getLeft() + views.get("passwordicon").vw.getWidth()))));
//BA.debugLineNum = 15;BA.debugLine="txtPassword.SetTopAndBottom(1%y, PasswordAnchor.Height - 1%y)"[Login/General script]
views.get("txtpassword").vw.setTop((int)((1d / 100 * height)));
views.get("txtpassword").vw.setHeight((int)((views.get("passwordanchor").vw.getHeight())-(1d / 100 * height) - ((1d / 100 * height))));
//BA.debugLineNum = 16;BA.debugLine="btnShowHide.SetLeftAndRight(txtPassword.Right + 5dip, PasswordAnchor.Width - 3%x)"[Login/General script]
views.get("btnshowhide").vw.setLeft((int)((views.get("txtpassword").vw.getLeft() + views.get("txtpassword").vw.getWidth())+(5d * scale)));
views.get("btnshowhide").vw.setWidth((int)((views.get("passwordanchor").vw.getWidth())-(3d / 100 * width) - ((views.get("txtpassword").vw.getLeft() + views.get("txtpassword").vw.getWidth())+(5d * scale))));
//BA.debugLineNum = 17;BA.debugLine="btnShowHide.VerticalCenter = txtPassword.VerticalCenter"[Login/General script]
views.get("btnshowhide").vw.setTop((int)((views.get("txtpassword").vw.getTop() + views.get("txtpassword").vw.getHeight()/2) - (views.get("btnshowhide").vw.getHeight() / 2)));
//BA.debugLineNum = 19;BA.debugLine="chkRemember.Left = PasswordAnchor.Left"[Login/General script]
views.get("chkremember").vw.setLeft((int)((views.get("passwordanchor").vw.getLeft())));
//BA.debugLineNum = 20;BA.debugLine="chkRemember.Top = PasswordAnchor.Bottom + 20dip"[Login/General script]
views.get("chkremember").vw.setTop((int)((views.get("passwordanchor").vw.getTop() + views.get("passwordanchor").vw.getHeight())+(20d * scale)));
//BA.debugLineNum = 22;BA.debugLine="Label1.Left = chkRemember.Right + 5dip"[Login/General script]
views.get("label1").vw.setLeft((int)((views.get("chkremember").vw.getLeft() + views.get("chkremember").vw.getWidth())+(5d * scale)));
//BA.debugLineNum = 23;BA.debugLine="Label1.VerticalCenter = chkRemember.VerticalCenter"[Login/General script]
views.get("label1").vw.setTop((int)((views.get("chkremember").vw.getTop() + views.get("chkremember").vw.getHeight()/2) - (views.get("label1").vw.getHeight() / 2)));
//BA.debugLineNum = 25;BA.debugLine="btnLogin.SetLeftAndRight(20%x, 80%x)"[Login/General script]
views.get("btnlogin").vw.setLeft((int)((20d / 100 * width)));
views.get("btnlogin").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
//BA.debugLineNum = 26;BA.debugLine="btnLogin.Top = chkRemember.Bottom + 15dip"[Login/General script]
views.get("btnlogin").vw.setTop((int)((views.get("chkremember").vw.getTop() + views.get("chkremember").vw.getHeight())+(15d * scale)));
//BA.debugLineNum = 28;BA.debugLine="Label2.SetLeftAndRight(5%x, 50%x)"[Login/General script]
views.get("label2").vw.setLeft((int)((5d / 100 * width)));
views.get("label2").vw.setWidth((int)((50d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 29;BA.debugLine="Label2.Top = 80%y"[Login/General script]
views.get("label2").vw.setTop((int)((80d / 100 * height)));
//BA.debugLineNum = 31;BA.debugLine="Label3.SetLeftAndRight(51%x, 99%x)"[Login/General script]
views.get("label3").vw.setLeft((int)((51d / 100 * width)));
views.get("label3").vw.setWidth((int)((99d / 100 * width) - ((51d / 100 * width))));
//BA.debugLineNum = 32;BA.debugLine="Label3.VerticalCenter = Label2.VerticalCenter"[Login/General script]
views.get("label3").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight()/2) - (views.get("label3").vw.getHeight() / 2)));

}
}