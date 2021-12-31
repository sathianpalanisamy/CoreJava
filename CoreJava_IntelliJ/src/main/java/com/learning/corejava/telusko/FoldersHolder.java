/**
 * @author nandishamm
 * @created 17/09/20
 */
package com.learning.corejava.telusko;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author nandishamm
 * @created 17/09/20
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FoldersHolder implements Serializable {

        private String name;
        private String fullPath;
        private List<FilesHolder> files;
        private List<FoldersHolder> folders;

    public FoldersHolder(String name, String fullPath) {
        this.name=name;
        this.fullPath=fullPath;
        files = new ArrayList<>();
        folders = new ArrayList<>();
    }
    public void addFolder(FoldersHolder folder) {
        this.folders.add(folder);
    }
    public void addFile(FilesHolder file) {
        this.files.add(file);
    }
}
