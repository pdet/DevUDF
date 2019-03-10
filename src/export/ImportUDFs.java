package export;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogBuilder;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.Messages;

import javax.swing.*;

public class ImportUDFs extends AnAction {
    public ImportUDFs() {
        super("Text _Boxes");
    }

    public void actionPerformed(AnActionEvent event) {
        if (ConnectionGlobal.con == null){
            JOptionPane.showMessageDialog(new JFrame(), "Missing Database Connection!", "Dialog",
                    JOptionPane.ERROR_MESSAGE);
        }

        else {
            final ImportForm form = new ImportForm();
            DialogBuilder builder = new DialogBuilder(getEventProject(event));
            builder.setCenterPanel(form);
            builder.setDimensionServiceKey("FrameSwitcherCloseProjects");
            builder.setTitle("Import");
            builder.removeAllActions();
            boolean isOk = builder.show() == DialogWrapper.OK_EXIT_CODE;
            Project project = event.getData(PlatformDataKeys.PROJECT);
            project.getBaseDir().refresh(false,true);
        }

    }
}