package action.action;

import action.FileAction;
import action.FileOperations;

import java.util.List;

public class CapitalLettersFileAction extends FileAction {
    public CapitalLettersFileAction(FileOperations fileOperations) {
        super(fileOperations);
    }

    @Override
    protected List<String> perform(List<String> text) {
        List<String> res = text;
        res.replaceAll(String::toUpperCase);

        return res;
    }

}
