package action.action;

import action.FileAction;
import action.FileOperations;

import java.util.ArrayList;
import java.util.List;

public class ReplaceFileAction extends FileAction {

    private final String pattern;
    private final String target;

    public ReplaceFileAction(FileOperations fileOperations, String pattern, String target) {
        super(fileOperations);
        this.pattern = pattern;
        this.target = target;
    }

    /**
     * Replace all occurrences of 'pattern' to 'target'
     *
     * @param text
     * @return
     */
    @Override
    protected List<String> perform(List<String> text) {

        //TODO implement - done
        List<String> res = new ArrayList<>();

        for (String string : text) {
            res.add(string.replace(pattern, target));
        }

        return res;
    }

}


//  https://github.com/Maryfro/Java_module2/commit/c48216fb0717dfad4de76e76c4e269fd2787b617