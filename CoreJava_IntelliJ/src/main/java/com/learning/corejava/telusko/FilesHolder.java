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

/**
 * @author nandishamm
 * @created 17/09/20
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilesHolder implements Serializable {
    private String name;
    private String fullPath;
}
