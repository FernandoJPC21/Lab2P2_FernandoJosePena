
package Semana4;


import java.util.ArrayList;

public class Directory extends FileEntry {
    
    private ArrayList<FileEntry> fileList;
    
    public Directory(String _name, int _size)
    {
        super(_name, _size);
        this.type = FileType.directory;
        this.fileList = new ArrayList<FileEntry>();
    }
    
    public void addFile(String _name, int _size, String _extension)
    {
        fileList.add(new File(_name, _size, _extension));
        System.out.printf("El archivo %s ha sido creado%n", _name);
    }
    
    public void addDirectory(String _name, int _size)
    {
        fileList.add(new Directory(_name, _size));
        System.out.printf("El directorio %s ha sido creado%n", _name);
    }    

    public ArrayList<FileEntry> getFileList() {
        return fileList;
    }
    
    
    
}