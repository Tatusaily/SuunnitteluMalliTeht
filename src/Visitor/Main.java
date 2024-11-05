package Visitor;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        File file1 = new File("file1.txt", 1.5);
        File file2 = new File("file2.jpg", 2.0);
        Directory subDir = new Directory("subDir");
        File file3 = new File("file3.txt", 3.0);

        root.addElement(file1);
        root.addElement(file2);
        subDir.addElement(file3);
        root.addElement(subDir);

        // Calculate total size
        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total size: " + sizeVisitor.getTotalSize() + " MB");

        // Search for files with ".txt" extension
        SearchVisitor searchVisitor = new SearchVisitor(".txt");
        root.accept(searchVisitor);
        System.out.println("Matching files:");
        for (File file : searchVisitor.getMatchingFiles()) {
            System.out.println(file.getName());
        }
    }
}
