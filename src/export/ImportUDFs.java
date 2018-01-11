package export;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogBuilder;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.Messages;

public class ImportUDFs extends AnAction {
    // If you register the action from Java code, this constructor is used to set the menu item name
    // (optionally, you can specify the menu description and an icon to display next to the menu item).
    // You can omit this constructor when registering the action in the plugin.xml file.
    public ImportUDFs() {
        // Set the menu item name.
        super("Text _Boxes");
        // Set the menu item name, description and icon.
        // super("Text _Boxes","Item description",IconLoader.getIcon("/Mypackage/icon.png"));
    }

    public void actionPerformed(AnActionEvent event) {
        final ImportForm form = new ImportForm();

        DialogBuilder builder = new DialogBuilder(getEventProject(event));
        builder.setCenterPanel(form);
        builder.setDimensionServiceKey("FrameSwitcherCloseProjects");
        builder.setTitle("Import");
        builder.removeAllActions();
        boolean isOk = builder.show() == DialogWrapper.OK_EXIT_CODE;

    }
}