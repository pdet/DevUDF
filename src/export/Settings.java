package export;

import com.intellij.ide.impl.ProjectUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogBuilder;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.Messages;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Settings extends AnAction {
    public Settings() {
        super("Text _Boxes");
    }

    public void actionPerformed(AnActionEvent event) {
        String aux = event.getProject().getProjectFilePath();
        aux = aux.replaceAll(".idea/misc.xml","");
        aux+="src/";
        if (!Files.exists( Paths.get(aux))) {
            File dir = new File(aux);
            dir.mkdir();
        }
        ConnectionGlobal.path = aux;
        final SettingsForm form = new SettingsForm();
        DialogBuilder builder = new DialogBuilder(getEventProject(event));
        builder.setCenterPanel(form);
        builder.setDimensionServiceKey("FrameSwitcherCloseProjects");
        builder.setTitle("Settings");
        builder.removeAllActions();
        boolean isOk = builder.show() == DialogWrapper.OK_EXIT_CODE;

    }
}
