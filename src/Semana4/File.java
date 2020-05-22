
package Semana4;


public class File extends FileEntry {
    
    private String extension;
    
    public File(String _name, int _size, String _extension)
    {
        super(_name, _size);
        this.extension = _extension;
        this.type = FileType.file;   
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }

    @Override
    public FileType getType() {
        return FileType.file;
    }

    @Override
    public void setType(FileType type) {
        super.setType(type); 
    }
}
    
    
    
    

