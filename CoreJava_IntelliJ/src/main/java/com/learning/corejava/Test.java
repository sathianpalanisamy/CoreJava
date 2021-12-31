package com.learning.corejava;

import com.learning.corejava.telusko.FilesHolder;
import com.learning.corejava.telusko.FoldersHolder;
import org.apache.commons.vfs2.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws IOException {

//        try (Stream<Path> pathStream = Files.walk(Paths.get("C:\\Users\\91735\\Downloads\\dbo")).filter(path -> path.toFile().isFile() && path.toFile().getName().endsWith(".cob"))) {
//            pathStream.forEach(System.out::println);
//
//        }

//        try (Stream<Path> pathStream = Files.walk(Paths.get("C:\\Users\\91735\\Downloads\\dbo"),1).filter(path -> path.toFile().isDirectory())) {
//            pathStream.forEach(System.out::println);
//
//        }

//        String f=new File("C:\\Users\\91735\\Downloads\\dbo\\Employee_Data_03 - Copy - Copy\\empolyee3.cob").getParentFile().getName();
//        System.out.println(f);
       FileSystemManager manager = VFS.getManager();


        final FileObject dir = manager.resolveFile("C:\\Users\\91735\\Downloads\\OneDrive_1_12-10-2021\\Vsam sample data");
        FoldersHolder parentFolder = new FoldersHolder("COPYBOOK", "C:\\Users\\91735\\Downloads\\OneDrive_1_12-10-2021\\Vsam sample data");

        boolean finalFiles =Test.listCopyBookFiles(dir,parentFolder,true);
        System.out.println(finalFiles);

//        String a= "Hello";
//
//        System.out.println(a.contains("Hello"));

    }

    public static boolean listCopyBookFiles(final FileObject dir,
                                           FoldersHolder parentFolder, boolean recursive)
            throws FileSystemException {
        boolean contains =false;
        String[] copyBookExt = new String[]{".cob", ".cbl"};
        final FileObject[] children = dir.getChildren();
        for (int i = 0; i < children.length; i++) {
            final FileObject child = children[i];
            String tempCopybookFile=child.getName().getBaseName().toLowerCase();
            System.out.println(tempCopybookFile);
            if (child.getType() != FileType.FOLDER) {
                contains = Arrays.stream(copyBookExt).anyMatch(tempCopybookFile::endsWith);
                if (contains)
                    break;
            }else {
                if (recursive){
                    contains= listCopyBookFiles(child, parentFolder, recursive);
                    if(contains)
                        break;
                }
            }
        }
        System.out.println(parentFolder.getFiles());
        return contains;

    }

    }
