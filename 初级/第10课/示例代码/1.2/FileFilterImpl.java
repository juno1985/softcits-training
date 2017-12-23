package FileListFilterDemo;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilterImpl implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(".txt");
	}

}
