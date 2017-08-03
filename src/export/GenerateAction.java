package export;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;

/**
 * @author Pedro Holanda
 * @since 03/08/17.
 */
public class GenerateAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
    }

    @Override
    public void update(AnActionEvent e ){
        PsiFile psiFile = e.getData(LangDataKeys.PSI_FILE);
        Editor editor = e.getData(PlatformDataKeys.EDITOR);
        if(psiFile == null || editor == null) {
            e.getPresentation().setEnabled((false));
            return;
        }
        int offset = editor.getCaretModel().getOffset();
        PsiElement elementAt = psiFile.findElementAt(offset);
//        PsiClass psiClass = PsiTreeUtil.getParentOfType(elementAt,PsiClass.class);
//        if (psiClass == null)
//            e.getPresentation().setEnabled(false);

    }

}
