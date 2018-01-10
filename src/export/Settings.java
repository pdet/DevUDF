package export;

import com.intellij.ide.impl.ProjectUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogBuilder;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.Messages;

import java.util.List;

public class Settings extends AnAction {
    // If you register the action from Java code, this constructor is used to set the menu item name
    // (optionally, you can specify the menu description and an icon to display next to the menu item).
    // You can omit this constructor when registering the action in the plugin.xml file.
    public Settings() {
        // Set the menu item name.
        super("Text _Boxes");
        // Set the menu item name, description and icon.
        // super("Text _Boxes","Item description",IconLoader.getIcon("/Mypackage/icon.png"));
    }

    public void actionPerformed(AnActionEvent event) {
//        Project project = event.getData(PlatformDataKeys.PROJECT);
//        String hostname= Messages.showInputDialog(project, "Hostname:", "Hostname", Messages.getQuestionIcon());
//        String port= Messages.showInputDialog(project, "Port:", "Port", Messages.getQuestionIcon());
//        String database= Messages.showInputDialog(project, "Database:", "Database", Messages.getQuestionIcon());
//        String username= Messages.showInputDialog(project, "User:", "User", Messages.getQuestionIcon());
//        String password= Messages.showInputDialog(project, "Password:", "Password", Messages.getQuestionIcon());

        final SettingsForm form = new SettingsForm();

        DialogBuilder builder = new DialogBuilder(getEventProject(event));
        builder.setCenterPanel(form);
        builder.setDimensionServiceKey("FrameSwitcherCloseProjects");
        builder.setTitle("Settings");
        builder.removeAllActions();
//        builder.addOkAction();
//        builder.addCancelAction();
//
        boolean isOk = builder.show() == DialogWrapper.OK_EXIT_CODE;
//        if (isOk) {
//            List<String> checkProjects = form.getCheckProjects();
//            for (String checkProject : checkProjects) {
//                System.out.println(checkProject);
//            }
//
//        }
    }
}
