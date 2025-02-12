B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=10
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region
#Extends: android.support.v7.app.AppCompatActivity
#If Java

public boolean _onCreateOptionsMenu(android.view.Menu menu) {
	if (processBA.subExists("activity_createmenu")) {
		processBA.raiseEvent2(null, true, "activity_createmenu", false, new de.amberhome.objects.appcompat.ACMenuWrapper(menu));
		return true;
	}
	else
		return false;
}
#End If

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Dim ActionBarButton As ACActionBar
	Private ToolBar As ACToolBarDark
	Private MainMenu As ASBottomMenu


	Dim bdLogout As BitmapDrawable
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MainScreen")
	GlobalVar.CSTitle.Initialize.Size(18).Bold.Append(Application.LabelName).PopAll
	GlobalVar.CSSubTitle.Initialize.Size(15).Append(Application.VersionName).PopAll
	
	ToolBar.InitMenuListener
	ToolBar.Title = GlobalVar.CSTitle
	ToolBar.SubTitle = GlobalVar.CSSubTitle
	ToolBar.SetElevationAnimated(5, 5dip)

	Dim jo As JavaObject
	Dim xl As XmlLayoutBuilder
	jo = ToolBar
	jo.RunMethod("setPopupTheme", Array(xl.GetResourceId("style", "ToolbarMenu")))
	jo.RunMethod("setContentInsetStartWithNavigation", Array(1dip))
	jo.RunMethod("setTitleMarginStart", Array(0dip))
		
	ActionBarButton.Initialize
	ActionBarButton.ShowUpIndicator = False
	
	bdLogout.Initialize(LoadBitmap(File.DirAssets, "logout.png"))

	MainMenu.SetIcon1(GlobalVar.FontToBitmap(Chr(0xE88A),True,38,Colors.Black))'1 Home
	MainMenu.SetIcon2(GlobalVar.FontToBitmap(Chr(0xE24A),True,38,Colors.Black))'2 Calculator
	MainMenu.SetIcon5(GlobalVar.FontToBitmap(Chr(0xE880),True,38,Colors.Black))'3 Search
	MainMenu.SetIcon3(GlobalVar.FontToBitmap(Chr(0xE7F4),True,38,Colors.Black))'4 Notification
	MainMenu.SetIcon4(GlobalVar.FontToBitmap(Chr(0xE7FD),True,38,Colors.Black))'5 Profile

	MainMenu.SetPageClickColor(GlobalVar.SecColor)
	MainMenu.SetCurrentPage(1)
	MainMenu.SetPartingLinesColor(GlobalVar.SecColor)
	MainMenu.SetPartingLineColor(Colors.White)
	
	MainMenu.EnableBadget3(True)
	MainMenu.SetBadgetValue3(1)
End Sub

Sub Activity_CreateMenu(Menu As ACMenu)
	Dim Item As ACMenuItem
	
	Menu.Clear
	Menu.Add2(1, 1, "Logout", bdLogout).ShowAsAction = Item.SHOW_AS_ACTION_IF_ROOM
End Sub

Sub Activity_Resume
	MainMenu.SetCurrentPage(1)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub MainMenu_Page1Click
	
End Sub

Sub MainMenu_Page2Click
	Dim jo As JavaObject
	jo.InitializeContext
	jo.RunMethod("openCalculator", Null)
End Sub

#If JAVA
import android.content.Intent;
public void openCalculator() {
    Intent intent = new Intent();
    intent.setAction(Intent.ACTION_MAIN);
    intent.addCategory(Intent.CATEGORY_APP_CALCULATOR);
    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    startActivity(intent);
   }
#End If
Sub MainMenu_Page3Click
	
End Sub

Sub MainMenu_Page4Click
	
End Sub

Sub MainMenu_Page5Click
	
End Sub