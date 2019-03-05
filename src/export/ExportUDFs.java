package export;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogBuilder;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.Messages;

public class ExportUDFs extends AnAction {

    public ExportUDFs() {
        super("Text _Boxes");
    }

    public void actionPerformed(AnActionEvent event) {
        final ExportForm form = new ExportForm();

        DialogBuilder builder = new DialogBuilder(getEventProject(event));
        builder.setCenterPanel(form);
        builder.setDimensionServiceKey("FrameSwitcherCloseProjects");
        builder.setTitle("Export");
        builder.removeAllActions();
        boolean isOk = builder.show() == DialogWrapper.OK_EXIT_CODE;

    }
}