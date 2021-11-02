package stringmethods.filename;

import java.util.Locale;

public class FileNameManipulator {
    public char findLastCharacter(String str){
        return str.charAt(str.length()-1);
    }

    public String findFileExtension(String fileName){
        return fileName.substring(fileName.indexOf("."));
    }

    public boolean identifyFilesByExtension(String ext,String fileName){
        return ext.equals(fileName.substring(fileName.indexOf(".")+1));
    }

    public boolean compareFilesByName(String fileName,String actualFileName){
        return actualFileName.equals(fileName);
    }

    public String changeExtensionToLowerCase(String fileName){
        return fileName.replace(fileName.substring(fileName.indexOf(".")+1),fileName.substring(fileName.indexOf(".")+1).toLowerCase());
    }

    public String replaceStringPart(String fileName,String present,String target){
        return fileName.replace(present,target);
    }

    public static void main(String[] args) {
        FileNameManipulator manipulator = new FileNameManipulator();
        System.out.println(manipulator.findLastCharacter("fsdfe.jar"));
        System.out.println(manipulator.findFileExtension("alma.jpg"));
        System.out.println(manipulator.identifyFilesByExtension("bat","nice.bat"));
        System.out.println(manipulator.identifyFilesByExtension("bat","nice.exe"));
        System.out.println(manipulator.compareFilesByName("jardan.png","jardan.png"));
        System.out.println(manipulator.compareFilesByName("jardan.png","jardaan.png"));
        System.out.println(manipulator.changeExtensionToLowerCase("hulu.MD"));
        System.out.println(manipulator.replaceStringPart("Ezt itt","itt","erre"));
    }
}
