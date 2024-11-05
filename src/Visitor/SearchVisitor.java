package Visitor;

import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private String criterion;
    private List<File> matchingFiles;

    public SearchVisitor(String criterion) {
        this.criterion = criterion;
        this.matchingFiles = new ArrayList<>();
    }

    public List<File> getMatchingFiles() {
        return matchingFiles;
    }

    @Override
    public void visit(File file) {
        if (file.getName().contains(criterion)) {
            matchingFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        // No action needed for directory itself
    }
}
